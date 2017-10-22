/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import estadisticas.metodos.ChiCuadrado;
import estadisticas.metodos.KolmogorovSmirnov;
import estadisticas.metodos.VarianzaPrueba;
import generadores.WichmannyHill;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.naming.OperationNotSupportedException;
import menu.Menu_Generadores;

/**
 *
 * @author Verónica Cortes / Jazmin Patiño
 */
public class WichmannyHillGui extends javax.swing.JFrame {

    private WichmannyHill p = new WichmannyHill();

    /**
     * Creates new form WichmannyHillGui
     */
    public WichmannyHillGui() {
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

        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldIteraciones1 = new javax.swing.JTextField();
        jLabelResultado1 = new javax.swing.JLabel();
        jButtonGenerar = new javax.swing.JButton();
        jLabelSemilla = new javax.swing.JLabel();
        jTextFieldSemilla = new javax.swing.JTextField();
        jLabelIteraciones = new javax.swing.JLabel();
        jTextFieldIteraciones = new javax.swing.JTextField();
        jLabelResultado = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaResultado = new javax.swing.JTextArea();
        jLabelSemilla1 = new javax.swing.JLabel();
        jTextFieldSemilla1 = new javax.swing.JTextField();
        jLabelSemilla2 = new javax.swing.JLabel();
        jTextFieldSemilla2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaResultado1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldITolerancia = new javax.swing.JTextField();
        jLabelResultado2 = new javax.swing.JLabel();

        jButton2.setText("Volver");
        jButton2.setName("volver"); // NOI18N

        jLabel9.setText("Tolerancia");

        jLabelResultado1.setText("Resultado");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonGenerar.setText("Generar");
        jButtonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarActionPerformed(evt);
            }
        });

        jLabelSemilla.setText("Valor semilla X:");

        jLabelIteraciones.setText("Número de iteraciones:");

        jTextFieldIteraciones.setName("iteraciones"); // NOI18N

        jLabelResultado.setText("Resultado");

        jTextAreaResultado.setColumns(20);
        jTextAreaResultado.setRows(5);
        jScrollPane4.setViewportView(jTextAreaResultado);

        jLabelSemilla1.setText("Valor semilla Y:");

        jLabelSemilla2.setText("Valor semilla Z:");

        jTextFieldSemilla2.setName("semillaZ"); // NOI18N

        jButton3.setText("Exit");
        jButton3.setName("volver"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("GENERADOR WichmannyHillGui");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("PRUEBAS ESTADISTICAS");

        jButton10.setText("Promedio");
        jButton10.setActionCommand("jButton2 ");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("CHI Cuadrado");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Varianza");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Kolmogorov-Smirnov");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jTextAreaResultado1.setColumns(20);
        jTextAreaResultado1.setRows(5);
        jScrollPane5.setViewportView(jTextAreaResultado1);

        jLabel10.setText("Tolerancia");

        jLabelResultado2.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelResultado2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton11)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton13)))))
                        .addGap(8, 8, 8)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSemilla)
                                    .addComponent(jLabelSemilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldSemilla1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSemilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSemilla, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelResultado)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelSemilla2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelIteraciones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldITolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSemilla)
                    .addComponent(jTextFieldSemilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSemilla1)
                    .addComponent(jTextFieldSemilla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSemilla2)
                    .addComponent(jTextFieldSemilla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGenerar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelResultado)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldITolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13))
                .addGap(18, 18, 18)
                .addComponent(jLabelResultado2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarActionPerformed
        try {

            Long semillaX = new Long(jTextFieldSemilla.getText());
            Long semillaY = new Long(jTextFieldSemilla1.getText());
            Long semillaZ = new Long(jTextFieldSemilla2.getText());
            Integer iteraciones = new Integer(jTextFieldIteraciones.getText());

            p.inicial(semillaX, semillaY, semillaZ, iteraciones);

            p.generar();

            jTextAreaResultado.setText(p.imprimirResultados());

        } catch (Exception ex) {
            jTextAreaResultado.setText(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonGenerarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Menu_Generadores Volver = new Menu_Generadores();
        Volver.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:

        List<BigDecimal> list = new ArrayList<>();
        for (int i = 0; i < p.numerosAleatorio.size(); i++) {
            double numero = p.numerosAleatorio.get(i);
            list.add(new BigDecimal(numero));
            int entero = (int) numero;
            list.add(new BigDecimal(numero - entero));

        }

        Double tolerancia = new Double(jTextFieldITolerancia.getText());

        jTextAreaResultado1.setText(ChiCuadrado.probar(list, tolerancia));
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        List<BigDecimal> list = new ArrayList<>();
        for (int i = 0; i < p.numerosAleatorio.size(); i++) {
            double numero = p.numerosAleatorio.get(i);
            list.add(new BigDecimal(numero));
            int entero = (int) numero;
            list.add(new BigDecimal(numero - entero));

        }

        Double tolerancia = new Double(jTextFieldITolerancia.getText());

        jTextAreaResultado1.setText(KolmogorovSmirnov.probar(list, tolerancia));

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        List<BigDecimal> list = new ArrayList<>();
        for (int i = 0; i < p.numerosAleatorio.size(); i++) {
            double numero = p.numerosAleatorio.get(i);
            list.add(new BigDecimal(numero));
            int entero = (int) numero;
            list.add(new BigDecimal(numero - entero));

        }

        Double tolerancia = new Double(jTextFieldITolerancia.getText());

        jTextAreaResultado1.setText(VarianzaPrueba.probar(list, tolerancia));
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(WichmannyHillGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WichmannyHillGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WichmannyHillGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WichmannyHillGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WichmannyHillGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelIteraciones;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelResultado1;
    private javax.swing.JLabel jLabelResultado2;
    private javax.swing.JLabel jLabelSemilla;
    private javax.swing.JLabel jLabelSemilla1;
    private javax.swing.JLabel jLabelSemilla2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextAreaResultado;
    private javax.swing.JTextArea jTextAreaResultado1;
    private javax.swing.JTextField jTextFieldITolerancia;
    private javax.swing.JTextField jTextFieldIteraciones;
    private javax.swing.JTextField jTextFieldIteraciones1;
    private javax.swing.JTextField jTextFieldSemilla;
    private javax.swing.JTextField jTextFieldSemilla1;
    private javax.swing.JTextField jTextFieldSemilla2;
    // End of variables declaration//GEN-END:variables
}
