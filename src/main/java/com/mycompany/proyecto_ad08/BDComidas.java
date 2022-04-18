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
        modeloComidas.addColumn("CALORIAS");
        
                // Nos conectamos a la base de datos
        con = getConnection();

        try {

           //Leemos la tabla vuelos de la BBDD y guardamos los datos en un array 
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * from COMIDAS");
            while (rs.next()) {
                String[] datos = {rs.getString("FECHA"), rs.getString("COMIDA"), "0"};
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
        String fechaComida;
        String comidaComida;       
        fechaComida = (String) PanelPrincipal.tablaComida.getValueAt(PanelPrincipal.tablaComida.getSelectedRow(), 0);
        comidaComida = (String) PanelPrincipal.tablaComida.getValueAt(PanelPrincipal.tablaComida.getSelectedRow(), 1);
        
        PanelPrincipal.fechaComida_in.setText(fechaComida);
        PanelPrincipal.comidaComida_in.setText(comidaComida);
        
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

            ResultSet rs = stmt.executeQuery("SELECT * from ALIMENTOS WHERE FECHA_AL ='" +fechaComida+"' AND COMIDA_AL='" +comidaComida+ "'");
            while (rs.next()) {
                String[] datos = {rs.getString("ALIMENTO"), rs.getString("CALORIAS")};
                CrearMenu.modeloMenu.addRow(datos);
            }

            //Cerramos la conexión
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        

    }
    }

