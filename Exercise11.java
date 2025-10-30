/*
 * Name: Triangle Polygon
 * Purpose: To store and get data about a triangle as an extension of polygons in general.
 * Programmer: Biruk Yidnekachew
 * Date: 29 October 2025
 */

public class Exercise11 {
    public static void main(String[] args) {
        // Constructs new Triangle object and sets data fields from GeometricObject class
        Triangle triangle = new Triangle(1, 1.5, 1);
        triangle.setColor("yellow");
        triangle.setFilled(true);

        // Tests output of methods
        System.out.println(triangle);
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
        System.out.println(triangle);
    }
}

// GeometricObject class from Revel textbook
public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    
    /** Construct a default geometric object */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with the specified color 
    * and filled value */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    
    /** Return color */
    public String getColor() {
        return color;
    }
    
    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }
    
    /** Return filled. Since filled is boolean,
    * its get method is named isFilled */
    public boolean isFilled() {
        return filled;
    }
    
    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    
    /** Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}

// Creates class for Triangle objects based on GeometricObject class
public class Triangle extends GeometricObject {
    // Declares variables for Triangle class
    private double side1;
    private double side2;
    private double side3;

    /** No arg constructor to create a default Triangle object */
    public Triangle(){
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    /** Constructor for Triangle object based on specified side lengths */
    public Triangle(double newSide1, double newSide2, double newSide3){
        this.side1 = newSide1;
        this.side2 = newSide2;
        this.side3 = newSide3;
    }

    /** Accessor methods for each Triangle object side */
    public double getSide1(){
        return this.side1;
    }
    public double getSide2(){
        return this.side2;
    }
    public double getSide3(){
        return this.side3;
    }

    /** Calculates and returns Triangle object Area based on Heron's Formula */
    public double getArea(){
        double semiPerimeter = this.getPerimeter() / 2;
        return Math.sqrt((semiPerimeter) * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));;
    }
    /** Calculates and returns Triangle object Perimeter */
    public double getPerimeter(){
        return (this.side1 + this.side2 + this.side3);
    }

    /** Overrides GeometricObject toString method and returns string with details about Triangle object's side lengths */
    public String toString(){
        return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
    }
}
