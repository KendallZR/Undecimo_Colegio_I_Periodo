/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flujos;

/**
 *
 * @author KendallZR
 * Date: 11/04/2023
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Flujo_Bits {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int caracter; //variable para recabar bit por bit cada dato
        FileInputStream lectura; //variable de tipo fileInputStream
        FileOutputStream escritura; //variable de tipo fileOutputStream
        
        //crear objetos de cada flujo
        lectura = new FileInputStream("ejemplo.txt");
        escritura = new FileOutputStream("cop_ejemplo.txt");
        
        caracter=lectura.read(); //lee bit por bit
        
        while(caracter!=-1){
            escritura.write(caracter); //se escribe el valor del archivo
            System.out.println((char)caracter); //casteo para cambiar valor 
            caracter=lectura.read();
        }
        System.out.println("\n Ya se realizo la copia del archivo");
        JOptionPane.showMessageDialog(null, "Ya se realizo la copia del archivo");
        lectura.close();
        escritura.close();
    }
}
