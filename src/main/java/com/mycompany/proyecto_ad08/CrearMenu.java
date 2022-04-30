package com.mycompany.proyecto_ad08;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * En esta clase creamos una tabla donde por una parte cargaremos los alimentos que queremos añadir a una comida y por otra mostraremos que alimentos 
 * componen una comida con la selccionamos en la tabla comida
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
        
        //En este metodo añadimos a la tabla los alimentos que seleccionamos en la tabla alimentos
        String nombre = (String) CargarTablaAlimentos.modeloAlimentos.getValueAt(PanelAlimentos.tablaAlimentos.getSelectedRow(), 0);
        int calorias = (int) CargarTablaAlimentos.modeloAlimentos.getValueAt(PanelAlimentos.tablaAlimentos.getSelectedRow(), 1);

        int validar = 0;

        for (int i = 0; i < PanelPrincipal.tablaMenu.getRowCount(); i++) {
            if (PanelPrincipal.tablaMenu.getValueAt(i, 0).toString().equals(nombre)) {
                validar = validar + 1;
            }
        }

        if (validar > 0) {
            JOptionPane.showMessageDialog(null, "El plato ya se encuentra en el menu");
        } else {
            Object[] fila = new Object[]{nombre, calorias};
            modeloMenu.addRow(fila);
            PanelPrincipal.tablaMenu.setModel(modeloMenu);
        }
    }

    public static void nuevoMenu() {
        
        //Este metodo sirve para borrar la tabla cuando queremos crear un nuevo menu
        int filas = PanelPrincipal.tablaMenu.getRowCount();
        for (int i = 0; i < filas; i++) {
            CrearMenu.modeloMenu.removeRow(0);
        }

        PanelPrincipal.fechaAndirComida.setEnabled(true);
        PanelPrincipal.anadirComida.setEnabled(true);
        
    }

    //Metodo borra de la tabla menu el alimento seleccionamos en la tabla menu con el boton derecho del raton
    public static void quitarAlimento() {
        int reply = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere eliminar el plato seleccionado?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
        modeloMenu.removeRow(PanelPrincipal.tablaMenu.getSelectedRowCount());
        }
    }
}
