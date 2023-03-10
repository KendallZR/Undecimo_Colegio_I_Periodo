/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Switch;

/**
 *
 * @author KZR
 */

import java.util.Scanner;  //biblioteca del Scanner

public class Ejercicio_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Declarando el Scanner
         //declaracion de variable
        int i;
        
        //solicitude de datos para el bucle switch
        System.out.println("********MESES********");
        System.out.println("Digite un numero correspondiente a un mes, para indicarle a que mes corresponde: ");
        i=sc.nextInt(); //obtencion de datos
        
        //Bucle para saber el numero y mes
        switch(i){
            case 1: 
                System.out.println("El mes "+i+" es Enero");
                break;
            case 2:
                System.out.println("El mes "+i+" es Febrero");
                break;
            case 3:
                System.out.println("El mes "+i+" es Marzo");
                break;
            case 4:
                System.out.println("El mes "+i+" es Abril");
                break;
            case 5:
                System.out.println("El mes "+i+" es Mayo");
                break;
            case 6:
                System.out.println("El mes "+i+" es Junio");
                break;
            case 7:
                System.out.println("El mes "+i+" es Julio");
                break;
            case 8:
                System.out.println("El mes "+i+" es Agosto");
                break;
            case 9:
                System.out.println("El mes "+i+" es Setiembre");
                break;
            case 10:
                System.out.println("El mes "+i+" es Octubre");
                break;
            case 11:
                System.out.println("El mes "+i+" es Noviembre");
                break;
            case 12:
                System.out.println("El mes "+i+" es Dciembre");
                break;
            default:
                System.out.println("!!ERROR!! El numero seleccionado es Incorrecto");
                break;
        }
    }
}
