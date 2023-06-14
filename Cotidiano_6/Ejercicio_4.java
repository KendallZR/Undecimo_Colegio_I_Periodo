/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cotidiano_6;

/**
 *
 * @author KendallZR
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio_4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int caracter;
        
        BufferedInputStream lectura=null;
        BufferedOutputStream escritura=null;
        
        lectura = new BufferedInputStream(new FileInputStream("D:\\Kendall\\Undecimo\\Programacion\\Cuartos Temas\\Trabajo Cotidiano 6\\Ejercicios\\personal.txt"));
        escritura = new BufferedOutputStream(new FileOutputStream("D:\\Kendall\\Undecimo\\Programacion\\Cuartos Temas\\Trabajo Cotidiano 6\\Ejercicios\\cop_personal.txt"));

        caracter = lectura.read();
                
        while(caracter!=-1){
            escritura.write(caracter);
            System.out.print((char)caracter);
            caracter=lectura.read();
        }
        
        System.out.println("El archivo fue copiado exitosamente");
        lectura.close();
        escritura.close();
    }
    
}
