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
        con = getConnection();

        Map parametros = new HashMap();
        parametros.put("FECHA", fechaAndirComida.getDate());
        parametros.put("COMIDA", anadirComida.getSelectedItem().toString());

        JasperPrint print = JasperFillManager.fillReport("Menus/Menus.jasper", parametros, con);
        JasperExportManager.exportReportToPdfFile(print, ruta);
        try {
            File path = new File(ruta);
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
        }

        System.exit(0);
    }

    static public FileFilter filtro() {
        FileFilter filter = new FileNameExtensionFilter("pdf", "pdf");
        return filter;
    }

    public static void guardarArchivo() throws JRException, IOException {

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
