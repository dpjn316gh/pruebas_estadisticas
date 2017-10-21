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
public class Fibonacci {

    private long n0;
    private long n1;
    private long modulus;
    private char operation;
    private int iteraciones;
    public ArrayList<Long> numerosAleatorios;

    public void inicio(long n0, long n1, long modulus, char operation, int iteraciones) throws Exception {

        this.n0 = n0;
        this.n1 = n1;
        this.modulus = modulus;
        this.operation = operation;
        this.iteraciones = iteraciones;

        numerosAleatorios = new ArrayList<>();
    }

    private long hacerOperacion(long a, long b) {

        switch (operation) {
            case '+':
                return (a + b) % modulus;
            case '-':
                return (a - b) % modulus;
            case '*':
                return (a * b) % modulus;
            default:
                return (a + b) % modulus;
        }
    }

    public void operar() throws Exception {

        long entrada = 0;
        long elevado;
        String cadenaElevado;

        for (int i = 0; i < iteraciones; i++) {

            long temp = hacerOperacion(n0, n1);
            n0 = n1;
            n1 = temp;
            
            numerosAleatorios.add(temp);
        }
    }

    public String imprimirResultados() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numerosAleatorios.size(); i++) {
            sb.append(String.format("%d)\t%d\n", i + 1, numerosAleatorios.get(i)));
        }

        return sb.toString();
    }

    public static void main(String args[]) throws Exception {

        Fibonacci m = new Fibonacci();
        m.inicio(4, 11, 7109257, '*', 100000);
        m.operar();
        System.out.print(m.imprimirResultados());
    }
}
