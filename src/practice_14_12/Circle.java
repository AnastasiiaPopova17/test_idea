package practice_14_12;

public class Circle extends Figure{
    double r;
    public Circle(double r){
        this.r = r;
    }
    public void area(){
        System.out.println("Circle has area of  " + Math.PI*r*r);
    }

    @Override
    public String toString() {
        return "Figure " + " with " + "r=" + r + " : Circle";

    }
}
