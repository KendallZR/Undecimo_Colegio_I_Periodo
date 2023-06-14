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
import java.util.Arrays;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num [] = new int[40];
        int sum = 0;
        
        for(int i=0; i<num.length; i++){
            num[i] = (int) (Math.random()* 40);
            
            sum += num [i];
        }
        
        int promedio = 0;
       
        promedio = sum/40;
        
        
        
       
        System.out.println("\nLa suma de ellos es: "+sum);
        
        System.out.println("\nEl promedio total de los numeros es de: "+promedio);
        
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
        
        Arrays.sort(num); //ordenar de forma ascendente
        System.out.println("\nArreglo de forma ascendente: " + Arrays.toString(num));
        
        for(int i=40; i<num.length; i--){
            System.out.println("\nArreglo de forma descendente"+num[i]);
        }
        
        System.out.println("\n¿Que dimensión tiene su arreglo? \nEl Arreglo es Unidimensional." );
        System.out.println("\n¿Cual es el Indice maximo? \nEl Indice maximo es de 40.");
        System.out.println("\n¿Que tipo de datos almacena el arreglo? \nAlmacena datos tipo Int");
        System.out.println("\n¿Que tipo de arreglo se utilizo? \nSe utilizo un Arreglo tipo Unidimensional");
    }
}
