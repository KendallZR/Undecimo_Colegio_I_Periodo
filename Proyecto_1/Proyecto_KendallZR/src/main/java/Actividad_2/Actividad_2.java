/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_2;

/**
 *
 * @author KendallZR
 */

import java.util.Scanner;

public class Actividad_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j=0;
        
        System.out.println("Digite el tamaño del arreglo");
        j = sc.nextInt();
        
        int array [] = new int [j];
        
        mult(array);
        sum(array);
        
        for(int i=0; i<array.length; i++){
            System.out.println("\nDigite un numero para el arreglo");
            array [i] = sc.nextInt();
        }
        
        System.out.println("\nEl Arreglo normal");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);      //Impresion para el Arreglo ordenado 
        }
            System.out.println("\nLa sumatoria de arreglo es de: " + sum(array));
            System.out.println("\nLa multiplicación del arreglo es de: "+mult(array));
    }
    
    //Función para saber la sumatoria del arreglo
    public static int sum(int [] array){
        int sum=0;
       for(int i=0; i<array.length; i++){     //for para saber la sumatoria del arreglo
           sum += array[i];
       }
       return sum;      //retornar la variable que contiene la sumatoria 
    }
    
    //Función para saber la multiplicación del arreglo
    public static int mult(int [] array){
        int multi=1;
       for(int i=0; i<array.length; i++){     //for para saber la multiplicación del arreglo
           multi *= array[i];
       }
       return multi;      //retornar la variable que contiene la multiplicación
    }
}
