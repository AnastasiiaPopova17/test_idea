package hw_22;

public class Main {
    /*
    Задача 1
Создать класс Calculator, способный выполнять два арифметических действия - сложение двух чисел,
вычитание двух чисел а также сложение трех чисел и вычитание трех чисел.
Калькулятор должен работать как для целых чисел, так и для чисел с запятой.
(т.е. в классе надо создать соответствующие методы и затем вызывать их в методе main)
     */
    public static void main(String[] args) {
        System.out.println("The summa of two numbers is : " + sum(2.45,3.56));
        System.out.println("The summa of three numbers is : " + sum(5.47,7.34, 2));
        System.out.println("The substraction of two numbers is : " + substr(4,2.22));
        System.out.println("The substraction of three numbers is : " + substr(3, 3.12, 4.2));

    }
    public static double sum(double a, double b){
        return (a+b);
    }
    public static double sum(double a, double b, double c){
        return (a+b+c);
    }
    public static double substr(double a, double b){
        return (a-b);
    }
    public static double substr(double a, double b, double c){
        return (a-b-c);
    }
}
