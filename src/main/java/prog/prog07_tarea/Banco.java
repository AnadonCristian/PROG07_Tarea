/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.prog07_tarea;

/**
 *
 * @author Cristian
 */
public class Banco {
    
    private CuentaBancaria[] cuentas;
    private final int Max=100;
    private int numCuentas;

    public Banco() {
        this.cuentas = new CuentaBancaria[this.Max];
        this.numCuentas = 0;
    }
    
    public boolean abrirCuenta (CuentaBancaria a){
        if (this.numCuentas == this.Max){
            
            System.out.println("No puedes almacenar mas cuentas");
            return false;
        }
       
        
    }
    public CuentaBancaria BuscaIban(String IBAN){
        
        for (int i=0; i < this.numCuentas; i++){
            if(this.cuentas[i].getIBAN().equals(IBAN)){
                return this.cuentas[i];
            }
        }
        return null;
        
    }
    
    
    
}
