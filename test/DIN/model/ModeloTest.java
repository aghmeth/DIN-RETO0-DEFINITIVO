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
public class ModeloTest {
    
    public ModeloTest() {
    }

    /**
     * Test of getGreeting method, of class Modelo.
     */
    @Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        Modelo instance = new ModeloImpl();
        String expResult = "";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    public class ModeloImpl implements Modelo {

        public String getGreeting() {
            return "";
        }
    }
    
}
