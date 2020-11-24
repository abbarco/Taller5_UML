/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class HistoriaClinica {
    protected int nro;
    protected ArrayList<String> enfermedades;
    protected ArrayList<String> alergias;
    protected ArrayList<String> otros;
    protected Paciente paciente;

    public HistoriaClinica() { }

    public HistoriaClinica(int nro, Paciente paciente) {
        this.nro = nro;
        this.paciente = paciente;
        this.enfermedades= new ArrayList<>();
        this.alergias= new ArrayList<>();
        this.otros= new ArrayList<>();
    }

    
}
