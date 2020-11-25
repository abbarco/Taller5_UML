import java.util.Date;
import java.util.List;

/**

 */
public class Paciente extends Persona {
    
    protected String email;
    protected List<Receta> recetas;
    protected Cita cita;
    protected HistoriaClinica historiaClinica;

    public Paciente() { }
    
    public Paciente(String usuario, String clave, String nombre, String apellido,
        String cedula, String direccion, Date fechaNacimiento, String email) {

        super(usuario, clave, nombre, apellido, cedula, direccion, 
            fechaNacimiento);

        this.email = email;
        
    }

    public boolean solicitarCita() {
    
        // Implements
        
        return true;
        
    }
    
}
