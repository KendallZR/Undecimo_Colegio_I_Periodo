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

public class Ejercicio_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Declarando el Scanner
        
        //Declaracion de Varibales
        int km;
        int precio=500;
        double precioColo = 0;
        
        //Obtencio de datos, distancia
        System.out.println("De cuanta distancia es el trayecto, que realizo: ");
        km = sc.nextInt();
        
        //bucle if elseif (if elseif) para saber el precio del trayecto asegun de la distancia obtenida
        if (km<=150){
            System.out.println("El precio del trayecto es de "+precio+" colones.");  //resultados
            System.out.println("Con un trayecto de "+km);                            //resultados
        }else if(km>150&&km<250){
        if(km>150&&km<250){
                precioColo=precio+5;
            }
            System.out.println("El precio del trayecto es de "+precioColo+" colones."); //resultados
            System.out.println("Con un trayecto de "+km);                               //resultados
        }else if(km>250){
            precioColo=(precioColo-(precioColo*0.15));
            System.out.println("El precio del trayecto es de "+precioColo+" colones."); //resultados
            System.out.println("Con un trayecto de "+km);                               //resultados
        }
    }
}
