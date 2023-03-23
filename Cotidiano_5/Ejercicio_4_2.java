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

public class Ejercicio_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Declarando el Scanner
        Ejercicio_4_2 ruta = new Ejercicio_4_2(); //Estanciamiento
        //Declaración de Variable 
        int km;
        //Obtención de la distancia del trayecto
        System.out.println("De cuanta distancia es el trayecto que realizo: ");
        km = sc.nextInt();
        //llamado al procedimiento trayecto
        ruta.trayecto(km);
    }
    //Procedimiento que asegun de la distancia, va acobrar diferente, por eso se usa un bucle if-else if
    void trayecto(int km){
        int precio=500;
        double precioColo = 0;
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
