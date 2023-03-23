/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosFuncMetodProd;

/**
 *
 * @author KendallZR
 */

import java.util.Scanner;  //Biblioteca Scanner

public class Ejercicio_4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Declarando el Scanner
        Ejercicio_4_4 ami = new Ejercicio_4_4();  //Estanciamiento
        //Declarando las Variables
        int num1, num2;
        int suma;
        //Obtencion de los numeros
        System.out.println("__*****NUMEROS AMIGOS*****__");
        System.out.println("Digite dos numeros, para saber si son amigos");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        //igualando la variable suma a la funcion Sumatoria
        suma = sumatoria(num1, num2);
        //Llamando al procedimiento de los numeros amigos
        ami.amigos(num1, num2, suma);
    }
    //Funcion para la suma de los numeros
    public static int sumatoria (int nume1, int nume2){
        int sum=nume1+nume2;
        return sum;
    }
    //Procedimiento para saber si los numeros digitados son amigos
    void amigos(int numer1, int numer2, int sumat){
        if(numer1 > 0 && numer2 > 0 && ((sumat/3)==0)){
            System.out.println("Los numeros "+numer1+" y "+numer2+" si son amigos"); //Resultados
        }else{
            System.out.println("Los numeros "+numer1+" y "+numer2+" no son amigos"); //Resultados
        }
    }
}
