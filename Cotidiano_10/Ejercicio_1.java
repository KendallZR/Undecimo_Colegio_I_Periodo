/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cotidiano_10;

/**
 *
 * @author KendallZR
 */
public class Ejercicio_1 {
    String tipo, marca, modelo;
    int cilindraje;
    double capacidad;
    
    public static void main(String[] args) {
       
        
        //llenar los campos del elemento 0 del arreglo
        //crear arreglo del registro
        Ejercicio_1 carros1 = new Ejercicio_1();
        carros1.tipo = "Sedan";
        carros1.marca = "BMW";
        carros1.modelo = "M5 CS";
        carros1.cilindraje = 635;
        carros1.capacidad = 5;
        
        Ejercicio_1 carros2 = new Ejercicio_1();
        carros2.tipo = "Muscle Car";
        carros2.marca = "Ford (Shelby)";
        carros2.modelo = " gt500";
        carros2.cilindraje =  730;
        carros2.capacidad = 4;
        
        Ejercicio_1 carros3 = new Ejercicio_1();
        carros3.tipo = "Sedan o Fusca";
        carros3.marca = "Volkswagen (Vocho)";
        carros3.modelo = "Tipo 1";
        carros3.cilindraje =  150;
        carros3.capacidad = 4;
        
        Ejercicio_1 carros4 = new Ejercicio_1();
        carros4.tipo = "Suv";
        carros4.marca = "Cadillac";
        carros4.modelo = "Escalade v8";
        carros4.cilindraje =   682;
        carros4.capacidad = 8;
        
        //Imprimir el Registro
        System.out.println("Datos de 4 Vehiculos:");
        System.out.println("\nTipo: "+carros1.tipo+"\nMarca: "+carros1.marca+"\nModelo: "+carros1.modelo+
                "\nCilindraje: "+carros1.cilindraje+"\nCapacidad: "+carros1.capacidad);
        System.out.println("\nTipo: "+carros2.tipo+"\nMarca: "+carros2.marca+"\nModelo: "+carros2.modelo+
                "\nCilindraje: "+carros2.cilindraje+"\nCapacidad: "+carros2.capacidad);
        System.out.println("\nTipo: "+carros3.tipo+"\nMarca: "+carros3.marca+"\nModelo: "+carros3.modelo+
                "\nCilindraje: "+carros3.cilindraje+"\nCapacidad: "+carros3.capacidad);
        System.out.println("\nTipo: "+carros4.tipo+"\nMarca: "+carros4.marca+"\nModelo: "+carros4.modelo+
                "\nCilindraje: "+carros4.cilindraje+"\nCapacidad: "+carros4.capacidad);
    }
}
