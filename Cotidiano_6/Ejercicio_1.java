/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cotidiano_6;

/**
 *
 * @author KendallZR
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Ejercicio_1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader lectura = new BufferedReader(new FileReader("D:\\Kendall\\Undecimo\\Programacion\\Cuartos Temas\\Trabajo Cotidiano 6\\Ejercicios\\ABC.txt"));
        
        String linea;
        
        while ((linea=lectura.readLine()) !=null){
            //usando consola escribir
            System.out.println(linea.toUpperCase());
            
            JOptionPane.showMessageDialog(null, linea);
            
        }
        
        lectura.close();
    }
}
