package Estruct_Seleccion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CTPG
 */

import java.util.Scanner; //La biblioteca para usar el Scanner

public class Ejercicio_1 {
    public static void main(String[] args) {
        //Crear una instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);
        
        //Declaración de Variables int
        int num1;
        int num2;
        int sum;
        
        System.out.println("*********************************");
        System.out.println("Digite dos numeros acontinuación: "); //Pregunta por lo datos requeridos
        num1=sc.nextInt(); //Obtiene el dato de la variable num1
        num2=sc.nextInt(); //Obtiene el dato de la variable num1
        
        //Un if y else para ver cual es mayor
        if (num1>num2){
            sum = num1+num2;
            System.out.println("El primer numero es mayor y su suma es "+sum);
        } else if (num1 == num2){
            sum = num1+num2;
            System.out.println("Los numeros son iguales y su suma es "+sum);
        }else {
            sum = num1+num2;
            System.out.println("El segundo numero es mayor y suma es "+sum);
        }
    }
}
