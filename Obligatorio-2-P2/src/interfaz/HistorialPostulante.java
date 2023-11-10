/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.CriterioPostulantes;
import dominio.Entrevista;
import dominio.Postulante;
import dominio.Sistema;
import java.awt.Color;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class HistorialPostulante extends javax.swing.JFrame implements Observer{
    private Sistema sistema;
    private Postulante postulante;
    /**
     * Creates new form HistorialPostulante
     */
    public HistorialPostulante(Sistema unSistema) {
        sistema = unSistema;
        sistema.addObserver(this);
        initComponents();
        this.setSize(770, 670);
        cargarLista();
    }
    
    public void cargarLista() {
        ArrayList<Postulante> listaAux = sistema.getPostulantes();
        
        if(listaAux.size() == 0) {
            
           JOptionPane.showMessageDialog(this, "No hay Postulantes Creados", "OK", JOptionPane.INFORMATION_MESSAGE);
             // Cerrar la ventana después de mostrar el mensaje
            SwingUtilities.invokeLater(() -> {
                this.dispose();
            });
        } else {
            Collections.sort(listaAux, new CriterioPostulantes());
            listaPostulantes.setListData(listaAux.toArray());
        }
                

    }
    
    public void cargarTabla() {
        
        DefaultTableModel modelo = (DefaultTableModel) tablaEntrevistas.getModel();
        modelo.setRowCount(0); // Limpia cualquier dato existente en la tabla

        for (Entrevista e : sistema.obtenerEntrevistasPostulante(postulante)) {
            Object[] fila = {e.getNroEntrevista(), e.getEntrevistador().formatoTabla(), e.getPuntaje(), e.getComentarios()};
            modelo.addRow(fila);
        }
        
    }
    
    public void limpiarBusqueda() {
        DefaultTableModel modelo = (DefaultTableModel) tablaEntrevistas.getModel();

        for (int row = 0; row < modelo.getRowCount(); row++) {
            String comentarios = modelo.getValueAt(row, 3).toString();
            String comentariosFormateados = comentarios;

            // Elimina cualquier formato HTML anterior
            comentariosFormateados = comentariosFormateados.replaceAll("<[^>]*>", "");

            modelo.setValueAt(comentariosFormateados, row, 3);
        }

        tablaEntrevistas.updateUI();
    }
    
    public void cargarDatosPostulante() {
        
        textArea.setText("");
        txtCedulaHistorial.setText(postulante.getCedula());
        txtNombreHistorial.setText(postulante.getNombre());
        txtMailHistorial.setText(postulante.getMail());
        txtDireccionHistorial.setText(postulante.getDireccion());
        txtTelefonoHistorial.setText(postulante.getTelefono());
        txtFormatoHistorial.setText(postulante.getFormato());

        txtLinkedinHistorial.setText(postulante.getLinkedin());
        txtLinkedinHistorial.setForeground(Color.blue);
        txtLinkedinHistorial.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        ArrayList<String> temas = postulante.formatoTemas();
        
        for(String t : temas) {
            textArea.append(t + "\n");
        }

    }
    
    public void update(Observable o, Object ob) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreHistorial = new javax.swing.JLabel();
        txtCedulaHistorial = new javax.swing.JLabel();
        txtDireccionHistorial = new javax.swing.JLabel();
        txtTelefonoHistorial = new javax.swing.JLabel();
        txtMailHistorial = new javax.swing.JLabel();
        txtLinkedinHistorial = new javax.swing.JLabel();
        txtFormatoHistorial = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPostulantes = new javax.swing.JList();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnResetear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEntrevistas = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Historial Postulante");
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Historial postulante");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(280, 10, 220, 25);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 70, 70, 14);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Cédula:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 100, 70, 14);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Dirección:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(310, 130, 80, 14);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Teléfono:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 150, 80, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Mail:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 180, 50, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Linkedin:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(310, 210, 80, 14);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Formato:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(310, 240, 80, 14);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Experiencia:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(310, 270, 100, 14);

        txtNombreHistorial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(txtNombreHistorial);
        txtNombreHistorial.setBounds(390, 70, 370, 20);

        txtCedulaHistorial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(txtCedulaHistorial);
        txtCedulaHistorial.setBounds(390, 100, 370, 20);

        txtDireccionHistorial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(txtDireccionHistorial);
        txtDireccionHistorial.setBounds(390, 130, 370, 20);

        txtTelefonoHistorial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(txtTelefonoHistorial);
        txtTelefonoHistorial.setBounds(390, 150, 370, 20);

        txtMailHistorial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(txtMailHistorial);
        txtMailHistorial.setBounds(390, 180, 340, 20);

        txtLinkedinHistorial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtLinkedinHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLinkedinHistorialMouseClicked(evt);
            }
        });
        jPanel1.add(txtLinkedinHistorial);
        txtLinkedinHistorial.setBounds(390, 200, 360, 20);

        txtFormatoHistorial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(txtFormatoHistorial);
        txtFormatoHistorial.setBounds(390, 240, 350, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Postulantes:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(6, 65, 90, 14);

        listaPostulantes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaPostulantes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPostulantesValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaPostulantes);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(6, 85, 270, 310);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 410, 760, 20);

        jLabel11.setText("Buscar:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 420, 70, 16);
        jPanel1.add(txtBuscar);
        txtBuscar.setBounds(60, 420, 248, 22);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(330, 420, 100, 22);

        btnResetear.setText("Resetear");
        btnResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetearActionPerformed(evt);
            }
        });
        jPanel1.add(btnResetear);
        btnResetear.setBounds(440, 420, 100, 22);

        tablaEntrevistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro", "Evaluador", "Puntaje", "Comentarios"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaEntrevistas);
        if (tablaEntrevistas.getColumnModel().getColumnCount() > 0) {
            tablaEntrevistas.getColumnModel().getColumn(0).setMinWidth(50);
            tablaEntrevistas.getColumnModel().getColumn(0).setMaxWidth(100);
            tablaEntrevistas.getColumnModel().getColumn(1).setMinWidth(250);
            tablaEntrevistas.getColumnModel().getColumn(1).setMaxWidth(450);
            tablaEntrevistas.getColumnModel().getColumn(2).setMinWidth(100);
            tablaEntrevistas.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(10, 460, 740, 120);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);
        btnSalir.setBounds(10, 590, 100, 22);

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane4.setViewportView(textArea);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(400, 270, 350, 130);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 630);

        setBounds(0, 0, 769, 631);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetearActionPerformed
        limpiarBusqueda();
        txtBuscar.setText("");
    }//GEN-LAST:event_btnResetearActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(postulante == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un Postulante", "OK", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String texto = txtBuscar.getText().toLowerCase();

            DefaultTableModel modelo = (DefaultTableModel) tablaEntrevistas.getModel();

            limpiarBusqueda();
            
            int cantidadCoincidencias = 0;

            for (int row = 0; row < modelo.getRowCount(); row++) {
                String comentarios = modelo.getValueAt(row, 3).toString().toLowerCase();
                String comentariosFormateados = comentarios;
                if (comentarios.contains(texto)) {
                    cantidadCoincidencias++;
                    comentariosFormateados = comentarios.replaceAll(texto, "<font color='red'>" + texto + "</font>");
                    modelo.setValueAt("<html>" + comentariosFormateados + "</html>", row, 3);
                }

            }
            
            if(cantidadCoincidencias == 0) {
               JOptionPane.showMessageDialog(this, "No se encontraron coincidencias", "OK", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void listaPostulantesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPostulantesValueChanged
        postulante = sistema.obtenerPostulante(((Postulante) listaPostulantes.getSelectedValue()).getCedula());
        cargarTabla();
        cargarDatosPostulante();
    }//GEN-LAST:event_listaPostulantesValueChanged

    private void txtLinkedinHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLinkedinHistorialMouseClicked
        if(postulante != null) {
            String linkedin = postulante.getLinkedin();
            if(linkedin != null && !linkedin.isEmpty()) {
                try {
                    java.awt.Desktop.getDesktop().browse(new java.net.URI(linkedin));
                } catch(java.io.IOException | java.net.URISyntaxException e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_txtLinkedinHistorialMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnResetear;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList listaPostulantes;
    private javax.swing.JTable tablaEntrevistas;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JLabel txtCedulaHistorial;
    private javax.swing.JLabel txtDireccionHistorial;
    private javax.swing.JLabel txtFormatoHistorial;
    private javax.swing.JLabel txtLinkedinHistorial;
    private javax.swing.JLabel txtMailHistorial;
    private javax.swing.JLabel txtNombreHistorial;
    private javax.swing.JLabel txtTelefonoHistorial;
    // End of variables declaration//GEN-END:variables
}
