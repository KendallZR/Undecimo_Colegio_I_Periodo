/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso_Estructuras;

/**
 *
 * @author KZR
 */

import java.util.Scanner; //biblioteca del Scanner

public class Ejercicio_f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Declarando Scanner
        //Declaracion de variables
        int comienzo;
        int fina;
        //obtencion de datos
        System.out.println("Ingrese el numero donde van a empezar los pares");
        comienzo = sc.nextInt();
        System.out.println("Ingrese el numero donde va a finalizar los pares");
        fina = sc.nextInt();
        
        //bucle for (if) para saber el comienzo y final de los pares
        for(int i=comienzo; i<=fina; i++){
            if ((i % 2) == 0){    
                System.out.println("Par "+i);
            }
        }
    }
}
