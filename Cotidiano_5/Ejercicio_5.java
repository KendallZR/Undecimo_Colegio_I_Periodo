/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosFuncMetodProd;

/**
 *
 * @author KendallZR
 */

import java.util.Scanner;  //Biblioteca Scanner

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Declarando el Scanner
        Ejercicio_5 uSP = new Ejercicio_5();  //Estanciamiento
        //Declaración de Variables
        String nom = null;
        double num1, num2, num3, sum=0, sumato=0;
        //Llamado del procedimiento, para obtener el usuario
        uSP.usuario(nom); 
        //Obtencion de los numeros a usar
        System.out.println("\nDigite tres numeros, para determinar el promedio y la sumatoria al cuadrado");
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        num3=sc.nextDouble();
        //Llamado del procedimiento que da la Bienvenida
        uSP.usuario2(nom);
        //Imprimir todos los resultados de las Funciones 
        System.out.println("La suma de los numeros es de: "+suma(num1, num2, num3, sum));
        System.out.println("\nLa sumatoria de los numeros al cuadrado es de: "+sumatoria(num1, num2, num3, sumato));
        System.out.println("\nY el promedio de los numeros digitados es de: "+promedio(num1, num2, num3, sum));
    }
    //Procedimiento para saber el Usuario
    void usuario(String nomb){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite su nombre de usuario");
        nomb=sc.next();
    }
    //Procedimiento para dar la bienvenida al usuario
    void usuario2(String nombr){
        System.out.println("\n\nBienvenido de nuevo Sr/Sra"+nombr);
    }
    //Función para saber la suma de los numeros
    public static double suma(double numer1, double numer2, 
            double numer3, double suma){
        suma=numer1+numer2+numer3;
        return suma;
    }
    //Función para saber la sumatoria al cuadrado
    public static double sumatoria(double nume1, double nume2,
            double nume3, double sumatoria){
        sumatoria=Math.pow(suma(nume1, nume2, nume3, sumatoria),4);
        return sumatoria;
    }
    //Función para saber el promedio de los numeros
    public static double promedio(double numero1, double numero2,
            double numero3, double sumatr){
        double prom=sumatoria(numero1, numero2, numero3, sumatr)/3;
        return prom;
    }
}
