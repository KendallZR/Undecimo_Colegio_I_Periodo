/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tema_3;

/**
 *
 * @author KendallZR
 */

import java.util.Scanner;

public class MetFunProd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetFunProd fP = new MetFunProd(); //instancia de clase
        
        //Llamado a una funcion
        System.out.println("La sumatoria es "+finSuma());
        
        //Llamado a 2da funcion
        System.out.println("La 2da sumatoria es "+finSumar(34,7.5));
        
        //Llamada a 2da funcion con información dada por el usuario
        System.out.println("Digite dos valores a sumar");
        int s = sc.nextInt();
        double x = sc.nextDouble();
        System.out.println("La 2da Sumatoria es "+finSumar(s, x));
        
        
        //Llamado a un metodo
        /*requiere de crear una instancia de la clase donde se encuentra
        el metodo*/
        System.out.println("El resultado de la multiplicacion es: "
                + "" + fP.mMultiplicar());
        
        System.out.println("Digite dos valores a multiplicar");
        int d2 = sc.nextInt();
        int t2 = sc.nextInt();
        System.out.println("El resultado de la multiplicacion es: "
                + "" + fP.mMultiplicarPa(d2, t2));
        
        System.out.println("El resultado de la multiplicacion es: "
                + "" + fP.mMultiplicarPa(6, 9));
        
        //Llamado a un procedimiento
        fP.mayorMenor();
    }
    
    //Funciones
    //Funcion Sumar sin parametros
    public static double finSuma(){
        int n=8;
        double valor=4;
        double suma=n+valor;
        return suma;
    }
    //Funcion sumas con parametros
    public static double finSumar(int num, double val){
        double suma=num+val;
        return suma;
    }
    
    //Metodos
    //Metodo mulitplicar
    double mMultiplicar(){
        int d=2;
        int t=6;
        int mult=d*t;
        return mult;
    }
    //Metodo multiplicar con parametros
    double mMultiplicarPa(int d1, int t1){
        int mult1=d1*t1;
        return mult1;
    }
    
    //Procedimientos
    //Procedimiento
    void mayorMenor(){
        int edad=18;
        if (edad>=18){
            System.out.println("Es mayor");
        }else{
            System.out.println("Es menor");
        }
            
    }
}
