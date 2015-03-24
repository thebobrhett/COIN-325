/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/* Bob Rhett - Tuesday, March 24, 2015
 * 
 * 
 */
public class ListTester {
    
    public ListTester() {
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
    public void SLinkedListTest() {
        listTest(new SLinkedList());
    }
    
    @Test
    public void SArrayListTest() {
        listTest(new ArrayList());
    }
    
    public void listTest(List list) {
        list.add(new Integer(10));
        list.add(new Integer(11));
        list.add(new Integer(12));
        assertTrue(list.size() == 3);
        
        list.add(new Integer(13));
        list.add(new Integer(14));
        list.add(new Integer(15));
        assertTrue(list.size() == 6);
        
        assertTrue(list.get(0).equals(new Integer(10)));
        assertTrue(list.get(1).equals(new Integer(11)));
        assertTrue(list.get(2).equals(new Integer(12)));
        assertTrue(list.get(3).equals(new Integer(13)));
        assertTrue(list.get(4).equals(new Integer(14)));
        assertTrue(list.get(5).equals(new Integer(15)));
    }
}
