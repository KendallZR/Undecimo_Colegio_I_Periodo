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

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del Arreglo");
        int length = sc.nextInt();
        
        float pares [] = new float[length];
        
        
        System.out.println(numPares(length));
        System.out.println("\n¿Que dimensión tiene su arreglo? \nEl Arreglo es Unidimensional." );
        System.out.println("\n¿Cual es el Indice maximo? \nEl Indice maximo es asegun del usuario.");
        System.out.println("\n¿Que tipo de datos almacena el arreglo? \nAlmacena datos tipo Float");
        System.out.println("\n¿Que tipo de arreglo se utilizo? \nSe utilizo un Arreglo tipo Unidimensional");
}
    public static float numPares(float lenght){
        Scanner sc = new Scanner(System.in);
            int num=0;
            
            for (int i=0; i<lenght; i++){
                System.out.println("Ingrese los numeros pares");
                num=sc.nextInt();
                
                if ((num % 2) == 0){    
                    System.out.println("["+num+"] es par.");
                }else{
                    System.out.println("["+num+"] es impar.");
                }
            }
            
        return num;
            
    }
}
