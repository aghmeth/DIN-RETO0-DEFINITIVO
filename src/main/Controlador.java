/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import DIN.ui.Vista;
import DIN.model.Modelo;
/**
 *
 * @author Ale
 * Llamamos a los métodos para obtener y mostrar el saludo
 */
public class Controlador {
    public void ejecutar(Modelo modelo, Vista vista){
        String integrade;
        integrade = modelo.getGreeting();
        vista.showGreeting(integrade);
    }
}