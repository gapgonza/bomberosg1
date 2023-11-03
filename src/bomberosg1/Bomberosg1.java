/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bomberosg1;

import bomberosg1.accesoadatos.BomberoData;
import bomberosg1.accesoadatos.BrigadaData;
import bomberosg1.accesoadatos.Conexion;
import bomberosg1.accesoadatos.CuartelData;
import bomberosg1.entidades.Bombero;
import bomberosg1.entidades.Brigada;
import bomberosg1.entidades.Cuartel;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Gonza
 */
public class Bomberosg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
/*------------------CuartelData---------------*/
//            Cuartel c1= new Cuartel("Bom Ciudad de San Luis", "Falucho 825", 10, 10, "2664422224", "B1@sanluis.gov.ar");
//            Cuartel c2= new Cuartel("Bom de El Trapiche", "Martin Grillo s/n", 50, 30, "2664493069", "B2@sanluis.gov.ar");
//            Cuartel c3= new Cuartel("Bom El fortin", "Remedios de Escalada N° 11", 30, 20, "2664445500", "B3@sanluis.gov.ar");
//          
//            CuartelData cuartelData = new CuartelData();
//            cuartelData.altaCuartel(c1);
//            cuartelData.altaCuartel(c2);
//            cuartelData.altaCuartel(c3);
//            System.out.println("Cuarteles agregados: "+c1 +", "+c2 +", "+c3);
// 
//            Cuartel cuartel = new Cuartel();
//            cuartel.setNombreCuartel("nombre");
//            cuartel.setDomicilio("direccion");
//            cuartel.setCoordenadaX(123);
//            cuartel.setCoordenadaY(456);
//            cuartel.setTelefono("1234567890");
//            cuartel.setCorreoElectronico("correo@example.com");
//
// Llamar al método altaCuartel
//            cuartelData.altaCuartel(cuartel);
///*---------------BrigadaData----------------*/
//            Brigada br1 = new Brigada("Zeta", "incendios", true, 1);
//            Brigada br1 = new Brigada("Alfa", "1 -incendios en viviendas, e industrias", true, 1);
//            Brigada br2 = new Brigada("Beta", "2 -salvamento en derrumbes", true, 2);
//            Brigada br3 = new Brigada("Delta", "3 -rescates en ámbito montaña", true, 3);
//            
//            BrigadaData brigadaData = new BrigadaData();
//            brigadaData.darAltaBrigada(br1);
//            brigadaData.darAltaBrigada(br2);
//            brigadaData.darAltaBrigada(br3);
//            System.out.println("Brigadas agregadas: "+br1);
//
//            Brigada brigada = new Brigada();
//            brigada.setNombreBrigada("nombre");
//            brigada.setEspecialidad("especialidad");
//            brigada.setLibre(true);
//            brigada.setNumeroCuartel(cuartel.getCodigoCuartel());
//            
//            brigadaData.darAltaBrigada(brigada);
//            
///*----------------BomberoData-------------------*/
///////////Alta Bombero
//
//            Bombero b1 = new Bombero(35767572, "Alan Peñiñorey", LocalDate.of(1991, Month.MARCH, 25), "2664328916", 1, "A+", true);
//            
//            BomberoData bomberoData = new BomberoData();
//            bomberoData.altaBombero(b1);
//
//            Bombero bombero = new Bombero();
//            bombero.setDni(123456789);
//            bombero.setNombreApellido("nombre");
//            bombero.setFechaNac(LocalDate.of(2000, 1, 1));
//            bombero.setGrupoSanguineo("O+");
//            bombero.setCelular("0987654321");
//            bombero.setCodBrigada(3);
//            
//            bomberoData.altaBombero(bombero);
    }
    
}
