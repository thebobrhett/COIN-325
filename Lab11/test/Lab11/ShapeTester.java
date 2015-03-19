/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/* Bob Rhett - Wednesday, March 18, 2015
 * For testing a 2 dimensional shape.
 */
public class ShapeTester {
    
    public ShapeTester() {
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
    public void testRightTriangle() {
        RightTriangle myTriangle = new RightTriangle(2, 3);
        double expectedResult;
        final double tolerance = 0.1;
        
        //Query Area
        expectedResult = 3.0;
        System.out.println("The area of the triangle is " + myTriangle.getArea());
        System.out.println("The expected result is " + expectedResult);
        System.out.println("The difference is " + Math.abs(myTriangle.getArea() - expectedResult));
        assertTrue(Math.abs((myTriangle.getArea() - expectedResult)) < tolerance);

        //Query Circumference
        expectedResult = 8.6;
        System.out.println("The circumference of the triangle is " + myTriangle.getCircumference());
        System.out.println("The expected result is " + expectedResult);
        System.out.println("The difference is " + (Math.abs(myTriangle.getCircumference() - expectedResult)));
        assertTrue(Math.abs(myTriangle.getCircumference() - expectedResult) < tolerance);

        //Query number of angles
        expectedResult = 3;
        System.out.println("The number of angles of the triangle is " + myTriangle.getNumberOfAngles());
        System.out.println("The expected result is " + expectedResult);
        System.out.println("The difference is " + (myTriangle.getNumberOfAngles() - expectedResult));
        assertTrue((myTriangle.getNumberOfAngles() - expectedResult) < tolerance);
    }

    @Test
    public void testRectangle() {
        Rectangle myRectangle = new Rectangle(2, 3);
        double expectedResult;
        final double tolerance = 0.1;
        
        //Query Area
        expectedResult = 6.0;
        System.out.println("The area of the rectangle is " + myRectangle.getArea());
        System.out.println("The expected result is " + expectedResult);
        System.out.println("The difference is " + Math.abs(myRectangle.getArea() - expectedResult));
        assertTrue(Math.abs((myRectangle.getArea() - expectedResult)) < tolerance);

        //Query Circumference
        expectedResult = 10.0;
        System.out.println("The circumference of the rectangle is " + myRectangle.getCircumference());
        System.out.println("The expected result is " + expectedResult);
        System.out.println("The difference is " + (Math.abs(myRectangle.getCircumference() - expectedResult)));
        assertTrue(Math.abs(myRectangle.getCircumference() - expectedResult) < tolerance);

        //Query number of angles
        expectedResult = 4;
        System.out.println("The number of angles of the rectangle is " + myRectangle.getNumberOfAngles());
        System.out.println("The expected result is " + expectedResult);
        System.out.println("The difference is " + (myRectangle.getNumberOfAngles() - expectedResult));
        assertTrue((myRectangle.getNumberOfAngles() - expectedResult) < tolerance);
    }

    @Test
    public void testCircle() {
        Circle myCircle = new Circle(3);
        double expectedResult;
        final double tolerance = 0.1;
        
        //Query Area
        expectedResult = 28.27;
        System.out.println("The area of the circle is " + myCircle.getArea());
        System.out.println("The expected result is " + expectedResult);
        System.out.println("The difference is " + Math.abs(myCircle.getArea() - expectedResult));
        assertTrue(Math.abs((myCircle.getArea() - expectedResult)) < tolerance);

        //Query Circumference
        expectedResult = 18.85;
        System.out.println("The circumference of the circle is " + myCircle.getCircumference());
        System.out.println("The expected result is " + expectedResult);
        System.out.println("The difference is " + (Math.abs(myCircle.getCircumference() - expectedResult)));
        assertTrue(Math.abs(myCircle.getCircumference() - expectedResult) < tolerance);

        //Query number of angles
        expectedResult = 0;
        System.out.println("The number of angles of the circle is " + myCircle.getNumberOfAngles());
        System.out.println("The expected result is " + expectedResult);
        System.out.println("The difference is " + (myCircle.getNumberOfAngles() - expectedResult));
        assertTrue((myCircle.getNumberOfAngles() - expectedResult) < tolerance);
    }
}
