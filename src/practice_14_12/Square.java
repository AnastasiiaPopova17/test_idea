package practice_14_12;

public class Square extends Figure{
    public Square(double length, double width){
        super(length,width);
    }
    public void area(){
        System.out.println("Square has area of " + width*length);
    }

    @Override
    public String toString() {
        return  super.toString() + " :" +
                " Square";
    }
}
