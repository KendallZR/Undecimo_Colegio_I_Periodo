/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso_Estructuras;

/**
 *
 * @author KZR
 */

import java.util.Scanner;  //biblioteca del Scanner

public class Ejercicio_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Declarando Scanner
        
        //Declaracion de variables
        int num1, num2;
        int sum;
        
        //Solicitud de dos datos
        System.out.println("__*****NUMEROS AMIGOS*****__");
        System.out.println("Digite dos numeros, para ver si son amigos: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        //suma de los datos obtenidos
        sum=num1+num2;
        
        //bucle para saber si los nuemros son amigos
        if(num1 > 0 && num2 > 0 && ((sum/3)==0)){
            System.out.println("Los numeros "+num1+" y "+num2+" si son amigos");
        }else{
            System.out.println("Los numeros "+num1+" y "+num2+" no son amigos");
    }
    }
}