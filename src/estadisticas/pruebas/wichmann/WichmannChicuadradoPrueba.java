/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas.pruebas.wichmann;

import estadisticas.metodos.ChiCuadrado;
import generadores.WichmannyHill;
import generadores.LEcuyer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author veronica
 */
public class WichmannChicuadradoPrueba {
    
    public static void main(String args[]) throws Exception {

        System.out.print("Iniciar");
        List<BigDecimal> list = new ArrayList<>();
        
        WichmannyHill m = new WichmannyHill();
        m.inicial(2245, 4456, 3325, 10);
        m.generar();
        
        for (int i = 0; i < m.numerosAleatorio.size(); i++) {
            double numero = m.numerosAleatorio.get(i);
            list.add(new BigDecimal(numero));
            
             }
        
        ChiCuadrado.probar(list, 1, 0.05);
    
}
}