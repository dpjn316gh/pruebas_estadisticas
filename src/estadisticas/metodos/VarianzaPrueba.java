/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas.metodos;

import java.math.BigDecimal;
import java.util.List;
import org.apache.commons.math3.stat.descriptive.moment.Variance;

/**
 *
 * @author jorge
 */
public class VarianzaPrueba {

    public static void probar(List<BigDecimal> list, double confianza) {

        double[] valores = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            BigDecimal get = list.get(i);
            valores[i] = get.doubleValue();
        }

        Variance v = new Variance();

        double varianza = v.evaluate(valores);

        int n = list.size();

        double chi2izq = Gamma.chi2inv(1 - (confianza / 2), n - 1);
        double chi2der = Gamma.chi2inv((confianza / 2), n - 1);

        double limIzq = chi2izq / (12 * (n - 1));
        double limDer = chi2der / (12 * (n - 1));

        System.out.println(String.format("Varianza %f", varianza));
        System.out.println(String.format("chi2izq=%f, chi2der=%f", chi2izq, chi2der));
        System.out.println(String.format("LimIzq=%f, LimDer=%f", limIzq, limDer));
        
        if (limIzq > limDer){
            double t = limIzq;
            limIzq = limDer;
            limDer = t;
        }

        if (varianza > limIzq && varianza < limDer) {
            System.out.println(String.format("Rechazar prueba: No"));
        } else {
            System.out.println(String.format("Rechazar prueba: Sí"));
        }
    }
}
