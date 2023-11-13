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
            ps.setInt(5, brigada.getIdBrigada());
            int filasModificadas=ps.executeUpdate();
            //modificar para prueba >0 a ==1
            if(filasModificadas==1){
                JOptionPane.showMessageDialog(null, "se modificaron datos de la Brigada");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro nada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Brigada");
        } 
    }
    
    public void eliminarBrigada(int idBrigada) {
        String sql = "DELETE FROM brigada WHERE idBrigada = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idBrigada);
            int rowsDeleted = ps.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Brigada eliminada exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna Brigada con el código proporcionado: " + idBrigada);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la Brigada: " + ex.getMessage());
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
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla brigada" + ex.getMessage());
        }
        return listBrigada;
    }
    
    public Brigada verBrigadasPorID(int id){
        Brigada brigada = null;
        String sql = "SELECT * FROM brigada WHERE idBrigada= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
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
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla cuarteIDl ");
        }
        return brigada;
    }
    
    public boolean existeBrigadaConNombre(String nombreBrigada) {
    String sql = "SELECT COUNT(*) FROM brigada WHERE nombreBrigada = ?";
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, nombreBrigada);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);
            return count > 0;
        }
    } catch (SQLException ex) {
    }
    return false;
}
    
    public List<Brigada> brigadasInactivas() {
        String sql = "SELECT DISTINCT codBrigada FROM bombero WHERE activo = 0";
        List<Brigada> listaBrigadas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Brigada brigadaI = new Brigada();
                int idBrigada = rs.getInt("codBrigada");
                brigadaI.setIdBrigada(idBrigada);
                listaBrigadas.add(brigadaI);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla brigada ");
        }

        return listaBrigadas;

    }
}
