package bomberosg1.entidades;


import bomberosg1.entidades.Bombero;
import java.util.List;

public class Brigada {
    private String nombreClave;
    private Especialidad especialidad;
    private List<Bombero> bomberos;

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
    
    public void asignarIncidente() {
    }

    public void resolverIncidente() {
    }
}
