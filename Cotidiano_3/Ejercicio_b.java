package Estruct_Seleccion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KZR
 */

import java.util.Scanner; 

public class Ejercicio_b {
    public static void main(String[] args) {
        //Crear una instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de Variable
        int num;
        
        System.out.println("***************************************************");
        System.out.println("Ingrese un numero para saber, si es Par o Impar"); //Preguntado por el dato
        num = sc.nextInt(); //Se obtiene el dato de la variable num
        System.out.println("****************************************************");
        
        //Un if else para saber si es par o impar
        if ((num % 2) == 0)  {
            System.out.println("El numero " + num + " es Par");
        }else {
            System.out.println("El numero " + num + " es Impar");
            }
        
        num*=2;
        System.out.println("El doble del numero ingreso es "+num);
        System.out.println("****************************************************");
    }
}
