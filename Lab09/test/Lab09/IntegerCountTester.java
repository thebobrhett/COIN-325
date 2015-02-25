/****************
Bob Rhett - Tuesday, February 24, 2015
  JUnit Tester for Integer Counter program.
  Initial release
****************/
package Lab09;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerCountTester {
    
    public IntegerCountTester() {
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
    public void IntegerCountTest1() {
        String strTest = "1 2 4 4 5";
        System.out.println("Test 1 input:");
        System.out.println(strTest);
        IntegerCount iCnt = new IntegerCount();
        iCnt.putIntegers(strTest);
        System.out.println("Test 1 output:");
        System.out.println(iCnt.getIntegers());
        assertTrue(iCnt.getIntegers().equals("1: 1\n2: 1\n4: 2\n5: 1\n"));
    }

    @Test
    public void IntegerCountTest2() {
        String strTest = "1 40 1 40 40";
        System.out.println("Test 2 input:");
        System.out.println(strTest);
        IntegerCount iCnt = new IntegerCount();
        iCnt.putIntegers(strTest);
        System.out.println("Test 2 output:");
        System.out.println(iCnt.getIntegers());
        assertTrue(iCnt.getIntegers().equals("1: 2\n40: 3\n"));
    }

        @Test
    public void IntegerCountTest3() {
        String strTest = "1 0 1 0 0";
        System.out.println("Test 3 input:");
        System.out.println(strTest);
        IntegerCount iCnt = new IntegerCount();
        iCnt.putIntegers(strTest);
        System.out.println("Test 3 output:");
        System.out.println(iCnt.getIntegers());
        assertTrue(iCnt.getIntegers().equals("1: 2\n0: 3\n"));
    }

@Test
    public void IntegerCountTest4() {
        String strTest = "1 5 -4 101 5";
        System.out.println("Test 4 input:");
        System.out.println(strTest);
        IntegerCount iCnt = new IntegerCount();
        iCnt.putIntegers(strTest);
        System.out.println("Test 4 output:");
        System.out.println(iCnt.getIntegers());
        assertTrue(iCnt.getIntegers().equals("1: 1\n5: 2\n"));
    }

    @Test
    public void IntegerCountTest5() {
        String strTest = "0 0 0 99 99 1024 1024 1024";
        System.out.println("Test 5 input:");
        System.out.println(strTest);
        IntegerCount iCnt = new IntegerCount();
        iCnt.putIntegers(strTest);
        System.out.println("Test 5 output:");
        System.out.println(iCnt.getIntegers());
        assertTrue(iCnt.getIntegers().equals("0: 3\n99: 2\n"));
    }

    @Test
    public void IntegerCountTest6() {
        String strTest = "1024 1024 1024 99 99 0 0 0";
        System.out.println("Test 6 input:");
        System.out.println(strTest);
        IntegerCount iCnt = new IntegerCount();
        iCnt.putIntegers(strTest);
        System.out.println("Test 6 output:");
        System.out.println(iCnt.getIntegers());
        assertTrue(iCnt.getIntegers().equals("99: 2\n0: 3\n"));
    }
}
