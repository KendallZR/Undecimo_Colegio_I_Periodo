/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flujos;

/**
 *
 * @author KendallZR
 * Date: 11/02/2023
 * 
 */

import java.util.Scanner;

public class Flujo_Estandar {
    public static void main(String[] args) {
        //Intancia de la clase escanner con nombre sc
        Scanner sc = new Scanner(System.in);
        
        //Declarar dos variables de tipo cadena
        String num1, num2;
        
        System.out.println("Digite dos numeros que esten entre 0 y 10");
        num1=sc.nextLine();
        num2=sc.nextLine();
        
        if(!num1.isEmpty()&&!num2.isEmpty()){ //que si No (!) esta vacido (.isEmpty)
            System.out.println("");
        }
        
        //realizar sumatoria de los numeros solo si estan dentro del rango
        int aux1, aux2;
        int sumatoria;
        
        if(isNumerico(num1)){
            aux1=Integer.parseInt(num1);
            aux2=Integer.parseInt(num2);
            if(aux1!=0 && aux2!=0) {
                if(aux1>0 && aux1<=10){
                    if(aux2>0 && aux2<=10){
                        sumatoria=aux1+aux2;
                        System.out.println("El resultado de la suma es: "+sumatoria);
                    }else{
                        System.out.println("El segundo valor esta fuera de rango");
                    }
                }else{
                    System.out.println("El primer valor esta fuera del rango");
                }
            }else{
                System.out.println("Los dos valores son nulos");
            }
        }else{
            System.out.println("Los datos no son numericos, no se puede continuar");
        }
    }
        
        public static boolean isNumerico(String cadena){
            try{
                Integer.parseInt(cadena); //convertir string a int
                return true;
            }catch (NumberFormatException nfe){
                return false;
            }
        }
    }
