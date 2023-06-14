/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cotidiano_10;

/**
 *
 * @author KendallZR
 */

import java.util.Scanner;

public class Ejercicio_5 {
    //atributos del registro
    String nombre, genero;
    char inicialNom;
    int edad;
    double estatura, peso;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio_5 persona[] = new Ejercicio_5[20];
        
        //recoleccion de datos
        for(int i=0; i<20; i++){
        persona[i]=new Ejercicio_5();
        System.out.println("Digite su nombre");
        persona[i].nombre=sc.nextLine();
        
        System.out.println("Ingrese su edad");
        persona[i].edad=sc.nextInt();
        
        System.out.println("Ingrese su Genero (m = Masculino | f = Femenino");
        persona[i].genero=sc.next();
        
        System.out.println("Ingrese su Estatura");
        persona[i].estatura=sc.nextDouble();
        
        System.out.println("Ingrese su peso");
        persona[i].peso=sc.nextDouble();
        }
        
        
        //Imprime el registro con cada dato
        
        for(int i=0; i<20; i++){
        System.out.println("\n\nDATOS PERSONALES");
        System.out.println("Nombre es "+persona[i].nombre);
        persona[i].inicialNom=persona[i].nombre.charAt(0);
        System.out.println("Inicial del nombre es:"+persona[i].inicialNom);
        System.out.println("Edad "+persona[i].edad);
        System.out.println("Genero "+persona[i].genero);
        System.out.println("Estatura "+persona[i].estatura);
        System.out.println("Peso "+persona[i].peso);
        }
    }
}
