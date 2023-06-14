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
        int num [] = new int[20];
        int sum = 0;
        
       for(int i=0; i<num.length; i++){
           num [i] = i+1;
           
           sum += num [i];
       }
       
       int promedio = 0;
       
       promedio = sum/20;
       
       for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
       
        System.out.println("La suma de ellos es: "+sum);
        System.out.println("El promedio total de los numeros es de: "+promedio);
        
        System.out.println("\n¿Que dimensión tiene su arreglo? \nEl Arreglo es Unidimensional." );
        System.out.println("\n¿Cual es el Indice maximo? \nEl Indice maximo es de 20.");
        System.out.println("\n¿Que tipo de datos almacena el arreglo? \nAlmacena datos tipo Int");
        System.out.println("\n¿Que tipo de arreglo se utilizo? \nSe utilizo un Arreglo tipo Unidimensional");
    }
}
