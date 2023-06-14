/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cotidiano_10;

import java.util.Scanner;

/**
 *
 * @author KendallZR
 */

import java.util.Scanner;

public class Ejercicio_4 {
    //los atributos del registro
    String artista, titulo;
    double duracion;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio_4 arreglo[] = new Ejercicio_4[15];
        
        arreglo[0]=new Ejercicio_4();
        
        //almacena datos
        for(int i=0; i<15; i++){
        arreglo[i]=new Ejercicio_4();
        System.out.println("MP3.. Cancion Favorita");
        System.out.println("Digite el nombre del Artista");
        arreglo[i].artista=sc.next();
        System.out.println("Digite el titulo de la cancion");
        arreglo[i].titulo = sc.next();
        System.out.println("Digite la duracion en segundos");
        arreglo[i].duracion = sc.nextDouble();
        }
        
        
        System.out.println("\n\nCANCION FAVORITA");
        for(int i=0; i<15; i++){
        System.out.println("\nArtista: "+arreglo[i].artista);;
        System.out.println("\nTitulo: "+arreglo[i].titulo);
        System.out.println("\nDuracion: "+arreglo[i].duracion);
        }
    }
}
