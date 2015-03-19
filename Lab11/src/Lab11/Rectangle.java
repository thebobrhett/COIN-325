/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

/* Bob Rhett - Wednesday, March 18, 2015
 * Represents a rectangle.
 * Subclass of Shape2D to demonstrate inheritance.
 */
public class Rectangle extends Shape2D {
    private double width;
    private double height;
    
    //Constructor
    public Rectangle(double mWidth, double mHeight) {
        super(4);
        width = mWidth;
        height = mHeight;
    }

    public double getArea() {
        return super.getArea(width, height);
    }

    public double getCircumference() {
        return super.getCircumference(width, height);
    }
}