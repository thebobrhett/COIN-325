/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/* Bob Rhett - Wednesday, March 18, 2015
 * Represents a 2 dimensional shape.
 * Used as a parent of a derived class to demonstrate inheritance.
 */
public class Shape2D {
    private int angles;
    
    //Constructor
    public Shape2D(int mNumberOfAngles) {
        angles = mNumberOfAngles;
    }
    
    final public int getNumberOfAngles() {
        return angles;
    }
    
    //Overloaded method for calculating the area of a circle
    public double getArea(double mRadius) {
        return Math.PI * Math.pow(mRadius, 2);
    }

    //Overloaded method for calculating the area of a rectangle
    public double getArea(double mWidth, double mHeight) {
        return mWidth * mHeight;
    }
    
    //Overloaded method for calculating the area of a right triangle
    public double getArea(double mWidth, double mHeight, double mHypotenuse) {
        return(mWidth * mHeight) / 2;
    }

    //Overloaded method for calculating the circumference of a circle
    public double getCircumference(double mRadius) {
        return Math.PI * (mRadius * 2);
    }
    
    //Overloaded method for calculating the circumference of a rectangle
    public double getCircumference(double mWidth, double mHeight) {
        return (mWidth + mHeight) * 2;
    }

        //Overloaded method for calculating the circumference of a right triangle
    public double getCircumference(double mWidth, double mHeight, double mHypotenuse) {
        return mWidth + mHeight + mHypotenuse;
    }

}
