/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_ad08;

import static com.mycompany.proyecto_ad08.BDComidas.con;
import static com.mycompany.proyecto_ad08.BDComidas.getConnection;
import static com.mycompany.proyecto_ad08.BDComidas.modeloComidas;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

        String fechaSeleccionada = PanelBuscarComida.fechaBuscarComidaIn.getName();
        String comidaSeleccionada = PanelBuscarComida.comidaBuscarComidaIn.toString();

        if (!fechaSeleccionada.isEmpty() & comidaSeleccionada.isEmpty()) {
            con = getConnection();

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT DISTINCT FECHA, COMIDA from ALIMENTOS WHERE FECHA = " + fechaSeleccionada);
            while (rs.next()) {
                Object[] datos = {rs.getDate("FECHA"), rs.getString("COMIDA"), "0"};
                modeloBuscarComidas.addRow(datos);
            }

            //Cerramos la conexión
            con.close();
        } else if (fechaSeleccionada.isEmpty() & !comidaSeleccionada.isEmpty()) {
            con = getConnection();

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT DISTINCT FECHA, COMIDA from ALIMENTOS WHERE FECHA = " + comidaSeleccionada);
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
