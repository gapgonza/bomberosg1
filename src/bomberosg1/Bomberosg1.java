/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bomberosg1;

import bomberosg1.accesoadatos.BomberoData;
import bomberosg1.entidades.Bombero;
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
///////////Alta Bombero
        Bombero b1 = new Bombero(35767572, "Alan Peñiñorey", LocalDate.of(1991, Month.MARCH, 25), "2664328916", 1);
        BomberoData bomberoData = new BomberoData();
        bomberoData.alta(b1);
    }
    
}
