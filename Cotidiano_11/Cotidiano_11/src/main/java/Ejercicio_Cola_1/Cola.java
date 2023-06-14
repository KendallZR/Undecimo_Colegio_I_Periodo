/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Cola_1;

/**
 *
 * @author KendallZR
 */

import javax.swing.JOptionPane;

public class Cola {
    //asignando el comportamiento de una cola
    private Nodo inicio, fin;
    String Cola = ""; //para saber el contenido de la cola
    
    //constructor de la cola
    public Cola(){
        inicio=null;
        fin=null;
    }
    
    //Metodos del programa (Cola Vacia)
    public boolean ColaVacia(){
        if (inicio==null){
            return true;
        }else {
            return false;
        }
    }
    
    //Insercion en la cola
    public void Insertar(int info){
        Nodo nuevoNodo=new Nodo();
        nuevoNodo.info=info;
        nuevoNodo.Siguiente=null;
        
        if (ColaVacia()){
            inicio=nuevoNodo;
            fin=nuevoNodo;
        }else{
            fin.Siguiente=nuevoNodo;
            fin=nuevoNodo;
        }
    }
    
    public int Extraer(){
        if(!ColaVacia()){
            int dato=inicio.info;
            
            if(inicio==fin){
                inicio=null;
                fin=null;
            }else{
                inicio=inicio.Siguiente;
            }
            return dato;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    
    //mostrar el contenido
    public void MostrarCola(){
        Nodo buscar = inicio;
        String ColaInvertida=""; //Invertimos una cadena de texto
        while (buscar!=null){
            Cola += buscar.info + "m ";
            buscar=buscar.Siguiente;
        }
        String cadena[]=Cola.split(" ");
        //para invertir la cadena creada con los espacios correctos
        
        for(int i=cadena.length-1; i>=0; i--){
            ColaInvertida += " " +cadena[i];
        }
        JOptionPane.showMessageDialog(null, ColaInvertida);
        Cola="";
    }
}