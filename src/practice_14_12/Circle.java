package practice_14_12;

public class Circle extends Figure{
    private double radius;
    private static double PI = 3.14;
    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }
    public double findAarea(){
        return PI*radius*radius;
    }
    public String toString(){
        return super.toString() + " , radius =" + radius;
    }


}
