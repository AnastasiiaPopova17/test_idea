package hw_31;

public class SumOfAreas {
    public static double sumOfAreas (Shape[] shapes) {
        double res = 0;
        for (Shape shape : shapes) {
            res += shape.calculateArea();
        }
        return res;
    }
}
