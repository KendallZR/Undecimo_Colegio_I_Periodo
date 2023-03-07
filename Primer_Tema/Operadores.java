package Tema_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author KZR
 */
public class Operadores {
    public static final double p=12.4;
    public static void main(String[] args) {
        
        int num = 0;
        int num1 = 2;
        double num2 = 4.9;
        double num3 = 6.6;
        float num4 = 8.5f;
        
        //operadores aritmetricos 
        //suma
        double sum = num2 + num1;
        //rest
        float rest = num4 - num;
        //multiplicacion
        int mult = num * num1;
        //division
        double div= num2 / num1;
        //determinar el resto de una division
        double restDiv = num2 % num1;
        //potecia
        int pot = num1 ^2;
        
        num1 = 5;
        num2 = 4;
        //operadores relacionales
        boolean comp1 = (num1 == num2);  //igualdad
        boolean comp2 = (num1 != num2);  //diferencia
        boolean comp3 = (num1 > num2);   //mayor que 
        boolean comp4 = (num1 > num2);   //menor que 
        boolean comp5 = (num1 >= num2);  //mayor o igual que
        boolean comp6 = (num1 <= num2);  //menor o igual que 
        
        //operador incremental 
        num1++;
        //operador decremental 
        num1--;
    }
}