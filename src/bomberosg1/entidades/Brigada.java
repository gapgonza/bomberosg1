package bomberosg1.entidades;


public class Brigada {
    private int codBrigada;
    private String nombreBrigada;
    private String especialidad;
    private boolean libre;
    private Cuartel numeroCuartel;
    

    public Brigada() {
    }
    
    public Brigada(int codBrigada, String nombreBrigada, String especialidad, boolean libre, Cuartel numeroCuartel) {
        this.codBrigada = codBrigada;
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.libre = libre;
        this.numeroCuartel = numeroCuartel;
    }

    public Brigada(String nombreBrigada, String especialidad, boolean libre, Cuartel numeroCuartel) {
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

    public Cuartel getNumeroCuartel() {
        return numeroCuartel;
    }

    public void setNumeroCuartel(Cuartel numeroCuartel) {
        this.numeroCuartel = numeroCuartel;
    }

    @Override
    public String toString() {
        return "Brigada{" + "codBrigada=" + codBrigada + ", nombreBrigada=" + nombreBrigada + ", especialidad=" + especialidad + ", libre=" + libre + ", numeroCuartel=" + numeroCuartel + '}';
    }

}
