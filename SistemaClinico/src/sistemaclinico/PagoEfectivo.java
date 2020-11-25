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
public class PagoEfectivo implements Pago { 
    protected float monto;
    
    public PagoEfectivo() {}
    
    public PagoEfectivo(float monto) {
        this.monto = monto;
    }
    
    @Override
    public boolean realizarPago(float Monto) {
        // Implements
        
        return true;
    }
}