/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.entidades;

import java.util.Date;

/**
 *
 * @author Gonza
 */
public class Bombero {
    private String codigoBombero;
    private String DNI;
    private String nombreCompleto;
    private String grupoSanguineo;
    private Date fechaNacimiento;
    private String celular;

    public Bombero(String DNI, String nombreCompleto, String grupoSanguineo, Date fechaNacimiento, String celular) {
        this.DNI = DNI;
        this.nombreCompleto = nombreCompleto;
        this.grupoSanguineo = grupoSanguineo;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
    }

    public Bombero(String codigoBombero, String DNI, String nombreCompleto, String grupoSanguineo, Date fechaNacimiento, String celular) {
        this.codigoBombero = codigoBombero;
        this.DNI = DNI;
        this.nombreCompleto = nombreCompleto;
        this.grupoSanguineo = grupoSanguineo;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
    }

    public String getCodigoBombero() {
        return codigoBombero;
    }

    public void setCodigoBombero(String codigoBombero) {
        this.codigoBombero = codigoBombero;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
}
