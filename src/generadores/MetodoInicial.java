/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadores;

import generadores.matematica.ExpresionMatematicaUnaVariable;
import java.util.ArrayList;

public class MetodoInicial {

    // Función 
    private ExpresionMatematicaUnaVariable funcionTransicion;
    private ExpresionMatematicaUnaVariable funcionSalida;
    private double semilla;
    private int iteraciones;
    private ArrayList<Pareja> conjuntoFinito;

    
    public void iniciar(double semilla, String expresionFuncionTransicion, 
            String expresionFuncionSalida, int iteraciones)  throws Exception {

        this.semilla = semilla;
        this.iteraciones = iteraciones;       
        conjuntoFinito = new ArrayList<>();
        funcionTransicion
                = new ExpresionMatematicaUnaVariable(expresionFuncionTransicion);
        funcionSalida
                = new ExpresionMatematicaUnaVariable(expresionFuncionSalida);
    }

    public void procesar() throws Exception {
        double estadoIntermedio;
        double salida;
        for (int i = 0; i < iteraciones; i++) {
            if (i == 0) {
                estadoIntermedio = funcionTransicion.evaluar(semilla);
            } else {
                estadoIntermedio = funcionTransicion.evaluar(
                        conjuntoFinito.get(i - 1).getEstado());
            }
            salida = funcionSalida.evaluar(estadoIntermedio);
            conjuntoFinito.add(new Pareja(estadoIntermedio, salida));
        }
    }
    
    public String imprimirResultados(){
        
        StringBuilder sb = new StringBuilder();
        double estado;
        double salida;
        
        for (int i = 0; i < conjuntoFinito.size(); i++) {
            estado = conjuntoFinito.get(i).getEstado();
            salida = conjuntoFinito.get(i).getSalida();
            sb.append(String.format("%d) EI=%f - S=%f\n", i+1, estado, salida));
        }
        
        return sb.toString();
    }
}
