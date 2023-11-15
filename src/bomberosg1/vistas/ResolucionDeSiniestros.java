/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bomberosg1.vistas;

import bomberosg1.accesoadatos.SiniestroData;
import bomberosg1.entidades.Siniestro;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gonza
 */
public class ResolucionDeSiniestros extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    SiniestroData siniestroData = null;

    /**
     * Creates new form ResolucionDeSiniestros
     */
    public ResolucionDeSiniestros() {
        initComponents();
        siniestroData = new SiniestroData();
        armarCabecera();
        cargaTabla();

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
        jLabel1 = new javax.swing.JLabel();
        jcPuntuacion = new javax.swing.JComboBox<>();
        jsFechaHoraResolucion = new javax.swing.JSpinner();

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

        jLabel_puntuacion.setText("Seleccione una puntuacion:");

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

        jsFechaHoraResolucion.setModel(new javax.swing.SpinnerDateModel());
        jsFechaHoraResolucion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(300, 300, 300)
                                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_fechaResolucion)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Subtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jsFechaHoraResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(111, 111, 111)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jcPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel_puntuacion))))))
                                .addGap(16, 16, 16))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbGuardar)
                                .addGap(472, 472, 472)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(Subtitulo)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_fechaResolucion)
                    .addComponent(jLabel_puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsFechaHoraResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        int filaSeleccionada = TablaSiniestro.getSelectedRow();

        if (filaSeleccionada != -1) {

            Date fechaHoraResolucion = (Date) jsFechaHoraResolucion.getValue();
            Instant instant = fechaHoraResolucion.toInstant();
            LocalDate fechaSeleccionada = instant.atZone(ZoneId.systemDefault()).toLocalDate();
            LocalTime horaSeleccionada = instant.atZone(ZoneId.systemDefault()).toLocalTime();
            int puntuacion = Integer.parseInt(jcPuntuacion.getSelectedItem().toString());


            int idSiniestro = (int) TablaSiniestro.getValueAt(filaSeleccionada, 0); 


            TablaSiniestro.setValueAt(fechaSeleccionada, filaSeleccionada, 2);
            TablaSiniestro.setValueAt(horaSeleccionada, filaSeleccionada, 3); 
            TablaSiniestro.setValueAt(puntuacion, filaSeleccionada, 4); 

            siniestroData.actualizarSiniestro(fechaSeleccionada, horaSeleccionada, puntuacion, idSiniestro);
        } else {

        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void armarCabecera() {
        modelo.addColumn("Siniestro");
        modelo.addColumn("Brigada");
        modelo.addColumn("Fecha Resolucion");
        modelo.addColumn("Hora Resolucion");
        modelo.addColumn("Puntuacion Asignada");
//        modelo.addColumn("Estado");
        TablaSiniestro.setModel(modelo);
    }

    private void limpiarCampos() {
        jsFechaHoraResolucion.setValue(null);
        jcPuntuacion.setSelectedItem("Seleccione");
    }

    private void enabled() {
        jsFechaHoraResolucion.setEnabled(true);
        jcPuntuacion.setEnabled(true);
    }

//    private void llenarTabla(LocalDate fechaResolucion, Integer puntuacion) {
//        Object[] rowData = {fechaResolucion, puntuacion};
//        modelo.addRow(rowData);
//    }
//    private void cargarTabla() {
//    Iterator<Siniestro> iterador = siniestroData.obtenerSiniestros().iterator();
//    while (iterador.hasNext()) {
//        Siniestro cosa = iterador.next();
//        String briNombreID = "[" + cosa.getCodBrigada().getIdBrigada() + "] " + cosa.getCodBrigada().getNombreBrigada();
//        modelo.addRow(new Object[]{
//            cosa.getIdSiniestro(),
//            cosa.getFechaSiniestro(),
//            cosa.getTipo(),
//            briNombreID, //Nombre e identificador de la brigada
//            cosa.getDetalles()
//        });
//    }
//}
    private void cargaTabla() {
        for (Siniestro sinis : siniestroData.obtenerSiniestrosRe()) {
            modelo.addRow(new Object[]{
                sinis.getIdSiniestro(),
                sinis.getCodBrigada().getNombreBrigada(),
                sinis.getFechaResolucion(),
                sinis.getHoraSiniestro(),
                sinis.getPuntuacion()
//                sinis.isActivo()
            });
        }
    }

    private void actualizarTabla() {
        modelo.setRowCount(0);
        cargaTabla();
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
    private javax.swing.JSpinner jsFechaHoraResolucion;
    // End of variables declaration//GEN-END:variables
}
