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

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num [][] = new int [3][3];
        
        for(int i=0; i<3; i++){
            for(int f=0; f<3; f++){
                System.out.println("Digite el dato que deasea ingresar al Arreglo");
                num[i][f] = sc.nextInt();
            }
        }
            
          for(int i=0; i<3; i++){
            System.out.println(" ");
            for(int f=0; f<3; f++){
                System.out.print(" "+num[i][f]);
            }
        }
    }
}
