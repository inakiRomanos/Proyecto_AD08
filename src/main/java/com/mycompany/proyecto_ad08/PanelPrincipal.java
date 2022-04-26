/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_ad08;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author i_rom
 */
public class PanelPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PanelPrincipal
     */
    public PanelPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuAlimentos = new javax.swing.JPopupMenu();
        borrarAlimento = new javax.swing.JMenuItem();
        PopupMenuComidas = new javax.swing.JPopupMenu();
        borrarComida = new javax.swing.JMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMenu = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaComida = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fechaBuscarComidaIn = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        buscarComida = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        fechaAndirComida = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        anadirComida = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        sumatorioCalorias = new javax.swing.JTextField();
        nuevoMenu = new javax.swing.JToggleButton();
        imprimirMenu = new javax.swing.JToggleButton();
        anadirMenú = new javax.swing.JToggleButton();
        actualizarMenu = new javax.swing.JToggleButton();
        alimentos = new javax.swing.JToggleButton();

        borrarAlimento.setText("Borrar");
        borrarAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarAlimentoActionPerformed(evt);
            }
        });
        jPopupMenuAlimentos.add(borrarAlimento);

        borrarComida.setText("Borrar");
        borrarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarComidaActionPerformed(evt);
            }
        });
        PopupMenuComidas.add(borrarComida);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Diario");

        tablaMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tablaMenu.setComponentPopupMenu(jPopupMenuAlimentos);
        jScrollPane2.setViewportView(tablaMenu);

        tablaComida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tablaComida.setComponentPopupMenu(PopupMenuComidas);
        tablaComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaComidaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaComida);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Comidas");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Menú");

        jLabel4.setText("Fecha");

        jLabel5.setText("Comida");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cena", "Comida", "Desayuno" }));
        jComboBox1.setSelectedIndex(-1);

        buscarComida.setText("Buscar");
        buscarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarComidaActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha");

        jLabel6.setText("Comida");

        anadirComida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desayuno", "Comida", "Cena" }));
        anadirComida.setSelectedIndex(-1);

        jLabel7.setText("Calorias");

        sumatorioCalorias.setEnabled(false);

        nuevoMenu.setText("Nuevo Menú");
        nuevoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoMenuActionPerformed(evt);
            }
        });

        imprimirMenu.setText("Imprimir Menú");

        anadirMenú.setText("Añadir Menú");
        anadirMenú.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirMenúActionPerformed(evt);
            }
        });

        actualizarMenu.setText("Actualizar Menú");
        actualizarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarMenuActionPerformed(evt);
            }
        });

        alimentos.setText("Alimentos");
        alimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alimentosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fechaBuscarComidaIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(buscarComida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechaAndirComida, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(anadirComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(sumatorioCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(imprimirMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(nuevoMenu)
                                .addGap(18, 18, 18)
                                .addComponent(anadirMenú)
                                .addGap(18, 18, 18)
                                .addComponent(actualizarMenu)))
                        .addGap(18, 18, 18)
                        .addComponent(alimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(sumatorioCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(anadirComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(fechaAndirComida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fechaBuscarComidaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(16, 16, 16)
                        .addComponent(buscarComida))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nuevoMenu)
                                    .addComponent(anadirMenú)
                                    .addComponent(actualizarMenu))
                                .addGap(16, 16, 16)
                                .addComponent(imprimirMenu))
                            .addComponent(alimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaComidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaComidaMouseClicked
        BDComidas.recargarMenu();
        String seleccion = (String) BDComidas.modeloComidas.getValueAt(PanelPrincipal.tablaComida.getSelectedRow(), 1);
        if (seleccion.equals("Desayuno")) {
            anadirComida.setSelectedIndex(0);
        }
        if (seleccion.equals("Comida")) {
            anadirComida.setSelectedIndex(1);
        }
        if (seleccion.equals("Cena")) {
            anadirComida.setSelectedIndex(2);
        }

        /*anadirComida.setEnabled(false);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String fechaSeleccionada = sdf.format((Date) BDComidas.modeloComidas.getValueAt(PanelPrincipal.tablaComida.getSelectedRow(), 0));
        fechaAndirComida.setDateFormatString(fechaSeleccionada);

        int subtotal = 0;
        for (int i = 0; i < tablaMenu.getRowCount(); i++) {
            subtotal = subtotal + (int) tablaMenu.getValueAt(i, 1);
        }
        
        String total = String.valueOf(subtotal);
        sumatorioCalorias.setText(total);*/
    }//GEN-LAST:event_tablaComidaMouseClicked

    private void buscarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarComidaActionPerformed

    private void alimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alimentosActionPerformed
        PanelAlimentos nuevo = new PanelAlimentos();
        nuevo.setVisible(true);
        CargarTablaAlimentos.cargandoTabla();
    }//GEN-LAST:event_alimentosActionPerformed

    private void nuevoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoMenuActionPerformed
        CrearMenu.nuevoMenu();
    }//GEN-LAST:event_nuevoMenuActionPerformed

    private void anadirMenúActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirMenúActionPerformed

        try {
            AnadirQuitarComida.anadir();
        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_anadirMenúActionPerformed

    private void actualizarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarMenuActionPerformed
        try {
            AnadirQuitarComida.actualizarComida();
        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_actualizarMenuActionPerformed

    private void borrarAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarAlimentoActionPerformed
        CrearMenu.quitarAlimento();
    }//GEN-LAST:event_borrarAlimentoActionPerformed

    private void borrarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarComidaActionPerformed
        try {
            AnadirQuitarComida.quitar();
        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_borrarComidaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu PopupMenuComidas;
    public static javax.swing.JToggleButton actualizarMenu;
    public static javax.swing.JToggleButton alimentos;
    public static javax.swing.JComboBox<String> anadirComida;
    public static javax.swing.JToggleButton anadirMenú;
    public static javax.swing.JMenuItem borrarAlimento;
    private javax.swing.JMenuItem borrarComida;
    public static javax.swing.JToggleButton buscarComida;
    public static com.toedter.calendar.JDateChooser fechaAndirComida;
    public static com.toedter.calendar.JDateChooser fechaBuscarComidaIn;
    public static javax.swing.JToggleButton imprimirMenu;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPopupMenu jPopupMenuAlimentos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JToggleButton nuevoMenu;
    public static javax.swing.JTextField sumatorioCalorias;
    public static javax.swing.JTable tablaComida;
    public static javax.swing.JTable tablaMenu;
    // End of variables declaration//GEN-END:variables
}
