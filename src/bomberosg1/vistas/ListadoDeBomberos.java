/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bomberosg1.vistas;

/**
 *
 * @author Gonza
 */
public class ListadoDeBomberos extends javax.swing.JInternalFrame {

  private List<Bombero> listaBomberos;
private List<Brigada> listaBrigada;

private BomberoData bomberoData;
private BrigadaData brigadaData;
private DefaultTableModel modelo;


    public ListadoDeBomberos() {
        initComponents();
        brigadaData=new BrigadaData();
        bomberoData=new BomberoData();
       
        listaBrigada=brigadaData.verBrigadas();
        modelo =new DefaultTableModel();
       
        armarCabecera();
        cargarBrigadas();
        cruceBomberoConBrigadas();
    }
    
    
    private void cargarBrigadas(){
        for (Brigada auxBrigada: listaBrigada)
            comboBoxBrigada.addItem(auxBrigada);
    }
    
    
    private void armarCabecera(){
        ArrayList<Object>filaCabeceraList=new ArrayList<>();        
        filaCabeceraList.add("id");       
      //  filaCabeceraList.add("DNI");
        filaCabeceraList.add("nombre");
        filaCabeceraList.add("apellido");
      //  filaCabeceraList.add("fechaNac");
      //  filaCabeceraList.add("grupoSanguineo");
      //  filaCabeceraList.add("celular");
        filaCabeceraList.add("codBrigada");
        filaCabeceraList.add("activo");
        for(Object it: filaCabeceraList){
            modelo.addColumn(it);
        }
          tablaBomberos.setModel(modelo);
    }
    
    private void borrarFilaTabla(){
        int indice= modelo.getRowCount()-1;        
        for(int i=indice;i>0;i--){
            modelo.removeRow(i);//borramos las filas de atras p adelante
        }        
    }
    
    
    private void cruceBomberoConBrigadas(){
        borrarFilaTabla();
        Brigada brigada=(Brigada)comboBoxBrigada.getSelectedItem();        
        listaBomberos=bomberoData.verBomberos();        
        for(Bombero aux: listaBomberos){
            modelo.addRow(new  Object[]{aux.getIdBombero(), aux.getNombre(), aux.getApellido(),
            aux.getCodBrigada(), aux.isActivo()});
            
            
            
//            modelo.addRow(new  Object[]{aux.getIdBombero(), aux.getDni(), aux.getNombre(), aux.getApellido(),
//                aux.getFechaNac(), aux.getGrupoSanguineo(), aux.getCelular(), aux.getCodBrigada(), aux.isActivo()});
        }
    }
    
    
     private void bomberosInactivos(){
         listaBomberos=bomberoData.bomberosInactivos();
         for(Bombero aux: listaBomberos){
            modelo.addRow(new  Object[]{aux.getIdBombero(), aux.getNombre(), aux.getApellido(),
            aux.getCodBrigada(), aux.isActivo()});
         }}
    
    
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBomberos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxBrigada = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        boton_Inactivos = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setClosable(true);
        setForeground(new java.awt.Color(0, 102, 102));
        setIconifiable(true);
        setAutoscrolls(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Brigadas: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        tablaBomberos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaBomberos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 430, 240));

        jLabel2.setText("--------------------------------------------------------------------------------------");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 440, -1));

        jLabel3.setText("Seleccione una Brigada para ver la Lista:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jPanel1.add(comboBoxBrigada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 210, -1));

        jLabel4.setText("Marque para ver aquellos Inactivos:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        boton_Inactivos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton_Inactivos.setText("Inactivos");
        boton_Inactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_InactivosActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Inactivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void boton_InactivosActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
       
        borrarFilaTabla();
        bomberosInactivos();
        
        
    }                                               


    // Variables declaration - do not modify                     
    private javax.swing.JToggleButton boton_Inactivos;
    private javax.swing.JComboBox<Brigada> comboBoxBrigada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaBomberos;
    // End of variables declaration  
}
