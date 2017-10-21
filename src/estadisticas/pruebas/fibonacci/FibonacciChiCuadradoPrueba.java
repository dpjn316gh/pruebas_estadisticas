/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas.pruebas.fibonacci;

import estadisticas.metodos.ChiCuadrado;
import generadores.Fibonacci;
import generadores.LEcuyer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class FibonacciChiCuadradoPrueba {

    public static void main(String args[]) throws Exception {

        System.out.print("Iniciar");
        List<BigDecimal> list = new ArrayList<>();

        Fibonacci m = new Fibonacci();
        m.inicio(4, 11, 9999889, '*', 1000000);
        m.operar();

        for (int i = 0; i < m.numerosAleatorios.size(); i++) {
            double numero = m.numerosAleatorios.get(i);
            list.add(new BigDecimal(numero / 10000000));

        }
        ChiCuadrado.probar(list, 1, 0.05);
    }
}
