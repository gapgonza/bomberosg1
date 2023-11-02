/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.accesoadatos;

import bomberosg1.entidades.Cuartel;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
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
        String sql = "INSERT INTO cuartel (nombreCuartel,direccion,coord_X,coord_Y,telefono, correo" 
                + "VALUES (?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException ex) {
            Logger.getLogger(CuartelData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
