package com.mycompany.proyecto_ad08;

import static com.mycompany.proyecto_ad08.BDAlimentos.modelo;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author i_rom
 */
public class CrearMenu {

    public static DefaultTableModel modeloMenu = new DefaultTableModel();

    public CrearMenu() {
    }

    public static void crearModelo() {
        modeloMenu.addColumn("NOMBRE");
        modeloMenu.addColumn("CALORIAS");
        PanelPrincipal.tablaMenu.setModel(modeloMenu);

    }

    public static void ponerAlimento() {
        String nombre = (String) CargarTablaAlimentos.modeloAlimentos.getValueAt(PanelPrincipal.tablaAlimentos.getSelectedRow(), 0);
        int calorias = (int) CargarTablaAlimentos.modeloAlimentos.getValueAt(PanelPrincipal.tablaAlimentos.getSelectedRow(), 1);
        Object[] fila = new Object[]{nombre, calorias};
        modeloMenu.addRow(fila);
        PanelPrincipal.tablaMenu.setModel(modeloMenu);
    }
    
    public static void nuevoMenu(){
    int filas = PanelPrincipal.tablaMenu.getRowCount();
        for (int i = 0; i < filas; i++) {
            CrearMenu.modeloMenu.removeRow(0);          
        }
}
    public static void quitarAlimento(){
         modeloMenu.removeRow(PanelPrincipal.tablaMenu.getSelectedRowCount());
    }
}
