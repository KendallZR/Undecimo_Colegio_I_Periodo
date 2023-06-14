/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flujos;

/**
 *
 * @author KendallZR
 */

public class Ejercicio_5 {
    public static void main(String[] args) {
        String letras [][]= new String [4][5];
        
        letras [0][0]="Menta";
        letras [0][1]="Cúrcuma";
        letras [0][2]="Culantro";
        letras [0][3]="Mejorana";
        letras [0][4]="Salvia";
        
        letras [1][0]="Comino";
        letras [1][1]="Ajo";
        letras [1][2]="Cilantro";
        letras [1][3]="Romero";
        letras [1][4]="Cebollín";
        
        letras [2][0]="Perejil";
        letras [2][1]="Curri";
        letras [2][2]="Laurel";
        letras [2][3]="Albahaca";
        letras [2][4]="Caléndula";
        
        letras [3][0]="Orégano";
        letras [3][1]="Pimienta";
        letras [3][2]="Tomillo";
        letras [3][3]="Hierbabuena";
        letras [3][4]="Manzanilla";
        
          for(int i=0; i<4; i++){
            System.out.println(" ");
            for(int f=0; f<5; f++){
                System.out.print(letras[i][f]+" ");
            }
        }
    }
}