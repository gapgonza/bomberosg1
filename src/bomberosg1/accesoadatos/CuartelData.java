/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.accesoadatos;

import bomberosg1.entidades.Cuartel;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.ArrayList;
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
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartelALTA");
        }
        
    }
    
    public void modificarCuartel(Cuartel cuartel){
        String sql = "UPDATE `cuartel` SET `nombreCuartel`=?,`domicilio`=?,`longitudX`=?,`latitudY`=?,`telefono`=?,`correoElectronico`=?"
                + " WHERE idCuartel = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cuartel.getNombreCuartel());
            ps.setString(2, cuartel.getDomicilio());
            ps.setInt(3, cuartel.getLongitudX());
            ps.setInt(4, cuartel.getLatitudY());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreoElectronico());
            ps.setInt(7, cuartel.getIdCuartel());
            int filas = ps.executeUpdate();
            if(filas==1){
                JOptionPane.showMessageDialog(null, "Se ha modificado el Cuartel");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartelMODIf");
        }
        
        
    }
    
    public Cuartel verCuarteles(int id){
        
        Cuartel cuartel = new Cuartel();
        try {
            String sql = "SELECT * FROM cuartel WHERE idCuartel = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cuartel.setIdCuartel(rs.getInt("idCuartel"));
                cuartel.setNombreCuartel(rs.getString("nombreCuartel"));
                cuartel.setDomicilio(rs.getString("domicilio"));
                cuartel.setLongitudX(rs.getInt("longitudX"));
                cuartel.setLatitudY(rs.getInt("latitudY"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreoElectronico(rs.getString("correoElectronico"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla cuartel");//encontre el error
        }
        return cuartel;
    }
    
    public List<Cuartel> verCuartel(){
        List<Cuartel> listaCuartel = new ArrayList<>();
        
        try {
            String sql = "Select * FROM cuartel";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Cuartel cuartel = new Cuartel();
                cuartel.setIdCuartel(rs.getInt("idCuartel"));
                cuartel.setNombreCuartel(rs.getString("nombreCuartel"));
                cuartel.setDomicilio(rs.getString("domicilio"));
                cuartel.setLongitudX(rs.getInt("longitudX"));
                cuartel.setLatitudY(rs.getInt("latitudY"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreoElectronico(rs.getString("correoElectronico"));
                listaCuartel.add(cuartel);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartelLIST");
        }
        return listaCuartel;
    }
    
    public void bajaCuartel(Cuartel cuartel){
        String sql = "DELETE FROM `cuartel` WHERE `idCuartel` = ?";
         try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, cuartel.getIdCuartel());
        ps.executeUpdate();
        ps.close();
    } catch (SQLException ex) {
        System.out.println("Error al eliminar el cuartel: " + ex.getMessage());
    }
    }
    
    //Metodo agregado para poder validar el duplicado
    public boolean existeCuartel(String nombreCuartel){
        try {
        String sql = "SELECT * FROM cuartel WHERE nombreCuartel = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, nombreCuartel);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            return true;
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartelEXISYTRE");
    }
    return false;
    }
}
