/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bomberosg1.vistas;

import bomberosg1.accesoadatos.BrigadaData;
import bomberosg1.accesoadatos.CuartelData;
import bomberosg1.entidades.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gonza
 */
public class ListadoDeBrigadas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    BrigadaData briData = null;
    CuartelData cuartelData = null;

    /**
     * Creates new form ListadoDeBrigadas
     */
    public ListadoDeBrigadas() {
        initComponents();
        cuartelData = new CuartelData();
        briData = new BrigadaData();
        cargaCuarteles();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcCuarteles = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaListBrigadas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        JtoInactivos = new javax.swing.JToggleButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Brigadas: ");

        jLabel2.setText("--------------------------------------------------------------------------------------");

        jcCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCuartelesActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione un Cuartel para ver la Lista:");

        TablaListBrigadas.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaListBrigadas.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(TablaListBrigadas);

        jLabel4.setText("Marque para ver aquellos Inactivos:");

        JtoInactivos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JtoInactivos.setText("Inactivos");
        JtoInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtoInactivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jcCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(JtoInactivos)))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(jcCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addComponent(JtoInactivos))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCuartelesActionPerformed
//        // TODO add your handling code here:
        limpiarTabla();
        Cuartel cuartelSel = (Cuartel) jcCuarteles.getSelectedItem();
        int cuartelID = cuartelSel.getIdCuartel();
        for (Brigada aux : briData.verBrigadas()) {
            if (aux.getNumeroCuartel().getIdCuartel() == cuartelID) {
                modelo.addRow(new Object[]{
                    aux.getNombreBrigada(),
                    aux.getEspecialidad(),
                    "No esta asiganada"
                });
            }
        }
/////////////////////////////////////////////////////////////////
//        limpiarTabla();
//        Brigada brigada=(Brigada)jcBrigadas.getSelectedItem();
//        
//        if (brigada != null) {
//        List<Bombero> listaBomberos = bomData.verBomberos();
//            for(Bombero aux: listaBomberos){
//                modelo.addRow(new  Object[]{aux.getDni(), aux.getNombre(), aux.getApellido(),
//                       aux.getFechaNac(),aux.getGrupoSanguineo(),aux.isActivo()
//                        });
//             }
//        }
    }//GEN-LAST:event_jcCuartelesActionPerformed

    private void JtoInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtoInactivosActionPerformed
        // TODO add your handling code here:
        try {
            if (JtoInactivos.isSelected()) {
                jcCuarteles.setEnabled(false);
                limpiarTabla();
                for (Brigada bri : briData.brigadasInactivas()) {
                    if (bri.isLibre() == false) {
                        modelo.addRow(new Object[]{
                            bri.getIdBrigada(),
                            bri.getEspecialidad(),
                            bri.getNumeroCuartel()
                        });
                    }
                }
            } else {
                jcCuarteles.setEnabled(true);
                limpiarTabla();
            }
        } catch (Exception e) {
        }
////////////////////////////////////////////        
//        try {
//            if(JtoInactivos.isSelected()){
//                jcCuarteles.setEnabled(false);
//                limpiarTabla();
//                for(Bombero bomber : cuartelData.){
//                    if(bomber.isActivo() == false){
//                        modelo.addRow(new Object[]{
//                            bomber.getDni(),
//                            bomber.getNombre(),
//                            bomber.getApellido(),
//                            bomber.getFechaNac(),
//                            bomber.getGrupoSanguineo(),
//                            bomber.getClass()
//                        });
//                    }
//                }
//            }else{
//                jcCuarteles.setEnabled(true);
//                limpiarTabla();
//            }
//        } catch (Exception e) {
//        }

    }//GEN-LAST:event_JtoInactivosActionPerformed

    private void cargaCuarteles() {
        for (Cuartel listaCuartel : cuartelData.verCuartel()) {
            jcCuarteles.addItem(listaCuartel);
        }
    }

    private void limpiarTabla() {
        modelo.setRowCount(0);
    }

    private void armarCabecera() {
        modelo.addColumn("Brigada");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Asignado a: ");
        TablaListBrigadas.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton JtoInactivos;
    private javax.swing.JTable TablaListBrigadas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Cuartel> jcCuarteles;
    // End of variables declaration//GEN-END:variables
}
