/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flujos;

/**
 *
 * @author KendallZR
 * Date:11/04/2023
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Flujo_Caracteres {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //inicio de flujos (declaraciòn e inicialización 
        BufferedReader lectura=new BufferedReader(new FileReader("2ejemplo.txt"));
        BufferedWriter escritura=new BufferedWriter(new FileWriter("2copia_ej.txt"));
        PrintWriter escritura2=new PrintWriter(new FileWriter("2copiaEj2.txt"));
        
        String linea;
        
        while ((linea=lectura.readLine()) !=null){
            //usando BufferedReader escribir
            escritura.write(linea);
            
            //usando PrintWriter escribir
            escritura2.println(linea);
            
            //usando consola escribir
            System.out.println(linea.toUpperCase());
        }
        
        lectura.close();
        escritura.close();
        escritura2.close();
    }
    
}
