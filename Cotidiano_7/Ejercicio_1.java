/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flujos;

/**
 *
 * @author KendallZR
 */


public class Ejercicio_1 {
    public static void main(String[] args) {
        String productos [] = new String[9];
        
        //Dandole valor 
        productos [0]="Manzana";
        productos [1]="Mango";
        productos [2]="Pera";
        productos [3]="Durazno";
        productos [4]="Fresa";
        productos [5]="Sandia";
        productos [6]="Papaya";
        productos [7]="Yuplon";
        productos [8]="Naranja";
        
        //Impresion de datos
        for(int i=0; i<productos.length; i++){
            System.out.println(productos[i]);
            
        }
            System.out.println("\n¿Que dimensión tiene su arreglo? \nEl Arreglo es Unidimensional." );
            System.out.println("\n¿Cual es el Indice maximo? \nEl Indice maximo es de 8.");
            System.out.println("\n¿Que tipo de datos almacena el arreglo? \nAlmacena datos tipo String");
            System.out.println("\n¿Que tipo de arreglo se utilizo? \nSe utilizo un Arreglo tipo Unidimensional");
            
        
    }
    
}
