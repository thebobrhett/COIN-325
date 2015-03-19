/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

import lab11.RightTriangle;
import lab11.Rectangle;
import lab11.Circle;
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

    final private double tolerance = 0.1;

    @Test
    public void testRightTriangle() {
        RightTriangle myTriangle = new RightTriangle(2.0, 3.0);
        
        //Query Area
        double expectedArea = 3.0;
        System.out.println("The area of the triangle is " + myTriangle.getArea());
        System.out.println("The expected result is " + expectedArea);
        System.out.println("The difference is " + Math.abs(myTriangle.getArea() - expectedArea));
        assertEquals(expectedArea, myTriangle.getArea(), tolerance);

        //Query Circumference
        double expectedCircumference = 8.6;
        System.out.println("The circumference of the triangle is " + myTriangle.getCircumference());
        System.out.println("The expected result is " + expectedCircumference);
        System.out.println("The difference is " + (Math.abs(myTriangle.getCircumference() - expectedCircumference)));
        assertEquals(expectedCircumference, myTriangle.getCircumference(), tolerance);

        //Query number of angles
        int expectedAngles = 3;
        System.out.println("The number of angles of the triangle is " + myTriangle.getNumberOfAngles());
        System.out.println("The expected result is " + expectedAngles);
        System.out.println("The difference is " + (myTriangle.getNumberOfAngles() - expectedAngles));
        assertTrue(myTriangle.getNumberOfAngles() == expectedAngles);
    }

    @Test
    public void testRectangle() {
        Rectangle myRectangle = new Rectangle(2.0, 3.0);
        
        //Query Area
        double expectedArea = 6.0;
        System.out.println("The area of the rectangle is " + myRectangle.getArea());
        System.out.println("The expected result is " + expectedArea);
        System.out.println("The difference is " + Math.abs(myRectangle.getArea() - expectedArea));
        assertEquals(expectedArea, myRectangle.getArea(), tolerance);

        //Query Circumference
        double expectedCircumference = 10.0;
        System.out.println("The circumference of the rectangle is " + myRectangle.getCircumference());
        System.out.println("The expected result is " + expectedCircumference);
        System.out.println("The difference is " + (Math.abs(myRectangle.getCircumference() - expectedCircumference)));
        assertEquals(expectedCircumference, myRectangle.getCircumference(), tolerance);

        //Query number of angles
        int expectedAngles = 4;
        System.out.println("The number of angles of the rectangle is " + myRectangle.getNumberOfAngles());
        System.out.println("The expected result is " + expectedAngles);
        System.out.println("The difference is " + (myRectangle.getNumberOfAngles() - expectedAngles));
        assertTrue((myRectangle.getNumberOfAngles() - expectedAngles) < tolerance);
    }

    @Test
    public void testCircle() {
        Circle myCircle = new Circle(3.0);
        
        //Query Area
        double expectedArea = 28.27;
        System.out.println("The area of the circle is " + myCircle.getArea());
        System.out.println("The expected result is " + expectedArea);
        System.out.println("The difference is " + Math.abs(myCircle.getArea() - expectedArea));
        assertEquals(expectedArea, myCircle.getArea(), tolerance);

        //Query Circumference
        double expectedCircumference = 18.85;
        System.out.println("The circumference of the circle is " + myCircle.getCircumference());
        System.out.println("The expected result is " + expectedCircumference);
        System.out.println("The difference is " + (Math.abs(myCircle.getCircumference() - expectedCircumference)));
        assertEquals(expectedCircumference, myCircle.getCircumference(), tolerance);

        //Query number of angles
        int expectedAngles = 0;
        System.out.println("The number of angles of the circle is " + myCircle.getNumberOfAngles());
        System.out.println("The expected result is " + expectedAngles);
        System.out.println("The difference is " + (myCircle.getNumberOfAngles() - expectedAngles));
        assertTrue(myCircle.getNumberOfAngles() == expectedAngles);
    }
}
