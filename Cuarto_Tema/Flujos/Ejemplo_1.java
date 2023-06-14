/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flujos;

/**
 *
 * @author KendallZR
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ejemplo_1 {
    public static void main(String[] args) throws FileNotFoundException {
        String linea;
        //creamos un archivo como flujo
        System.setOut(new PrintStream(new FileOutputStream("prueba.txt")));
        System.out.println("Archivo de Prueba");
        for (int i=0; i<=15; i+=2){
            System.out.println(i);
        }
    }
    
}
