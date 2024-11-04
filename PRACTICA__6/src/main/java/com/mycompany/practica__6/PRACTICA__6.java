/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica__6;

import java.util.Scanner;

/**
 *
 * @author
 */
public class PRACTICA__6 {

    public static void main(String[] args) {
          int num;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Ingrese un número:");
        num = cap.nextInt();
        
        
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"); 
            }
            System.out.println();         }

        
        for (int i = num; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
    }
}
    

