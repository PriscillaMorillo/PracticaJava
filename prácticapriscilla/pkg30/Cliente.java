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


public class Cliente extends Persona {
    private String tipoCliente;

 
    public Cliente(String nombre, String direccion, String telefono, String tipoCliente) {
        super(nombre, direccion, telefono);
        this.tipoCliente = tipoCliente;
    }

  
    public String contactarRepresentante() {
        return "Cliente " + getNombre() + " ha contactado a su representante.";
    }

 
    public String solicitarInformacion() {
        return "Cliente " + getNombre() + " ha solicitado información.";
    }
}

