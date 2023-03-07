/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cotidiano_1;

/**
 *
 * @author KZR
 */

 //PRACTICA 1.1 Tipos de Datos y Conversiones

public class PRACT_1_1 {
    public static void main(String[] args) {
        //Decalarion de Variables 
        String num;
        float salario;
        double peso;
        double estatura;
        String edad;
        short año_de_nacimiento;
        boolean isEstudiante;
        
        //Inicialización de Variables
        num = "10";
        salario=780992.67f;
        peso=68.9;
        estatura=1.67;
        edad="12";
        año_de_nacimiento=1990;
        isEstudiante=true;
        
        int convNum=Integer.parseInt(num);
        String convSalario= String.valueOf(salario);
        float convPeso=(float)peso;
        String convEstatura= String.valueOf(estatura);
        int convEdad= Integer.parseInt(edad);
        String convAñoNac= String.valueOf(año_de_nacimiento);
        String convIsNac= String.valueOf(isEstudiante);
        
    }
}




