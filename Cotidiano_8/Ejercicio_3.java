/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flujos;

/**
 *
 * @author KendallZR
 */

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam;
         int inc = 0;
        
        System.out.println("Ingrese el tamaño del Arreglo");
        tam = sc.nextInt();
        
        int num [][] = new int [5][tam];
        
        for(int i=0; i<5; i++){
            for(int f=0; f<tam; f++){
                inc ++;
                num[i][f] = inc;
                num[i][f] = (int) (Math.random()* 10);
                
            }
        }
       
        for(int i=0; i<5; i++){
            System.out.println(" ");
            for(int j=0; j<tam; j++){
                System.out.print(" "+num[i][j]);
            }
        }
    
}
    }