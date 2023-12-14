package practice_14_12;

public class Figure {
    double length;
    double width;

    public Figure(double length, double width){
        this.length = length;
        this.width = width;
    }
    public Figure(){

    }
    public void area(){
        System.out.println(length*width);

    }

    @Override
    public String toString() {
        return "Figure " + "with " +
                "length=" + length +
                ", width=" + width;
    }
}
