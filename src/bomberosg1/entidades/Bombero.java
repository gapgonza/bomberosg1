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
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private String grupoSanguineo;
    private String celular;
    private Brigada codBrigada;
    private boolean activo;

    public Bombero() {
    }

    public Bombero(int dni, String nombre, String apellido, LocalDate fechaNac, String celular, Brigada codBrigada, String grupoSanguineo, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.codBrigada = codBrigada;
        this.grupoSanguineo = grupoSanguineo;
        this.activo = activo;
    }

    public Bombero(int idBombero, int dni, String nombre, String apellido, LocalDate fechaNac, String celular, Brigada codBrigada, String grupoSanguineo, boolean activo) {
        this.idBombero = idBombero;
        this.dni = dni;
        this.nombre = nombre;
        this.nombre = apellido;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
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
        return "Bombero{" + "idBombero=" + idBombero + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + ", codBrigada=" + codBrigada + ", grupoSanguineo=" + grupoSanguineo + ", activo=" + activo + '}';
    }



    
}