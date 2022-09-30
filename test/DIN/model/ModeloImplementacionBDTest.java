/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIN.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ale
 */
public class ModeloImplementacionBDTest {
    
    public ModeloImplementacionBDTest() {
    }

    /**
     * Test of openConnection method, of class ModeloImplementacionBD.
     */
    @Test
    public void testOpenConnection() {
        System.out.println("openConnection");
        ModeloImplementacionBD instance = new ModeloImplementacionBD();
        instance.openConnection();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of closeConnection method, of class ModeloImplementacionBD.
     */
    @Test
    public void testCloseConnection() throws Exception {
        System.out.println("closeConnection");
        ModeloImplementacionBD instance = new ModeloImplementacionBD();
        instance.closeConnection();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getGreeting method, of class ModeloImplementacionBD.
     */
    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        ModeloImplementacionBD instance = new ModeloImplementacionBD();
        String expResult = "QUE TAL GENTE";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
