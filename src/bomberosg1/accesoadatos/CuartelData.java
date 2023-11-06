/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.accesoadatos;

import bomberosg1.entidades.Cuartel;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Gonza
 */
public class CuartelData {
    
    private Connection con = null;
    
    public CuartelData(){
        con = Conexion.getConexion();
}
    
    public void altaCuartel(Cuartel cuartel){
        String sql = "INSERT INTO `cuartel`(`nombreCuartel`, `domicilio`, `longitudX`, `latitudY`, `telefono`, `correoElectronico`)" 
                + "VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cuartel.getNombreCuartel());
            ps.setString(2, cuartel.getDomicilio());
            ps.setInt(3, cuartel.getLongitudX());
            ps.setInt(4, cuartel.getLatitudY());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreoElectronico());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                cuartel.setIdCuartel(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cuartel agregado Exitosamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartel");
        }
        
    }
    
    public void modificarCuartel(Cuartel cuartel){
        String sql = "UPDATE cuartel SET nombreCuartel = ?, direccion = ?, coord_X = ?, coord_Y = ?, telefono = ?, correo = ?"
                + " WHERE codCuartel = ?";
        
    }
    
    public void verCuarteles(int id){
        String sql = "SELECT * FROM cuartel WHERE codCuartel = ";
    }
    
    public List<Cuartel> verCuartel(){
        String sql = "Select * FROM cuartel";
        return null;
        
    }
}
