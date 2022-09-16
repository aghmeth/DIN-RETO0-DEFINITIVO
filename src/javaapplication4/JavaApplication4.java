/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

 /*
 * @author Ale
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Properties saludo = new Properties();
        
        try{
        saludo.load(new FileInputStream(new File("PropiedadSaludo.properties")));
        System.out.println(saludo.get("SALUDO"));
        }catch(FileNotFoundException e){
                //e.printStackTrace();
                System.out.print("Archivo no encontrado\n");
        }catch (IOException e) {
                //e.printStackTrace();
                System.out.print("Error");
        }
        System.out.print(saludo.get("Saludo"));
    }
    
}
