/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor,factor = 0;
        Scanner cap = new Scanner(System.in);
        System.out.println("Introduce el valor: ");
        valor = cap.nextInt();
        cap.nextInt();
       int acum = 1;
         for(int i = valor; i >= 1; i--){
        factor = factor * i;
        }
        System.out.println("Factorial de " + valor + " = " + factor );
        
       
    }
    
}
