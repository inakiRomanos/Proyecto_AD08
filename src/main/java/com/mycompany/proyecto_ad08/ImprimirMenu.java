/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_ad08;

import static com.mycompany.proyecto_ad08.BDComidas.con;
import static com.mycompany.proyecto_ad08.BDComidas.getConnection;
import static com.mycompany.proyecto_ad08.PanelPrincipal.anadirComida;
import static com.mycompany.proyecto_ad08.PanelPrincipal.fechaAndirComida;
import java.awt.Component;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author i_rom
 */
public class ImprimirMenu {

    public static String ruta;

    public ImprimirMenu() {
    }

    static public void imprimir() throws JRException, IOException {
        
        //Este metodo nos permite imprimir en pdf el menu selccionado para ello usamos un .jasper
        con = getConnection();

        Map parametros = new HashMap();
        parametros.put("FECHA", fechaAndirComida.getDate());
        parametros.put("COMIDA", anadirComida.getSelectedItem().toString());

        JasperPrint print = JasperFillManager.fillReport("Menus/Menus.jasper", parametros, con);
        JasperExportManager.exportReportToPdfFile(print, ruta);
        
        //Muestra el pdf despues de ser guardado
        try {
            File path = new File(ruta);
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
        }

        System.exit(0);
    }

    public static void guardarArchivo() throws JRException, IOException {
        
        //Este metodo abre una ventana que nos permite seleccionar la ruta y el nombre con el que queremos guardar el pdf

        JFileChooser fc = new JFileChooser();

        fc.setApproveButtonText("Guardar");

        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.PDF", "pdf");

        fc.setFileFilter(filtro);
        Component ventana = null;

        int seleccion = fc.showOpenDialog(ventana);

        if (seleccion == JFileChooser.APPROVE_OPTION) {

            ruta = fc.getSelectedFile().toString();
            ruta = ruta + ".pdf";

            imprimir();
        }

    }

}
