/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadores;

/**
 *
 * @author Veronica Cortes/ Jazmin Patiño
 */
public class Pareja {
    
    private double estado;
    private double salida;
    
    public Pareja(double estado, double salida){
        this.estado = estado;
        this.salida = salida;
    }

    /**
     * @return the estado
     */
    public double getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(double estado) {
        this.estado = estado;
    }

    /**
     * @return the salida
     */
    public double getSalida() {
        return salida;
    }

    /**
     * @param salida the salida to set
     */
    public void setSalida(double salida) {
        this.salida = salida;
    }
    
    
}
