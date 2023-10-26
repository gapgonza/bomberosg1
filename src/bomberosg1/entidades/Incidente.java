package bomberosg1.entidades;


import bomberosg1.entidades.Brigada;
import java.util.Date;

public class Incidente {
    private Date fechaHora;
    private TipoEmergencia tipoEmergencia;
    private String detalles;
    private Brigada brigadaAsignada;

    public Incidente() {
    }

    public Incidente(Date fechaHora, TipoEmergencia tipoEmergencia, String detalles, Brigada brigadaAsignada) {
        this.fechaHora = fechaHora;
        this.tipoEmergencia = tipoEmergencia;
        this.detalles = detalles;
        this.brigadaAsignada = brigadaAsignada;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public TipoEmergencia getTipoEmergencia() {
        return tipoEmergencia;
    }

    public void setTipoEmergencia(TipoEmergencia tipoEmergencia) {
        this.tipoEmergencia = tipoEmergencia;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Brigada getBrigadaAsignada() {
        return brigadaAsignada;
    }

    public void setBrigadaAsignada(Brigada brigadaAsignada) {
        this.brigadaAsignada = brigadaAsignada;
    }

    // Esto lo controla EmergenciaData
//    
//    public void asignarBrigada() {
//    }
}
