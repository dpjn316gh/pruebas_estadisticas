/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas.pruebas.midsquare;

import estadisticas.metodos.ChiCuadrado;
import generadores.MidsquareMethod;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author veronica
 */
public class MidsquareChiCuadradoPrueba {

    public static void main(String args[]) throws Exception {

        List<BigDecimal> list = new ArrayList<>();

        MidsquareMethod m = new MidsquareMethod();
        m.inicio(3714, 1000);
        m.operar();

        for (int i = 0; i < m.numerosAleatorios.size(); i++) {
            double numero = m.numerosAleatorios.get(i);
            list.add(new BigDecimal(numero));
        }
        ChiCuadrado.probar(list, 0.05);
    }
}
