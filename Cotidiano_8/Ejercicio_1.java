/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flujos;

/**
 *
 * @author KendallZR
 */



public class Ejercicio_1 {
    public static void main(String[] args) {
        char letras [][] = new char [5][5];
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXY";
        
        int p = 0;
        
        for(int i=0; i<5; i++){
            for(int f=0; f<5; f++){
                letras[i][f] = a.charAt(p);
                p++;
            }
        }
        
        
        for(int i=0; i<letras.length; i++){
            System.out.println(" ");
            for(int f=0; f<letras.length; f++){
                System.out.print(letras[i][f] + "    ");
            }
        }
        
        
    }
    
}
