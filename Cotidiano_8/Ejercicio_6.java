/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flujos;

import java.util.Scanner;

/**
 *
 * @author KendallZR
 */



public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String golosinas [][] = new String [7][2];
        
        for(int i=0; i<7; i++ ){
            System.out.println("Ingrese el nombre de la golosina");
            golosinas[i][0] = sc.nextLine();
            System.out.println("Ingrese el precio de la golosina");
            golosinas[i][1]= sc.nextLine();
        }
        
        for(int i=0; i<7; i++){
            System.out.println("Los caramelos comprados son: ");
            System.out.println("\n"+golosinas[i][0]+" "+golosinas[i][1]);
        }
    }
}
