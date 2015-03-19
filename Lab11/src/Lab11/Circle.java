/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

/* Bob Rhett - Wednesday, March 18, 2015
 * Represents a circle.
 * Subclass of Shape2D to demonstrate inheritance.
 */
public class Circle extends Shape2D {
    private double radius;
    
    //Constructor
    public Circle(double mRadius) {
        super(0);
        radius = mRadius;
    }

    public double getArea() {
        return super.getArea(radius);
    }

    public double getCircumference() {
        return super.getCircumference(radius);
    }

}
