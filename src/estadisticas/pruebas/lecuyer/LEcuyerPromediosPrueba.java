/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas.pruebas.lecuyer;

import estadisticas.metodos.PruebaPromedios;
import generadores.LEcuyer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author veronica
 */
public class LEcuyerPromediosPrueba {
    
    public static void main(String args[]) {

        List<BigDecimal> list = new ArrayList<>();

        LEcuyer m = new LEcuyer();
        m.inicial(2246,84457, 100);
        m.generar();
        
        
        for (int i = 0; i < m.numerosAleatorio.size(); i++) {
            double numero = m.numerosAleatorio.get(i);
            list.add(new BigDecimal(numero));
        }
        
        System.out.println(PruebaPromedios.probar(list, 0.05));
    }
    
}
