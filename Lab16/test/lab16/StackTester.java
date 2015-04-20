/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16;

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
    // @Test
    // public void hello() {}
    @Test
    public void LinkedStackTest() {
        IntegerStackTest(new LinkedStack<>());
    }
    
    private void IntegerStackTest(Stack<Integer> stack) {
        stack.push(1);
        stack.push(10);
        stack.push(6);
        
        System.out.println(stack.toString());
        
        try{
            assertTrue(stack.size() == 3);
            assertTrue(stack.peek() == 6);
            assertTrue(stack.pop() == 6);
            assertTrue(stack.pop() == 10);

            assertTrue(stack.size() == 1);
            assertTrue(!stack.isEmpty());
            assertTrue(stack.pop() == 1);
            assertTrue(stack.isEmpty());

            assertTrue(stack.size() == 0);
        }catch(EmptyCollectionException ece) {
            System.err.println("Should not ever be here.");
        }
        
        
    }
    
    @Test 
    public void EmptyTest() {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        
        try{
            stack.peek();
            fail("peek should have thrown an exception!");
        }catch(EmptyCollectionException ece){
        }
        
        try{
            stack.pop();
            fail("pop should have thrown an exception!");
        }catch(EmptyCollectionException ece){
        }
    }
}