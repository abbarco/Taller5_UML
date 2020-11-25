/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author PC
 */
public class Secretaria extends Persona {
    protected Doctor doctor;
    protected List<Cita> citas;
	
    public Secretaria() { 
        this.citas= new ArrayList<>();
    }

    public Secretaria(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNacimiento) {

        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNacimiento);
        this.citas= new ArrayList<>();
    }

    public void verificarCita() {

        // Implements

    }

    public void agendarCita() {

        // Implements

    }
	
}
