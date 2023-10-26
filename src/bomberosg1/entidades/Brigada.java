/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.entidades;

import java.util.List;

public class Brigada {
    private String nombreClave;
    private Especialidad especialidad; // Esta puede ser una enumeración
    private List<Bombero> bomberos; // Una lista de bomberos

    public Brigada() {
    }

    public Brigada(String nombreClave, Especialidad especialidad, List<Bombero> bomberos) {
        this.nombreClave = nombreClave;
        this.especialidad = especialidad;
        this.bomberos = bomberos;
    }

    public String getNombreClave() {
        return nombreClave;
    }

    public void setNombreClave(String nombreClave) {
        this.nombreClave = nombreClave;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public List<Bombero> getBomberos() {
        return bomberos;
    }

    public void setBomberos(List<Bombero> bomberos) {
        this.bomberos = bomberos;
    }
    
    
}
