/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.accesoadatos;

import bomberosg1.entidades.Bombero;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;
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

    public void alta(Bombero bombero) {
        String sql = "INSERT INTO bombero (dni, nombreApellido, fechaNac, celular, codBrigada) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, bombero.getDni());
            ps.setString(2, bombero.getNombreApellido());
            ps.setDate(3, Date.valueOf(bombero.getFechaNac()));
            ps.setString(4, bombero.getCelular());
            ps.setInt(5, bombero.getCodBrigada());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                bombero.setIdBombero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se dio de alta el bombero");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Bombero");
        }
    }
    
    
}