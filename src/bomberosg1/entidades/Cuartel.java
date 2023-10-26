package bomberosg1.entidades;

public class Cuartel {
    private String codigoCuartel;
    private String nombreCuartel;
    private String domicilio;
    private Object coordenadas;
    private String telefono;
    private String correoElectronico;

    public Cuartel() {
    }
    
    public Cuartel(String codigoCuartel, String nombreCuartel, String domicilio, Object coordenadas, String telefono, String correoElectronico) {
        this.codigoCuartel = codigoCuartel;
        this.nombreCuartel = nombreCuartel;
        this.domicilio = domicilio;
        this.coordenadas = coordenadas;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public Cuartel(String nombreCuartel, String domicilio, Object coordenadas, String telefono, String correoElectronico) {
        this.nombreCuartel = nombreCuartel;
        this.domicilio = domicilio;
        this.coordenadas = coordenadas;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public String getCodigoCuartel() {
        return codigoCuartel;
    }

    public void setCodigoCuartel(String codigoCuartel) {
        this.codigoCuartel = codigoCuartel;
    }

    public String getNombreCuartel() {
        return nombreCuartel;
    }

    public void setNombreCuartel(String nombreCuartel) {
        this.nombreCuartel = nombreCuartel;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Object getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Object coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    public void asignarBrigada() {
        
    }
    
}
