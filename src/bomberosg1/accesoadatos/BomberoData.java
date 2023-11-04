/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.accesoadatos;

import bomberosg1.entidades.Bombero;
import java.sql.*;
import java.time.Month;
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
        String sql = "INSERT INTO bombero (dni, nombreApellido, fechaNac, celular, codBrigada, grupoSanguineo, activo)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, bombero.getDni());
            ps.setString(2, bombero.getNombreApellido());
            ps.setDate(3, Date.valueOf(bombero.getFechaNac()));
            ps.setString(4, bombero.getGrupoSanguineo());
            ps.setString(5, bombero.getCelular());
            ps.setInt(6, bombero.getCodBrigada().getCodBrigada());
            ps.setBoolean(7, true);
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
        String sql = "UPDATE bombero SET dni=?, apellido=?, nombre=?, fechaNacimiento=?, grupoSanguineo=?, celular=?, codBrigada=?"
                + " WHERE idBombero=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, bombero.getDni());
            ps.setString(2, bombero.getNombreApellido());
            ps.setDate(3,Date.valueOf(bombero.getFechaNac()));
            ps.setString(4, bombero.getGrupoSanguineo());
            ps.setString(5, bombero.getCelular());
            ps.setInt(6, bombero.getCodBrigada().getCodBrigada());
            ps.setInt(7, bombero.getIdBombero());
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
        
    }
    
//    public List<Bombero>
    
}
