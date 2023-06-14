/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

/**
 *
 * @author KendallZR
 */
//registro de fechas
public class arrayRegFecha {
    //atributos (dia, mes, ano)
        int dia;
        String mes;
        int ano;
        
    public static void main(String[] args) {
        //crear arreglo del registro
        arrayRegFecha arrayFecha[] = new arrayRegFecha[3];
        
        //inicializar el elemento 0 del arreglo
        arrayFecha[0] = new arrayRegFecha();
        //inicializar el elemento 1 del arreglo 
        arrayFecha[1] = new arrayRegFecha();
        //inicializar el elemento 2 del arreglo
        arrayFecha[2] = new arrayRegFecha();
        
        
        //llenar los campos del elemento 0 del arreglo
        arrayFecha[0].dia = 5;
        arrayFecha[0].mes = "Agosto";
        arrayFecha[0].ano = 2022;
        
        //llenar los campos del elemento 1 del arreglo
        arrayFecha[1].dia= 16;
        arrayFecha[1].mes= "Enero";
        arrayFecha[1].ano= 2023;
        
        //llenar los campos del elemento 2 del arreglo
        arrayFecha[2].dia = 8;
        arrayFecha[2].mes = "Febrero";
        arrayFecha[2].ano = 2005;
        
        //imprimir el registro
        System.out.println("Fechas de un Array");
        System.out.println("\n"+arrayFecha[0].dia+"/"+arrayFecha[0].mes+"/"+arrayFecha[0].ano);
        System.out.println("\n"+arrayFecha[1].dia+"/"+arrayFecha[1].mes+"/"+arrayFecha[1].ano);
        System.out.println("\n"+arrayFecha[2].dia+"/"+arrayFecha[2].mes+"/"+arrayFecha[2].ano);
    }
}
