/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.accesoadatos;

import java.sql.*;

/**
 *
 * @author Gonza
 */
public class SiniestroData {
    private Connection con = null;

    public SiniestroData() {
        con = Conexion.getConexion();
    }
    
    
}
