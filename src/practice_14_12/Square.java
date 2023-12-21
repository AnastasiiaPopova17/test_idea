package practice_14_12;

public class Square extends Figure{
    private double a;

    public Square(String name, double a){
        super(name);
        this.a = a;
    }
    public double findArea(){
        return a*a;
    }


}
