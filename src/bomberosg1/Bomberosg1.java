/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bomberosg1;

import bomberosg1.accesoadatos.BomberoData;
import bomberosg1.accesoadatos.BrigadaData;
import bomberosg1.entidades.Bombero;
import bomberosg1.entidades.Brigada;
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
/*----------------BomberoData-------------------*/
///////////Alta Bombero
        Bombero b1 = new Bombero(35767572, "Alan Peñiñorey", LocalDate.MIN, "2664328916", codBrigada, grupoSanguineo, true);
        BomberoData bomberoData = new BomberoData();
        bomberoData.altaBombero(b1);

/*---------------BrigadaData----------------*/
//        Brigada brigada = new Brigada("Brigada 1", "Especialidad 1", true, 0);
//        BrigadaData brigadaData = new BrigadaData();
//        brigadaData.darAltaBrigada(brigada);
/*------------------CuartelData---------------*/


    }
    
}
