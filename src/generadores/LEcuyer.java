/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadores;

import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class LEcuyer {

    private long semillaX;
    private long semillaY;
    private int NumeroIteraciones;

    public ArrayList<Double> numerosAleatorio;

    public void inicial(long semillaX, long semillaY, int NumeroIteraciones) {

        this.semillaX = semillaX;
        this.semillaY = semillaY;
        this.NumeroIteraciones = NumeroIteraciones;
        numerosAleatorio = new ArrayList<>();
    }

    public void generar() {

        long x = semillaX;
        long y = semillaY;
        long z;
        double resultado;

        for (int i = 0; i < NumeroIteraciones; i++) {

            x = generarX(x);
            y = generarY(y);
            z = generarZ(x, y);

            if (z > 0) {
                resultado = z / 2147483563.0;
            } else {
                resultado = 2147483562.0 / 2147483563.0;
            }

            numerosAleatorio.add(resultado);
        }
    }

    public long generarX(long x) {

        return (40014 * x) % 2147483563;
    }

    public long generarY(long y) {

        return (40692 * y) % 2147483399;
    }

    public long generarZ(long x, long y) {
        return Math.abs(x - y) % 2147483562;
    }

    // public void resultado() throws Exception {
    //   double resultado;
    //   resultado = (numeroAleatorioX + numeroAleatorioY + numeroAleatorioZ);
    //}
    public String imprimirResultados() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numerosAleatorio.size(); i++) {
            sb.append(String.format("%f\n", /*i + 1,*/ numerosAleatorio.get(i)));
        }

        return sb.toString();
    }

    public static void main(String args[]) throws Exception {

        LEcuyer m = new LEcuyer();
        m.inicial(2246, 4457, 100000);
        m.generar();
        System.out.print(m.imprimirResultados());
    }
}
