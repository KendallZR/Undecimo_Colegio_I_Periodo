/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_While;

/**
 *
 * @author CTPG
 */

import java.util.Scanner;  //biblioteca del Scanner

public class Ejercicio_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   //Declarando el Scanner
      
        //declaracion de variables
        int n; 
        int sum=0;
        int total=0;
        double promedio;
        
        //solicitud de datos
        System.out.println("Escriba un numero");
        n = sc.nextInt();  //obtencion de datos
        sum=+n; 
        total++;
        
        //bucle para saber todos los numeros escritos, hasta que escriba 0 y se termine el proceso
        while (n!=0){
            System.out.println("Escriba numeros");
            n = sc.nextInt();
            sum+=n;
            total++;
        } 
        
        //resultados
        System.out.println("Ls suma de todos los numeros es: "+sum);
        System.out.println("El total es: "+total);
        promedio=sum/total;
        System.out.println("El promedio de los numeros es: "+promedio);
    }
}
