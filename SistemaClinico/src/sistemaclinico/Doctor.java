import java.util.Date;
import java.util.List;

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
    
        super();
        this.secretaria = new Secretaria();
        this.area = new AreaMedica();
    
    }

    public Doctor(String usuario, String clave, String nombre, String apellido, 
        String cedula, String direccion, Date fechaNacimiento) {
    
        super(usuario, clave, nombre, apellido, cedula, direccion, 
            fechaNacimiento);
    
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
