/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.prog07_tarea;

/**
 *
 * @author Cristian
 */
public class CuentaCorrienteEmpresa extends CuentaCorriente{
    
    private double maxDescubierto;
    private double tipoInteresDescubierto;
    private double comisionFijaDescubierto;

    public CuentaCorrienteEmpresa(double maxDescubierto, double tipoInteresDescubierto, double comisionFijaDescubierto, String listaEntidades, Persona titular, double saldo, String IBAN) {
        super(listaEntidades, titular, saldo, IBAN);
        this.maxDescubierto = maxDescubierto;
        this.tipoInteresDescubierto = tipoInteresDescubierto;
        this.comisionFijaDescubierto = comisionFijaDescubierto;
    }

    public double getMaxDescubierto() {
        return maxDescubierto;
    }

    public void setMaxDescubierto(double maxDescubierto) {
        this.maxDescubierto = maxDescubierto;
    }

    public double getTipoInteresDescubierto() {
        return tipoInteresDescubierto;
    }

    public void setTipoInteresDescubierto(double tipoInteresDescubierto) {
        this.tipoInteresDescubierto = tipoInteresDescubierto;
    }

    public double getComisionFijaDescubierto() {
        return comisionFijaDescubierto;
    }

    public void setComisionFijaDescubierto(double comisionFijaDescubierto) {
        this.comisionFijaDescubierto = comisionFijaDescubierto;
    }
     public String devolverInfoString(){
        return  super.devolverInfoString() +   "CuentaCorrienteEmpresa" + "maxDescubierto=" + maxDescubierto + 
                ", tipoInteresDescubierto=" + tipoInteresDescubierto + ", comisionFijaDescubierto=" + comisionFijaDescubierto;
        
    
}

}