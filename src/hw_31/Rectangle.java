package hw_31;

public class Rectangle implements Shape{
    double length;
    double width;
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        System.out.println("Area of Rectangle with " + length + " length and " + width +
                " width is " + length*width );
        return length*width;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Perimeter of Rectangle with " + length + " length and " + width +
                " width is " + 2*(length+width));
        return 2*(length+width);

    }
}
