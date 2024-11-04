/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica__1;

/**
 *
 * @author 
 */
public class PRACTICA__1 {

    public static void main(String[] args) {
         String cad;
        int num;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Ingrese un texto:");
        cad = cap.nextLine();
        
        System.out.println("Ingrese el numero de repeticiones:");
        num = cap.nextInt();
        
        for (int i=0; i < num; i++) {
            System.out.println(cad);
        }
            
    }
}
    

