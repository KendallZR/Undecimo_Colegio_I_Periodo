/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosFuncMetodProd;

/**
 *
 * @author KendallZR
 */

import java.util.Scanner; //Biblioteca Scanner

public class Ejercicio_3 {
    public static void main(String[] args) {
        Ejercicio_3 Op = new Ejercicio_3();  //Estanciamiento
        
        //Llamado del Proecedimiento
        Op.menu(0);
    }
    
    /*Procedimiento, asegun de la opción seleccionada, se hace una operación u otra
    y cada caso del bucle Switch se imprime la operación hecha por las funciones*/
    void menu(int op){
        Scanner sc = new Scanner(System.in); //Declarando el Scanner
        int num1, num2;   //Declaración de Variables
        System.out.println("""
                           Elija cual operaci\u00f3n desea hacer:
                           1. Suma
                           2. Resta
                           3. Multiplicaci\u00f3n
                           4. Divisi\u00f3n""");
        op = sc.nextInt(); //Obtencion de la opcion
        //bucle switch, asegun de la opcion se imprime una operación 
        switch (op){
            case 1:
                System.out.println("Digite los numeros a sumar");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                System.out.println("El resultado de la Suma es de: "+suma(num1, num2));
                break;
            case 2:
                System.out.println("Digite los numeros a restar");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                System.out.println("El resultado de la Resta es de: "+rest(num1, num2));
                break;
            case 3:
                System.out.println("Digite los numeros a multiplicar");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                System.out.println("El resultado de la Multiplicación es de: "+multi(num1, num2));
                break;
            case 4:
                System.out.println("Digite los numeros a Dividir");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                System.out.println("El resultado de la División es de: "+div(num1, num2));
                break;
            default:
                System.out.println("No se encontro la operación");
        }
    }
    //Funcion para la operación suma
    public static int suma(int num1, int num2){
        int sumar;
        sumar=num1+num2;
        return sumar;
    }
    //Funcion para la operación resta
    public static int rest(int num1, int num2){
        int resta;
        resta=num1-num2;
        return resta;
    }
    //Funcion para la operación multiplicación
    public static int multi(int num1, int num2){
        int mult;
        mult=num1*num2;
        return mult;
    }
    //Función para la operación División
    public static double div(int num1, int num2){
        int divi;
        divi=num1/num2;
        return divi;
    }
}
