/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadores;

import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.naming.OperationNotSupportedException;

/**
 *
 * @author Verónica
 */
public class MidsquareMethod {

    private long semilla;
    private int iteraciones;
    public ArrayList<Double> numerosAleatorios;

    public void inicio(long semilla, int iteraciones) throws Exception {

        this.semilla = semilla;
        
        if (this.semilla % 2 != 0){
            throw new OperationNotSupportedException("Debe ser un valor par");
        }
        
        this.iteraciones = iteraciones;
        numerosAleatorios = new ArrayList<>();
    }

    public void operar() throws Exception {

        long entrada = 0;
        long elevado;
        String cadenaElevado;

        for (int i = 0; i < iteraciones; i++) {
            if (i == 0) {
                entrada = semilla;
            }

            elevado = (long) Math.pow(entrada, 2);
            cadenaElevado = String.valueOf(elevado);

            if (cadenaElevado.length() < 4) {

                StringBuilder sb = new StringBuilder(cadenaElevado);
                for (int k = 0; k < 4 - cadenaElevado.length(); k++) {
                    sb.append("0");
                }

            } else {

                int indice = (cadenaElevado.length() - 4) / 2;
                cadenaElevado = cadenaElevado.substring(indice, indice + 4);

            }
            
            numerosAleatorios.add(((double)Long.valueOf(cadenaElevado) / 10000));
            entrada = Long.valueOf(cadenaElevado);
        }        
    }

    public String imprimirResultados() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numerosAleatorios.size(); i++) {
            sb.append(String.format("%d)\t%f\n", i + 1, numerosAleatorios.get(i)));
        }

        return sb.toString();
    }
    
    public static void main(String args[]) throws Exception {
        
        MidsquareMethod m = new MidsquareMethod();
        m.inicio(3714, 1000);
        m.operar();
        System.out.print(m.imprimirResultados());
    }
    
}