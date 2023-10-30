/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.Sistema;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author User
 */
public class BajaPostulante extends javax.swing.JFrame implements Observer {
    private Sistema sistema;
    /**
     * Creates new form BajaPostulante
     */
    public BajaPostulante(Sistema unSistema) {
        sistema = unSistema;
        sistema.addObserver(this);
        initComponents();
        cargarLista();
        this.setSize(400,350);
    }

    public void cargarLista() {
        listaPostulantes.setListData(sistema.getPostulantes().toArray());
    }
    
    public void update(Observable o, Object ob) {
        cargarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPostulantes = new javax.swing.JList();
        btnEliminarPostulante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Baja Postulante");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Baja postulante");

        jScrollPane1.setViewportView(listaPostulantes);

        btnEliminarPostulante.setText("Eliminar");
        btnEliminarPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPostulanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnEliminarPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarPostulante)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPostulanteActionPerformed
        String cedulaPostulante = listaPostulantes.getSelectedValue().toString().split(" ")[2];
        System.out.println("Cedula Postulante a eliminar "+cedulaPostulante);
        sistema.eliminarPostulante(cedulaPostulante);
    }//GEN-LAST:event_btnEliminarPostulanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarPostulante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaPostulantes;
    // End of variables declaration//GEN-END:variables
}
