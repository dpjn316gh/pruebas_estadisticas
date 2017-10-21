/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadores;

import java.util.ArrayList;


/**
 *
 * @author Veronica Cortes/Jazmin Patino
 */
public class CongruencialMixto {
    
    private int semilla;
    private int iteraciones;
    private int multiplicador;
    private int constante;
    private int modulo;
    
    public ArrayList<Double> numeroAleatorio;
    
    public void mostrar(int semilla, int iteraciones, int multiplicador, int constante, int modulo)  throws Exception {
           
        this.semilla = semilla;
        this.iteraciones = iteraciones;
        this.multiplicador = multiplicador;
        this.constante = constante;
        this.modulo = modulo;
        numeroAleatorio = new ArrayList<>();
       }
    
    
    public void generar() throws Exception {
       
        double resultado=0;
        double multiplicacion;
        
        for (int i = 0; i < iteraciones; i++) {
            if (i == 0) {
                resultado = semilla;
            } else {
                
                multiplicacion = (multiplicador * resultado)+ constante;
                resultado = multiplicacion % modulo;
                        
            }
           numeroAleatorio.add(resultado);
        }
    }

        public String imprimirResultados() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numeroAleatorio.size(); i++) {
            sb.append(String.format("%d) %f\n", i + 1, numeroAleatorio.get(i)));
        }

        return sb.toString();
    }
         public static void main(String args[]) throws Exception {
        
        CongruencialMixto m = new CongruencialMixto();
        m.mostrar(4,10,5,7,8);
        m.generar();
        System.out.print(m.imprimirResultados());
    }
    }
    

