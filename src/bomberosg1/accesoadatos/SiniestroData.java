/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.accesoadatos;

import bomberosg1.entidades.Siniestro;
import java.sql.*;
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
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Siniestro");
        }

    }
}
