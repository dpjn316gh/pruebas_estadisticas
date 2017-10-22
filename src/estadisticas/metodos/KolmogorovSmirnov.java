/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas.metodos;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import jsc.goodnessfit.KolmogorovCB;

/**
 *
 * @author veronica
 */
public class KolmogorovSmirnov {
        
    public static String probar(List<BigDecimal> list, double confianza) {
        
        StringBuilder resultado = new StringBuilder();
        
        Collections.sort(list);

        int n = list.size();

        double max = 0;
        for (int i = 0; i < list.size(); i++) {

            BigDecimal get = list.get(i);

            double i_n = (i + 1.0)  / n;
            double i_1_n = (i + 0.0) / n;
            double d1 = i_n - get.doubleValue();
            double d2 = get.doubleValue() - i_1_n;
            max = Math.max(Math.max(d1, d2), max);
        }
        
        double valTable = KolmogorovCB.approxCriticalValue(n, confianza);
               
        resultado.append(String.format("Max %f\n", max));
        resultado.append(String.format("K valor %f\n", valTable));
        resultado.append(String.format("Rechazar prueba: %s\n", max >= valTable));
        
        return resultado.toString();
    }
}

