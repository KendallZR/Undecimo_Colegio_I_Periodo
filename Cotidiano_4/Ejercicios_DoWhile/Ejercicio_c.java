/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_DoWhile;

/**
 *
 * @author KZR
 */

import java.util.Scanner;  //biblioteca del Scanner

public class Ejercicio_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Declarando el Scanner
        
        //Declaracion de varibles 
        int i=1; 
        int produc;
        
        //Bucle para saber el prodcuto de 5 numeros solicitados
        do{
            System.out.println(i+"-Escriba un numero "); //solicitud de datos
            int num=sc.nextInt();  //declaracion y obtencion de datos
            i++;                   //actualizacion de datos
            num*=num;              //multiplicar todo los numeros entre si
            produc=num;            //obtener el producto
        }while (i<=5);  //limite de bucle hasta 5
        System.out.println("El producto de los numeros es: "+produc); //resultado
    }
   
}
