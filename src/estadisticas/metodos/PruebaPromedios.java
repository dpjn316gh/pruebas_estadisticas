/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas.metodos;

import java.math.BigDecimal;
import java.util.List;
import org.apache.commons.math3.distribution.NormalDistribution;

/**
 *
 * @author veronica
 */
public class PruebaPromedios {

    public static String probar(List<BigDecimal> list, double confianza) {

        StringBuilder sb = new StringBuilder();
        
        double suma = 0;
        double[] valores = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            BigDecimal get = list.get(i);
            valores[i] = get.doubleValue();
            suma += valores[i];
        }
        int n = list.size();

        double promedio = suma / n;
                            
        
        //double valorZ = confianza / 2;

        NormalDistribution nd = new NormalDistribution();
        
        double valorZ = (nd.inverseCumulativeProbability(1 - confianza / 2));

        double limiteIzq = ((1 / 2) - valorZ) * (1 / (Math.sqrt(12 * n)));
        double limiteDer = ((1 / 2) + valorZ) * (1 / (Math.sqrt(12 * n)));
        
        sb.append(String.format("Promedio %f\n", promedio));
        sb.append(String.format("limiteIzquierdo: %f\n", limiteIzq));
        sb.append(String.format("limiteDerecho: %f\n", limiteDer));
        

        if (limiteIzq > limiteDer) {
            double t = limiteIzq;
            limiteIzq = limiteDer;
            limiteDer = t;
        }
        if (promedio > limiteIzq && promedio < limiteDer) {
            sb.append(String.format("Rechazar prueba: No\n"));
        } else {
            sb.append(String.format("Rechazar prueba: Sí\n"));
        }
        return sb.toString();
    }

}
