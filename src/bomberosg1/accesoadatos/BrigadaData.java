/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.accesoadatos;
import bomberosg1.entidades.Brigada;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Gonza
 */
public class BrigadaData {
    private Connection con = null;

    public BrigadaData() {
        con= Conexion.getConexion();
    }
    
    public void darAltaBrigada(Brigada brigada){
        String sql = "INSERT INTO `brigada`( `nombreBrigada`, `especialidad`, `libre`, `numeroCuartel`) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, brigada.getNombreBrigada());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getNumeroCuartel().getIdCuartel());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                brigada.setIdBrigada(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se agrego la Brigada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada");
        }
    }
    
    public void modificarBrigada(Brigada brigada){
        String sql = "UPDATE `brigada` SET `nombreBrigada`=?,`especialidad`=?,`libre`=?,`numeroCuartel`=? WHERE `idBrigada`= ?"; 
        try{
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1,brigada.getNombreBrigada());
            ps.setString(2,brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4,brigada.getNumeroCuartel().getIdCuartel());
            int filasModificadas=ps.executeUpdate();
            if(filasModificadas>0){
                JOptionPane.showMessageDialog(null, "se modificaron datos de la Brigada");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro nada");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Bombero");
        }
        
    }
    
  public void eliminarBrigada(int codBrigada) {
    String sql = "UPDATE `brigada` SET `libre` = 0 WHERE `idBrigada` = ?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, codBrigada);
        int filasActualizadas = ps.executeUpdate();
        
        if(filasActualizadas > 0){
            JOptionPane.showMessageDialog(null, "Se desactivó la Brigada con código: " + codBrigada);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna Brigada con el código proporcionado: " + codBrigada);
        }
        
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al desactivar la Brigada");
    }
}


    
    public List<Brigada> verBrigadas(){
        List<Brigada> listBrigada= new ArrayList<>();
        try {
            String sql = "SELECT * FROM brigada";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Brigada brigada1 = new Brigada();
                CuartelData cuartelData = new CuartelData();
                brigada1.setIdBrigada(rs.getInt("idBrigada"));
                brigada1.setNombreBrigada(rs.getString("nombreBrigada"));
                brigada1.setEspecialidad(rs.getString("especialidad"));
                brigada1.setLibre(rs.getBoolean("libre"));
                brigada1.setNumeroCuartel(cuartelData.verCuarteles(rs.getInt("numeroCuartel")));
                listBrigada.add(brigada1);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada");
        }
        return listBrigada;
    }
    
    public Brigada verBrigadasPorID(int id){
        Brigada brigada = null;
        String sql = "SELECT * FROM brigada WHERE idBrigada= ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                brigada = new Brigada();
                CuartelData cuartlData = new CuartelData();
                brigada.setIdBrigada(rs.getInt("idBrigada"));
                brigada.setNombreBrigada(rs.getString("nombreBrigada"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setLibre(rs.getBoolean("libre"));
                brigada.setNumeroCuartel(cuartlData.verCuarteles(rs.getInt("numeroCuartel")));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla cuartel ");
        }
        return brigada;
    }
}
