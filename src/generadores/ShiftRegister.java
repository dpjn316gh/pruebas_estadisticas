/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadores;

/**
 *
 * @author jorge
 */
public class ShiftRegister {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int start_state = 0xACE1;
        /* Any nonzero start state will work. */
        int lfsr = start_state;
        int bit;
        /* Must be 16bit to allow bit<<15 later in the code */
        int period = 0;

        do {
            /* taps: 16 14 13 11; feedback polynomial: x^16 + x^14 + x^13 + x^11 + 1 */

//            System.out.println(String.format("lfsr >> 0 = %s %d", Integer.toBinaryString(lfsr).replace(' ', '0'), lfsr >> 0));
//            System.out.println(String.format("lfsr >> 2 = %s %d", Integer.toBinaryString(lfsr >> 2).replace(' ', '0'), lfsr >> 2));            
//            System.out.println(String.format("lfsr >> 3 = %s %d", Integer.toBinaryString(lfsr >> 3).replace(' ', '0'), lfsr >> 3));             
//            System.out.println(String.format("lfsr >> 4 = %s %d", Integer.toBinaryString(lfsr >> 4).replace(' ', '0'), lfsr >> 4)); 
//            System.out.println(String.format("lfsr >> 5 = %s %d", Integer.toBinaryString(lfsr >> 5).replace(' ', '0'), lfsr >> 5)); 
//            System.out.println(String.format("(lfsr >> 0) ^ (lfsr >> 2) = %s %d", 
//                    Integer.toBinaryString((lfsr >> 0) ^ (lfsr >> 2)).replace(' ', '0'),
//                    (lfsr >> 0) ^ (lfsr >> 2)));
//            System.out.println(String.format("(lfsr >> 0) ^ (lfsr >> 2) ^ (lfsr >> 3) = %s %d", 
//                    Integer.toBinaryString((lfsr >> 0) ^ (lfsr >> 2) ^ (lfsr >> 3)).replace(' ', '0'),
//                    (lfsr >> 0) ^ (lfsr >> 2) ^ (lfsr >> 3)));
//            
//            System.out.println(String.format("((lfsr >> 0) ^ (lfsr >> 2) ^ (lfsr >> 3) ^ (lfsr >> 5)) = %s %d", 
//                    Integer.toBinaryString((lfsr >> 0) ^ (lfsr >> 2) ^ (lfsr >> 3)).replace(' ', '0'),
//                    ((lfsr >> 0) ^ (lfsr >> 2) ^ (lfsr >> 3) ^ (lfsr >> 5))));
//                        
            bit = (((lfsr >> 0) ^ (lfsr >> 2) ^ (lfsr >> 3) ^ (lfsr >> 5)) & 1);
//            System.out.println(String.format("(((lfsr >> 0) ^ (lfsr >> 2) ^ (lfsr >> 3) ^ (lfsr >> 5)) & 1) = %s %d", 
//                    Integer.toBinaryString(bit).replace(' ', '0'),
//                    bit));
//            
//            System.out.println(String.format("(lfsr >> 1) = %s %d", 
//                    Integer.toBinaryString(lfsr >> 1).replace(' ', '0'),                    
//                    (lfsr >> 1)));
//            
//            System.out.println(String.format("(bit << 15) = %s %d", 
//                    Integer.toBinaryString(bit << 15).replace(' ', '0'),      
//                    (bit << 15)));
//            
            lfsr = ((lfsr >> 1) | (bit << 15));
//            System.out.println(String.format("((lfsr >> 1) | (bit << 15)) = %s %d", 
//                    Integer.toBinaryString(lfsr).replace(' ', '0'),      
//                    lfsr));
//            
            ++period;
            System.out.println(String.format("%d)%d\t%d", period, bit, lfsr));
        } while (lfsr != start_state);
    }
}