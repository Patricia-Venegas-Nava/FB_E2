/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_3_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base, expo;
        Scanner cap = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        base = cap.nextInt();
        cap.nextInt();
        System.out.println("Introduce el exponente: ");
        expo = cap.nextInt();
        cap.nextInt();
        int acum = 1;
        for(int i = 1; i <= expo; i++){
        acum = acum * base;
        }
        System.out.println("Potencia = " + acum);
        
        
        
        
    }
    
}
