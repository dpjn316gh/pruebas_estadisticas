/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadores;

import java.util.ArrayList;

/**
 *
 * @author Veronica
 */
public class WichmannyHill {

    private long semillaX;
    private long semillaY;
    private long semillaZ;
    private int NumeroIteraciones;

    public ArrayList<Double> numerosAleatorio;

    public void inicial(long semillaX, long semillaY, long semillaZ, int NumeroIteraciones) {

        this.semillaX = semillaX;
        this.semillaY = semillaY;
        this.semillaZ = semillaZ;
        this.NumeroIteraciones = NumeroIteraciones;
        numerosAleatorio = new ArrayList<>();
    }

    public void generar() {

        long x = semillaX;
        long y = semillaY;
        long z = semillaZ;
        double resultado;

        for (int i = 0; i < NumeroIteraciones; i++) {

            x = generarX(x);
            y = generarY(y);
            z = generarZ(z);
            
            resultado =     
                    generarX(x) / 30269.0 +
                    generarY(y) / 30307.0 + 
                    generarZ(z) / 30323.0;
            
            numerosAleatorio.add(resultado);                       
        }
    }

    public long generarX(long x) {

        return (171 * x) % 30269;
    }

    public long generarY(long y) {

        return (172 * y) % 30307;
    }

    public long generarZ(long z) {

        return (170 * z) % 30323;
    }

    // public void resultado() throws Exception {
    //   double resultado;
    //   resultado = (numeroAleatorioX + numeroAleatorioY + numeroAleatorioZ);
    //}
    public String imprimirResultados() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numerosAleatorio.size(); i++) {
            sb.append(String.format("%d) %f\n", i + 1, numerosAleatorio.get(i)));
        }        

        return sb.toString();
    }

    public static void main(String args[]) throws Exception {

        WichmannyHill m = new WichmannyHill();
        m.inicial(2245, 4456, 3325, 10);
        m.generar();
        System.out.print(m.imprimirResultados());
    }
}
