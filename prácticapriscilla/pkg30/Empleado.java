/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prácticapriscilla.pkg30;

/**
 *
 * @author prisc
 */


public class Empleado extends Persona {
    private String puesto;
    private int horasExtra;

   
    public Empleado(String nombre, String direccion, String telefono, String puesto, int horasExtra) {
        super(nombre, direccion, telefono);
        this.puesto = puesto;
        this.horasExtra = horasExtra;
    }

 
    public String solicitudPermiso() {
        return "Permiso solicitado por " + getNombre();
    }

   
    public String reporteHorasExtra() {
        return "Horas extra trabajadas por " + getNombre() + ": " + horasExtra;
    }
}

