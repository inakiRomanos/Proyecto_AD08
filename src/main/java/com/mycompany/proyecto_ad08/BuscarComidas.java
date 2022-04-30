/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_ad08;

import static com.mycompany.proyecto_ad08.BDComidas.con;
import static com.mycompany.proyecto_ad08.BDComidas.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * En esta clase podemos buscar comidas filtrandolas por fecha y/o comida(DESAYUNO, COMIDA, CENA)
 * 
 * @author i_rom
 */
public class BuscarComidas {

    public BuscarComidas() {

    }

    static public void buscar() throws SQLException {
        
        
        //Creamos un nuevo modelo para la tabla comida
        DefaultTableModel modeloBuscarComidas = new DefaultTableModel();

        modeloBuscarComidas.addColumn("FECHA");
        modeloBuscarComidas.addColumn("COMIDA");

        //Tomamos el dato de la fecha
        java.util.Date fecha = PanelPrincipal.fechaBuscarComidaIn.getDate();

        //Si hemos seleccionado fecha pero no comida buscaremos por fecha
        if (fecha != null & PanelPrincipal.comidaBuscar.getSelectedItem().toString().equals("")) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaSeleccionada = sdf.format(fecha);
            
            //Conectamos la BBDD
            con = getConnection();
 
            //Escribimos las instrucciones para realizar la busqueda
            PreparedStatement pstmt = con.prepareStatement("SELECT DISTINCT FECHA, COMIDA from ALIMENTOS WHERE FECHA = ? ");
            pstmt.setString(1, fechaSeleccionada);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                //Cargamos los datos en modelo de la tabla
                Object[] datos = {rs.getDate("FECHA"), rs.getString("COMIDA"), "0"};
                modeloBuscarComidas.addRow(datos);
            }

            //Cerramos la conexión
            con.close();
            //Cargamos el modelo en la tabla
            PanelPrincipal.tablaComida.setModel(modeloBuscarComidas);

            //Si hemos seleccionado comida pero no fecha buscamos por comida
        } else if (fecha == null & !PanelPrincipal.comidaBuscar.getSelectedItem().toString().equals("")) {
            con = getConnection();

            PreparedStatement pstmt = con.prepareStatement("SELECT DISTINCT FECHA, COMIDA from ALIMENTOS WHERE COMIDA = ? ");
            pstmt.setString(1, PanelPrincipal.comidaBuscar.getSelectedItem().toString());

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Object[] datos = {rs.getDate("FECHA"), rs.getString("COMIDA"), "0"};
                modeloBuscarComidas.addRow(datos);
            }

            con.close();
            PanelPrincipal.tablaComida.setModel(modeloBuscarComidas);

            //Si hemos seleccionado ambos campos la busqueda se filtra con los dos
        } else if (fecha != null & !PanelPrincipal.comidaBuscar.getSelectedItem().toString().equals("")) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaSeleccionada = sdf.format(fecha);

            con = getConnection();

            PreparedStatement pstmt = con.prepareStatement("SELECT DISTINCT FECHA, COMIDA from ALIMENTOS WHERE FECHA = ? AND COMIDA = ? ");
            pstmt.setString(1, fechaSeleccionada);
            pstmt.setString(2, PanelPrincipal.comidaBuscar.getSelectedItem().toString());

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Object[] datos = {rs.getDate("FECHA"), rs.getString("COMIDA"), "0"};
                modeloBuscarComidas.addRow(datos);
            }

            con.close();
            PanelPrincipal.tablaComida.setModel(modeloBuscarComidas);

        }
        
        //Si no hemos seleccionado ningun campo se cargan todas las comidas
        else
        { BDComidas.cargarTabla();}

    }

}
