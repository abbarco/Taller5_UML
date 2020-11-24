/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico;

import java.util.Date;
import java.util.List;

/**
 *
 * @author PC
 */
public class Administrador {
    
    protected List<Persona> registradosPor;
	
	public Administrador() { }
	
	public Administrador(String usuario, String clave, String nombre, 
		String apellido, String cedula, String direccion, Date fechaNacimiento) {
		
		super(usuario, clave, nombre, apellido, cedula, direccion, 
			fechaNacimiento);
		
	}
	
	public void registrarPersona() {
	
		// Implements
	
	}
	
	public void asignarRol(Persona persona) {
	
		// Implements
	
	}
}
