/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bob
 */
public class GCDTester {
    
    public GCDTester() {
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

    /* Bob Rhett - Tuesday, March 31, 2015
     *   Demonstrate recursive programming
     *   by calculating greatest common denominator for two integers.
    */
    @Test
        public void GCDTest() {
            assertTrue(DivisorCalc.gcd(3, 9) == 3);
            assertTrue(DivisorCalc.gcd(9, 3) == 3);
            assertTrue(DivisorCalc.gcd(10, 15) == 5);
            assertTrue(DivisorCalc.gcd(15, 10) == 5);
            assertTrue(DivisorCalc.gcd(12, 24) == 12);
            assertTrue(DivisorCalc.gcd(24, 12) == 12);
            assertTrue(DivisorCalc.gcd(30, 42) == 6);
            assertTrue(DivisorCalc.gcd(42, 30) == 6);
            assertTrue(DivisorCalc.gcd(9, 28) == 1); //relatively prime
        }
}
