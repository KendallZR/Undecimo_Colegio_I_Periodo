/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad_1;

/**
 *
 * @author KendallZR
 */


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Actividad_1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in); //Declaracion de Scanner
        
        //Declaracion de Variable
        String ced [] = new String [7];
        String nom [] = new String [7];
        String gen [] = new String [7];
        double sala[] = new double [7];
        double horExt [] = new double [7];
        double salarioExtra [] = new double [7];
        double agui [] = new double [7];
        
        //salExtra (sala, horExt);
        //aguinaldo (sala, salExtra(sala, horExt));
        
        /*Bucle for para obtener todos los datos de los 7 trabajadores, 
        y adentro de cada dato, un bucle para validar que la informacion
        dada es correspondiente a como se desea, y si no que se vuelva a 
        preguntar para obtenerla*/
        for (int i = 0; i < 7; i++) {
            String cedula = JOptionPane.showInputDialog("Ingrese la Cédula " + (i + 1));
            if (cedula == null || cedula.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La cédula está en blanco. Por favor, ingrese un valor válido.");
                i--; // Restar 1 a i para repetir el bucle
            } else {
                ced[i] = cedula;
            }
            
            String nombre = JOptionPane.showInputDialog("Ingrese el Nombre " + (i + 1));
            if (nombre == null || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El Nombre está en blanco. Por favor, ingrese un valor válido.");
                i--; // Restar 1 a i para repetir el bucle
            } else {
                nom[i] = nombre;
            }
            
            String genero = JOptionPane.showInputDialog("Ingrese su Genero m / f " + (i + 1));
            if (genero == null || genero.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El Genero está en blanco. Por favor, ingrese un valor válido.");
                i--; // Restar 1 a i para repetir el bucle
            } else {
                gen[i] = genero;
            }
            
            double salarioMen;
            
            String salario = JOptionPane.showInputDialog("Ingrese su salario Mensual " + (i + 1));
            if (salario == null || salario.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El Salario está en blanco. Por favor, ingrese un valor válido.");
                i--; // Restar 1 a i para repetir el bucle
            } else {
                salarioMen = Double.parseDouble(salario);
                sala[i] = salarioMen;
            }
            
            int horasEx;
            
            String horas = JOptionPane.showInputDialog("Ingrese sus horas extras anuales " + (i + 1));
            if (horas == null || horas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El Salario está en blanco. Por favor, ingrese un valor válido.");
                i--; // Restar 1 a i para repetir el bucle
            } else {
                horasEx = Integer.parseInt(horas);
                 horExt[i] = horasEx;
            }
            
        }
      
                
                
         for(int i=0; i<7; i++){
           System.out.println(nom[i] + " " + ced[i] + " " + gen [i] + " " + sala[i] + "" + horExt[i] + "" + Arrays.toString (salExtra (sala, horExt)) + " " + Arrays.toString (aguinaldo (sala, salExtra (sala, horExt))));      //Impresion para el Arreglo ordenado 
        }
         
         /*Blank workbook
        XSSFWorkbook workbook = new XSSFWorkbook(); 
         
        //Create a blank sheet
        XSSFSheet sheet = workbook.createSheet("Trabajadores");
          
        //This data needs to be written (Object[])
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[] {"ID", "NOMRE", "GENERO, SALARIO MENSUAL, HORAS EXTRAS, SALARIO EXTRA, AGUINALDO"});
        data.put("2", new Object[] {ced[7], nom[7], gen [7], sala[7], horExt[7], salExtra (sala, horExt), aguinaldo (sala, salExtra(sala, horExt))});
        data.put("3", new Object[] {ced[7], nom[7], gen [7], sala[7], horExt[7], salExtra (sala, horExt), aguinaldo (sala, salExtra(sala, horExt))});
        data.put("4", new Object[] {ced[7], nom[7], gen [7], sala[7], horExt[7], salExtra (sala, horExt), aguinaldo (sala, salExtra(sala, horExt))});
        data.put("5", new Object[] {ced[7], nom[7], gen [7], sala[7], horExt[7], salExtra (sala, horExt), aguinaldo (sala, salExtra(sala, horExt))});
        data.put("6", new Object[] {ced[7], nom[7], gen [7], sala[7], horExt[7], salExtra (sala, horExt), aguinaldo (sala, salExtra(sala, horExt))});
        data.put("7", new Object[] {ced[7], nom[7], gen [7], sala[7], horExt[7], salExtra (sala, horExt), aguinaldo (sala, salExtra(sala, horExt))});
        
        //Iterate over data and write to sheet
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset)
        {
            Row row = sheet.createRow(rownum++);
            Object [] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr)
            {
               Cell cell = row.createCell(cellnum++);
               if(obj instanceof String)
                    cell.setCellValue((String)obj);
                else if(obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
        try
        {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("Proyecto_Ejercicio_1.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("Proyecto_Ejercicio_1.xlsx written successfully on disk.");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }*/
         
         
          // Se crea el libro
        HSSFWorkbook libro = new HSSFWorkbook();

        // Se crea una hoja dentro del libro
        HSSFSheet hoja = libro.createSheet();

        // Se crea una fila dentro de la hoja
        HSSFRow fila = hoja.createRow(0);

        // Se crea una celda dentro de la fila
        HSSFCell celda = fila.createCell((short) 0);

        // Se crea el contenido de la celda y se mete en ella.
        for(int i=0; i<7; i++){
        HSSFRichTextString texto = new HSSFRichTextString(nom[i] + " " + ced[i] + " " + gen [i] + " " + sala[i] + "" + horExt[i] + "" + Arrays.toString (salExtra (sala, horExt)) + " " + Arrays.toString (aguinaldo (sala, salExtra (sala, horExt)))); 
        celda.setCellValue(texto);
        }

        // Se salva el libro.
        try {
            FileOutputStream elFichero = new FileOutputStream("proyecto.xls");
            libro.write(elFichero);
            elFichero.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public static double []salExtra (double [] sala, double [] horExt){
        double [] salarioExtra = new double [7];
        
        for(int i=0; i<7; i++){
        salarioExtra [i]= ((sala[i]/30)*1.5)*horExt[i];
        }
        return salarioExtra;
    }
    
    public static double []aguinaldo (double [] sala, double []salExtra){
        double [] agui = new double [7];
        
        for(int i=0; i<7; i++){
        agui [i] = ((sala[i]*12+salExtra[i])*12);
        }
        return agui;
    }
    
    
}
        //JOptionPane.showMessageDialog(null, cedula );