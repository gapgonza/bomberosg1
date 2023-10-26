/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberosg1.entidades;

import java.util.Date;

public class Incidente {
    private Coordenada ubicacion;
    private Date fechaHora;
    private TipoEmergencia tipoEmergencia; // Esta puede ser una enumeración
    private String detalles;
    private Brigada brigadaAsignada;
    private Date fechaResolucion;
    private int calificacionExito;

}
