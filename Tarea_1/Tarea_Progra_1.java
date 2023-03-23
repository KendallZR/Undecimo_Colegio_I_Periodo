/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Tarea_1;

/**
 *
 * @author KendallZR
 */

import java.util.Scanner; //biblioteca de Scanner

public class Tarea_Progra_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //declarando el Scanner
        //declaracion de Variables
        int precio=0, total=0, iva=0;
        double totalDesc=0, totalDescImpu=0; 
        //obtencion de datos, la marca y la cantidad de litros a comprar
        System.out.println("Bienvenido al Supermercado\n");
        System.out.println("""
                           Indique cual marca desea comprar
                           1. Sabemas   (unit 950 col)
                           2. Coronado  (unit 1100 col)
                           3. Dos Pinos (unit 1400 col)""");
        int op = sc.nextInt();
        System.out.println("\nIndique cuantos litros va a comprar");
        int litros = sc.nextInt();        
        //bucle switch para saber asegún de la marca, asignarle un precio
        switch(op){
            case 1:
                precio=950;
                break;
            case 2:
                precio=1100;
                break;
            case 3:
                precio=1400;
            break;
        }
        /*bucle if else if para todas las operaciones, precio total, precio total 
        con el descuento y precio total con el descuento y el iva*/
        if(litros>10){       //cantidad de litros mayor a 10
               total=litros*precio;
               totalDesc=total-(total*0.135);
               iva=(int) (totalDesc*0.13);
               totalDescImpu=totalDesc-iva;
           } else if(litros>7 && litros<10){ //cantidad de litros mayor a 7 y menos 10
               total=litros*precio;
               totalDesc=total-(total*0.12);
               iva=(int) (totalDesc*0.13);
               totalDescImpu=totalDesc-iva;
           } else if(litros<7 && litros>4){ //cantidad de litros menor a 7 y mayor a 4
               total=litros*precio;
               totalDesc=total-(total*0.065);
               iva=(int) (totalDesc*0.13);
               totalDescImpu=totalDesc-iva;
           } else if(litros<4){  //cantidad de litros menor a 4
               total=litros*precio;
               totalDesc=total-(total*0.03);
               iva=(int) (totalDesc*0.13);
               totalDescImpu=totalDesc-iva;
           }
        //Obtencion de resultados de las operaciones, con sus variables
        //Imprimir los reultados de las operaciones, al usuario
           System.out.println("Resultados Factura");
           System.out.println("El monto total sin el descuento es de:         "+total);
           System.out.println("El monto total con el descuento es de:         "+totalDesc);
           System.out.println("El iva del monto es de:                        "+iva);
           System.out.println("El mont total con el descuento y el iva es de: "+totalDescImpu);
    }
}