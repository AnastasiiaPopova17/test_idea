package hw_22;

public class Calculator {
    double a;
    double b;
    double c;

    public Calculator(double a, double b){
        this.a = a;
        this.b = b;
    }
    public Calculator(double a, double b, double c){
        this(a,b);
        this.c = c;
    }


}
