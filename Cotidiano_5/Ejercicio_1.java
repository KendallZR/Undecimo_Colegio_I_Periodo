/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosFuncMetodProd;

/**
 *
 * @author KendallZR
 */

import java.util.Scanner; //Biblioteca Scanner

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Declarando el Scanner
        //Declaración de Variables
        int r;
        int l, b, h;
        int lC;
        int aT, bT, cT, baseT, alturaT;
        int aRec, bRec;
        //Petición de figura para el Switch
        System.out.println("""
                           Elija cual figura, desea saber el area y el perimetro:
                           1. Circulo
                           2. Rombo
                           3. Cuadrado
                           4. Triangulo
                           5. Rectangulo""");
        int op = sc.nextInt(); //Obtencion de Datos
        
        //Bucle Switch asegún de lo seleccionado, se imprime los resultados, dados por las funciones
        switch (op){
            case 1: 
                System.out.println("Digite el radio del circulo");
                r = sc.nextInt();
                System.out.println("El area del circulo es de: " +circuloP(r));
                System.out.println("El perimetro del circulo es de: "+circuloA(r));
                break;
            case 2:
                System.out.println("Para saber el Perimetro");
                System.out.println("Digite la longitud de uno de los lados:");
                l = sc.nextInt();
                System.out.println("Para saber el Area");
                System.out.println("Digite la base del rombo");
                b = sc.nextInt();
                System.out.println("Digite la altura del rombo");
                h = sc.nextInt();
                System.out.println("El Perimetro del Rombo es de: "+romboP(l));
                System.out.println("El Area del ROmbo es de: "+romboA(b,h));
                break;
            case 3:
                System.out.println("Para saber el Perimtero y el Area");
                System.out.println("Digite la medida un lado: ");
                lC = sc.nextInt();
                System.out.println("El Perimtero del Cuadrado es de: "+cuadradoP(lC));
                System.out.println("El Area del Cuadrado es de: "+cuadradoA(lC));
                break;
            case 4:
                System.out.println("Para saber el Perimetro");
                System.out.println("Digite la medida de los tres lados");
                aT = sc.nextInt();
                bT = sc.nextInt();
                cT = sc.nextInt();
                System.out.println("Para saber el Area");
                System.out.println("Digite la base");
                baseT = sc.nextInt();
                System.out.println("Digite la altura");
                alturaT = sc.nextInt();
                System.out.println("El Perimetro del Triangulo es de: "+trianguloP(aT, bT, cT));
                System.out.println("El Area del Triangulo es de: "+trianguloA(baseT, alturaT));
                break;
            case 5:
                System.out.println("Para saber el Perimetro y el Area");
                System.out.println("Digite el ancho");
                aRec = sc.nextInt();
                System.out.println("Digite la longitud");
                bRec = sc.nextInt();
                System.out.println("El Perimetro del Rectangulo es de: "+rectanguloP(aRec, bRec));
                System.out.println("El Area del Rectangulo es de: "+rectanguloA(aRec, bRec));
                break;
            default:
                System.out.println("No se encontro esa figura, intentar de nuevo");
        }
                
        
    }
    //Funciones de las Formulas de las Figuras Geometricas
    //Circulo
    public static double circuloP(int r){
        double pC;
        pC=2*13.14*r;
        return pC;
    }
    public static double circuloA(int r){
        double aC;
        aC=13.14*Math.pow(r,2);
        return aC;
    }
    
    //Rombo
    public static double romboP(int l){
        double pR;
        pR=4*l;
        return pR;
    }
    public static double romboA(int b, int h){
        double aR;
        aR=b*h;
        return aR;
    }
    
    //Cuadrado
    public static double cuadradoP(int lC){
        double pCu;
        pCu=4*lC;
        return pCu;
    }
    public static double cuadradoA(int lC){
        double aCu;
        aCu=Math.pow(lC, 2);
        return aCu;
    }
    
    //Triangulo
    public static double trianguloP(int aT, int bT, int cT){
        double pT;
        pT=aT+bT+cT;
        return pT;
    }
    public static double trianguloA(int baseT, int alturaT){
        double aT;
        aT=(baseT*alturaT)/2;
        return aT;
    }
    
    //Rectangulo
    
    /**
     * 
     * @param aRec
     * @param bRec
     * @return 
     */
    public static double rectanguloP(int aRec, int bRec){
        double pRec;
        pRec=2*(aRec+bRec);
        return pRec;
    }
    public static double rectanguloA(int aRec, int bRec){
        double arRec;
        arRec=aRec*bRec;
        return arRec;
    }
}
