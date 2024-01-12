package hw_31;

public class Main {
    public static void main(String[] args) {
        /*
        Задача 1
Создать интерфейс Shape, содержащий методы для подсчета площади и периметра фигуры
 и классы прямоугольник и круг, реализующие этот интерфейс.
В методе main создать несколько фигур и вывести на печать площадь и периметр каждой.
Написать метод, вычисляющий общую площадь фигур нескольких видов.
         */
        Shape circle1 = new Circle(5.0);
        Shape rectangle1 = new Rectangle(2.76, 3.56);

        circle1.calculateArea();
        circle1.calculatePerimeter();
        System.out.println("");

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();
        System.out.println("");

        SumOfAreas sum = new SumOfAreas();
        Shape[] shapes = {circle1, rectangle1};
        System.out.println("Total square is: " + sum.sumOfAreas(shapes));
    }


}
