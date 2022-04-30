
package com.mycompany.proyecto_ad08;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author i_rom
 */
public class Main {
    
    public static DefaultComboBoxModel combo;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear y cargar BD
        BDAlimentos.cargarBD();
        
        //Abrir panel principal
        PanelPrincipal nuevo = new PanelPrincipal();
                //Cargar datos comBox
        PanelPrincipal.comidaBuscar.addItem("");
        PanelPrincipal.comidaBuscar.addItem("DESAYUNO");
        PanelPrincipal.comidaBuscar.addItem("COMIDA");
        PanelPrincipal.comidaBuscar.addItem("CENA");
        
        PanelPrincipal.anadirComida.addItem("");
        PanelPrincipal.anadirComida.addItem("DESAYUNO");
        PanelPrincipal.anadirComida.addItem("COMIDA");
        PanelPrincipal.anadirComida.addItem("CENA");
        nuevo.setVisible(true);
        CrearMenu.crearModelo();
        BDComidas.cargarTabla();
    }

}
