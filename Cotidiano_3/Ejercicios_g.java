package Estruct_Seleccion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KZR
 */

import java.util.Scanner; //La biblioteca para usar el Scanner

public class Ejercicios_g {
    public static void main(String[] args) {
        //Crear una instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero"); //Preguntando por el dato
        int num1 = sc.nextInt(); //Declarando y obteniendo el dato de num1
        System.out.println("Ingrese el segundo numero"); //Preguntando por el dato
        int num2 = sc.nextInt(); //Declarando y obteniendo el dato de num2
        System.out.println("Ingrese el tercer numero"); //Preguntando por el dato
        int num3 = sc.nextInt(); //Declarando y obteniendo el dato de num3
        
        //if - else if para saber cual numero es mayor
        if(num1>num2 && num3<num1){ //si numero 1 es mayor a numero 2 y numero 3 es menor a numero 1
            System.out.println("El numero mayor es el primero: " + num1); 
        }else if(num2>num1 && num3<num2){ //si numero 2 es mayor a numero 1 y numero 3 es menor a numero 2
            System.out.println("El numero mayor es el segundo: " + num2);
        }else{ //Si no ers ninguna de las anteriores es mayor el numero 3
            System.out.println("El numero mayor es el tercero: " + num3);
        }
    }
}
