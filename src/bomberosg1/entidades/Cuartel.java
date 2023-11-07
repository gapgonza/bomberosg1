package bomberosg1.entidades;

public class Cuartel {
    private int idCuartel;
    private String nombreCuartel;
    private String domicilio;
    private int longitudX;
    private int latitudY;
    private String telefono;
    private String correoElectronico;

    public Cuartel() {
    }

    public Cuartel(int idCuartel, String nombreCuartel, String domicilio, int longitudX, int latitudY, String telefono, String correoElectronico) {
        this.idCuartel = idCuartel;
        this.nombreCuartel = nombreCuartel;
        this.domicilio = domicilio;
        this.longitudX = longitudX;
        this.latitudY = latitudY;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public Cuartel(String nombreCuartel, String domicilio, int longitudX, int latitudY, String telefono, String correoElectronico) {
        this.nombreCuartel = nombreCuartel;
        this.domicilio = domicilio;
        this.longitudX = longitudX;
        this.latitudY = latitudY;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public int getIdCuartel() {
        return idCuartel;
    }

    public void setIdCuartel(int idCuartel) {
        this.idCuartel = idCuartel;
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
        return idCuartel +", " +nombreCuartel;
    }
    
    
    
}
