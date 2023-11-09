/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bomberosg1.vistas;

import bomberosg1.accesoadatos.*;
import bomberosg1.entidades.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gonza
 */
public class FormBombero extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    BrigadaData bd = null;
    BomberoData bomData = null;

    /**
     * Creates new form FormBombero
     */
    public FormBombero() {
        bd = new BrigadaData();
        bomData = new BomberoData();
        initComponents();
        armarCabecera();
        cargarBomberos();
        cargarBrigada();
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
        jtDni = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtCelular = new javax.swing.JTextField();
        jcGrupoSang = new javax.swing.JComboBox<>();
        jcBrigadaAsignar = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jtDisponibilidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBombero = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jbSeleccionar = new javax.swing.JButton();
        jdFechaNac = new com.toedter.calendar.JDateChooser();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbDarBaja = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("FORMULARIO BOMBERO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel2.setText("DNI:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel6.setText("Grupo Sanguineo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel7.setText("Celular:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel8.setText("Asignar a Brigada:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));
        jPanel1.add(jtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, -1));
        jPanel1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 110, -1));
        jPanel1.add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 140, -1));

        jLabel9.setText("-------------------------------------------------------------------------------------------------------------------------");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        jPanel1.add(jtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, -1));

        jcGrupoSang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel1.add(jcGrupoSang, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 110, -1));

        jPanel1.add(jcBrigadaAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 190, -1));

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel10.setText("Disponibilidad:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        jtDisponibilidad.setEditable(false);
        jtDisponibilidad.setEnabled(false);
        jPanel1.add(jtDisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 40, -1));

        TablaBombero.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaBombero);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 640, 130));

        jLabel11.setText("Espacios Dispo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        jLabel12.setText("---------------------------------------------------------------------------------------------------------------------------");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jbSeleccionar.setText("Seleccionar");
        jbSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(jbSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jPanel1.add(jdFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 130, -1));

        jbNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbModificar.setText("Modificar");

        jbDarBaja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbDarBaja.setText("Dar Baja");
        jbDarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDarBajaActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jbGuardar)
                .addGap(65, 65, 65)
                .addComponent(jbModificar)
                .addGap(67, 67, 67)
                .addComponent(jbDarBaja)
                .addGap(44, 44, 44)
                .addComponent(jbSalir)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbNuevo)
                    .addComponent(jbGuardar)
                    .addComponent(jbModificar)
                    .addComponent(jbDarBaja)
                    .addComponent(jbSalir))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        jbModificar.setEnabled(false);
        jbDarBaja.setEnabled(false);
        limpiar();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try {
            if (jtDni.getText().isEmpty() || jtNombre.getText().isEmpty() || jtApellido.getText().isEmpty() || jtCelular.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete los campos, Todos son obligatorios");
            } else {
                int dni = Integer.parseInt(jtDni.getText());
                String nombre = jtNombre.getText();
                String apellido = jtApellido.getText();
                Date fnac = jdFechaNac.getDate();
                LocalDate feDate = fnac.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                String grupoSan = (String) jcGrupoSang.getSelectedItem();
                String celular = jtCelular.getText();
                Boolean activo = true;
                
                Brigada brig = (Brigada) jcBrigadaAsignar.getSelectedItem();

                Bombero bo = new Bombero(dni, nombre, apellido, feDate, celular, brig, grupoSan, true);
                bomData.altaBombero(bo);
                cargarBomberos();
            }
        } catch (Exception e) {
        }
        
        jbModificar.setEnabled(true);
        jbDarBaja.setEnabled(true);

//          if(jtDni.getText().isEmpty()|| jtNombre.getText().isEmpty()|| jtApellido.getText().isEmpty()||jtCelular.getText().isEmpty()){
//            JOptionPane.showMessageDialog(null, "Complete los campos, Todos son obligatorios");
//        }else{
//            try {
//                int dni = Integer.parseInt(jtDni.getText());
//                String nombre = jtNombre.getText();
//                String apellido = jtApellido.getText();
//                Date fnac = jdFechaNac.getDate();
//                LocalDate feDate = fnac.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//                String grupoSan = (String)jcGrupoSang.getSelectedItem();
//                String celular = jtCelular.getText();
//                Boolean activo = true;
//                Brigada brig = (Brigada)jcBrigadaAsignar.getSelectedItem();
//                
//                Bombero bo = new Bombero(dni, nombre, apellido, feDate, celular, brig, grupoSan, true);
//                bomData.altaBombero(bo);
//                cargarBomberos();
//            } catch (Exception e) {
//            }
//        }
//        


    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarActionPerformed
        jbGuardar.setEnabled(false);
        jbModificar.setEnabled(true);
        jbDarBaja.setEnabled(true);
    }//GEN-LAST:event_jbSeleccionarActionPerformed

    private void jbDarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDarBajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbDarBajaActionPerformed

    private void armarCabecera() {
        modelo.addColumn("Dni");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Brigada");
        TablaBombero.setModel(modelo);
    }

    private void cargarBomberos() {
        for (Bombero bom : bomData.verBomberos()) {
            modelo.addRow(new Object[]{
                bom.getDni(),
                bom.getNombre(),
                bom.getApellido(),
                bom.getCodBrigada()
            });
        }
    }

    private void cargarBrigada() {
        for (Brigada b : bd.verBrigadas()) {
            jcBrigadaAsignar.addItem(b);
        }
    }

    private void limpiar() {
        jtDni.setText("");
        jtNombre.setText("");
        jtApellido.setText("");
        jtCelular.setText("");
        jcGrupoSang.setSelectedItem("Seleccione");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaBombero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbDarBaja;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbSeleccionar;
    private javax.swing.JComboBox<Brigada> jcBrigadaAsignar;
    private javax.swing.JComboBox<String> jcGrupoSang;
    private com.toedter.calendar.JDateChooser jdFechaNac;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCelular;
    private javax.swing.JTextField jtDisponibilidad;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
