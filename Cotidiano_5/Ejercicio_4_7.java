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

public class Ejercicio_4_7 {
    public static void main(String[] args) { 
        Ejercicio_4_7 intervalo = new Ejercicio_4_7(); //Estancionamiento
        //Declaración de Variables
        int num1=0, num2=0, num34=0, total=0, total2=0;
        //Llamado al Procedimiento comFin
        intervalo.comFin(num1, num2, num34, total, total2);
        
    }
    //Procedimiento para saber el intervalo de numeros 
    void comFin(int nume1, int nume2, int nume34, int tot, int tot2){
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Ingrese el comienzo del intervalo");
            nume1=sc.nextInt();
            System.out.println("Ingrese el final del intervalo");
            nume2=sc.nextInt();
        }while(nume1>nume2);
        
        do{
            System.out.println("Ingrese numeros, (finaliza con 0)");
            nume34=sc.nextInt();
            if(nume34>nume1 && nume34<nume2){
            tot+=nume34;   
            }else{
          tot2++;  
            }       
        }while (nume34!=0);
        //Resultados
        System.out.println("La suma de los numeros adentro del intervalo es: "+tot); 
        System.out.println("Los numeros afuera del intervalo son: "+tot2);
    }
}
