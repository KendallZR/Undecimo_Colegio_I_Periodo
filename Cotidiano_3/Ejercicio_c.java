package Estruct_Seleccion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KZR
 */

import java.util.Scanner; //La biblioteca para usar el Scanner

public class Ejercicio_c {
    public static void main(String[] args) {
        //Crear una instancia de la clase Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------BIENVENIDO A LA GRANJA KENDALL--------");
        System.out.println("Ingrese el precio de la sandia"); //Preguntado por el dato
        double precio = sc.nextDouble(); //Declarando y obteniendo el dato de precio
        System.out.println("Escoja una opcion de las siguientes opciones: ");
        System.out.println("El tipo de Fruta*******************" //Preguntando por el dato
                + "\n1. Ketsali."
                + "\n2. Lavon.");
        int frutaOp = sc.nextInt(); //Declarando y obteniendo el dato de frutaOp

        System.out.println("El tipo de calidad***************" //Preguntando por el dato
                + "\n1. Exelente."
                + "\n2. Buena.");
        int calidadOp = sc.nextInt(); //Declarando y obteniendo el dato de calidadOp
        System.out.println("--------GRACIAS POR SU OPCION--------");
        System.out.println("\n-------RESULTADO DE LA COMPRA-------"); //Se va a mostrar el resultado
        
        //Un switch para saber si es una marca, a segun de la calidad se le suma un porcentaje
        switch (frutaOp) {
            case 1:
                switch (calidadOp){ //Calidad de marca Ketsali
                    case 1:
                        precio = (precio + (precio*0.40));
                        System.out.println("El precio final con el 40% es:\n"
                        + precio);
                        break;
                    case 2:
                        precio = (precio + (precio*0.20));
                        System.out.println("El precio final con el 20% es:\n"
                        + precio);
                        break;
                    default:
                        System.out.println("La opcion es incorrecta");
                }
            case 2:
                switch (calidadOp){ //Calidad de marca Lavon
                    case 1:
                        precio = (precio + (precio*0.45));
                        System.out.println("El precio final con el 45% es:\n"
                        + precio);
                        break;
                    case 2:
                        precio = (precio + (precio*0.15));
                        System.out.println("El precio final con el 15% es:\n"
                        + precio);
                        break;
                    default:
                        System.out.println("La opcion es incorrecta");
                }
        } 
    }
}
