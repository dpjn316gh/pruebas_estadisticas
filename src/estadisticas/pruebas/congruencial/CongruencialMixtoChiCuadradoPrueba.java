/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas.pruebas.congruencial;

import estadisticas.metodos.ChiCuadrado;
import generadores.CongruencialMixto;
import generadores.LEcuyer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author veronica
 */
public class CongruencialMixtoChiCuadradoPrueba {
    
    
      public static void main(String args[]) throws Exception {
          
          System.out.print("Iniciar");
          
          List<BigDecimal> list = new ArrayList<>();
          
          
          CongruencialMixto m = new CongruencialMixto();
          m.mostrar(4,10,5,7,8);
          m.generar();
          
          
          for (int i = 0; i < m.numeroAleatorio.size(); i++) {
               double numero = m.numeroAleatorio.get(i);
               list.add(new BigDecimal(numero));
          }
           ChiCuadrado.probar(list, 0.05);
      }
}
