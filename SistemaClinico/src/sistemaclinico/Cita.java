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
public class Cita implements Pago{
    
    protected Date fecha;
    protected boolean pagada;
    protected String registradoPor;
    protected Paciente paciente;
    protected Doctor doctor;

    public Cita() {}

    public Cita(Date fecha, boolean pagada, String registradoPor, Paciente paciente, Doctor doctor) {
        this.fecha = fecha;
        this.pagada = pagada;
        this.registradoPor = registradoPor;
        this.paciente = paciente;
        this.doctor = doctor;
    }

    public Cita(Date fecha, boolean pagada, String registradoPor) {
        this.paciente = new Paciente();
        this.doctor = new Doctor();
        this.fecha = fecha;
        this.pagada = pagada;
        this.registradoPor = registradoPor;

    }

    @Override
    public boolean realizarPago(float Monto) {

        // Implements

        return true;
		
    }
    
}
