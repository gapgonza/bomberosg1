/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.accesoadatos;

import bomberosg1.entidades.Cuartel;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
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
        String sql = "INSERT INTO cuartel (nombreCuartel,direccion,coord_X,coord_Y,telefono, correo)" 
                + "VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cuartel.getNombreCuartel());
            ps.setString(2, cuartel.getDomicilio());
            ps.setInt(3, cuartel.getCoordenadaX());
            ps.setInt(4, cuartel.getCoordenadaY());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreoElectronico());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                cuartel.setCodigoCuartel(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cuartel agregado Exitosamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartel");
        }
        
    }
}
