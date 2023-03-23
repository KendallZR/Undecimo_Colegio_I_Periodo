/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosFuncMetodProd;

/**
 *
 * @author KendallZR
 */

import java.util.Scanner; //Biblioteca Scanner

public class Ejercicio_4_5 {
    public static void main(String[] args) {
        Ejercicio_4_5 login = new Ejercicio_4_5(); //Estancionamiento 
        Scanner sc = new Scanner(System.in); //Declarando el Scanner
        //Declarando el Scanner
        int clave, clave2=0;
        //Obtencion de datos
        System.out.println("______***********BASE DE DATOS***********______");
        System.out.println("Cree una contraeña numerica, (entre el 0 y 999)");
        clave = sc.nextInt();
        //Llamado del Procedimiento clave donde esta todo el proceso para hacer el login
        login.contra(clave, clave2);
    }
    /*Procedimiento para saber si el usuario y el contraseña, creados son exitosos, y al iniciar sesion es exitoso
    utilizando un bucle for (adentro dos if-else if)*/
    void contra(int clave, int clave2){
        Scanner sc = new Scanner(System.in);
        
        if(clave<999){
            System.out.println("**Contraseña, creada exitosamente**"); //resultados
            
            System.out.println("___*****************************************___");

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
        }else{
            System.out.println("**__Valores Incorrectos, limite 999__**");
        }
    }
}
