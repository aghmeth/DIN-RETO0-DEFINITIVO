/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIN.ui;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ale
 */
public class ViewFactoryTest {
    
    public ViewFactoryTest() {
    }

    /**
     * Test of getvista method, of class ViewFactory.
     */
    @Test
    public void testGetvista() {
        System.out.println("getvista");
        ViewFactory instance = new ViewFactory();
        Vista expResult = null;
        Vista result = instance.getvista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
