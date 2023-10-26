/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.entidades;

public class Cuartel {
    private String codigoCuartel;
    private String nombreCuartel;
    private String domicilio;
    private Coordenada coordenada1;
    private Coordenada coordenada2;
    private String telefono;
    private String correoElectronico;

    public Cuartel(String codigoCuartel, String nombreCuartel, String domicilio, Coordenada coordenada1, Coordenada coordenada2, String telefono, String correoElectronico) {
        this.codigoCuartel = codigoCuartel;
        this.nombreCuartel = nombreCuartel;
        this.domicilio = domicilio;
        this.coordenada1 = coordenada1;
        this.coordenada2 = coordenada2;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    
    
}
