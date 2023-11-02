package bomberosg1.entidades;

public class Cuartel {
    private int codigoCuartel;
    private String nombreCuartel;
    private String domicilio;
    private int coordenadaX;
    private int coordenadaY;
    private String telefono;
    private String correoElectronico;

    public Cuartel() {
    }

    public Cuartel(String nombreCuartel, String domicilio, int coordenadaX, int coordenadaY, String telefono, String correoElectronico) {
        this.nombreCuartel = nombreCuartel;
        this.domicilio = domicilio;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    
    public Cuartel(int codigoCuartel, String nombreCuartel, String domicilio, int coordenadaX, int coordenadaY, String telefono, String correoElectronico) {
        this.codigoCuartel = codigoCuartel;
        this.nombreCuartel = nombreCuartel;
        this.domicilio = domicilio;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public int getCodigoCuartel() {
        return codigoCuartel;
    }

    public void setCodigoCuartel(int codigoCuartel) {
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

    @Override
    public String toString() {
        return "Cuartel{" + "nombreCuartel=" + nombreCuartel + '}';
    }
    
    
}
