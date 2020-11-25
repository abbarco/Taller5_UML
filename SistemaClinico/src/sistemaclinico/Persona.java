/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico;

import java.util.Date;

/**
 *
 * @author PC
 */
public class Persona {
    
	protected String usuario;
	protected String clave;
	protected String nombre;
	protected String apellido;
	protected String cedula;
	protected String direccion;
	protected Date fechaNacimiento;

	public Persona() {}
	
	public Persona(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNacimiento) {

		this.usuario = usuario;
		this.clave = clave;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
	
	}

	public boolean logIn() {
	
		// Implements
		
		return true;
	
	}

	public boolean logOut() {
	
		// Implements
		
		return true;
	
	}
	
}
