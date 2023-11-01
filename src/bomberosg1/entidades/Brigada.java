package bomberosg1.entidades;


import bomberosg1.entidades.Bombero;
import java.util.List;

public class Brigada {
    private int codBrigada;
    private String nombreBrigada;
    private String especialidad;
    private boolean libre;
    private int numeroCuartel;
    

    public Brigada() {
    }
    
    public Brigada(int codBrigada, String nombreBrigada, String especialidad, boolean libre, int numeroCuartel) {
        this.codBrigada = codBrigada;
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.libre = libre;
        this.numeroCuartel = numeroCuartel;
    }
    
    public Brigada(String nombreBrigada, String especialidad, boolean libre, int numeroCuartel) {
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.libre = libre;
        this.numeroCuartel = numeroCuartel;
    }
    
    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public String getNombreBrigada() {
        return nombreBrigada;
    }

    public void setNombreBrigada(String nombreBrigada) {
        this.nombreBrigada = nombreBrigada;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public int getNumeroCuartel() {
        return numeroCuartel;
    }

    public void setNumeroCuartel(int numeroCuartel) {
        this.numeroCuartel = numeroCuartel;
    }

    
    //lo controla BrigadaData
   
//    public void asignarIncidente() {
//    }
//
//    public void resolverIncidente() {
//    }
    
}
