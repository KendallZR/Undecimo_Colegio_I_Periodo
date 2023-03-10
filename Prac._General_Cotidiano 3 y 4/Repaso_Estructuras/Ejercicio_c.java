/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso_Estructuras;

/**
 *
 * @author KZR
 */

import java.util.Scanner;  //biblioteca del Scanner

public class Ejercicio_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Declarando Scanner
     
        //Declaracion de Variables
        int result=0;
        int multiplo;
        
        //bucle for(for) para saber las tables de multiplicar del 1 al 16
        for (int tabla=1;tabla<=6;tabla++){
            System.out.println("La tabla del "+tabla); 
            
            for (multiplo=1;multiplo<10;multiplo++){
            result=multiplo*tabla;
            System.out.println(tabla+" * "+multiplo+" es "+result); //resultados
            }
        }
    }
}
