public class Exercise11 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1.5, 1);
        triangle.setColor("yellow");
        triangle.setFilled(true);
        
        System.out.println(triangle);
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
        System.out.println(triangle);
    }
}


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

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(){
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    
    public Triangle(double newSide1, double newSide2, double newSide3){
        this.side1 = newSide1;
        this.side2 = newSide2;
        this.side3 = newSide3;
    }
    
    public double getSide1(){
        return this.side1;
    }
    public double getSide2(){
        return this.side2;
    }
    public double getSide3(){
        return this.side3;
    }
    
    public double getArea(){
        return 1.0;
    }
    public double getPerimeter(){
        return (this.side1 + this.side2 + this.side3);
    }
    
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
