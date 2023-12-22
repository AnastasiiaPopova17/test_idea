package hw_31;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    @Override
    public double calculateArea() {
        System.out.println("Area of circle with radius " + getRadius() + " is " + Math.PI*radius*radius);
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Perimeter of circle with radius " + getRadius() + " is " + 2*Math.PI*radius);
        return 2*Math.PI*radius;

    }
}
