/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotidiano_2;

/**
 *
 * @author KZR
 */
public class PRACT_2 {
    public static void main(String[] args) {
        //Declaración de varibleas 
        //Operadores Artimeticos
        String nom = "Obi-Wan";
        String ap1 = "Kenobi";
        String ap2 = "Skywalker";
        //suma del nombre
        String nomComple = nom + ap1 + ap2;
        
        
        String a = "el";
        String b = "mundo";
        String c = "esta";
        String d = "de cabeza";
        //suma de la frase
        String frase = a + b + c + d;
        
        int n1 = 120;
        int n2 = 34;
        int n3 = 56;
        int n4 = 5;;
        
        //suma
        int sum = n1+n2+n3+n4;
        //resta
        int rest = n1-n2-n3-n4;
        //multiplicacion
        int mult = n1*n2*n3*n4;
        //division
        int div = n1/n2/n3/n4;
        
        //impresion en pantalla de las operaciones
        System.out.println("La Suma: " + sum);
        System.out.println("La Resta: "+ rest);
        System.out.println("La Multiplicación: "+ mult);
        System.out.println("La División: "+ div);
        
        //Operadores Crementales
        n1++;
        //Operadores Incrementales
        n4--;
        
        //Operadores Logicos
        //Invertir valor de condicion
        boolean condicion = true;
        boolean t = !condicion;
        
        //Operadores Combinados
        int h = 5;
        int f = 8;
        int m = 3;
        int r = 4;
        
        //Suma combinada
        h += 6;
        //resta combinada
        f -= 2;
        //multiplicacion combinada
        m *= 2;
        //division combinada
        r /= 1;
        
        //Impresion en pantalla de las operaciones
        System.out.println("\nLa suma combinada es: " + h);
        System.out.println("La resta combinada es: " + f);
        System.out.println("La multiplicación combinada es: " + m);
        System.out.println("La division combinada es: " + r);
    }
}
