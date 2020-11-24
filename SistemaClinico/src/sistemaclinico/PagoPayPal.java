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
public class PagoPayPal implements Pago {
    protected String email;
    protected float monto;

    public PagoPayPal(String email, float monto) {
        this.email = email;
        this.monto = monto;
    }
    
    @Override
    public boolean realizarPago(float Monto) {
        // Implements
        
        return true;
    }
}