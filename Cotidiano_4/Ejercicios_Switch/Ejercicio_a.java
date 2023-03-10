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

public class Ejercicio_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Declarando el Scanner
        
        System.out.println("Escriba dos numeros"); //solicitud de datos
        int num1=sc.nextInt();  //declaracion obtencion de dato
        int num2=sc.nextInt();  //declaracion obtencion de dato
        
        //Solicitud de datos para el bucle switch
        System.out.println("Seleccione cual Operacion quiere hacer:"
                + "\n1.Suma"
                + "\n2.Resta"
                + "\n3.Multiplicación"
                + "\n4.División");
        int i=sc.nextInt(); //declaracion y obtencion de datos
        
        //bucle para saber cual operacion se va hacer
        switch(i){
            case 1:
                int sum=num1+num2;
                System.out.println("La resultado de la Suma es de: "+sum);
                break;
            case 2:
                int res=num1-num2;
                System.out.println("El resultado de la resta es de: "+res);
                break;
            case 3:
                int mult=num1*num2;
                System.out.println("El resultado de la multiplicacion es de "+mult);
                break;
            case 4:
                double div=num1/num2;
                System.out.println("El resultado de la division es de "+div);
                break;
            default:
                System.out.println("!!ERROR!! La opcion, seleccionada es incorrecta");
                break;
        }
    }
}
