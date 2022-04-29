/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_ad08;

import static com.mycompany.proyecto_ad08.BDComidas.con;
import static com.mycompany.proyecto_ad08.BDComidas.getConnection;
import static com.mycompany.proyecto_ad08.PanelPrincipal.anadirComida;
import static com.mycompany.proyecto_ad08.PanelPrincipal.fechaAndirComida;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;


/**
 *
 * @author i_rom
 */
public class ImprimirMenu {

    public ImprimirMenu() {
    }

    static public void imprimir() throws JRException{
        con = getConnection();

        Map parametros = new HashMap();
        parametros.put("FECHA", fechaAndirComida.getDate());
        parametros.put("COMIDA", anadirComida.getSelectedItem().toString());

        JasperPrint print = JasperFillManager.fillReport("Menus/Menus.jasper", parametros, con);
        JasperExportManager.exportReportToPdfFile(print, "Menus.pdf");
        System.exit(0);
    }

}
