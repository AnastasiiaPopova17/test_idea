package hw18;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jack", 25);
        Student student1 = new Student("Name", 24);
        Student student2 = new Student("Maria", 23);

        System.out.println("Student " + student.name + " is "+ student.age + " years old");
        System.out.println("Student " + student1.name + " is "+ student1.age + " years old");
        System.out.println("Student " + student2.name + " is "+ student2.age + " years old");

        System.out.println("*******************");

        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(8,6);
        Rectangle rectangle3 = new Rectangle(24,13);

        System.out.println("Rectangel 1 has "+ rectangle1.length + " length and "+ rectangle1.width + " width" );
        rectangle1.calculatePerimetr();
        rectangle1.calculateSquare();

        System.out.println();
        System.out.println("Rectangel 2 has "+ rectangle2.length + " length and "+ rectangle2.width + " width" );
        rectangle2.calculatePerimetr();
        rectangle2.calculateSquare();

        System.out.println();
        System.out.println("Rectangel 3 has "+ rectangle3.length + " length and "+ rectangle3.width + " width" );
        rectangle3.calculatePerimetr();
        rectangle3.calculateSquare();


    }
}
