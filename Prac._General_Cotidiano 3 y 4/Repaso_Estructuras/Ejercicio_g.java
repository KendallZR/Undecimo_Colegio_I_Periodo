/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso_Estructuras;

/**
 *
 * @author KZR
 */

import java.util.Scanner; //biblioteca del Scanner

public class Ejercicio_g {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  //Declarando Scanner
    //Decaracion de Variables
    int num1, num2, num34, total=0, total2=0;   
    
        //bucle do while para saber donde comienzo y finaliza el intervalo
        do{
            System.out.println("Ingrese el comienzo del intervalo");
            num1=sc.nextInt();
            System.out.println("Ingrese el final del intervalo");
            num2=sc.nextInt();
        }while(num1>num2);
        /*bucle do while para saber los numeros adentro del intervalo y sumarlos, 
        y los de afuera del bucle saber la cantidad*/
        do{
            System.out.println("Ingrese numeros, (finaliza con 0)");
            num34=sc.nextInt();
            if(num34>num1 && num34<num2){
            total+=num34;   
            }else{
          total2++;  
            }       
        }while (num34!=0);
        //Resultados
        System.out.println("La suma de los numeros adentro del intervalo es: "+total); 
        System.out.println("Los numeros afuera del intervalo son: "+total2);
    }
}
