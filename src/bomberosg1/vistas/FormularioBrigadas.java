/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bomberosg1.vistas;

import bomberosg1.accesoadatos.BrigadaData;
import bomberosg1.accesoadatos.CuartelData;
import bomberosg1.entidades.*;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gonza
 */
public class FormularioBrigadas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    BrigadaData bd = new BrigadaData();
    CuartelData cd = new CuartelData();

    /**
     * Creates new form FormularioBrigadas
     */
    public FormularioBrigadas() {
        initComponents();
        bd = new BrigadaData();
        cd = new CuartelData();
        armarCabecera();
        cargaCCuartel();
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFormBrigadas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtNombreBrigadas = new javax.swing.JTextField();
        jcEspecialidad = new javax.swing.JComboBox<>();
        jcCuarteles = new javax.swing.JComboBox<>();
        jbNuevo = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jbSeleccionar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbDardeBaja = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("FORMULARIO BRIGADAS");

        jLabel2.setText("Brigadas");

        jtFormBrigadas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtFormBrigadas);

        jLabel3.setText("Especialidad");

        jLabel4.setText("Cuarteles");

        jtNombreBrigadas.setEnabled(false);

        jcEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1- Incendios en viviendas e industrias", "2- Salvamento en derrumbes", "3- Rescates en �mbito monta�a", "4- Rescate de personas atrapadas en accidentes de tr�fico", "5- Socorrer inundaciones", "6- Operativos de prevenci�n" }));
        jcEspecialidad.setToolTipText("");
        jcEspecialidad.setEnabled(false);

        jcCuarteles.setEnabled(false);

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.setEnabled(false);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel5.setText("---------------------------------------------------------------------------------------------------------");

        jbSeleccionar.setText("Seleccionar");
        jbSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbDardeBaja.setText("Dar de Baja");
        jbDardeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDardeBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbNuevo)
                                .addGap(27, 27, 27)
                                .addComponent(jbModificar)
                                .addGap(18, 18, 18)
                                .addComponent(jbGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jbDardeBaja)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jtNombreBrigadas, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbSeleccionar))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jcCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombreBrigadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSeleccionar)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbModificar)
                    .addComponent(jbSalir)
                    .addComponent(jbGuardar)
                    .addComponent(jbDardeBaja))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        limpiarCampos();
        jtNombreBrigadas.setEnabled(true);
        jcEspecialidad.setEnabled(true);
        jcCuarteles.setEnabled(true);
        jbModificar.setEnabled(false);
        jbSeleccionar.setEnabled(true);
        jbGuardar.setEnabled(true);
        jbDardeBaja.setEnabled(false);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarActionPerformed
          int filaSeleccionada = jtFormBrigadas.getSelectedRow();
    if(filaSeleccionada == -1){
        JOptionPane.showMessageDialog(null, "No se seleccion� ninguna fila");
        return;
    }
    
    Object nombreBrigada = jtFormBrigadas.getValueAt(filaSeleccionada, 1);
    Object especialidad = jtFormBrigadas.getValueAt(filaSeleccionada, 2);
    Object cuartel = jtFormBrigadas.getValueAt(filaSeleccionada, 3);
    
    // Verificar si los valores no son nulos antes de convertirlos a String
    if(nombreBrigada != null && !nombreBrigada.toString().isEmpty()){
        // Verificar si la brigada ya existe
        if(!jtNombreBrigadas.getText().contains(nombreBrigada.toString())){
            jtNombreBrigadas.setText(nombreBrigada.toString());
        } else {
            JOptionPane.showMessageDialog(null, "La brigada ya existe");
            return;
        }
    }
    if(especialidad != null){
        jcEspecialidad.setSelectedItem(especialidad.toString());
    }
    if(cuartel != null){
        jcCuarteles.setSelectedItem(cuartel.toString());
    }
    
    jtNombreBrigadas.setEnabled(true);
    jcEspecialidad.setEnabled(true);
    jcCuarteles.setEnabled(true);
    jbModificar.setEnabled(true);
    }//GEN-LAST:event_jbSeleccionarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        if (jtNombreBrigadas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre");
        } else {
            try {
                String brigada = jtNombreBrigadas.getText();
                String especialidad = (String) jcEspecialidad.getSelectedItem();
                Cuartel seleccion = (Cuartel) jcCuarteles.getSelectedItem();
                Brigada brigada1 = new Brigada(brigada, especialidad, false, seleccion);
                bd.darAltaBrigada(brigada1);

                modelo.setRowCount(0);
                llenarTabla();
            } catch (Exception e) {
                }
        }

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbDardeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDardeBajaActionPerformed
        try {
            String seleccionado = String.valueOf(jtFormBrigadas.getValueAt(jtFormBrigadas.getSelectedRow(), 0));
            Brigada brigadaSelec = null;
            for(Brigada listBrigada: bd.verBrigadas()){
                if(seleccionado.contains(listBrigada.getNombreBrigada())){
                    brigadaSelec = listBrigada;
                    break;
                }
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jbDardeBajaActionPerformed

    private void armarCabecera() {
        modelo.addColumn("Id");
        modelo.addColumn("Nombre Brigada");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Estado");
        jtFormBrigadas.setModel(modelo);
    }

    //REVISAR CARGADE CUARTELES Devuelve = entidades.etc
    private void cargaCCuartel() {
        for (Cuartel listCuartel : cd.verCuartel()) {
            jcCuarteles.addItem(listCuartel);
        }
    }

    private void llenarTabla() {
        for (Brigada b : bd.verBrigadas()) {
            modelo.addRow(new Object[]{
                b.getIdBrigada(),
                b.getNombreBrigada(),
                b.getEspecialidad(),
                b.isLibre()
            });
        }
    }

    private void limpiarCampos() {
        jtNombreBrigadas.setText("");
        jcEspecialidad.setSelectedItem("Seleccione");
    }
    
    private int getComboBoxIndex(JComboBox<Brigada> comboBox, String value) {
    for (int i = 0; i < comboBox.getItemCount(); i++) {
        Brigada brigada = comboBox.getItemAt(i);
        if (brigada.getNombreBrigada().contains(value)) {
            return i;
        }
    }
    return -1;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbDardeBaja;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbSeleccionar;
    private javax.swing.JComboBox<Cuartel> jcCuarteles;
    private javax.swing.JComboBox<String> jcEspecialidad;
    private javax.swing.JTable jtFormBrigadas;
    private javax.swing.JTextField jtNombreBrigadas;
    // End of variables declaration//GEN-END:variables
}
