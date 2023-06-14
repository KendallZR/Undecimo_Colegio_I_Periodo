/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cotidiano_9;

/**
 *
 * @author KendallZR
 */

import java.util.Scanner;

public class RetoCadenas_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cade1, cade2;
        
        System.out.println("Digite una frase para la primera cadena");
        cade1 = sc.next();
        System.out.println("Digite una frase para la segunda cadena");
        cade2 = sc.next();
        char arrayletras1 [] = cade1.toCharArray();
        char arrayletras2 [] = cade2.toCharArray();
        String car3 = "";
        
        if(arrayletras1.length<arrayletras2.length){
            for(int i = 0; i<arrayletras1.length; i++){
                car3 =+ cade1.toCharArray(i);
                car3 =+ cade2.toCharArray(i);
            }
        }else(arrayletras1.length>arrayletras2.length){
             for(int i = 0; i<arrayletras1.length; i++){
                car3 =+ cade1.toCharArray(i);
                car3 =+ cade2.toCharArray(i);
            }
        }   
    }
}
