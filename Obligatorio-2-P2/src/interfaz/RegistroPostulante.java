/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.Postulante;
import dominio.Sistema;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author User
 */
public class RegistroPostulante extends javax.swing.JFrame {
    private Sistema sistema;
    private String formatoaux;
    /**
     * Creates new form RegistroPostulante2
     */
    public RegistroPostulante(Sistema unSistema) {
        sistema = unSistema;
        initComponents();
        this.setSize(630, 450);
    }
    
    public void resetearCampos() {
        txtNombrePostulante.setText("");
        txtPostulanteCedula.setText("");
        txtDireccionPostulante.setText("");
        txtTelefonoPostulante.setText("");
        txtMailPostulante.setText("");
        txtPostulanteLinkedin.setText("");
        buttonGroup1.clearSelection();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombrePostulante = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPostulanteCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccionPostulante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefonoPostulante = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMailPostulante = new javax.swing.JTextField();
        txtPostulanteLinkedin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        radioRemoto = new javax.swing.JRadioButton();
        radioPresencial = new javax.swing.JRadioButton();
        radioMixto = new javax.swing.JRadioButton();
        btnSiguientePostulante = new javax.swing.JButton();
        btnCancelarPostulante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Alta Postulante");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Cédula:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Dirección:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Teléfono:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Mail:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Linkedin:");

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

        btnSiguientePostulante.setText("Siguiente");
        btnSiguientePostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguientePostulanteActionPerformed(evt);
            }
        });

        btnCancelarPostulante.setText("Cancelar");
        btnCancelarPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPostulanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(91, 91, 91)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPostulanteLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefonoPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDireccionPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPostulanteCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombrePostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMailPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(radioRemoto)
                                    .addGap(73, 73, 73)
                                    .addComponent(radioPresencial)
                                    .addGap(59, 59, 59)
                                    .addComponent(radioMixto))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnCancelarPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSiguientePostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombrePostulante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPostulanteCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDireccionPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefonoPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMailPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPostulanteLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(radioRemoto)
                    .addComponent(radioMixto)
                    .addComponent(radioPresencial))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarPostulante)
                    .addComponent(btnSiguientePostulante))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 610, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguientePostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguientePostulanteActionPerformed
        String nombre = txtNombrePostulante.getText();
        String cedula = txtPostulanteCedula.getText();
        String direccion = txtDireccionPostulante.getText();
        String telefono = txtTelefonoPostulante.getText();
        String mail = txtMailPostulante.getText();
        String linkedin = txtPostulanteLinkedin.getText();
        String formato = formatoaux;
        
        boolean existeCedula = sistema.validarExisteCedula(cedula);
        Postulante p = new Postulante();
        p.setCedula(cedula);
        p.setNombre(nombre);
        p.setDireccion(direccion);
        p.setTelefono(telefono);
        p.setMail(mail);
        p.setLinkedin(linkedin);
        p.setFormato(formato);
        
        if(!existeCedula) {
            ExperienciaPostulante ventanaAux = new ExperienciaPostulante(sistema, p, this);
            ventanaAux.setLocation(50, 50);
            ventanaAux.setSize(500, 325);
            ventanaAux.setVisible(true);
        } else {
           JOptionPane.showMessageDialog(this, "Postulante ya existente", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnSiguientePostulanteActionPerformed

    private void radioRemotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioRemotoActionPerformed
       formatoaux = buttonGroup1.getSelection().isSelected() ? "remoto" : "";

    }//GEN-LAST:event_radioRemotoActionPerformed

    private void radioPresencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPresencialActionPerformed
       formatoaux = buttonGroup1.getSelection().isSelected() ? "presencial" : "";
    }//GEN-LAST:event_radioPresencialActionPerformed

    private void radioMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMixtoActionPerformed
       formatoaux = buttonGroup1.getSelection().isSelected() ? "mixto" : "";
    }//GEN-LAST:event_radioMixtoActionPerformed

    private void btnCancelarPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPostulanteActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarPostulanteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarPostulante;
    private javax.swing.JButton btnSiguientePostulante;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioMixto;
    private javax.swing.JRadioButton radioPresencial;
    private javax.swing.JRadioButton radioRemoto;
    private javax.swing.JTextField txtDireccionPostulante;
    private javax.swing.JTextField txtMailPostulante;
    private javax.swing.JTextField txtNombrePostulante;
    private javax.swing.JTextField txtPostulanteCedula;
    private javax.swing.JTextField txtPostulanteLinkedin;
    private javax.swing.JTextField txtTelefonoPostulante;
    // End of variables declaration//GEN-END:variables
}
