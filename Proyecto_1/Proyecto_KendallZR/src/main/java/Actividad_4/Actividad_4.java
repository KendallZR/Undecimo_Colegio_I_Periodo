/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_4;

/**
 *
 * @author KendallZR
 */

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Actividad_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("EEEEE, d MMM yyyy, HH:mm:ss z");
        String date = dateFormat.format(new Date());
        String nombre;
        
        System.out.println("¿Cual es su nombre?");
        nombre = sc.nextLine();
        
        System.out.println("¿Cual es el total de productos que compro?");
        int j = sc.nextInt();
        
        String nombreProduc [] = new String [j];
        int precioProduc [] = new int [j];
        
        System.out.println("Solicitud de Datos");
        
        for(int i=0; i<nombreProduc.length; i++){
            System.out.println("Digite el nombre del producto ");
            nombreProduc[i] = sc.next();
        }
        
        for(int p=0; p<precioProduc.length; p++){
            System.out.println("\nDigite el precio del producto ");
            precioProduc [p] = sc.nextInt();
        }
        
        System.out.println("\n\nFactura del: ");
        System.out.println(date);
        System.out.println("Cliente: "+nombre);
        
        System.out.println("\nProductos        Precios"); 
       
            for (int y = 0; y<precioProduc.length; y++) {
                System.out.println(nombreProduc[y] + "              " + precioProduc[y]);
            } //Impresion para el Arreglo ordenado 
            
        System.out.println("--------------------------");
        
        System.out.println("SUBTOTAL:   "+ subTotalCompra(precioProduc));
        System.out.println("IVA:        "+ ivaCompra(precioProduc));
        
        System.out.println("--------------------------");
        
        System.out.println("TOTAL:      "+totalCompra(precioProduc));
        
    }
    
    public static int subTotalCompra (int [] precioProduc){
        int sum=0;
        for(int i=0; i<precioProduc.length; i++){     //for para saber la sumatoria del arreglo
           sum += precioProduc[i];
        }
       
       return sum;
    }
    
    public static float ivaCompra(int [] precioProduc){
        float iva = (float) 0.13; 
        float impuesto;
        
        impuesto = subTotalCompra(precioProduc)*iva;
        
        return impuesto;
    }
 
    public static int totalCompra (int [] precioProduc){
        int total;
        
        total= (int) (subTotalCompra(precioProduc) + ivaCompra(precioProduc));
        
        return total;
    }
}
