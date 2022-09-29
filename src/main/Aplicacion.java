/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import DIN.model.ModelFactory;
import DIN.model.Modelo;
import DIN.ui.Ventana;
import DIN.ui.ViewFactory;
import main.Controlador;
/**
 *
 * @author Diego
 * Desde Aplicacion llamamos a los métodos getModel y getVista y construimos el controlador
 */
public class Aplicacion { 
    
    /*private static ModelFactory ModelFactory() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }*/
    
        public static void main(String [] args){
        Controlador controller = new Controlador();
        ModelFactory modelfact = new ModelFactory();
        ViewFactory vistafact = new ViewFactory();
        
        controller.ejecutar(modelfact.getModel(), vistafact.getvista());   
       
    }
}