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

public class Ejercicio_3 {
    //atributos del registro
    String nombre, genero;
    char inicialNom;
    int edad;
    double estatura, peso;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio_3 persona = new Ejercicio_3();
        
        //recoleccion de datos
        System.out.println("Digite su nombre");
        persona.nombre=sc.nextLine();
        
        System.out.println("Ingrese su edad");
        persona.edad=sc.nextInt();
        
        System.out.println("Ingrese su Genero (m = Masculino | f = Femenino");
        persona.genero=sc.next();
        
        System.out.println("Ingrese su Estatura");
        persona.estatura=sc.nextDouble();
        
        System.out.println("Ingrese su peso");
        persona.peso=sc.nextDouble();
        
        
        
        //Imprime el registro con cada dato
        
        System.out.println("\n\nDATOS PERSONALES");
        System.out.println("Nombre es "+persona.nombre);
        persona.inicialNom=persona.nombre.charAt(0);
        System.out.println("Inicial del nombre es:"+persona.inicialNom);
        System.out.println("Edad "+persona.edad);
        System.out.println("Genero "+persona.genero);
        System.out.println("Estatura "+persona.estatura);
        System.out.println("Peso "+persona.peso);

    }
}
