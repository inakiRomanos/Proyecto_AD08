package com.mycompany.proyecto_ad08;

import static com.mycompany.proyecto_ad08.BDComidas.con;
import static com.mycompany.proyecto_ad08.BDComidas.getConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * En esta clase podemos añadir, quitar y actualizar menus(en codigo comida)
 *
 * @author i_rom
 */
public class AnadirQuitarComida {

    public AnadirQuitarComida() {
    }

    public static void anadir() throws SQLException {
        int filas = PanelPrincipal.tablaMenu.getRowCount();

        //Comprobamos que los campos de nombre y calorias tengan datos
        if (PanelPrincipal.anadirComida.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo TURNO es obligatorio");
        } else if (PanelPrincipal.fechaAndirComida.getDate() == null) {
            JOptionPane.showMessageDialog(null, "El campo FECHA es obligatorio");
        } else if (PanelPrincipal.tablaMenu.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "El menu no contien platos");
        } else {

            con = getConnection();

            for (int i = 0; i < filas; i++) {

                PreparedStatement pstmt = null;
                pstmt = con.prepareStatement("INSERT INTO ALIMENTOS (FECHA,COMIDA,ALIMENTO,CALORIAS) VALUES (?,?,?,?)");

                pstmt.setObject(1, PanelPrincipal.fechaAndirComida.getDate());
                pstmt.setObject(2, PanelPrincipal.anadirComida.getSelectedItem().toString());
                pstmt.setObject(3, PanelPrincipal.tablaMenu.getValueAt(i, 0));
                pstmt.setObject(4, PanelPrincipal.tablaMenu.getValueAt(i, 1));
                pstmt.execute();
            }

            BDComidas.cargarTabla();

            con.close();
        }
    }

    public static void quitar() throws SQLException {

        //Pedimos verificacion del borrado
        int reply = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere eliminar el menu seleccionada?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {

            //Conectamos BBDD
            con = getConnection();

            PreparedStatement pstmt = null;

            //Borramos la comida seleccionada
            pstmt = con.prepareStatement("DELETE FROM ALIMENTOS WHERE FECHA=? AND COMIDA=?");

            pstmt.setObject(1, (Date) BDComidas.modeloComidas.getValueAt(PanelPrincipal.tablaComida.getSelectedRow(), 0));
            pstmt.setObject(2, (String) BDComidas.modeloComidas.getValueAt(PanelPrincipal.tablaComida.getSelectedRow(), 1));
            pstmt.executeUpdate();

            //Informamos del borrado
            JOptionPane.showMessageDialog(null, "El menú seleccionada ha sido borrado");

            //Actualizamos el panel
            BDComidas.cargarTabla();
            CrearMenu.nuevoMenu();

            //Desconectamos BBDD
            con.close();
        }

    }

    static public void borrarActualizar() throws SQLException {

        //En este metodo borramos los datos de la comida seleccionada para poder volver a insertarla con los nuevos datos actualizados
        con = getConnection();

        PreparedStatement pstmt = null;

        pstmt = con.prepareStatement("DELETE FROM ALIMENTOS WHERE FECHA=? AND COMIDA=?");

        pstmt.setObject(1, (Date) BDComidas.modeloComidas.getValueAt(PanelPrincipal.tablaComida.getSelectedRow(), 0));
        pstmt.setObject(2, (String) BDComidas.modeloComidas.getValueAt(PanelPrincipal.tablaComida.getSelectedRow(), 1));
        pstmt.executeUpdate();

        con.close();

    }

    public static void anadirActualizar() throws SQLException {

        //En este metodo volvemos añadir la comida seleccionada con los datos actualizamos
        con = getConnection();

        int filas = PanelPrincipal.tablaMenu.getRowCount();

        for (int i = 0; i < filas; i++) {

            PreparedStatement pstmt = null;
            pstmt = con.prepareStatement("INSERT INTO ALIMENTOS (FECHA,COMIDA,ALIMENTO,CALORIAS) VALUES (?,?,?,?)");

            pstmt.setObject(1, (Date) BDComidas.modeloComidas.getValueAt(PanelPrincipal.tablaComida.getSelectedRow(), 0));
            pstmt.setObject(2, (String) BDComidas.modeloComidas.getValueAt(PanelPrincipal.tablaComida.getSelectedRow(), 1));
            pstmt.setObject(3, PanelPrincipal.tablaMenu.getValueAt(i, 0));
            pstmt.setObject(4, PanelPrincipal.tablaMenu.getValueAt(i, 1));
            pstmt.execute();
        }

        con.close();

    }

    public static void actualizarComida() throws SQLException {

        //Actulizamos la comida selccionada, borramos los datos viejos e insertamos los nuevos
        borrarActualizar();
        anadirActualizar();

    }

}
