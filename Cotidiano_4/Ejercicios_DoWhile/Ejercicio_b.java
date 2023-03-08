/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_DoWhile;

/**
 *
 * @author KZR
 */

import java.util.Scanner; //biblioteca del Scanner

public class Ejercicio_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Declarando el Scanner
      
        //Declaracion de variables
        int num1, num2;
        
        System.out.println("Digite dos numeros (cuando sean iguales se terminara el proceso)"); //Solicitud de datos
        num1 = sc.nextInt();  //datos obtenidos
        num2 = sc.nextInt();  //datos obtenidos
        
        //bucle para saber si son iguales y no seguir
        do {
            System.out.println("Digite dos numeros (cuando sean iguales se terminara el proceso)"); //solicitud de datos
            num1 = sc.nextInt();  //datos obtenidos
            num1 = sc.nextInt();  //datos obtenidos
        }while (num1==num2);  //si son iguales termina el bucle
    }
}
