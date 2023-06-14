/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flujos;

/**
 *
 * @author KendallZR
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Flujo_Byte_Buffer {
    public static void main(String[] args) throws IOException {
        int caracter;
        
        BufferedInputStream lectura=null;
        BufferedOutputStream escritura=null;
        
        //creando objetos de cada flujo de E/S
        lectura=new BufferedInputStream(new FileInputStream("3ejemplo.txt"));
        escritura=new BufferedOutputStream(new FileOutputStream("3copia_ej.txt"));
        
        caracter=lectura.read();
        
        //hacer el recorrido de ficheros byte por byte hasta llegar al final
        
        while(caracter!=-1){
            escritura.write(caracter);
            caracter=lectura.read();
        }
        System.out.println("El archivo fue copiado exitosamente");
        lectura.close();
        escritura.close();
    }
    
}
