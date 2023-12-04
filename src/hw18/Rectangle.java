package hw18;

public class Rectangle {
    /*
    Задача 2
Создать класс Rectangle (прямоугольник), содержащий переменные длина и ширина,
конструктор и методы для подсчета площади и периметра прямоугольника.
В классе Main создать несколько обьектов класса Rectangle и вывести на экран площадь и периметр каждого
     */
    static int length;
    static int width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;

    }
    public static void calculatePerimetr(){
        //int perimetr = 2*(width+width)
        System.out.println("Perimetr is " + 2*(width+width) + " cm");
    }
    public static void calculateSquare(){
        System.out.println("Square is " + (width*length) + " sq cm");
    }


}
