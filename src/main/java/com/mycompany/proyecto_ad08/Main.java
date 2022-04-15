/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_ad08;

/**
 *
 * @author i_rom
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear y cargar BD
        BDAlimentos.cargarBD();

        //Abrir panel principal
        PanelPrincipal nuevo = new PanelPrincipal();
        nuevo.setVisible(true);
        CargarTablaAlimentos.cargandoTabla();
    }

}
