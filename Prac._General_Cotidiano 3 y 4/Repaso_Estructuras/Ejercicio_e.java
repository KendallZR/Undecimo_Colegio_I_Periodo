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

public class Ejercicio_e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Declarando Scanner
        
        //Declaracion de Variables
        int clave, clave2=0;
        //Obtencion de datos
        System.out.println("______***********BASE DE DATOS***********______");
        System.out.println("Cree una contraeña numerica, (entre el 0 y 999)");
        clave = sc.nextInt();
        //bucle if else para saber si las contraseña fue exitosa
        if(clave<999){
            System.out.println("**Contraseña, creada exitosamente**");
        }else{
            System.out.println("**__Valores Incorrectos, limite 999__**");
        }
        
        System.out.println("___*****************************************___");
        //bucle for(if elseif) para saber si indruce la contraseña correctamente, y si no le dan 3 intentos
        for(int contra=0; contra<3; contra++){
        
            System.out.println("Introduzca la Contraseña");
            clave2 = sc.nextInt();
            
            if (clave2 == clave){
            System.out.println("--Acceso Autorizado--"); //resultados
            contra = 4;
            }else if(clave2!=clave){
            System.out.println("Le quedan "+contra+" intentos");
            }
            }
        if (clave2 != clave){
         System.out.println("Ha excedido el numero de intentos permitidos"); //resultados
        }
    }
}
    
