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
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        Ejercicio_3 escAr = new Ejercicio_3();
        
        BufferedReader lectura=new BufferedReader(new StringReader(escAr.escribirArchivo()));
        BufferedWriter escritura=new BufferedWriter(new FileWriter(escAr.rutaArchivo()));
        
        String linea;
        
        while ((linea=lectura.readLine()) !=null){
            //usando BufferedReader escribir
            escritura.write(linea.toUpperCase());
        }

        System.out.println("Lo digitado anteriormente en el archivo editay seleccionado es: "+escAr.imprimirArchivo().toUpperCase());
        
        lectura.close();
        escritura.close();
    }
    
    public String escribirArchivo(){
        Scanner sc = new Scanner(System.in);
        String escrito;
        System.out.println("Digite lo que quiere escribir en el archivo seleccionado");
        escrito=sc.nextLine();
        return escrito;
    }
    
    public String rutaArchivo(){
        Scanner sc = new Scanner(System.in);
        String ruta="";
        System.out.println("Digite la ruta del archivo a editar (exacta)");
        ruta=sc.nextLine();
        
        return ruta;
    }
    
    public String imprimirArchivo(){
        String impr;
        impr = escribirArchivo();
        return impr; 
    }
    
    //D:\Kendall\Undecimo\Programacion\Cuartos Temas\Trabajo Cotidiano 6\Ejercicios\ArchivoPruebaEjer6.txt
}
