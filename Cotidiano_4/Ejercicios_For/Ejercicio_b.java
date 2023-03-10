/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_For;

/**
 *
 * @author KZR
 */

import java.util.Scanner;  //biblioteca del Scanner

public class Ejercicio_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   //Declarando el Scanner
        
        //declaracion de variables
        int num, limt, i, suma = 0, prom;
        
        //limite de numeros solicitados
        System.out.println("Limite: ");
        limt = sc.nextInt();
        
        //solicitud de datos
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();
        
        suma+=num;  //suma de los numeros
        
        //bucle para saber si el numero anterior es menor y el promedio de los numeros
        for(i=2; i <= limt; i++){ //inicializacion y final del bucle
            System.out.println("Ingrese un numero: "); //Solicitud de datos
            int num1 = sc.nextInt(); //declaracion y obtencion de datos
            suma += num1;            //suma de datos
            //if para saber si es menor al primer numero
            if(num1 < num){
                System.out.println(num1 + " es menor que "+num+" que es el primer numero ingresado. ");
            }
            //if para dar el promedio de los datos
            if(i >= limt){
                prom = suma/limt;
                System.out.println("Promedio de los numeros: "+prom);
            }
        }
    }
}
