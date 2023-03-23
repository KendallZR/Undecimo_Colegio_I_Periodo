package ejemplosFuncMetodProd;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KendallZR
 */

import java.util.Scanner; //Biblioteca Scanner

public class Ejercicio_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Declarando el Scanner
        Ejercicio_4_1 nota = new Ejercicio_4_1();  //Estanciamiento
        
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
        
        notaTotal=notaTo(notaExamen, notaProyecto,notaTareas); //Llamado de la Función
        nota.notaMayor(notaTotal, radioAsistencia);  //Llamado del Procedimiento
    }
    //Función para saber la nota final que obtiene el estudiante
    public static double notaTo(double notaExa, double notaProy, double notaTar){
        double notaTotal;
        notaTotal=notaExa+notaProy+notaTar;
        return notaTotal;
    }
    //Procedimiento para comparar las notas y saber si aprobo o reprobo, e imprimir el resultado
    void notaMayor(double notaTot, boolean radioAsis){
        if(notaTot>=50 && radioAsis==true){
            System.out.println("Felicidades usted esta APROBADO");  //resultados
            System.out.println("Nota final: "+notaTot);             //resultados
        }else{
            System.out.println("Sigue progresando usted esta Reprobado");  //resultados
            System.out.println("Nota final: "+notaTot);                    //resultados
        }      
    }
}
