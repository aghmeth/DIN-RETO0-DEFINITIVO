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
public class ModelFactoryTest {
    
    public ModelFactoryTest() {
    }

    /**
     * Test of getModel method, of class ModelFactory.
     */
    @Test
    public void testGetModel() {
        System.out.println("getModel");
        ModelFactory instance = new ModelFactory();
        Modelo expResult = null;
        Modelo result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
