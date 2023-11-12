/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.accesoadatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonza
 */
public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost:3308/tpfinal";
    private static final String USUARIO = "root";
    private static  String PASSWORD = "";
    private static Connection conexion;

    public Conexion() {
    }
    
    public static Connection getConexion(){
        if(conexion==null){
             try{                           
            // cargar driver
            Class.forName("org.mariadb.jdbc.Driver");
           //conectar BD
          conexion = DriverManager.getConnection(URL , USUARIO, PASSWORD); 
           System.out.println("conectada BD");
        }catch(ClassNotFoundException cnf){
            JOptionPane.showMessageDialog(null,"Error al cargar driver");                     
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al conectar BD");
           if (ex.getErrorCode() == 1062) {
                    JOptionPane.showMessageDialog(null, "Ya exite un bombero con ese DNI");
                }
        }      
        }
        return conexion;      
    }
}
