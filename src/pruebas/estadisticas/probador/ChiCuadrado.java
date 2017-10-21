/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.estadisticas.probador;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.math3.stat.inference.TestUtils;

/**
 *
 * @author veronica
 */
public class ChiCuadrado {

    public static void probar(List<BigDecimal> list, int limiteSuperior, double confianza) {

        Collections.sort(list);

        int n = list.size();
        double m = Math.sqrt(n);
        double E = n / m;

        HashMap<BigDecimal, Long> clases = new HashMap<>();

        double intervaloClase = limiteSuperior / E;
        double clase = intervaloClase;
        int frecuencia = 0;
        for (int i = 0; i < list.size(); i++) {

            BigDecimal get = list.get(i);
            if (get.doubleValue() < clase) {
                frecuencia++;
            } else {
                clases.put(new BigDecimal(clase), new Long(frecuencia));
                frecuencia = 1;
                clase += intervaloClase;
            }
            if (i == list.size() - 1) {
                clases.put(new BigDecimal(clase), new Long(frecuencia));
            }
        }

        for (Map.Entry<BigDecimal, Long> entry : clases.entrySet()) {
            BigDecimal key = entry.getKey();
            Long value = entry.getValue();
            System.out.println(String.format("%f %d", key.doubleValue(), value));
        }

        List<Long> frecuenciaLista = new ArrayList<>(clases.values());
        long[] observed = new long[frecuenciaLista.size()];
        double[] expected = new double[frecuenciaLista.size()];
        for (int i = 0; i < frecuenciaLista.size(); i++) {
            observed[i] = frecuenciaLista.get(i);
            expected[i] = E;
        }

        //TestUtils.
        System.out.println(String.format("N:%d. Raiz(n):%f E:%f Intervalo clase:%f", n, m, E, intervaloClase));
        System.out.println(TestUtils.chiSquare(expected, observed));
        System.out.println(TestUtils.chiSquareTest(expected, observed));
        System.out.println(String.format("Rechazar prueba: %s", TestUtils.chiSquareTest(expected, observed, confianza)));
    }
}
