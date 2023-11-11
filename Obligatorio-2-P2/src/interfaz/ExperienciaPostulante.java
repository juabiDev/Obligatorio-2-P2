/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.Postulante;
import dominio.Sistema;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

/**
 *
 * @author Dana Cizin
 * @author Fabian Mederos
 */
public class ExperienciaPostulante extends javax.swing.JFrame implements Observer{
    private Sistema sistema;
    private Postulante postulante;
    private HashMap<String,String> temasPostulantes;
    private RegistroPostulante referencia;

    /**
     * Creates new form ExperienciaPostulante2
     */
    public ExperienciaPostulante(Sistema unSistema, Postulante unPostulante, RegistroPostulante unaReferencia) {
        sistema = unSistema;
        postulante = unPostulante;
        initComponents();
        temasPostulantes = new HashMap<>();
        referencia = unaReferencia;
        sistema.addObserver(this);
        cargarTemas();
    }
    
    public void cargarTemas() {
        comboTemas.removeAllItems();
        sistema.getTematicas().forEach((tema) -> {
            comboTemas.addItem(tema.getNombre());
        });
    }
    
    public void cargarLista() {
        String[] elementos = new String[temasPostulantes.size()];
        int contador = 0;
        
        for (Map.Entry<String, String> entry : temasPostulantes.entrySet()) {
            String aux = entry.getKey() + " (" + entry.getValue() + ")";
            elementos[contador] = aux;
            contador++;
        }
        
        listaTemas.setListData(elementos);
    }
    
    public void update(Observable o, Object ob) {
        cargarTemas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comboTemas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNivel = new javax.swing.JSpinner();
        btnAgregarTema = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTemas = new javax.swing.JList();
        btnEliminarTema = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnRegistrarPostulante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Experiencia Postulante");
        getContentPane().setLayout(null);

        jLabel2.setText("Tema:");

        comboTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTemasActionPerformed(evt);
            }
        });

        jLabel3.setText("Nivel:");

        txtNivel.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        txtNivel.setToolTipText("");

        btnAgregarTema.setText("Agregar");
        btnAgregarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTemaActionPerformed(evt);
            }
        });

        jLabel4.setText("Experiencia:");

        listaTemas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaTemas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaTemasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaTemas);

        btnEliminarTema.setText("Eliminar");
        btnEliminarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTemaActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnRegistrarPostulante.setText("Registrar");
        btnRegistrarPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPostulanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregarTema, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboTemas, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(78, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminarTema, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegistrarPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarTema)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarTema))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarPostulante)
                    .addComponent(jButton3))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 550, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTemasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTemasActionPerformed

    private void btnAgregarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTemaActionPerformed
        String temaSeleccionado = (String) comboTemas.getSelectedItem();
        int valor = (int) txtNivel.getValue();
        String nivel = String.valueOf(valor);
        
        if(!this.temasPostulantes.containsKey(temaSeleccionado)) {
            this.temasPostulantes.put(temaSeleccionado, nivel);
        }
        
        cargarLista();
    }//GEN-LAST:event_btnAgregarTemaActionPerformed

    private void btnEliminarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTemaActionPerformed
       String clave = listaTemas.getSelectedValue().toString().split(" ")[0];
       temasPostulantes.remove(clave);
       cargarLista();
    }//GEN-LAST:event_btnEliminarTemaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnRegistrarPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPostulanteActionPerformed
        try {
            sistema.agregarPostulante(postulante.getNombre(), postulante.getCedula(), postulante.getDireccion(), postulante.getTelefono(), postulante.getMail(), 
                postulante.getLinkedin(), postulante.getFormato(), temasPostulantes);
            JOptionPane.showMessageDialog(this, "Postulante creado con éxito", "OK", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            referencia.resetearCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarPostulanteActionPerformed

    private void listaTemasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaTemasValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_listaTemasValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarTema;
    private javax.swing.JButton btnEliminarTema;
    private javax.swing.JButton btnRegistrarPostulante;
    private javax.swing.JComboBox<String> comboTemas;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList listaTemas;
    private javax.swing.JSpinner txtNivel;
    // End of variables declaration//GEN-END:variables
}
