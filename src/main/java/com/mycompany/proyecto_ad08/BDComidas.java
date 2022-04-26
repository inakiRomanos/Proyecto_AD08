/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_ad08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;

/**
 *
 * @author i_rom
 * Esta clase crea y gestiona una BD MySQL
 */
public class BDComidas {
    public static String url = "jdbc:mysql://localhost/inakiromanos";
    public static String user = "acda";
    public static String password = "acda";
    public static Connection con;
    public static DefaultTableModel modeloComidas;

    public BDComidas() {
    }
            
        public static Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
            
    }

    public static void cargarTabla(){
        modeloComidas = new DefaultTableModel();
        
        modeloComidas.addColumn("FECHA");
        modeloComidas.addColumn("COMIDA");
        
        
                // Nos conectamos a la base de datos
        con = getConnection();

        try {

           
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT DISTINCT FECHA, COMIDA from ALIMENTOS");
            while (rs.next()) {
                Object[] datos = {rs.getDate("FECHA"), rs.getString("COMIDA")};
                modeloComidas.addRow(datos);
            }

            //Cerramos la conexión
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Cargamos el array en el modelo
        PanelPrincipal.tablaComida.setModel(modeloComidas);
    }
    
    public static void recargarMenu(){
        //Extraemos fecha y comida
        Date fechaComida;
        String comidaComida;       
        fechaComida = (Date) PanelPrincipal.tablaComida.getValueAt(PanelPrincipal.tablaComida.getSelectedRow(), 0);
        comidaComida = (String) PanelPrincipal.tablaComida.getValueAt(PanelPrincipal.tablaComida.getSelectedRow(), 1);
        
        
        //Conectamos BBDD
        con = getConnection();
        
        //Limpiamos tabla
        int filas = PanelPrincipal.tablaMenu.getRowCount();
        for (int i = 0; i < filas; i++) {
            CrearMenu.modeloMenu.removeRow(0);          
        }
        
        //Extraemos datos BDD
        try {
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * from ALIMENTOS WHERE FECHA ='" +fechaComida+"' AND COMIDA='" +comidaComida+ "'");
            while (rs.next()) {
                Object[] datos = {rs.getString("ALIMENTO"), rs.getInt("CALORIAS")};
                CrearMenu.modeloMenu.addRow(datos);
            }

            //Cerramos la conexión
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        

    }
    }

