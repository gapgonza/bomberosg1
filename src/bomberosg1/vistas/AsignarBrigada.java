/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bomberosg1.vistas;

import bomberosg1.accesoadatos.*;
import bomberosg1.entidades.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gonza
 */
public class AsignarBrigada extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    BrigadaData brigadaData = null;
    SiniestroData siniestroData = null;
    CuartelData cuartelData = null;
    
    /**
     * Creates new form AsignarBrigada
     */
    public AsignarBrigada() {
        initComponents();
        brigadaData = new BrigadaData();
        siniestroData = new SiniestroData();
        cuartelData = new CuartelData();
        armarCabecera();
        cargarSiniestros();
        comboCuartel();
        cargarBrigada();
        
        //Este actionListener, obtiene las brigadas asociadas al cuartel
        jcCuarteles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cuartel cuartelSeleccionado = (Cuartel) jcCuarteles.getSelectedItem();
                int idCuartel = cuartelSeleccionado.getIdCuartel();
                List<Brigada> brigadasDelCuartel = brigadaData.obtenerBrigadasPorCuartel(idCuartel);

                // Limpiamos el JComboBox jcBrigadas
                jcBrigadas.removeAllItems();

                // A�adimos las brigadas del cuartel seleccionado al JComboBox jcBrigadas
                for (Brigada brigada : brigadasDelCuartel) {
                    jcBrigadas.addItem(brigada);
                }
            }
        });
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
        TablaSiniestro = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbAsignar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcCuarteles = new javax.swing.JComboBox<>();
        jcBrigadas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("Siniestros");

        jLabel2.setText("----------------------------------------------------------------------------------------------------------------------------------------------");

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

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel3.setText("Asignar Brigadas:");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel4.setText("Cuarteles:");

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel5.setText("Brigadas:");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel6.setText("Calcular distancias:");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jbAsignar.setText("Asignar");

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jcCuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCuartelesActionPerformed(evt);
            }
        });

        jButton1.setText("Seleccionar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbAsignar)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jcBrigadas, 0, 230, Short.MAX_VALUE)
                            .addComponent(jbSalir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcCuarteles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel1)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcCuarteles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcBrigadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAsignar)
                            .addComponent(jbSalir)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcCuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCuartelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCuartelesActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void armarCabecera(){
        modelo.addColumn("Id");
        modelo.addColumn("Tipo");
        modelo.addColumn("Fecha");
        modelo.addColumn("LongX");
        modelo.addColumn("LatiY");
        modelo.addColumn("Detalles");
        TablaSiniestro.setModel(modelo);
    }
    
    private void cargarSiniestros(){
        for(Siniestro siniestro: siniestroData.obtenerSiniestros()){
            modelo.addRow(new Object[]{
                siniestro.getIdSiniestro(),
                siniestro.getTipo(),
                siniestro.getFechaSiniestro(),
                siniestro.getLongitudX(),
                siniestro.getLatitudY(),
                siniestro.getDetalles()
            });
        }
    }
    
    private void comboCuartel(){
        for (Cuartel listCuartel : cuartelData.verCuartel()) {
            jcCuarteles.addItem(listCuartel);
        }
    }
    
    private void cargarBrigada() {
        for (Brigada b : brigadaData.verBrigadas()) {
            jcBrigadas.addItem(b);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaSiniestro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAsignar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Brigada> jcBrigadas;
    private javax.swing.JComboBox<Cuartel> jcCuarteles;
    // End of variables declaration//GEN-END:variables
}
