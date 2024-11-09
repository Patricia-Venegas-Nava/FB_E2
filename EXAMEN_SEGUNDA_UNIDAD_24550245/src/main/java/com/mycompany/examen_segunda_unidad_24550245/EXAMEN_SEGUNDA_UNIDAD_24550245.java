/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_segunda_unidad_24550245;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class EXAMEN_SEGUNDA_UNIDAD_24550245 {

    public static void main(String[] args) {
        
        //JUEGO PIEDRA PAPEL O TIJERA
        Scanner cap = new Scanner(System.in);
        double movimiento;
        int partidas, empate = 0;
        System.out.println("SELECCIONE CUANTAS PARTIDAS QUIERE JUGAR");
        partidas = cap.nextInt();
        for(int i = 0; i < partidas; i++){
        System.out.println("SELECCIONE SU MOVIMIENTO, SI QUIERE PIEDRA OPRIMA 3, SI QUIERE TIJERAS OPRIMA 2, SI QUIERE PAPEL OPRIMA 1");
        movimiento = cap.nextInt();
        if(movimiento == 3){
        System.out.println("PIEDRA");
     }else if(movimiento == 2){
         System.out.println("TIJERAS");
        }else if( movimiento == 1){
            System.out.println("PAPEL");
        }else{
            System.out.println("NO VALIDO");
        }
        double valor = (Math.random()*3) + 1;
         if(valor == 3){
        System.out.println("PIEDRA");
     }else if(valor == 2){
         System.out.println("TIJERAS");
        }else if( valor == 1){
            System.out.println("PAPEL");
        }else{
            System.out.println("NO VALIDO");
        }
        
         if (movimiento == valor) {
                System.out.println("Es un empate!");
                empate++;
            } else if ((movimiento == 1 && valor == 3) || 
                       (movimiento == 2 && valor == 1) || 
                       (valor == 3 && valor == 2)) {
                
                System.out.println("Usted gano!!!");
        
        
        }
        
       
       
        
        
        
        
        
        
        
        
    }
}
