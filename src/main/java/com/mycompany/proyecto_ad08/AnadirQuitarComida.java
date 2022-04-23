package com.mycompany.proyecto_ad08;

import static com.mycompany.proyecto_ad08.BDComidas.con;
import static com.mycompany.proyecto_ad08.BDComidas.getConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author i_rom
 */
public class AnadirQuitarComida {

    public AnadirQuitarComida() {
    }

    public static void anadir() throws SQLException {
        int filas = PanelPrincipal.tablaMenu.getRowCount();

        con = getConnection();

        for (int i = 0; i < filas; i++) {

            PreparedStatement pstmt = null;
            pstmt = con.prepareStatement("INSERT INTO ALIMENTOS (FECHA,COMIDA,ALIMENTO,CALORIAS) VALUES (?,?,?,?)");

            pstmt.setObject(1, PanelPrincipal.fechaComida_in.getText());
            pstmt.setObject(2, PanelPrincipal.comidaComida_in.getText());
            pstmt.setObject(3, PanelPrincipal.tablaMenu.getValueAt(i, 0));
            pstmt.setObject(4, PanelPrincipal.tablaMenu.getValueAt(i, 1));
            pstmt.execute();
        }

        BDComidas.cargarTabla();

        con.close();
    }

    public static void quitar() throws SQLException {

        con = getConnection();

        
         PreparedStatement pstmt = null;
         
        pstmt = con.prepareStatement("DELETE FROM ALIMENTOS WHERE FECHA=? AND COMIDA=?");

        pstmt.setObject(1, PanelPrincipal.fechaComida_in.getText());
        pstmt.setObject(2, PanelPrincipal.comidaComida_in.getText());
        pstmt.executeUpdate();
        
        BDComidas.cargarTabla();
        
        con.close();
        

    }
}
