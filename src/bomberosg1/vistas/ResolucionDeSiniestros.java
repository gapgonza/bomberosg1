/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bomberosg1.vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gonza
 */
public class ResolucionDeSiniestros extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form ResolucionDeSiniestros
     */
    public ResolucionDeSiniestros() {
        initComponents();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Subtitulo = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jLabel_fechaResolucion = new javax.swing.JLabel();
        jLabel_puntuacion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaSiniestro = new javax.swing.JTable();
        jdFechaResolucion = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jcPuntuacion = new javax.swing.JComboBox<>();

        Subtitulo.setText("Formulario de Resolucion del Siniestro Afectado");

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        Titulo.setText("Siniestro");

        jLabel_fechaResolucion.setText("Fecha de Resolucion:");

        jLabel_puntuacion.setText("Escriba su puntuacion:");

        TablaSiniestro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaSiniestro);

        jLabel1.setText("------------------------------------------------------------------------------------------------------------------------");

        jcPuntuacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(Subtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel_fechaResolucion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdFechaResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jcPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbGuardar)
                                .addGap(100, 100, 100)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Subtitulo)
                    .addComponent(jLabel_fechaResolucion))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jdFechaResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jcPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jbGuardar))
                            .addComponent(jbSalir))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        enabled();

        // Verifica si los campos obligatorios est�n completos
        if (jdFechaResolucion.getDate() == null || "Seleccione".equals(jcPuntuacion.getSelectedItem())) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos, son obligatorios");
        } else {
            try {
                // Convierte la fecha y la puntuaci�n
                Date fresolucion = jdFechaResolucion.getDate();
                LocalDate feDate = fresolucion.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                Integer puntuacion = Integer.parseInt(jcPuntuacion.getSelectedItem().toString());

                // Llena la tabla
                llenarTabla(feDate, puntuacion);

                // Limpia los campos
                limpiarCampos();
            } catch (NumberFormatException e) {
                // Muestra un mensaje si la puntuaci�n no es un n�mero v�lido
                JOptionPane.showMessageDialog(null, "La puntuaci�n debe ser un n�mero v�lido");
            }
        }
//        enabled();
//        if (jdFechaResolucion.getDate() == null || jTextField_puntuacion.getText().trim().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Complete los campos, Todos son obligatorios");
//        } else {
//            try {
//                Date fresolucion = jdFechaResolucion.getDate();
//                LocalDate feDate = fresolucion.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//                Integer puntuacion = Integer.parseInt(jTextField_puntuacion.getText().trim());
//
//                llenarTabla(feDate, puntuacion);
//                limpiarCampos();
//            } catch (NumberFormatException e) {
//                JOptionPane.showMessageDialog(null, "La puntuaci�n debe ser un n�mero v�lido");
//            }
//        }

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void armarCabecera() {
        modelo.addColumn("Fecha Resolucion");
        modelo.addColumn("Puntuacion Asignada");
        TablaSiniestro.setModel(modelo);
    }

    private void limpiarCampos() {
        jdFechaResolucion.setDate(null);
        jcPuntuacion.setSelectedItem("Seleccione");
    }

    private void enabled() {
        jdFechaResolucion.setEnabled(true);
        jcPuntuacion.setEnabled(true);
    }

    private void llenarTabla(LocalDate fechaResolucion, Integer puntuacion) {
        Object[] rowData = {fechaResolucion, puntuacion};
        modelo.addRow(rowData);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Subtitulo;
    private javax.swing.JTable TablaSiniestro;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_fechaResolucion;
    private javax.swing.JLabel jLabel_puntuacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcPuntuacion;
    private com.toedter.calendar.JDateChooser jdFechaResolucion;
    // End of variables declaration//GEN-END:variables
}
