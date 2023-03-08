/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_General;

/**
 * 
 * @author KZR
 */

public class PRACT_R_1 { 
    public static final double PI=3.14159264;
    public static void main(String[] args) {
        //Ejercicio 1
        //Area de un Triangulo
        int baseOc = 057;
        int alturaOc = 064;
        double areaOc = (baseOc*alturaOc)/2;
        
        //Area de un Circulo
        int radioHex = 0xC;
        double areaHex = (PI*(radioHex ^ 2));
        
        //IMC de una Persona
        int peso = 86;
        int altura = 180;
        double imc = (peso / (altura * altura));
        
        //Impresión de si una persona es mayor de edad
        System.out.println("Si una persona tiene 19 años de edad, ya es mayor de edad, por que"
                + " segun la ley apartir de los 18, es mayor de edad en Costa Rica.");
        
        //Ejercicio 2
        //Operadores Aritmeticos
        int a = 8;
        int b = 3;
        int c = 5;
        
        //suma
        int sum = a + b + c;
        //division
        double div = a/b;
        double div2 = a/c;
        //multiplicacion y resta
        int mulRest = 2*b+3*(a-c);
        //resto division
        double rest1 = a % b;
        double rest2 = a % b;
        //multiplicacion y division
        double multDiv = a * (b / c);
        //resto division
        double restDiv = (a % (c / b));
        //multiplicacion y division
        double multDiv2 = a * (b / c);
        //todas las operaciones anteriores juntas
        double operaciones = (a - 4 * b)%(c + 2 * a)/(a - c);
        
        //Ejercicio 3
        //Declaracion de String
        String c1 = "54";
        String c2 = "20";
        String c3 = "36";
        
        //Conversiones
        int C1 = Integer.parseInt(c1);
        int C2 = Integer.parseInt(c2);
        int C3 = Integer.parseInt(c3);
        
        //Suma
        int suma = C1 + C2; 
        //Division
        int divi = C1 / C3;
        //Division y Suma
        int divSuma = C1 * C3 + C2;
        //Potencia, multiplicacion y resta
        int poMultRest = ((C2^2)*C1+C2);
        
        //Ejercicio 4
        //Decaracion de Boolean
        boolean X = true;
        boolean Y = false;
        boolean Z = true;
        
        //Operaciones booleanas
        //Expresiones Logicas
        boolean boo1 = (X && Y) || (X && Z);
        boolean boo2 = X && Z || Y;
        boolean boo3 = X && !Y && !X || !Z && !Y;
        boolean boo4 = !X && !Z && (!Z || !X);
        
        //Ejercicio 5
        //Declaracion de diferentes tipos de variables
        int i = 9;
        int j = 4;
        float x = 0.005f;
        float y = -0.0f;
        char C = 5;
        char d = 3;
        
        //Ejercicio 6
        //Operadores de Igualdad
        boolean comp1 = (i <= j);
        boolean comp2 = !(i <= j);
        boolean comp3 = !(x > 0);
        boolean comp4 = (i > 0 && j > 9);
        boolean comp5 = ((j*-1) == (i-10));
        boolean comp6 = (x != i);
        boolean comp7 = ((a + b) == 99);    
    }
}
    

