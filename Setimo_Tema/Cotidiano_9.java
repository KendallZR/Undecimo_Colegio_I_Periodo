/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Cotidiano_9;

/**
 *
 * @author KendallZR
 */

import java.util.Scanner;

public class Cotidiano_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cotidiano_9 metodo = new Cotidiano_9();
        //char letras [] = new char [cadenaUsuario.length];
        String cadena = "Al mal paso darle Prisa";
      
        System.out.println("Ingrese una frase para llenar la cadena");
        String cadenaUsuario = sc.nextLine();
        
        //Imprimir cadenas para saber cuales son
        metodo.mostrarCadenas(cadena, cadenaUsuario);
        /*Imprimir el tamaño de las cadenas, primera y segunda*/
        metodo.tamanoDeLasCadena(cadena, cadenaUsuario);
        //Imprimir la primera cadena en mayusculas
        metodo.mayusculasCadena(cadena);
        //Imprimir la segunda cadena en minusculas
        metodo.minusuculasCadena(cadenaUsuario);
        //Imprimir el caracter seleccionado por el usuario de las dos cadenas
        metodo.caracterCadaCadena(cadena, cadenaUsuario);
        //Imprimir la concatenacion de las cadenas
        metodo.concatenarCadaCadena(cadena, cadenaUsuario);
        //Imprimir la porcion dada por el sistema
        metodo.porsicionCadena(cadena);
        //Imprimir el numero del texto paso
        metodo.posicionPasoCadena(cadena);
        //Imprimir si termina con palabra amor si o no
        metodo.terminarTextoAmorCadena(cadenaUsuario);
        //Imprimir la primer cadena u en vez de las a
        metodo.remplazoAPorU(cadena);
        //Imprimri si ahi igualdad entre las cadenas
        metodo.igualdadCadenas(cadena, cadenaUsuario);
        //Imprimir la cadena 2 en un arreglo
        //metodo.arrayCadena(cadenaUsuario, letras);
        //Imprimir la cadena 1 sin espacios
        metodo.eliminacionEspaciosCadena(cadena);
    }
    
    void mostrarCadenas (String cadena, String cadenaUsuario){
        System.out.println("\nPrimer cadena: "+cadena);
        System.out.println("\nSegunda cadena: "+cadenaUsuario);
    }
    
    //1. Metodo para tamaño de las cadenas
    void tamanoDeLasCadena (String cadena, String cadenaUsuario){
        System.out.println("\nTamaño Primer Cadena> "+cadena.length()); //Para saber el tamaño de la cadena
        System.out.println("\nTamaño Segunda Cadena> "+cadenaUsuario.length());  //Para saber el tamaño de la cadena
    }
    
    //2. Metodo para mayusculas de la cadena 1
    void mayusculasCadena (String cadena){
        System.out.println("\nPrimer Cadena Mayusculas> "+cadena.toUpperCase()); //devolver la cadena en mayusculas
    }
    
     //3. Metodo para minusculas de la cadena 2
    void minusuculasCadena (String cadenaUsuario){
        System.out.println("\nSegunda Cadena Minusculas> "+cadenaUsuario.toLowerCase());//Devolver la cadena en minusculas
    }
    
    
    //3. Metodo caracter seleccionado de las cadenas
    void caracterCadaCadena (String cadena, String cadenaUsuario){
        Scanner sc = new Scanner(System.in); //Declaraci[on de Scanner
        System.out.println("\nIndique el numero del caracter que quiere ver"); //Pregunta por caracter
        int j = sc.nextInt();   //Obtiene el numero del caracter
        
        char caracter1 = cadena.charAt(j); //caracter1 valdrá j que es el numero dado por el usuario
        char caracter2 = cadenaUsuario.charAt(j); //caracter2 valdrá j que es el numero dado por el usuario
        
        System.out.println("\nEl caracter de la Primera Cadena es> "+caracter1); //Para saber el caracter de la primera cadena
        System.out.println("\nEl caracter de la Segunda Cadena es> "+caracter2); //Para saber el caracter de la segunda cadena
    }
    
    //4. Metodo concatenacion de las cadenas
    void concatenarCadaCadena (String cadena, String cadenaUsuario){
        String cd3;     //declaracion de la variable que guarda la concatenacion de las cadenas
        cd3 = cadena.concat(cadenaUsuario);     //concatenacion de las cadenas
        
        System.out.println("\nLas Cadenas concatenas> "+cd3);   //Para saber la concatenacion de las dos cadenas
    }
    
    //5. Metodo para mostrar solo una porcion de la primera cadena
    void porsicionCadena (String cadena){    
        String cd = cadena.substring(4,9); //declaracion de la porcion, y seleccionar solo la porcion a imprimir
        
        System.out.println("\nLa primer cadena con la porcion dada es de> "+cd);
    }
    
    //6. Metodo para saber el numero de la posicion del texto paso
    void posicionPasoCadena (String cadena){
        
        System.out.println("\nEl numero de la posicion del texto 'paso'>");
        System.out.print(cadena.indexOf("paso")); 
    }
    
    //7. Metodo para saber si termina con palabra amor
    void terminarTextoAmorCadena (String cadenaUsuario){
        System.out.println("\nVerificacion de la segunda cadena, si termina con la palabra amor> ");
        if (cadenaUsuario.endsWith("amor")){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
    }
    
    //8. Metodo para reemplazar letras a por u
    void remplazoAPorU (String cadena){
        System.out.println("\nLa primer cadena reemplazada la letra a por la u> ");
        System.out.print(cadena.replace("a", "u"));
    }
    
    //9. Metodo para saber si ahi igualdad entre las cadenas
    void igualdadCadenas (String cadena, String cadenaUsuario){
        if (cadena.equals (cadenaUsuario)){
            System.out.println("\nSi ahi igualdad");
        }else{
            System.out.println("\nNo ahi igualdad");
        }
    }
    
    /*void arrayCadena (String cadenaUsuario, char [] letras){
        int k=0;
        
        for(int f=0; f<cadenaUsuario.length(); f++){
                letras[f] = cadenaUsuario.charAt(k);
                k++;
            }
    }*/

    void eliminacionEspaciosCadena (String cadena){
        System.out.println("\nLa primera Cadena sin espacios");
        System.out.println(cadena.trim());
    }
    
}
