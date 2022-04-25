/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_ad08;

import static com.mycompany.proyecto_ad08.BDComidas.con;
import static com.mycompany.proyecto_ad08.BDComidas.getConnection;
import static com.mycompany.proyecto_ad08.BDComidas.modeloComidas;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author i_rom
 */
public class BuscarComidas {

    public BuscarComidas() {

    }

    static public void buscar() throws SQLException {

        DefaultTableModel modeloBuscarComidas = new DefaultTableModel();

        modeloBuscarComidas.addColumn("FECHA");
        modeloBuscarComidas.addColumn("COMIDA");
        modeloBuscarComidas.addColumn("CALORIAS");

        java.util.Date fecha = PanelBuscarComida.fechaBuscarComidaIn.getDate();

        if (fecha != null & PanelBuscarComida.comidaBuscarComidaIn.getSelectedItem() == null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaSeleccionada = sdf.format(fecha);

            con = getConnection();

            PreparedStatement pstmt = con.prepareStatement("SELECT DISTINCT FECHA, COMIDA from ALIMENTOS WHERE FECHA = ? ");
            pstmt.setString(1, fechaSeleccionada);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Object[] datos = {rs.getDate("FECHA"), rs.getString("COMIDA"), "0"};
                modeloBuscarComidas.addRow(datos);
            }

            //Cerramos la conexión
            con.close();

        }

        if (fecha == null & PanelBuscarComida.comidaBuscarComidaIn.getSelectedItem() != null) {
            con = getConnection();

            PreparedStatement pstmt = con.prepareStatement("SELECT DISTINCT FECHA, COMIDA from ALIMENTOS WHERE COMIDA = ? ");
            pstmt.setString(1, PanelBuscarComida.comidaBuscarComidaIn.getSelectedItem().toString());

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Object[] datos = {rs.getDate("FECHA"), rs.getString("COMIDA"), "0"};
                modeloBuscarComidas.addRow(datos);
            }

            //Cerramos la conexión
            con.close();

        }

        if (fecha != null & PanelBuscarComida.comidaBuscarComidaIn.getSelectedItem() != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fechaSeleccionada = sdf.format(fecha);

            con = getConnection();

            PreparedStatement pstmt = con.prepareStatement("SELECT DISTINCT FECHA, COMIDA from ALIMENTOS WHERE FECHA = ? AND COMIDA = ? ");
            pstmt.setString(1, fechaSeleccionada);
            pstmt.setString(2, PanelBuscarComida.comidaBuscarComidaIn.getSelectedItem().toString());

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Object[] datos = {rs.getDate("FECHA"), rs.getString("COMIDA"), "0"};
                modeloBuscarComidas.addRow(datos);
            }

            //Cerramos la conexión
            con.close();

        }

        PanelPrincipal.tablaComida.setModel(modeloBuscarComidas);

    }

}
