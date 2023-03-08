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

public class Ejercicio_d {
    public static void main(String[] args) {
        //Crear una instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);
        
        int nota;
        
        System.out.println("--*******************************--");
        System.out.println("--------NOTA DE CALIFICACIÒN-------");
        System.out.println("--Ingrese su NOTA_________________");
        nota = sc.nextInt();
        
        if (nota>=85 && nota<=100){
            System.out.println("--**********************--");
            System.out.println("--La NOTA obtenida es una *A*--");
            System.out.println("---------FELICIDADES----------");
            System.out.println("*******************************");
        } else if (nota<=85 && nota>=69){
            System.out.println("--**********************--");
            System.out.println("--La NOTA obtenida es una *B*--");
            System.out.println("----------Muy bien-----------");
            System.out.println("*******************************");
        } else if (nota<69){
            System.out.println("--**********************--");
            System.out.println("--La NOTA obtenida es una *C*--");
            System.out.println("-------Siga Adelaante--------");
            System.out.println("*******************************");
        } else {
            System.out.println("La calificacion es incorrecta");
        }
    }
}
