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
        Circle circle1 = new Circle(2.45);
        Rectangle rectangle1 = new Rectangle(2.76, 3.56);

        circle1.calculateArea();
        circle1.calculatePerimeter();
        System.out.println("");

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();


       /* Shape[] shapes = {circle1, rectangle1};

        public Shape sumOfAreas (Shape[] shapes) {
            for (int i = 0; i < 2; i++) {

            }
            return circle1.calculateArea() + rectangle1.calculateArea();

        }*/
    }

}
