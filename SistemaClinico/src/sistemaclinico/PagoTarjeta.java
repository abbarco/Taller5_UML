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
public class PagoTarjeta implements Pago{
    protected float monto;
    protected String numero;
    protected String propietario;
    protected Date expira;
    protected String banco;

    public PagoTarjeta() {}
    
    public PagoTarjeta(float monto, String numero, String propietario, Date expira, String banco) {
        this.monto = monto;
        this.numero = numero;
        this.propietario = propietario;
        this.expira = expira;
        this.banco = banco;
    }
    
    @Override
    public boolean realizarPago(float Monto) {
    
        // Implements
        
        return true;
    
    }
}
