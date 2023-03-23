/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosFuncMetodProd;

/**
 *
 * @author CTPG
 */

public class Ejercicio_4_3 {
    public static void main(String[] args) {
      Ejercicio_4_3 tablaMult = new Ejercicio_4_3(); //Estanciamiento 
      //Llamado del Procedimiento que hace la tabla
      tablaMult.tabla();
    }
    //Procedimiento que hace las tablas de multiplicar del 1 al 6, con un bucle de for-for
    void tabla(){
    int result=0;
    int multiplo;
        for (int tabla=1;tabla<=6;tabla++){
            System.out.println("La tabla del "+tabla); 
            
            for (multiplo=1;multiplo<10;multiplo++){
            result=multiplo*tabla;
            System.out.println(tabla+" * "+multiplo+" es "+result); //resultados
            }
        }
    }
}
