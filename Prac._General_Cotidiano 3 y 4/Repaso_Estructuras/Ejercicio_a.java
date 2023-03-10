/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso_Estructuras;

/**
 *
 * @author CTPG
 */

import java.util.Scanner;  //biblioteca del Scanner

public class Ejercicio_a {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);  //Declarando el Scanner
     //Declaracion de Variables
     double notaExamen;
     double notaProyecto;
     double notaTareas;
     boolean radioAsistencia=true;
     double notaTotal;
     
     //Solicitud de todos los datos (notas y true o false)
        System.out.println("******NOTA MATEMATICAS******");
        System.out.println("Digite que porcentaje tiene en la nota de Examen.");
        notaExamen = sc.nextDouble();
        System.out.println("Digite que porcentaje tiene en la nota del Proyecto");
        notaProyecto = sc.nextDouble();
        System.out.println("Digite que porcentaje tiene en la nota de las Tareas");
        notaTareas = sc.nextDouble();
        System.out.println("Digite "
                + "\ntrue. Si cumple con el minimo de asistencia. "
                + "\nfalse. si no cumple con el minimo de asistencia. ");
        radioAsistencia = sc.nextBoolean();
        
        //Formula para obtener el porcentaje de las notas
        //(nota*porcentaje)/100
        notaExamen=(notaExamen*60)/100;         
        notaProyecto=(notaProyecto*30)/100;
        notaTareas=(notaTareas*10)/100;
        
        //Suma de todas las notas, para nota final
        notaTotal=notaExamen+notaProyecto+notaTareas;
        
        //bucle if else para saber si aprobo o no, con las notas y el true o false
        if(notaTotal>=50 && radioAsistencia==true){
            System.out.println("Felicidades usted esta APROBADO");  //resultados
            System.out.println("Nota final: "+notaTotal);             //resultados
        }else{
            System.out.println("Sigue progresando usted esta Reprobado");  //resultados
            System.out.println("Nota final: "+notaTotal);                    //resultados
        }      
    }
}
