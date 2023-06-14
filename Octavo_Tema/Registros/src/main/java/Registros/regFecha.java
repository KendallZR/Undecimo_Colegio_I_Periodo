/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

/**
 *
 * @author KendallZR
 */
public class regFecha {
    //los atributos del registro se crean antes del main
    int dia;
    String mes;
    int ano;
    
    public static void main(String[] args) {
        //instacia o creacion  de un objeto
        regFecha fecha = new regFecha();
        
        
        //almacena datos
        fecha.dia = 18;
        fecha.mes = "Mayo";
        fecha.ano = 2023;
        
        //nueva instacia de regFecha
        regFecha fecha1 = new regFecha();
        
        //almacenar datos
        fecha1.dia=12;
        fecha1.mes="Julio";
        fecha1.ano=2023;
        
        //impresion de datos de un registro 
        System.out.println(fecha.dia+"/"+fecha.mes+"/"+fecha.ano);
        System.out.println(fecha1.dia+"/"+fecha1.mes+"/"+fecha1.ano);
    }
}
