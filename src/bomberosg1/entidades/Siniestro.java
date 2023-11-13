package bomberosg1.entidades;


import bomberosg1.entidades.Brigada;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Siniestro {
    private int idSiniestro;
    private String tipo;
    private LocalDate fechaSiniestro;
    private int longitudX;
    private int latitudY;
    private String detalles;
    private LocalDate fechaResolucion;
    private int puntuacion;
    private Brigada codBrigada;
    private boolean activo;
    private LocalTime horaSiniestro;

    public Siniestro() {
    }

    public Siniestro(String tipo, LocalDate fechaSiniestro, int longitudX, int latitudY, String detalles, LocalDate fechaResolucion, int puntuacion, Brigada codBrigada, boolean activo, LocalTime horaSiniestro) {
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.longitudX = longitudX;
        this.latitudY = latitudY;
        this.detalles = detalles;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
        this.activo = activo;
        this.horaSiniestro = horaSiniestro;
    }

    public Siniestro(int idSiniestro, String tipo, LocalDate fechaSiniestro, int longitudX, int latitudY, String detalles, LocalDate fechaResolucion, int puntuacion, Brigada codBrigada, boolean activo, LocalTime horaSiniestro) {
        this.idSiniestro = idSiniestro;
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.longitudX = longitudX;
        this.latitudY = latitudY;
        this.detalles = detalles;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
        this.activo = activo;
        this.horaSiniestro = horaSiniestro;
    }

    public int getIdSiniestro() {
        return idSiniestro;
    }

    public void setIdSiniestro(int idSiniestro) {
        this.idSiniestro = idSiniestro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaSiniestro() {
        return fechaSiniestro;
    }

    public void setFechaSiniestro(LocalDate fechaSiniestro) {
        this.fechaSiniestro = fechaSiniestro;
    }

    public int getLongitudX() {
        return longitudX;
    }

    public void setLongitudX(int longitudX) {
        this.longitudX = longitudX;
    }

    public int getLatitudY() {
        return latitudY;
    }

    public void setLatitudY(int latitudY) {
        this.latitudY = latitudY;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDate getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(LocalDate fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Brigada getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(Brigada codBrigada) {
        this.codBrigada = codBrigada;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public LocalTime getHoraSiniestro() {
        return horaSiniestro;
    }

    public void setHoraSiniestro(LocalTime horaSiniestro) {
        this.horaSiniestro = horaSiniestro;
    }

    

    
    
}
