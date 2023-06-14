/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registros;

/**
 *
 * @author KendallZR
 */
public class regEstudiante {
    String cedula, nombre;
    int edad;
    boolean beca;
    double promedio;
    char estado;
    
    public static void main(String[] args) {
        //Instancia
        regEstudiante estudiante = new regEstudiante();
        
        //llenado del objeto del registro
        estudiante.cedula="1-1927-0712";
        estudiante.nombre="Kendall Zuñiga";
        estudiante.edad=18;
        estudiante.beca=true;
        estudiante.promedio=85;
        estudiante.estado='A';
        //A = Aprobado, R = Repobado, S = Aplazado
        
        //Imprimir objeto de registros
        System.out.println("**************REGISTRO DE ESTUDIANTE 1**************");
        System.out.println("****************************************************");
        System.out.println("*Cedula:"+"["+estudiante.cedula+"]");
        System.out.println("*Nombre estudiante: "+"["+estudiante.nombre+"]");
        System.out.println("*Edad de cumplida:"+"["+estudiante.edad+"]");
        System.out.println("*Tiene beca:"+"["+estudiante.beca+"]");
        System.out.println("*Promedio obtenido:"+"["+estudiante.promedio+"%"+"]");
        System.out.println("*Estado de NOTA:"+"["+estudiante.estado+"]");
        System.out.println("*****************************************************");
        
        //Instancia
        regEstudiante estudiante1 = new regEstudiante();
        
        //llenado del objeto del registro
        estudiante1.cedula="1-1965-0621";
        estudiante1.nombre="Leandro Poveda";
        estudiante1.edad=16;
        estudiante1.beca=false;
        estudiante1.promedio=71;
        estudiante1.estado='A';
        //A = Aprobado, R = Repobado, S = Aplazado
        
        //Imprimir objeto de registros
        System.out.println("\n\n**************REGISTRO DE ESTUDIANTE 2**************");
        System.out.println("****************************************************");
        System.out.println("*Cedula:"+"["+estudiante1.cedula+"]");
        System.out.println("*Nombre estudiante: "+"["+estudiante1.nombre+"]");
        System.out.println("*Edad de cumplida:"+"["+estudiante1.edad+"]");
        System.out.println("*Tiene beca:"+"["+estudiante1.beca+"]");
        System.out.println("*Promedio obtenido:"+"["+estudiante1.promedio+"%"+"]");
        System.out.println("*Estado de NOTA:"+"["+estudiante1.estado+"]");
        System.out.println("*****************************************************");
    }
}
