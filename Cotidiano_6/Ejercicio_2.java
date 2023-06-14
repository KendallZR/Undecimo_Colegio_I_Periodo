/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cotidiano_6;

/**
 *
 * @author KendallZR
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio_2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int caracteres; //variable para recabar bit por bit cada dato
        FileInputStream lectura; //variable de tipo fileInputStream
        
        lectura = new FileInputStream("D:\\Kendall\\Undecimo\\Programacion\\Cuartos Temas\\Trabajo Cotidiano 6\\Ejercicios\\Binario 1.txt");
        
        caracteres=lectura.read();
        
        while(caracteres!=-1){
            System.out.print((char)caracteres);
            caracteres=lectura.read();
        }
        lectura.close();
    }
}
