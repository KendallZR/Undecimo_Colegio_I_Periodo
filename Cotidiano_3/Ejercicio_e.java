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

public class Ejercicio_e {
    public static void main(String[] args) {
        //Crear una instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de Variable
        int est;
        
        System.out.println("******************************************");
        System.out.println("---------Cuantos estudiante son: ---------"); //Preguntado por el dato
        est = sc.nextInt(); //Obteniendo el dato de est
        System.out.println("--GRACIAS--");
        
        /*Un if - else if para saber a segun de la cantidad de estudiantes, cuanto se va a cobrar por estudiante
        y el total de viaje*/
        if (est>120){
            System.out.println("--El costo por el estudiante es de 2500--"); //Dando la respuesta al coste unitario
            est *= 2500;
            System.out.println("-El coste total de la gira es de: "+est);
            System.out.println("******************************************"); //Dando la respuesta al coste total
        }else if (est>60 && est<120){
            System.out.println("--El costo por el estudiante es de 2800--"); //Dando la respuesta al coste unitario
            est *= 2800;
            System.out.println("-El coste total de la gira es de: "+est);
            System.out.println("******************************************"); //Dando la respuesta al coste total
        }else if (est>30 && est<=59){
            System.out.println("--El costo por el estudiante es de 2500--"); //Dando la respuesta al coste unitario
            est *= 2500*0.20;
            System.out.println("-El coste total de la gira es de: "+est);
            System.out.println("******************************************"); //Dando la respuesta al coste total
        }else if(est<30){
            System.out.println("-El costo total de la gira es de: 550000 "); //Dando la respuesta al coste total
            System.out.println("******************************************");
        }
            
    }
}
