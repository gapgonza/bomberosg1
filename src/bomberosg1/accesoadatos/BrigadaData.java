/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.accesoadatos;
import bomberosg1.entidades.Brigada;
import java.sql.Connection;
import java.sql.*;
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
        String sql = "INSERT INTO brigada (nombreBrigada, especialidad, libre, numeroCuartel) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, brigada.getNombreBrigada());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getNumeroCuartel());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                brigada.setCodBrigada(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se agrego la Brigada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada");
        }
    }
    
    public void modificarBrigada(Brigada brigada){
        
    }
    
    public void eliminarBrigada(int codBrigada){
        
    }
    
    
}