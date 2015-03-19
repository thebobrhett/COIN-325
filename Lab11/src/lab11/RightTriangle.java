/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/* Bob Rhett - Wednesday, March 18, 2015
 * Represents a right triangle.
 * Subclass of Shape2D to demonstrate inheritance.
 */
public class RightTriangle extends Shape2D {
    private double width;
    private double height;
    private double hypotenuse;
    
    //Constructor
    public RightTriangle(double mWidth, double mHeight) {
        super(3);
        width = mWidth;
        height = mHeight;
        hypotenuse = Math.sqrt((Math.pow(width, 2)) + Math.pow(height, 2));
    }

    public double getArea() {
        return super.getArea(width, height, hypotenuse);
    }

    public double getCircumference() {
        return super.getCircumference(width, height, hypotenuse);
    }
}
