/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.estadisticas.probador;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.math3.stat.inference.TestUtils;

/**
 *
 * @author veronica
 */
public class PruebaPromedios {

    public static void main(String args[]) {

        List<BigDecimal> list = new ArrayList<BigDecimal>();

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

        Collections.sort(list);

        BigDecimal max = Collections.max(list);

        int n = list.size();

        BigDecimal suma = new BigDecimal(0);
        for (int i = 0; i < list.size(); i++) {

            suma.add(list.get(i));

        }
        BigDecimal promedio = suma.divide(new BigDecimal (n));
        double valorZ = 0.05/2;
        
        
        
    }
    
}
