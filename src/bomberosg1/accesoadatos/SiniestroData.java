/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.accesoadatos;

import bomberosg1.entidades.Siniestro;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonza
 */
public class SiniestroData {

    private Connection con = null;

    public SiniestroData() {
        con = Conexion.getConexion();
    }

    public void agregarSiniestro(Siniestro siniestro) {
        String sql = "INSERT INTO `siniestro`(`tipo`, `fechaSiniestro`, `longitudX`, `latitudY`, `detalles`, `activo`, `horaSiniestro`)"
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, siniestro.getTipo());
            ps.setDate(2, Date.valueOf(siniestro.getFechaSiniestro()));
            ps.setInt(3, siniestro.getLongitudX());
            ps.setInt(4, siniestro.getLatitudY());
            ps.setString(5, siniestro.getDetalles());
            ps.setBoolean(6, siniestro.isActivo());
            ps.setTime(7, Time.valueOf(siniestro.getHoraSiniestro()));
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                siniestro.setIdSiniestro(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "El siniestro fue agregado");
            }
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Siniestro");
        }
    }

    public List<Siniestro> obtenerSiniestros() {
        List<Siniestro> siniestros = new ArrayList<>();
        String sql = "SELECT * FROM `siniestro`";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Siniestro siniestro = new Siniestro();
                BrigadaData bri = new BrigadaData();
                siniestro.setIdSiniestro(rs.getInt("idSiniestro"));
                siniestro.setTipo(rs.getString("tipo"));
                siniestro.setFechaSiniestro(rs.getDate("fechaSiniestro").toLocalDate());
                siniestro.setLongitudX(rs.getInt("longitudX"));
                siniestro.setLatitudY(rs.getInt("latitudY"));
                siniestro.setDetalles(rs.getString("detalles"));
                siniestro.setCodBrigada(bri.verBrigadasPorID(rs.getInt("codBrigada")));
//                siniestro.setFechaResolucion(rs.getDate("fechaResolucion").toLocalDate());
//                siniestro.setPuntuacion(rs.getInt("puntuacion"));

                siniestros.add(siniestro);
            }
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Siniestro");
        }
        return siniestros;
    }
    
    public Siniestro obtenerSiniestroPorId(int idSiniestro){
        Siniestro siniestroID = null;
        String sql = "SELECT * FROM siniestro WHERE idSiniestro= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idSiniestro);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                siniestroID = new Siniestro();
                BrigadaData briDa = new BrigadaData();
                siniestroID.setIdSiniestro(rs.getInt("idSiniestro"));
                siniestroID.setTipo(rs.getString("tipo"));
                siniestroID.setFechaSiniestro(rs.getDate("fechaSiniestro").toLocalDate());
                siniestroID.setLongitudX(rs.getInt("longitudX"));
                siniestroID.setLatitudY(rs.getInt("latitudY"));
                siniestroID.setDetalles(rs.getString("detalles"));
                siniestroID.setFechaResolucion(rs.getDate("fechaResolucion").toLocalDate());
                siniestroID.setPuntuacion(rs.getInt("puntuacion"));
                siniestroID.setCodBrigada(briDa.verBrigadasPorID(rs.getInt("codBrigada")));

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(SiniestroData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return siniestroID;
    }

    public void actualizarSiniestro(LocalDate fechaResolucion, int puntuacion, int idSiniestro) {
        try {
            String sql = "UPDATE siniestro SET fechaResolucion=?, puntuacion=? WHERE idSiniestro=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaResolucion));
            ps.setInt(2, puntuacion);
            ps.setInt(3, idSiniestro);
            ps.executeUpdate();
        } catch (SQLException ex) {
            // Manejo de excepciones, por ejemplo:
            ex.printStackTrace();
        }
    }
    
    public void asignarElSiniestro(Siniestro siniestro){
        String sql = "UPDATE siniestro SET codBrigada = ? WHERE idSiniestro = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, siniestro.getCodBrigada().getIdBrigada());
            ps.setInt(2, siniestro.getIdSiniestro());

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Brigada asiganada al Siniestro");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el siniestro para actualizar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el siniestro: " + ex.getMessage());
        }
    }
    
    public void asignarLaBrigada(Siniestro siniestro){
        String sql = "UPDATE siniestro SET codBrigada = ? WHERE idSiniestro = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, siniestro.getCodBrigada().getIdBrigada());
            ps.setInt(2, siniestro.getIdSiniestro());

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Brigada asiganada al Siniestro");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el siniestro para actualizar");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el siniestro: " + ex.getMessage());
        }
    }
    
    public void actualizarBrigada(int idBrigada, boolean libre){
        String sql = "UPDATE brigada SET libre = ? WHERE idBrigada = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, libre);
            ps.setInt(2, idBrigada);

            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                // JOptionPane.showMessageDialog(null, "Brigada dado de baja");
            } else {
                JOptionPane.showMessageDialog(null, "error");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el estado de la brigada");
        }
    }
}
