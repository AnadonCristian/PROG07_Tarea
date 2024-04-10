/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.prog07_tarea;

/**
 *
 * @author Cristian
 */
public class CuentaCorrientePersonal extends CuentaCorriente{
    
    private double ComisionMntenimiento;

    public CuentaCorrientePersonal(double ComisionMntenimiento, String listaEntidades, Persona titular, double saldo, String IBAN) {
        super(listaEntidades, titular, saldo, IBAN);
        this.ComisionMntenimiento = ComisionMntenimiento;
    }

    public double getComisionMntenimiento() {
        return ComisionMntenimiento;
    }

    public void setComisionMntenimiento(double ComisionMntenimiento) {
        this.ComisionMntenimiento = ComisionMntenimiento;
    }
    public String devolverInfoString(){
        return  super.devolverInfoString()  + "ComisionMntenimiento=" + ComisionMntenimiento; 
    
}

    }
