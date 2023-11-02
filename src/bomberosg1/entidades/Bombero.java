/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.entidades;

import java.time.LocalDate;



/**
 *
 * @author Gonza
 */
public class Bombero {
    private int idBombero;
    private int dni;
    private String nombreApellido;
    private LocalDate fechaNac;
    private String celular;
    private Brigada codBrigada;
    private String grupoSanguineo;
    private boolean activo;

    public Bombero() {
    }

    public Bombero(int dni, String nombreApellido, LocalDate fechaNac, String celular, Brigada codBrigada, String grupoSanguineo, boolean activo) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.codBrigada = codBrigada;
        this.grupoSanguineo = grupoSanguineo;
        this.activo = activo;
    }

    public Bombero(int idBombero, int dni, String nombreApellido, LocalDate fechaNac, String celular, Brigada codBrigada, String grupoSanguineo, boolean activo) {
        this.idBombero = idBombero;
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.codBrigada = codBrigada;
        this.grupoSanguineo = grupoSanguineo;
        this.activo = activo;
    }

    public int getIdBombero() {
        return idBombero;
    }

    public void setIdBombero(int idBombero) {
        this.idBombero = idBombero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Brigada getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(Brigada codBrigada) {
        this.codBrigada = codBrigada;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Bombero{" + "dni=" + dni + ", nombreApellido=" + nombreApellido + ", codBrigada=" + codBrigada + ", grupoSanguineo=" + grupoSanguineo + ", activo=" + activo + '}';
    }

    
}