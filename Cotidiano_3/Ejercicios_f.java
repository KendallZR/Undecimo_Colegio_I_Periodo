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

public class Ejercicios_f {
    public static void main(String[] args) {
        //Crear una instancia de la clase Scanner
    Scanner sc = new Scanner(System.in);
    
    System.out.println("***********************DIA DE LA SEMANA********************");
    System.out.println("**Digite un numero, correspondiente a un dia de la semana**"); //Preguntado por el dato
    int dia = sc.nextInt(); //Declarando y obteniendo el dato de dia
    
    //Un switch para saber el dia de la semana
    switch (dia){
        case 1: 
            System.out.println("Dia LUNES"); //Dando respuesta, que es lunes
            System.out.println("***********************************************************");
        break;
        case 2: 
            System.out.println("Dia MARTES"); //Dando respuesta, que es martes
            System.out.println("***********************************************************");
        break;
        case 3: 
            System.out.println("Dia MIERCOLES"); //Dando respuesta, que es miercoles
            System.out.println("***********************************************************");
        break;
        case 4: 
            System.out.println("Dia JUEVES"); //Dando respuesta, que es jueves
            System.out.println("***********************************************************");
        break;
        case 5: 
            System.out.println("Dia VIERNES"); //Dando respuesta, que es viernes
            System.out.println("***********************************************************");
        break;
        case 6: 
            System.out.println("Dia SABADO"); //Dando respuesta, que es sabado
            System.out.println("***********************************************************");
        break;
        case 7: 
            System.out.println("Dia DOMINGO"); //Dando respuesta, que es domingo
            System.out.println("***********************************************************");
        break;
        default:
                System.out.println("\nLa dia indicado no existe"); //Dando respuesta, si el numero no coincide
                break;
    }
    }
}
