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
public class ModeloImplementacionFichTest {
    
    public ModeloImplementacionFichTest() {
    }

    /**
     * Test of getGreeting method, of class ModeloImplementacionFich.
     */
    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        ModeloImplementacionFich instance = new ModeloImplementacionFich();
        String expResult = "";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
