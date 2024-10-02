/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_PROMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calif, acum;
        acum = 0;
        Scanner cap = new Scanner(System.in);
        
        for(int i = 1;  i <= 10; i++){
            System.out.println("Estudiante #" +1);
            System.out.println("Introduce la calificacion");
            calif = cap.nextInt();
            cap.nextInt();
            acum = acum + calif;
            
            
        }
        System.out.println("Promedio = " + (acum / 10.0));
    }
    
}