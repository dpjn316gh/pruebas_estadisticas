/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.estadisticas.probador;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.RealDistribution;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math3.stat.inference.TestUtils;

/**
 *
 * @author veronica
 */
public class KolmogorovSmirnov {
    
    public static void main(String args[]) throws Exception {
        probar(new ArrayList<BigDecimal>(),0,0);
    }
    
    public static void probar(List<BigDecimal> list, int limiteSuperior, double confianza) {
        
        list = new ArrayList<BigDecimal>();

        list.add(new BigDecimal("0.005128974"));
        list.add(new BigDecimal("0.009734491"));
        list.add(new BigDecimal("0.01625157"));
        list.add(new BigDecimal("0.022527729"));
        list.add(new BigDecimal("0.02514941"));
        list.add(new BigDecimal("0.095105525"));
        list.add(new BigDecimal("0.098109063"));
        list.add(new BigDecimal("0.120044449"));
        list.add(new BigDecimal("0.17100019"));
        list.add(new BigDecimal("0.201629844"));
        list.add(new BigDecimal("0.210614157"));
        list.add(new BigDecimal("0.255477656"));
        list.add(new BigDecimal("0.257349716"));
        list.add(new BigDecimal("0.265218657"));
        list.add(new BigDecimal("0.279847937"));
        list.add(new BigDecimal("0.284940225"));
        list.add(new BigDecimal("0.318791313"));
        list.add(new BigDecimal("0.321438471"));
        list.add(new BigDecimal("0.325524489"));
        list.add(new BigDecimal("0.325793853"));
        list.add(new BigDecimal("0.329143327"));
        list.add(new BigDecimal("0.331101225"));
        list.add(new BigDecimal("0.331320018"));
        list.add(new BigDecimal("0.369580299"));
        list.add(new BigDecimal("0.396040077"));
        list.add(new BigDecimal("0.404671476"));
        list.add(new BigDecimal("0.434223725"));
        list.add(new BigDecimal("0.451659075"));
        list.add(new BigDecimal("0.5112324"));
        list.add(new BigDecimal("0.51651664"));
        list.add(new BigDecimal("0.519682163"));
        list.add(new BigDecimal("0.53122996"));
        list.add(new BigDecimal("0.610044077"));
        list.add(new BigDecimal("0.629047138"));
        list.add(new BigDecimal("0.640532962"));
        list.add(new BigDecimal("0.641974386"));
        list.add(new BigDecimal("0.746693809"));
        list.add(new BigDecimal("0.762053986"));
        list.add(new BigDecimal("0.781951018"));
        list.add(new BigDecimal("0.791039096"));
        list.add(new BigDecimal("0.840966883"));
        list.add(new BigDecimal("0.864972406"));
        list.add(new BigDecimal("0.889674314"));
        list.add(new BigDecimal("0.949404375"));
        list.add(new BigDecimal("0.955307415"));
        list.add(new BigDecimal("0.963113811"));
        list.add(new BigDecimal("0.970790973"));
        list.add(new BigDecimal("0.980859608"));
        list.add(new BigDecimal("0.981342116"));
        list.add(new BigDecimal("0.988179596"));
        
        double[] observed = new double[list.size()];
        double[] y = new double[list.size()];
        double contador = 0.02;
        for (int i = 0; i < list.size(); i++) {
            observed[i] = list.get(i).doubleValue();
            y[i] += contador;
        }

        /*double[] o = {6.0,2.3,4.8,5.6,4.5,3.3,1.9,4.8,4.5};
        double[] t = {};
        
        NormalDistribution nd = new NormalDistribution();
        
        TestUtils.
        
        for (int i = 0; i< 10; i++){
            System.out.println(nd.sample(10)[i]);
        }*/
        
        Mean m = new Mean();
        double meanValue = m.evaluate(observed);
        System.out.println(meanValue);
        
        StandardDeviation sd = new StandardDeviation();
        double sdValue = sd.evaluate(observed);
        System.out.println(sdValue);
        
        NormalDistribution nd = new NormalDistribution(0d, 1d);
        
        System.out.println(TestUtils.kolmogorovSmirnovTest(observed, y));
        System.out.println(TestUtils.kolmogorovSmirnovTest(nd, observed, false));
        
        System.out.println(TestUtils.kolmogorovSmirnovTest(nd, observed, 0.05));
        System.out.println(TestUtils.kolmogorovSmirnovStatistic(nd, observed));
    }
}
