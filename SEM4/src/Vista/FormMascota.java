/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
//librerias
import Modelo.Mascota;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormMascota extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormMascota.class.getName());
    //Coleccion de objeto mascota
    private final ArrayList<Mascota> listMascota = new ArrayList<>();
    //modelo de la tabla
    DefaultTableModel modTabla;
    //constructor
    public FormMascota() {
        initComponents();
        String[] titulo ={"Nombre","Tipo","Edad","Edad Humana"};
        //crear el modelo de la tabla
        modTabla = new DefaultTableModel(null,titulo);
        //Asigna el modelo
        tblMostrar.setModel(modTabla);
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNombreMascot = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        txtEdad = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRAR MASCOTA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreMascot.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre mascota", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel2.add(txtNombreMascot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, 60));

        cbxTipo.setToolTipText("");
        cbxTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de mascota", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel2.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, 60));

        txtEdad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edad de la mascota", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel2.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 60));

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(153, 0, 0));
        lblCantidad.setText("Cant.Mascota:");
        jPanel2.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 130, 40));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(153, 0, 0));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 130, 50));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(153, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 130, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 230));

        tblMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblMostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 540, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //metodo limpiar entradas
    public void LimpiarEntradas()
    {
        txtNombreMascot.setText("");
        txtEdad.setText("");
        cbxTipo.setSelectedIndex(0);
        txtNombreMascot.requestFocus();
    }
    void cargarCombo(){
     cbxTipo.addItem("Perro");
     cbxTipo.addItem("Gato");
     cbxTipo.addItem("Loro");
    }
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = txtNombreMascot.getText().trim();
    String edadTexto = txtEdad.getText().trim();

    //Validar campos vacios
    if (nombre.isEmpty() || edadTexto.isEmpty()) {
        JOptionPane.showMessageDialog(null,"Complete todos los campos");
        return;
    }

    try {
        int edad = Integer.parseInt(edadTexto);

        //Validar edad
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor que 0");
        }

        //Crear el objeto
        Mascota mas = new Mascota();

        //Enviar informacion
        mas.setNombre(nombre);
        mas.setTipo(cbxTipo.getSelectedItem().toString());
        mas.setEdad(edad);

        //Guardar objeto en el ArrayList
        listMascota.add(mas);

        //Mostrar objeto en tabla
        modTabla.addRow(mas.RegistrarDatos());

        //Mostrar cantidad
        lblCantidad.setText("Mascotas registradas: " + listMascota.size());

        JOptionPane.showMessageDialog(null,"Mascota correctamente registrada");

        LimpiarEntradas();

    } catch (NumberFormatException ex) {

        JOptionPane.showMessageDialog(null,"La edad debe ser un número entero");

    } catch (IllegalArgumentException ex) {

        JOptionPane.showMessageDialog(null,
                ex.getMessage());
    }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila;
        //obtener la fila seleccionada
        fila=tblMostrar.getSelectedRow();
        //validamos
        if (fila>=0) {
            int resp = JOptionPane.showConfirmDialog(null,"¿Desea eliminar la mascota?","Eliminar",JOptionPane.YES_NO_OPTION);
            if(resp==JOptionPane.YES_OPTION)
            {
                //Eliminar objeto del arreglo
                listMascota.remove(fila);
                //eliminar la fila de la tabla
                modTabla.removeRow(fila);
                //actualizar cantidad
                lblCantidad.setText("Mascotas registradas: " +listMascota.size());
                JOptionPane.showMessageDialog(null, "mascota eliminado correctamente");
            }
        } 
        else {
           JOptionPane.showMessageDialog(null, "Seleccione una mascota");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormMascota().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JTable tblMostrar;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombreMascot;
    // End of variables declaration//GEN-END:variables
}
