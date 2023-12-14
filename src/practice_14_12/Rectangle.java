package practice_14_12;

public class Rectangle extends Figure{
    public Rectangle(double length, double width){
        super(length,width);
    }
    public void area(){
       System.out.println("Rectangle has area of " + length*width);

    }

    @Override
    public String toString() {
        return super.toString() + " :" + " Rectangle";
    }
}
