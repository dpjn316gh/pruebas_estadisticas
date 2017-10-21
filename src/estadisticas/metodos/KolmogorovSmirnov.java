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
        
    public static void probar(List<BigDecimal> list, int limiteSuperior, double confianza) {
        
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
               
        System.out.println(String.format("Max %f", max));
        System.out.println(String.format("K valor %f", valTable));
        System.out.println(String.format("Rechazar prueba: %s", max >= valTable));                       
    }
}

