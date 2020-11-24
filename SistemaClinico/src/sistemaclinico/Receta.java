/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico;

/**
 *
 * @author PC
 */
public class Receta {
protected Date fecha;
	protected List<Medicamento> medicamentos;
	protected PlanNutricional planNut;
	protected Paciente paciente;
	protected Doctor doctor;

	public Receta() {
	
		this.planNut = new PlanNutricional();
		this.paciente = new Paciente();
		this.doctor = new Doctor();
		
	}
	
	public Receta(Date fecha) {
	
		this.fecha = fecha;
	
	}
	
    


}
