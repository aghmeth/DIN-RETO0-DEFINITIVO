/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import DIN.model.ModelFactory;
/**
 *
 * @author Ale
 */
public class Aplicacion {
    
    private static ModelFactory ModelFactory() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public static void main(String [] args){
        ModelFactory modelFactory = ModelFactory();
        modelFactory.getModel();
    }

    
}



