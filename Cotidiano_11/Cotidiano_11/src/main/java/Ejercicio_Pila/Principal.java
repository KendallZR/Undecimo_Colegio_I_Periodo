/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Pila;

/**
 *
 * @author KendallZR
 */

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        int menu=0, Dato_Nodo=0;
        Pila pila=new Pila();
        
        do{
            try{
                menu = Integer.parseInt((JOptionPane.showInputDialog(null,
                        "OPCIONES DE LA PILA\n\n"
                        + "1. Mostrar Pila\n"
                        + "2. Insertar un Nuevo Nodo\n"
                        + "3. Extraer un Nodo\n"
                        + "4. Salir\n\n")));
                
                switch (menu){
                    case 1:
                        pila.MostrarPila();
                        break;
                    case 2:
                        Dato_Nodo=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Digite el peso a incluir en el nodo"));
                        pila.Insertar(Dato_Nodo);
                        break;
                    case 3:
                        if (!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: "
                                        + pila.desapilar());
                        }else{
                            JOptionPane.showMessageDialog(null, "La Pila esta vacia");
                        }
                        break;
                    case 4:
                        menu=4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opcion seleccionada no esta dentro del menu");
                        break;
                }
            } catch (NumberFormatException e){
                
            }
        }while (menu!=4);
    }
}