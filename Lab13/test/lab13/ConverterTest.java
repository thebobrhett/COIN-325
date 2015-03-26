/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/* Bob Rhett - Thursday, March 26, 2015
 *   To test Convert Unicode string to integer class.
 *   To demonstrate exception handling.
 */
public class ConverterTest {
    
    public ConverterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    //Demonstrate try/catch exception handling
    public void ConverterTest() {
        String str = new String();
        try {
            assertTrue(Converter.utoi("10").equals(new Integer(10)));
            assertTrue(Converter.utoi("not a number") == null);
        } catch (NumberFormatException exception) {
            System.out.println("Not a number!");
        }
    }
}
