package Tema_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KZR
 */
public class estructuraRepeticion {
    /*imprimir el mensaje siempre que el numero sea menor a 10 y mayor
    a 10 y mayor o igual a o*/
    public static void main(String[] args) {
        int n=0;
        
        while(n<10){
            System.out.println("HOLA MUNDO (while) "+n);
            n++; /*se le suma 1 a n, para que solo se imprima, las 
            veces que ocupamos*/
        }
        
        n=0;
        
        do{
            System.out.println("HOLA MUNDO (do while) "+n);
            n++;
        }while (n<10);
        
        
        for (int i=0;i<10;i++){
            System.out.println("HOLA MUNDO (for) "+i);
        }
    }
 
}
