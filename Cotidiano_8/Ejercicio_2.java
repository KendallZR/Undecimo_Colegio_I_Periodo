/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flujos;

/**
 *
 * @author CTPG
 */



public class Ejercicio_2 {
    public static void main(String[] args) {
        int num [][] = new int [4][4];
        int inc = 0;
        
        for(int i=0; i<4; i++){
            for(int f=0; f<4; f++){
                inc ++;
                num[i][f] = inc;
            }
        }
        
        for(int i=0; i<num.length; i++){
            System.out.println(" ");
            for(int f=0; f<num.length; f++){
                System.out.print(num[i][f] + "   ");
            }
        }
    }
    
}
