/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import java.awt.Component;

/**
 *
 * @author User
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Frame() {
        initComponents();
        this.setSize(1000,800);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        DesktopPanel = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jItemRTematica = new javax.swing.JMenuItem();
        jItemRPostulante = new javax.swing.JMenuItem();
        jItemREvaluador = new javax.swing.JMenuItem();
        jItemREntrevista = new javax.swing.JMenuItem();
        jItemRPuesto = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jItemBPostulante = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jItemCPuesto = new javax.swing.JMenuItem();
        jItemCHistorial = new javax.swing.JMenuItem();
        jItemCEstadisticas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jItemFCerrar = new javax.swing.JMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Personal");
        getContentPane().setLayout(null);

        DesktopPanel.setPreferredSize(new java.awt.Dimension(1000, 800));

        javax.swing.GroupLayout DesktopPanelLayout = new javax.swing.GroupLayout(DesktopPanel);
        DesktopPanel.setLayout(DesktopPanelLayout);
        DesktopPanelLayout.setHorizontalGroup(
            DesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        DesktopPanelLayout.setVerticalGroup(
            DesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        getContentPane().add(DesktopPanel);
        DesktopPanel.setBounds(-10, -30, 1000, 800);

        jMenu2.setText("Registros");

        jItemRTematica.setText("Tematica");
        jItemRTematica.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jItemRTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemRTematicaActionPerformed(evt);
            }
        });
        jMenu2.add(jItemRTematica);

        jItemRPostulante.setText("Postulante");
        jItemRPostulante.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jItemRPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemRPostulanteActionPerformed(evt);
            }
        });
        jMenu2.add(jItemRPostulante);

        jItemREvaluador.setText("Evaluador");
        jItemREvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemREvaluadorActionPerformed(evt);
            }
        });
        jMenu2.add(jItemREvaluador);

        jItemREntrevista.setText("Entrevista");
        jMenu2.add(jItemREntrevista);

        jItemRPuesto.setText("Puesto");
        jMenu2.add(jItemRPuesto);

        jMenuBar2.add(jMenu2);

        jMenu1.setText("Bajas");

        jItemBPostulante.setText("Postulante");
        jMenu1.add(jItemBPostulante);

        jMenuBar2.add(jMenu1);

        jMenu3.setText("Consultas");

        jItemCPuesto.setText("Puesto");
        jMenu3.add(jItemCPuesto);

        jItemCHistorial.setText("Historial Postulante");
        jMenu3.add(jItemCHistorial);

        jItemCEstadisticas.setText("Estadisticas por Temática");
        jItemCEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemCEstadisticasActionPerformed(evt);
            }
        });
        jMenu3.add(jItemCEstadisticas);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Fin");

        jItemFCerrar.setText("Cerrar Sesión");
        jMenu4.add(jItemFCerrar);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        setBounds(0, 0, 831, 595);
    }// </editor-fold>//GEN-END:initComponents

    private void jItemRTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemRTematicaActionPerformed
       RegistroTematica ventanaTematica = new RegistroTematica();
       ventanaTematica.setVisible(true);
       ventanaTematica.setLocation(50, 50);
    }//GEN-LAST:event_jItemRTematicaActionPerformed

    private void jItemREvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemREvaluadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jItemREvaluadorActionPerformed

    private void jItemCEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemCEstadisticasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jItemCEstadisticasActionPerformed

    private void jItemRPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemRPostulanteActionPerformed
       RegistroPostulante ventanaPostulante = new RegistroPostulante();
       ventanaPostulante.setVisible(true);
       ventanaPostulante.setLocation(50, 50);
    }//GEN-LAST:event_jItemRPostulanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPanel;
    private javax.swing.JMenuItem jItemBPostulante;
    private javax.swing.JMenuItem jItemCEstadisticas;
    private javax.swing.JMenuItem jItemCHistorial;
    private javax.swing.JMenuItem jItemCPuesto;
    private javax.swing.JMenuItem jItemFCerrar;
    private javax.swing.JMenuItem jItemREntrevista;
    private javax.swing.JMenuItem jItemREvaluador;
    private javax.swing.JMenuItem jItemRPostulante;
    private javax.swing.JMenuItem jItemRPuesto;
    private javax.swing.JMenuItem jItemRTematica;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}
