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

public class Ejercicio_4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Declarando el Scanner
        Ejercicio_4_6 pares = new Ejercicio_4_6(); //Estancionamiento
        
        //Declaracion de variables
        int comienzo;
        int fina;
        //obtencion de datos
        System.out.println("Ingrese el numero donde van a empezar los pares");
        comienzo = sc.nextInt();
        System.out.println("Ingrese el numero donde va a finalizar los pares");
        fina = sc.nextInt();
        //Llamado del Procedimiento numPare
        pares.numPare(comienzo, fina);
        
    }
    //Procedimiento para imprimir numeros pares, asegun de los limites puestos por el usuario
    void numPare(int com, int fin){
        for(int i=com; i<=fin; i++){
            if ((i % 2) == 0){    
                System.out.println("Par "+i);
            }
        }
    }
}