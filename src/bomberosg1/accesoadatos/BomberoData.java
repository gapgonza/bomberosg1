/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.accesoadatos;

import bomberosg1.entidades.Bombero;
import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonza
 */
public class BomberoData {

    private Connection con = null;

    public BomberoData() {
        con = Conexion.getConexion();
    }

    public void altaBombero(Bombero bombero) {
        String sql = "INSERT INTO `bombero`(`dni`, `nombre`, `apellido`, `fechaNacimiento`, `grupoSanguineo`, `celular`, `codBrigada`, `activo`)"
                + " VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, bombero.getDni());
            ps.setString(2, bombero.getNombre());
            ps.setString(3, bombero.getApellido());
            ps.setDate(4, Date.valueOf(bombero.getFechaNac()));
            ps.setString(5, bombero.getGrupoSanguineo());
            ps.setString(6, bombero.getCelular());
            ps.setInt(7, bombero.getCodBrigada().getIdBrigada());
            ps.setBoolean(8, true);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                bombero.setIdBombero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Bombero guardado exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Bombero");
        }
    }
    
    public void modificarBombero(Bombero bombero){
        String sql = "UPDATE `bombero` SET `dni`=?,`nombre`=?,`apellido`=?,`fechaNacimiento`=?,`grupoSanguineo`=?,`celular`=?,`codBrigada`=?"
                + " WHERE idBombero=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, bombero.getDni());
            ps.setString(2, bombero.getNombre());
            ps.setString(3, bombero.getApellido());
            ps.setDate(4,Date.valueOf(bombero.getFechaNac()));
            ps.setString(5, bombero.getGrupoSanguineo());
            ps.setString(6, bombero.getCelular());
            ps.setInt(7, bombero.getCodBrigada().getIdBrigada());
            ps.setInt(8, bombero.getIdBombero());
            int filasModificadas=ps.executeUpdate();
            if(filasModificadas>0){
                JOptionPane.showMessageDialog(null, "se modificaron datos de Bombero");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro nada");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Bombero");
        }
        
    }
    
    public void eliminarBombero(int idBombero){
    String sql = "UPDATE bombero SET activo=0, codBrigada=null WHERE idBombero=?";
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idBombero);
        int filasModificadas = ps.executeUpdate();
        if(filasModificadas > 0){
            JOptionPane.showMessageDialog(null, "Bombero eliminado exitosamente");
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro el bombero");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero");
    }
}
    
    public List<Bombero> verBomberos(){
        List<Bombero> listaBomberos = new ArrayList<>();
        String query = "SELECT * FROM bombero WHERE activo = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet resultSet = ps.executeQuery();
            
            while (resultSet.next()) {
                int idBombero = resultSet.getInt("idBombero");
                int dni = resultSet.getInt("dni");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                LocalDate fechaNacimiento = resultSet.getDate("fechaNacimiento").toLocalDate();
                String grupoSanguineo= resultSet.getString("grupoSanguineo");
                boolean activo = resultSet.getBoolean("activo");

                Bombero bombero = new Bombero();
                bombero.setIdBombero(idBombero);
                bombero.setDni(dni);
                bombero.setApellido(apellido);
                bombero.setNombre(nombre);
                bombero.setFechaNac(fechaNacimiento);
                bombero.setGrupoSanguineo(grupoSanguineo);
                bombero.setActivo(activo);
                
                listaBomberos.add(bombero);
            }
            
            resultSet.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return listaBomberos;
    }
    
    public List<Bombero> bomberosInactivos(){
        String sql = "SELECT * FROM bombero WHERE activo = 0 ";
        List<Bombero> listaBomberos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Bombero bomberoI = new  Bombero();
                BrigadaData bd = new BrigadaData();
                bomberoI.setIdBombero(rs.getInt("idBombero"));
                bomberoI.setDni(rs.getInt("dni"));
                bomberoI.setNombre(rs.getString("nombre"));
                bomberoI.setApellido(rs.getString("apellido"));
                bomberoI.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                bomberoI.setGrupoSanguineo(rs.getString("grupoSanguineo"));
                bomberoI.setCelular(rs.getString("celular"));
                bomberoI.setCodBrigada(bd.verBrigadasPorID(rs.getInt("codBrigada")));
                bomberoI.setActivo(rs.getBoolean("activo"));
                listaBomberos.add(bomberoI);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, " Error al acceder a la tabla bombero ");
        }

        return listaBomberos;
        
    }
}
