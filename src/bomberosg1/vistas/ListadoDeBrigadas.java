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
        briData = new BrigadaData();
        cuartelData = new CuartelData();
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

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Brigadas: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 23, -1, -1));

        jLabel2.setText("--------------------------------------------------------------------------------------");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 57, 440, -1));

        jcCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCuartelesActionPerformed(evt);
            }
        });
        getContentPane().add(jcCuarteles, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 103, 210, -1));

        jLabel3.setText("Seleccione un Cuartel para ver la Lista:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 75, -1, -1));

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
        TablaListBrigadas.setEnabled(false);
        jScrollPane1.setViewportView(TablaListBrigadas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 75, 430, 240));

        jLabel4.setText("Marque para ver aquellos Inactivos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 251, -1, -1));

        JtoInactivos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JtoInactivos.setText("Inactivos");
        JtoInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtoInactivosActionPerformed(evt);
            }
        });
        getContentPane().add(JtoInactivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 279, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCuartelesActionPerformed
//        // TODO add your handling code here:
//        //        limpiarTabla();
//        //        Brigada brigada=(Brigada)jcBrigadas.getSelectedItem();
//        //
//        //        if (brigada != null) {
//            //            List<Bombero> listaBomberos = bomData.verBomberos();
//            //        for(Bombero aux: listaBomberos){
//                //            modelo.addRow(new  Object[]{aux.getDni(), aux.getNombre(), aux.getApellido(),
//                    //            aux.getFechaNac(),aux.getGrupoSanguineo(),aux.isActivo()
//                    //                    });
//            //        }
//        //        }
        limpiarTabla();
        Cuartel cuartelSel = (Cuartel) jcCuarteles.getSelectedItem();
        int cuartelID = cuartelSel.getIdCuartel();
        for (Brigada aux : briData.verBrigadas()) {
            if (aux.getNumeroCuartel().getIdCuartel()== cuartelID) {
                modelo.addRow(new Object[]{
                    aux.getNombreBrigada(),
                    aux.getEspecialidad(),
                });
            }
        }
    }//GEN-LAST:event_jcCuartelesActionPerformed

    private void JtoInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtoInactivosActionPerformed
        // TODO add your handling code here:

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

        try {
            if(JtoInactivos.isSelected()){
                jcCuarteles.setEnabled(false);
                limpiarTabla();
                for(Brigada bri : briData.brigadasInactivas()){
                    if(bri.isLibre() == false){
                        modelo.addRow(new Object[]{
                            bri.getIdBrigada(),
                            bri.getEspecialidad(),
                            bri.getNumeroCuartel()
                        });
                    }
                }
            }else{
                jcCuarteles.setEnabled(true);
                limpiarTabla();
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_JtoInactivosActionPerformed

    private void cargaCuarteles() {
        for (Cuartel listaCuartel : cuartelData.verCuartel()) {
            jcCuarteles.addItem(listaCuartel);
        }
    }
    
    private void limpiarTabla() {
        modelo.setRowCount(0);
    }
    
    private void armarCabecera(){
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
