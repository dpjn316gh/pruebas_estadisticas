/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas.metodos;

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

    public static String probar(List<BigDecimal> list, int limiteSuperior, double confianza) {

        StringBuilder resultado = new StringBuilder();

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
            resultado.append(String.format("%f %d\n", key.doubleValue(), value));
        }

        List<Long> frecuenciaLista = new ArrayList<>(clases.values());
        long[] observed = new long[frecuenciaLista.size()];
        double[] expected = new double[frecuenciaLista.size()];
        for (int i = 0; i < frecuenciaLista.size(); i++) {
            observed[i] = frecuenciaLista.get(i);
            expected[i] = E;
        }

        resultado.append(String.format("N:%d. Raiz(n):%f E:%f Intervalo clase:%f\n", n, m, E, intervaloClase));
        resultado.append(String.format("%f\n", TestUtils.chiSquare(expected, observed)));
        resultado.append(String.format("%f\n", TestUtils.chiSquareTest(expected, observed)));
        resultado.append(String.format("Rechazar prueba: %s\n", TestUtils.chiSquareTest(expected, observed, confianza)));
        return resultado.toString();
    }
}
