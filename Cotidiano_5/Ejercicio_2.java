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

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Declarando el Scanner
        Ejercicio_2 E2 = new Ejercicio_2(); //Estanciamiento
        
        //Obtencion de datos, del usuario
        System.out.println("Ingrese el Usuario");
        String user = sc.next();
        System.out.println("Ingrese la Contraseña");
        String pasw = sc.next();
        E2.login(user, pasw); //llamado del procedimiento
    }
    
    //Procedimiento, para saber si la clave y el usuario son iguales, ingresa son problema
    void login(String user, String pasw){
        String user1="Kendall"; 
        String pasw1="1234";
     
        if (user.equals(user1) && pasw.equals(pasw)){
            System.out.println("Bienvenido, Inicio de Seción !!Exitoso!!");  //resultados
        }else{
            System.out.println("Contaseña o/y Usuario !!INCORRECTOS!!");  //resultados
        }
    }
}
