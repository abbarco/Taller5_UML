package sistemaclinico;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import sistemaclinico.AreaMedica;
import sistemaclinico.Cita;
import sistemaclinico.Persona;
import sistemaclinico.Secretaria;

/**
 *

 */
public class Doctor extends Persona {
    
    protected int regDoctor;
    protected String especialidad;
    protected Secretaria secretaria;
    protected List<Cita> citasPendientes;
    protected AreaMedica area;
    
    public Doctor() {
        this.citasPendientes=new ArrayList<>();
    }

    public Doctor(String usuario, String clave, String nombre, String apellido, 
        String cedula, String direccion, Date fechaNacimiento) {
    
        super(usuario, clave, nombre, apellido, cedula, direccion, 
            fechaNacimiento);
        
        this.citasPendientes=new ArrayList<>();
    }
    
    public void recetar() {
    
        // Implements
    
    }
    
    public void agregarPlanNut() {
    
        // Implements
        
    }
    
    public void imprimirReceta() {
    
        // Implements
    
    }
    
    public void registrarSecretaria() {
    
        // Implements
    
    }
    
}
