/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_DoWhile;

/**
 *
 * @author KZR
 */
public class Ejercicio_a {
    public static void main(String[] args) {
    
    //Declaracion de Variables
    int num=1;
    int sum=0;
            
    //Bucle de Do While
    do {
    if(num % 2 == 1){  //Operacion para saber impares
        sum += num;    //operaciones combiandas, para la sumatoria
        num=num+2;     //la acutlaizacion
    }
    
    }while (num<=12);  //Que llegue el bucle hasta 12
            System.out.println("La sumatoria de los numeros impares es de: "+sum); //resultado
    }
}
