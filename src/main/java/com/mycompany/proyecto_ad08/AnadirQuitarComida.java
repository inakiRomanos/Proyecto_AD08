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

            PreparedStatement pstmt2 = null;
            pstmt2 = con.prepareStatement("INSERT INTO ALIMENTOS (FECHA_AL,COMIDA_AL,ALIMENTO,CALORIAS) VALUES (?,?,?,?)");

            pstmt2.setObject(1, PanelPrincipal.fechaComida_in.getText());
            pstmt2.setObject(2, PanelPrincipal.comidaComida_in.getText());
            pstmt2.setObject(3, PanelPrincipal.tablaMenu.getValueAt(i, 0));
            pstmt2.setObject(4, PanelPrincipal.tablaMenu.getValueAt(i, 1));
            pstmt2.execute();
        }

        BDComidas.cargarTabla();

        con.close();
    }

    public static void quitar() throws SQLException {

        con = getConnection();

        
         PreparedStatement pstmt2 = null;
         
        pstmt2 = con.prepareStatement("DELETE FROM ALIMENTOS WHERE FECHA_AL=? AND COMIDA_AL=?");

        pstmt2.setObject(1, PanelPrincipal.fechaComida_in.getText());
        pstmt2.setObject(2, PanelPrincipal.comidaComida_in.getText());
        pstmt2.executeUpdate();
        
        BDComidas.cargarTabla();
        
        con.close();
        

    }
}
