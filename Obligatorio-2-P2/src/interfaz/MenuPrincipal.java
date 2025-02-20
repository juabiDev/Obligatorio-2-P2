/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.Entrevista;
import dominio.Sistema;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Dana Cizin
 * @author Fabian Mederos
 */
public class MenuPrincipal extends javax.swing.JFrame {
    private Sistema sistema;

    public MenuPrincipal(boolean datos) throws FileNotFoundException, IOException  {

        if(datos) {
            String path = "sistema.ser";
            ObjectInputStream in = null;
            try {
                in = new ObjectInputStream(new FileInputStream(path));
                Sistema s = (Sistema) in.readObject();
                this.sistema = s;
            } catch (IOException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(this, "No se encontraron datos, se inicia el sistema vacío", "Error", JOptionPane.ERROR_MESSAGE);
                this.sistema = new Sistema();
            } finally {
                if(in != null) {
                    in.close();
                }
            }
        } else {
            this.sistema = new Sistema();
        }

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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        DesktopPanel.setPreferredSize(new java.awt.Dimension(1000, 800));

        javax.swing.GroupLayout DesktopPanelLayout = new javax.swing.GroupLayout(DesktopPanel);
        DesktopPanel.setLayout(DesktopPanelLayout);
        DesktopPanelLayout.setHorizontalGroup(
            DesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        DesktopPanelLayout.setVerticalGroup(
            DesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );

        getContentPane().add(DesktopPanel);
        DesktopPanel.setBounds(-10, -30, 1090, 790);

        jMenu2.setText("Registros");

        jItemRTematica.setText("Temática");
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
        jItemREntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemREntrevistaActionPerformed(evt);
            }
        });
        jMenu2.add(jItemREntrevista);

        jItemRPuesto.setText("Puesto");
        jItemRPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemRPuestoActionPerformed(evt);
            }
        });
        jMenu2.add(jItemRPuesto);

        jMenuBar2.add(jMenu2);

        jMenu1.setText("Bajas");

        jItemBPostulante.setText("Postulante");
        jItemBPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBPostulanteActionPerformed(evt);
            }
        });
        jMenu1.add(jItemBPostulante);

        jMenuBar2.add(jMenu1);

        jMenu3.setText("Consultas");

        jItemCPuesto.setText("Puesto");
        jItemCPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemCPuestoActionPerformed(evt);
            }
        });
        jMenu3.add(jItemCPuesto);

        jItemCHistorial.setText("Historial postulante");
        jItemCHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemCHistorialActionPerformed(evt);
            }
        });
        jMenu3.add(jItemCHistorial);

        jItemCEstadisticas.setText("Estadísticas por temática");
        jItemCEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemCEstadisticasActionPerformed(evt);
            }
        });
        jMenu3.add(jItemCEstadisticas);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Fin");

        jItemFCerrar.setText("Cerrar sesión");
        jItemFCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemFCerrarActionPerformed(evt);
            }
        });
        jMenu4.add(jItemFCerrar);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        setBounds(0, 0, 1096, 789);
    }// </editor-fold>//GEN-END:initComponents

    private void jItemRTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemRTematicaActionPerformed
       RegistroTematica ventanaTematica = new RegistroTematica(sistema);
       ventanaTematica.setVisible(true);
       ventanaTematica.setLocation(50, 50);
    }//GEN-LAST:event_jItemRTematicaActionPerformed

    private void jItemREvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemREvaluadorActionPerformed
       RegistroEvaluador ventanaEvaluador = new RegistroEvaluador(sistema);
       ventanaEvaluador.setVisible(true);
       ventanaEvaluador.setLocation(50, 50);
    }//GEN-LAST:event_jItemREvaluadorActionPerformed

    private void jItemCEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemCEstadisticasActionPerformed
       ConsultaTematica ventanaCTematica = new ConsultaTematica(sistema);
       ventanaCTematica.setVisible(true);
       ventanaCTematica.setLocation(50, 50);
    }//GEN-LAST:event_jItemCEstadisticasActionPerformed

    private void jItemRPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemRPostulanteActionPerformed
       RegistroPostulante ventanaPostulante = new RegistroPostulante(sistema);
       ventanaPostulante.setVisible(true);
       ventanaPostulante.setLocation(50, 50);
    }//GEN-LAST:event_jItemRPostulanteActionPerformed

    private void jItemBPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBPostulanteActionPerformed
       BajaPostulante ventanaBaja = new BajaPostulante(sistema);
       ventanaBaja.setVisible(true);
       ventanaBaja.setLocation(50, 50);
    }//GEN-LAST:event_jItemBPostulanteActionPerformed

    private void jItemREntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemREntrevistaActionPerformed
       RegistroEntrevista ventanaEntrevista = new RegistroEntrevista(sistema);
       ventanaEntrevista.setVisible(true);
       ventanaEntrevista.setLocation(50, 50);
    }//GEN-LAST:event_jItemREntrevistaActionPerformed

    private void jItemRPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemRPuestoActionPerformed
        RegistroPuesto ventanaPuesto = new RegistroPuesto(sistema);
        ventanaPuesto.setVisible(true);
        ventanaPuesto.setLocation(50, 50);
    }//GEN-LAST:event_jItemRPuestoActionPerformed

    private void jItemCPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemCPuestoActionPerformed
        ConsultaPuesto ventanaCPuesto = new ConsultaPuesto(sistema);
        ventanaCPuesto.setVisible(true);
        ventanaCPuesto.setLocation(50, 50);
    }//GEN-LAST:event_jItemCPuestoActionPerformed

    private void jItemCHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemCHistorialActionPerformed
        HistorialPostulante ventanaHistorialP = new HistorialPostulante(sistema);
        ventanaHistorialP.setVisible(true);
    }//GEN-LAST:event_jItemCHistorialActionPerformed

    private void jItemFCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemFCerrarActionPerformed
        this.guardarData();
        System.exit(0);
    }//GEN-LAST:event_jItemFCerrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.guardarData();           
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void guardarData() {
    try {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sistema.ser"));
        out.writeObject(this.sistema);
        out.close();
    } catch (IOException ex) {
        System.out.println("Error al escribir en el archivo");
    } 
}
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
