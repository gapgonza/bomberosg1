/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bomberosg1.vistas;

import bomberosg1.accesoadatos.CuartelData;
import bomberosg1.entidades.Cuartel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gonza
 */
public class FormularioDeCuartel extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
    CuartelData cd = null;
    /**
     * Creates new form FormularioDeCuartel
     */
    public FormularioDeCuartel() {
        initComponents();
        cd = new CuartelData();
        armarCabecera();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbNuevo = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbguardar = new javax.swing.JButton();
        jtNomCuartel = new javax.swing.JTextField();
        jtDomicilio = new javax.swing.JTextField();
        jtLongX = new javax.swing.JTextField();
        jtLatY = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jtCorreo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCuartel = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jbDarDeBaja = new javax.swing.JButton();
        jbSeleccionar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("Formulario Cuarteles");

        jLabel2.setText("Cuartel: ");

        jLabel3.setText("Domicilio:");

        jLabel4.setText("longX:");

        jLabel5.setText("LatY:");

        jLabel6.setText("Telefono:");

        jLabel7.setText("Correo Electronico: ");

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbguardar.setText("Guardar");
        jbguardar.setEnabled(false);
        jbguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarActionPerformed(evt);
            }
        });

        jtNomCuartel.setEnabled(false);

        jtDomicilio.setEnabled(false);

        jtLongX.setEnabled(false);

        jtLatY.setEnabled(false);

        jtTelefono.setEnabled(false);

        jtCorreo.setEnabled(false);

        tablaCuartel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaCuartel);

        jLabel8.setText("--------------------------------------------------------------------------------------------------------------------------");

        jbDarDeBaja.setText("Dar de Baja");
        jbDarDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDarDeBajaActionPerformed(evt);
            }
        });

        jbSeleccionar.setText("Seleccionar");
        jbSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbSeleccionar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNomCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtLongX, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtLatY, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jbNuevo)
                                .addGap(39, 39, 39)
                                .addComponent(jbguardar)
                                .addGap(60, 60, 60)
                                .addComponent(jbDarDeBaja)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbModificar)
                                .addGap(99, 99, 99)
                                .addComponent(jbSalir)))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNomCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtLongX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtLatY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jbSeleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbModificar)
                    .addComponent(jbguardar)
                    .addComponent(jbSalir)
                    .addComponent(jbDarDeBaja))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarActionPerformed
        if(jtNomCuartel.getText().isEmpty()||jtDomicilio.getText().isEmpty()||jtTelefono.getText().isEmpty()||jtCorreo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Complete los campos, Todos son obligatorios");
        }else{
            try{
            String cuartel = jtNomCuartel.getText();
            String domicilio = jtDomicilio.getText();
            int longitudX = Integer.parseInt(jtLongX.getText());
            int latitudY = Integer.parseInt(jtLatY.getText());
            String telefono = jtTelefono.getText();
            String correoElectronico = jtCorreo.getText();
            Cuartel agregarCuartel = new Cuartel(cuartel, domicilio, longitudX, latitudY, telefono, correoElectronico);
            cd.altaCuartel(agregarCuartel);
            
            modelo.setRowCount(0);
            
            llenarTabla();
            jbSeleccionar.setEnabled(true);
            }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"Ni idea");
            }
        }
    }//GEN-LAST:event_jbguardarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        enabled();
        jbguardar.setEnabled(true);
        jbModificar.setEnabled(false);
        jbDarDeBaja.setEnabled(false);
        limpiarCampos();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeleccionarActionPerformed
        try {
            jbNuevo.setEnabled(true);
            jbModificar.setEnabled(true);
            jbDarDeBaja.setEnabled(true);
            String seleccionado = String.valueOf(tablaCuartel.getValueAt(tablaCuartel.getSelectedRow(),0));
            for(Cuartel lisCuartel: cd.verCuartel()){
                if(seleccionado.contains(lisCuartel.getNombreCuartel())){
                    jtNomCuartel.setText(lisCuartel.getNombreCuartel());
                    jtDomicilio.setText(lisCuartel.getDomicilio());
                    jtLongX.setText(lisCuartel.getLongitudX() + "");
                    jtLatY.setText(lisCuartel.getLatitudY()+ "");
                    jtTelefono.setText(lisCuartel.getTelefono());
                    jtCorreo.setText(lisCuartel.getCorreoElectronico());
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Elija un cuartel");
        }
    }//GEN-LAST:event_jbSeleccionarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        try {
            String cuartel = jtNomCuartel.getText();
            String domicilio = jtDomicilio.getText();
            int longx = Integer.parseInt(jtLongX.getText());
            int laty = Integer.parseInt(jtLatY.getText());
            String telefono = jtTelefono.getText();
            String correoEle = jtCorreo.getText();
            
            Cuartel ncuartel = new Cuartel(cuartel, domicilio, longx, laty, telefono, correoEle);
            cd.modificarCuartel(ncuartel);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbDarDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDarDeBajaActionPerformed
        
        try {
            String seleccionado = String.valueOf(tablaCuartel.getValueAt(tablaCuartel.getSelectedRow(), 0));
            Cuartel cuartSeleleccionado = null;
            for(Cuartel listCuartel: cd.verCuartel()){
                if(seleccionado.contains(listCuartel.getNombreCuartel())){
                    cuartSeleleccionado = listCuartel;
                    break;
                }
            }
            if(cuartSeleleccionado != null){
                int confirmar = JOptionPane.showConfirmDialog(this,"Seguro quiero borrar definitivamente?");
                if(confirmar == JOptionPane.YES_OPTION){
                     cd.bajaCuartel(cuartSeleleccionado);
                modelo.setRowCount(0);
                llenarTabla();
                }
               
            }
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_jbDarDeBajaActionPerformed

    private void armarCabecera(){
        modelo.addColumn("Nombre");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo Electronico");
        tablaCuartel.setModel(modelo);
    }
    
    private void llenarTabla(){
        for(Cuartel cuartel: cd.verCuartel()){
            modelo.addRow(new Object[]{
                cuartel.getNombreCuartel(),
                cuartel.getDomicilio(),
                cuartel.getTelefono(),
                cuartel.getCorreoElectronico()
            });
        }
    }
    
    private void enabled(){
        jtNomCuartel.setEnabled(true);
        jtDomicilio.setEnabled(true);
        jtLongX.setEnabled(true);
        jtLatY.setEnabled(true);
        jtTelefono.setEnabled(true);
        jtCorreo.setEnabled(true);
    }

    private void limpiarCampos(){
        jtNomCuartel.setText("");
        jtDomicilio.setText("");
        jtLongX.setText("");
        jtLatY.setText("");
        jtTelefono.setText("");
        jtCorreo.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbDarDeBaja;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbSeleccionar;
    private javax.swing.JButton jbguardar;
    private javax.swing.JTextField jtCorreo;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtLatY;
    private javax.swing.JTextField jtLongX;
    private javax.swing.JTextField jtNomCuartel;
    private javax.swing.JTextField jtTelefono;
    private javax.swing.JTable tablaCuartel;
    // End of variables declaration//GEN-END:variables
}
