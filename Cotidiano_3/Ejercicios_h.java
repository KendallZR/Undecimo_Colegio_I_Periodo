package Estruct_Seleccion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KZR
 */

import java.util.Scanner; //La biblioteca para usar el Scanner

public class Ejercicios_h {
    public static void main(String[] args) {
        //Crear una instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("***ETAPA DE LA VIDA EN QUE TE ENCUANTRAS***");
        System.out.println("Ingrese su edad, para ver en que etapa estas: "); //Preguntando por el dato
        int edad = sc.nextInt(); //Declarando y obteniendo el dato de edad
        
        //if - else if para saber en que etapa de la vida te encuentras 
         if(edad>0 && edad<=3){ 
            System.out.println("En la etapa que estas es de ADULTO MAYOR);"); //Respuesta
        }else if(edad>=4 && edad<=11){
            System.out.println("En la etapa que estas es de ADULTO MAYOR);"); //Respuesta
        }else if(edad>=12 && edad<=17){
            System.out.println("En la etapa que estas es de ADOLECENTE);"); //Respuesta
        }else if(edad>=18 && edad<=29){
            System.out.println("En la etapa que estas es de ADULTO JOVEN);"); //Respuesta
        }else if(edad>=30 && edad<=64){
            System.out.println("En la etapa que estas es de ADULTO);"); //Respuesta
        }else if(edad>=65){
            System.out.println("En la etapa que estas es de ADULTO MAYOR);"); //Respuesta
        }
    }
}
