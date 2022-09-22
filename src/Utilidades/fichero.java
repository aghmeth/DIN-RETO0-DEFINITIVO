/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.File;
import java.io.Serializable;
import java.io.FileOutputStream;
/**
 *
 * @author Ale
 */
public class fichero implements Serializable{
    File fich = new File("fich.txt");
    
   /* try {
        FileOutputStream fos = new FileOutputStream(fich);
        
    }catch (FileNotFoundException ex) {
    
    }
}

