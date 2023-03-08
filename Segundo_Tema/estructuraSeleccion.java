package Tema_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KZR
 */

import java.util.Scanner;
public class estructuraSeleccion {
    public static void main(String[] args) {
        //Crear una instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);
        
        int edad; //variable para almacenar edad
        String texto; //variable para almacenar texto
        
        System.out.println("¿Que edad tienes?");//muestra info en pantalla
        edad=sc.nextInt(); //se recoge la informacion del teclado 
        
        //Estructura if
        //Verificamos si la persona es mayor de edad
        if (edad>18) {
            System.out.println("La persona es mayor de edad ");
        }
        
        //Estructura if else
        //Verificar la condicion
        //Edad <18 es menos de edad, mayor o igual 18 adulto
        if (edad<18) { //si edad no es menor a 18
            System.out.println("La persona es menor de edad");
        }else { //en caso contrario
            System.out.println("La persona es mayor de edad");
        }
        
        //Estructura if else if (if anidado)
        //Verificar la condicion
        /*Edad <18 es menos de edad, mayor o igual 18 adulto
        mayor o igual de 65 adulto mayor*/
        if (edad>=65) { //si edad es mayor a 65
            System.out.println("Es adulto mayor");
        }else if (edad>=18){ //si edad es mayor a 18
            System.out.println("Es mayor de edad");
        }else if (edad<18 & edad>0){ //si edad es menor a 18 y edad es mayor a 0 
            System.out.println("Es menor de edad");
        }else { //de los contrario
            System.out.println("El dato ingreso no es valido");
        }
        
        //Estructura Switch
        //Menu (1.Cantones, 2.Spaguetti a la carbonara, 3.Sopa de Mariscos
        int op;
        System.out.println("\n**********MENU RESTAURANTE*******");
        System.out.println("Cual de las siguientes opciones desea: "
                + "\n1. Cantones."
                + "\n2. Spaguetti a la carbonara."
                + "\n3. Sopa de Mariscos."
                + "\n**********************************"
                + "\n Indique un numero.");
        op=sc.nextInt();
        switch (op){
            case 1:
                System.out.println("\nSu orden es arroz Cantones");
                break;
            case 2:
                System.out.println("\nSu orden es Spaguetti a la carbonara");
                break;
            case 3:
                System.out.println("\nSu orden es Sopa de Mariscos");
                break;
            default:
                System.out.println("\nLa opción indica no existe");
                break;
        }
        
    }
}
