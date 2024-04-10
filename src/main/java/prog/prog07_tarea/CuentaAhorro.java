/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.prog07_tarea;

/**
 *
 * @author Cristian
 */
public class CuentaAhorro extends CuentaBancaria {
    
    private double tipoInteres;

    public CuentaAhorro(double tipoInteres, Persona titular, double saldo, String IBAN) {
        super(titular, saldo, IBAN);
        this.tipoInteres = tipoInteres;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    
  

    
    @Override
    public String devolverInfoString() {
    return  super.devolverInfoString() +  "tipoInteres=" + tipoInteres;    }
}
    

    

