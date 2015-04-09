/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab15;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bob
 */
public class StackTester {
    
    public StackTester() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void StackTest() {
        ArrayStack mStack = new ArrayStack();

        //stack should have the default capacity
        assertTrue(mStack.getCapacity() == 10);
        //Stack should be empty
        assertTrue(mStack.isEmpty());
        //Stack should have 0 elements
        assertTrue(mStack.size() == 0);
        
        //push an element onto the stack
        assertTrue(mStack.push("Element1") == 1);
        
        //Stack should not be empty
        assertFalse(mStack.isEmpty());
        //Stack should have 1 element1
        assertTrue(mStack.size() == 1);
        
        //push another element onto the stack
        assertTrue(mStack.push("Element2") == 2);
        
        //Top element should be "Element2"
        try {
            assertTrue(mStack.peek().equals("Element2"));
        } catch (EmptyCollectionException exception) {
            System.out.println("The stack is empty");
        }
        
        //fill the stack to capacity
        for (int i = 3; i <= 10; i++) {
            assertTrue(mStack.push("Element" + 1) == i);
        }
        
        //Stack should be expanded
        assertTrue(mStack.push("Element11") == 11);
        //Stack should have 11 elements
        assertTrue(mStack.size() == 11);
         //stack should have the double the default capacity
        assertTrue(mStack.getCapacity() == 20);

        //pop "Element11"
        try {
            assertTrue(mStack.pop().equals("Element11"));
        } catch (EmptyCollectionException exception) {
            System.out.println("The stack is empty");
        }

        //Stack should have 10 elements
        assertTrue(mStack.size() == 10);
        
        //pop all remaining elements
        for (int i = 1; i <= 10; i++) {
            try {
                mStack.pop();
            } catch (EmptyCollectionException exception) {
                System.out.println("The stack is empty");
            }
        }

        //Stack should be empty
        assertTrue(mStack.isEmpty());
        //Stack should have 0 elements
        assertTrue(mStack.size() == 0);
    }

    @Test
    public void EmptyStackTest() {
        ArrayStack mStack = new ArrayStack();

        //Stack should be empty
        try {
            assertTrue(mStack.peek().equals("Element2"));
        } catch (EmptyCollectionException exception) {
            System.out.println("The stack is empty");
        }

        try {
            assertTrue(mStack.pop().equals("Element11"));
        } catch (EmptyCollectionException exception) {
            System.out.println("The stack is empty");
        }

    }
}
