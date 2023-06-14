/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cotidiano_10;

/**
 *
 * @author KendallZR
 */

import java.util.Scanner;

public class Ejercicio_2 {
    //los atributos del registro
    String artista, titulo;
    double duracion;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicio_2 mp3 = new Ejercicio_2();
        
        //almacena datos
        System.out.println("MP3.. Cancion Favorita");
        System.out.println("Digite el nombre del Artista");
        mp3.artista = sc.next();
        System.out.println("Digite el titulo de la cancion");
        mp3.titulo = sc.next();
        System.out.println("Digite la duracion en segundos");
        mp3.duracion = sc.nextDouble();
        
        //Imprime datos del registro
        System.out.println("\n\nCANCION FAVORITA");
        System.out.println("Artista: "+mp3.artista);
        System.out.println("Titulo: "+mp3.titulo);
        System.out.println("Duracion: "+mp3.duracion);
        
    }
}
