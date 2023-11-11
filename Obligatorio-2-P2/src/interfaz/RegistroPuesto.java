/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.ErrorCamposVacios;
import dominio.ErrorNombreRepetido;
import dominio.Sistema;
import java.awt.HeadlessException;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Dana Cizin
 * @author Fabian Mederos
 */
public class RegistroPuesto extends javax.swing.JFrame implements Observer {
    private Sistema sistema;
    private String formatoaux = "";

    public RegistroPuesto(Sistema unSistema) {
        sistema = unSistema;
        sistema.addObserver(this);
        initComponents();
        this.setSize(550,450);
        cargarLista();
    }
    
    public void cargarLista() {
        int temas = sistema.getTematicas().size();
        
        if(temas == 0) {        
            JOptionPane.showMessageDialog(this, "No hay Tematicas Creadas", "OK", JOptionPane.INFORMATION_MESSAGE);
            SwingUtilities.invokeLater(() -> {
               this.dispose();
            });
        } else {
            listaTemas.setListData(sistema.getTematicas().toArray());
        }
    }
    
    public void update(Observable o, Object ob) {
        cargarLista();
    }
    
    public void resetearCampos() {
        txtNombrePuesto.setText("");
        buttonGroup1.clearSelection();
        cargarLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombrePuesto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        radioRemoto = new javax.swing.JRadioButton();
        radioPresencial = new javax.swing.JRadioButton();
        radioMixto = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        btnCancelarEvaluador = new javax.swing.JButton();
        btnRegistroPuesto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTemas = new javax.swing.JList();
        listaTemas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Puesto");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registro puesto");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Formato:");

        buttonGroup1.add(radioRemoto);
        radioRemoto.setText("Remoto");
        radioRemoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioRemotoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioPresencial);
        radioPresencial.setText("Presencial");
        radioPresencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPresencialActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioMixto);
        radioMixto.setText("Mixto");
        radioMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMixtoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Temas:");

        btnCancelarEvaluador.setText("Cancelar");
        btnCancelarEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEvaluadorActionPerformed(evt);
            }
        });

        btnRegistroPuesto.setText("Registrar");
        btnRegistroPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroPuestoActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaTemas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGap(42, 42, 42)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioRemoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(radioPresencial)
                        .addGap(75, 75, 75)
                        .addComponent(radioMixto))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombrePuesto, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(201, 201, 201))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelarEvaluador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistroPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombrePuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(radioRemoto)
                    .addComponent(radioPresencial)
                    .addComponent(radioMixto))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarEvaluador)
                    .addComponent(btnRegistroPuesto))
                .addGap(52, 52, 52))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 540, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroPuestoActionPerformed
        String nombre = txtNombrePuesto.getText();
        String formato = formatoaux;
        Object[] selectedValues = listaTemas.getSelectedValuesList().toArray();
        
        try {
            if(selectedValues.length > 0) {
                sistema.agregarPuesto(nombre, formato, selectedValues);
                JOptionPane.showMessageDialog(this, "Puesto creado con éxito", "OK", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar al menos un tema", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ErrorCamposVacios | ErrorNombreRepetido | HeadlessException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
         
        this.resetearCampos();
    }//GEN-LAST:event_btnRegistroPuestoActionPerformed

    private void btnCancelarEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEvaluadorActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarEvaluadorActionPerformed

    private void radioRemotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioRemotoActionPerformed
        formatoaux = buttonGroup1.getSelection().isSelected() ? "remoto" : "";
    }//GEN-LAST:event_radioRemotoActionPerformed

    private void radioPresencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPresencialActionPerformed
        formatoaux = buttonGroup1.getSelection().isSelected() ? "presencial" : "";
    }//GEN-LAST:event_radioPresencialActionPerformed

    private void radioMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMixtoActionPerformed
        formatoaux = buttonGroup1.getSelection().isSelected() ? "mixto" : "";
    }//GEN-LAST:event_radioMixtoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarEvaluador;
    private javax.swing.JButton btnRegistroPuesto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaTemas;
    private javax.swing.JRadioButton radioMixto;
    private javax.swing.JRadioButton radioPresencial;
    private javax.swing.JRadioButton radioRemoto;
    private javax.swing.JTextField txtNombrePuesto;
    // End of variables declaration//GEN-END:variables
}
