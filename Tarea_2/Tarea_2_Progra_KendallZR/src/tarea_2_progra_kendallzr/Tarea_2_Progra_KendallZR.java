/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_2_progra_kendallzr;

/**
 *
 * @author KendallZR
 */


import java.util.Arrays; //Biblioteca para el ordenar de forma ascendente
import java.util.Scanner; //Biblioteca de Scanner (obtencion de datos)

public class Tarea_2_Progra_KendallZR {
   public static void main(String[] args) {
        int num [] = new int[20];   //Declaracion del Arreglo num
        //Ingresar numeros al arreglo
        num = kzAsignarDatoArreglo();
        
        //1. imprimir arreglo completo
        keArregloNormal(num);
        
        //2. imprimir arreglo el numero mayor
        enSaberNumeroMayor(num);
        
        //3. imprimir arreglo, el promedio 
        ndSaberPromedioArreglo((num));
        ndImprimirArregloProm(ndSaberPromedioArreglo((num)));
        
        //4. imprimir arreglo, la sumatoria
        daSaberSumatoriaArreglo(num);
        daImprimirArregloSum(daSaberSumatoriaArreglo(num));
        
        //5. imprimir arreglo, los numeros pares
        alImprimirArregloImpares(num);
        
        //6. imprimir arreglo, de forma descendente
        llImprimirArregloDes(num);
        
        //7. imprimir arreglo, de forma ascendente
        zrImprimirArregloAs(num);
        
        
    }

    //Funcion para ingresar los numeros al arreglo
    public static int [] kzAsignarDatoArreglo() {
        Scanner sc = new Scanner(System.in);
        int nume [] = new int [20]; 
        
        for(int i = 0; i<20; i++){
            System.out.println("Ingrese un numero"); //Solicitud de numeros para el arreglo
            nume [i]= sc.nextInt();     //Obtencion de los numeros
        }
        
        return nume ;   //retornar la variable que contiene los numeros para el arreglo
    }
   
    //imprimir arreglo completo
     private static void keArregloNormal(int num[]) {
         System.out.println("\n1. Arreglo Normal"); 
        for(int i=0; i<num.length; i++){
           System.out.println(num[i]);      //Impresion para el Arreglo ordenado 
        }
    }
    
    //Imprimir y Función pasa saber el numero mayor del arreglo
    public static void enSaberNumeroMayor(int [] num){
        Arrays.sort(num); //ordenar de forma ascendente
        System.out.println("\n\n2. Arreglo numero mayor: \n" + num[num.length-1]); //Impresion para el numero mayor
    }
    
    //Función para saber la sumatoria del arreglo
    public static int daSaberSumatoriaArreglo(int [] num){
        int sum=0;
       for(int i=0; i<num.length; i++){     //for para saber la sumatoria del arreglo
           sum += num[i];
       }
       return sum;      //retornar la variable que contiene la sumatoria 
    }
    
     //Imprimir arreglo Sumatoria
    private static void daImprimirArregloSum(int suma) {
        System.out.println("\n4. La sumatoria del arreglo es: \n"+suma);    //Impresion de la sumatoria del arreglo
    }

    //Función para saber el promedio del arreglo
    public static int ndSaberPromedioArreglo(int [] num){
        int prom;
        
        prom = daSaberSumatoriaArreglo(num) / num.length;   //Division para saber el promedio del arreglo, sumatoria dividida por el el limite
        
        return prom;    //retornar la variable que contiene el promedio
    }
    
    //Imprimir arreglo Promedio
    public static void ndImprimirArregloProm(int prom){
        System.out.println("\n\n3. El Promedio del arreglo es: \n"+prom);   //Impresion del promedio del arreglo
    }
    
    
    //Imprimir y Función para saber los impares del arreglo
    private static void alImprimirArregloImpares(int [] num){   
        System.out.println("\n5. Numeros Impares: ");   
        for(int i : num){
            if((i % 2) != 0){   //if para saber los numeros impares del arreglo
                System.out.println(i);      //Impresion de los numeros impares
            }
        }
    }
     
    //Imprimir arreglo descendente
    private static void llImprimirArregloDes(int [] num){
        System.out.print("\n6. Arreglo numeros de forma Descendentes: ");   
        for(int i=19; i>=0; i--){    //for para poner el arreglo de forma descendente 
            System.out.print(num[i]+", ");  //Impresion del arreglo en forma descendente 
        }
     }
     
    //imprimir arreglo ascendente
    private static void zrImprimirArregloAs(int [] num){
        Arrays.sort(num); //ordenar de forma ascendente
        System.out.print("\n\n7. Arreglo numeros de fomra Ascendentes: ");
        System.out.print(Arrays.toString(num)); //Impresion del arreglo en forma ascendente 
    }
}