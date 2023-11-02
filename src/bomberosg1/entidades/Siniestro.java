package bomberosg1.entidades;


import bomberosg1.entidades.Brigada;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Siniestro {
    private int codigo;
    private String tipo;
    private LocalDate fechaSiniestro;
    private int coordenadaX;
    private int coordenadaY;
    private String detalles;
    private LocalDate fechaResolucion;
    private int puntuacion;
    private Brigada codBrigada;
    private Boolean activo;
    private LocalTime horaSiniestro;

    public Siniestro() {
    }

    public Siniestro(int codigo, String tipo, LocalDate fechaSiniestro, int coordenadaX, int coordenadaY, String detalles, LocalDate fechaResolucion, int puntuacion, Brigada codBrigada, Boolean activo, LocalTime horaSiniestro) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.detalles = detalles;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
        this.activo = activo;
        this.horaSiniestro = horaSiniestro;
    }

    public Siniestro(String tipo, LocalDate fechaSiniestro, int coordenadaX, int coordenadaY, String detalles, LocalDate fechaResolucion, int puntuacion, Brigada codBrigada, Boolean activo, LocalTime horaSiniestro) {
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.detalles = detalles;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
        this.activo = activo;
        this.horaSiniestro = horaSiniestro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
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

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public LocalTime getHoraSiniestro() {
        return horaSiniestro;
    }

    public void setHoraSiniestro(LocalTime horaSiniestro) {
        this.horaSiniestro = horaSiniestro;
    }

    
}
