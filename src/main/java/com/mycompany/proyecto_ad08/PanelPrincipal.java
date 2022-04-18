/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_ad08;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlimentos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMenu = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaComida = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fechaComida_in = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comidaComida_in = new javax.swing.JTextField();
        botonBuscarComida = new javax.swing.JButton();
        botonAnadirComida = new javax.swing.JButton();
        botonAnadirMenu = new javax.swing.JButton();
        botonImprimirMenu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombreAlimento_in = new javax.swing.JTextField();
        botonBuscarAlimento = new javax.swing.JButton();
        botonAmadirAlimento = new javax.swing.JButton();
        caloriasAlimento_in = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Diario");

        tablaAlimentos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaAlimentos);

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
        jScrollPane2.setViewportView(tablaMenu);

        tablaComida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane3.setViewportView(tablaComida);

        jLabel1.setText("Comidas");

        jLabel2.setText("Menú");

        jLabel3.setText("Alimentos");

        jLabel4.setText("Fecha");

        fechaComida_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaComida_inActionPerformed(evt);
            }
        });

        jLabel5.setText("Comida");

        comidaComida_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comidaComida_inActionPerformed(evt);
            }
        });

        botonBuscarComida.setText("Buscar");
        botonBuscarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarComidaActionPerformed(evt);
            }
        });

        botonAnadirComida.setText("Añadir");
        botonAnadirComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnadirComidaActionPerformed(evt);
            }
        });

        botonAnadirMenu.setText("Añadir Alimento");
        botonAnadirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnadirMenuActionPerformed(evt);
            }
        });

        botonImprimirMenu.setText("Imprimir Menú");
        botonImprimirMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonImprimirMenuActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre");

        jLabel7.setText("Calorias");

        nombreAlimento_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreAlimento_inActionPerformed(evt);
            }
        });

        botonBuscarAlimento.setText("Buscar");
        botonBuscarAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarAlimentoActionPerformed(evt);
            }
        });

        botonAmadirAlimento.setText("Añadir");
        botonAmadirAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAmadirAlimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonBuscarComida)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botonAnadirComida))
                                    .addComponent(comidaComida_in, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAnadirMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonImprimirMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(294, 294, 294))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fechaComida_in, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(95, 95, 95)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(112, 112, 112))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(nombreAlimento_in))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(botonBuscarAlimento)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(botonAmadirAlimento))
                                            .addComponent(caloriasAlimento_in))))
                                .addGap(15, 15, 15))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonAnadirMenu)
                        .addComponent(jLabel6)
                        .addComponent(nombreAlimento_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fechaComida_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comidaComida_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonImprimirMenu)
                    .addComponent(jLabel7)
                    .addComponent(caloriasAlimento_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscarComida)
                    .addComponent(botonAnadirComida)
                    .addComponent(botonBuscarAlimento)
                    .addComponent(botonAmadirAlimento))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fechaComida_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaComida_inActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaComida_inActionPerformed

    private void botonBuscarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarComidaActionPerformed

    private void botonAnadirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnadirMenuActionPerformed
        CrearMenu.ponerAlimento();
    }//GEN-LAST:event_botonAnadirMenuActionPerformed

    private void botonImprimirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonImprimirMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonImprimirMenuActionPerformed

    private void nombreAlimento_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreAlimento_inActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreAlimento_inActionPerformed

    private void comidaComida_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comidaComida_inActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comidaComida_inActionPerformed

    private void botonBuscarAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarAlimentoActionPerformed
         BuscarAlimentos.Buscar();
    }//GEN-LAST:event_botonBuscarAlimentoActionPerformed

    private void botonAmadirAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAmadirAlimentoActionPerformed
        InsertarAlimentos.insertarAli();
        CargarTablaAlimentos.cargandoTabla();
        
    }//GEN-LAST:event_botonAmadirAlimentoActionPerformed

    private void botonAnadirComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnadirComidaActionPerformed
        try {
            AnadirComida.anadir();
        } catch (SQLException ex) {
            Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonAnadirComidaActionPerformed

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
    private javax.swing.JButton botonAmadirAlimento;
    public static javax.swing.JButton botonAnadirComida;
    public static javax.swing.JButton botonAnadirMenu;
    private javax.swing.JButton botonBuscarAlimento;
    public static javax.swing.JButton botonBuscarComida;
    public static javax.swing.JButton botonImprimirMenu;
    public static javax.swing.JSpinner caloriasAlimento_in;
    public static javax.swing.JTextField comidaComida_in;
    public static javax.swing.JTextField fechaComida_in;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTextField nombreAlimento_in;
    public static javax.swing.JTable tablaAlimentos;
    public static javax.swing.JTable tablaComida;
    public static javax.swing.JTable tablaMenu;
    // End of variables declaration//GEN-END:variables
}
