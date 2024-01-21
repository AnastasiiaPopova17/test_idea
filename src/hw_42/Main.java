package hw_42;

public class Main {
    /*
    Задача1
Поймать исключение (с выводом на экран его типа),которое возникает при выполнении следующего кода int a = 40/0

Поймать исключение (с выводом на экран его типа),которое возникает при выполнении следующего кода
String s =null;
String m = s.toLowerCase()

Поймать исключение (с выводом на экран его типа),которое возникает при выполнении следующего кода
int[] m = new int[2]
m[8]=5
     */

    public static void main(String[] args) {
        int a = 40;
        int b = 0;

        String s = null;

        int[] m = new int[2];

        try {
            int divide = a/b;
            System.out.println(divide);

            String n = s.toLowerCase();
            System.out.println(s.toLowerCase());

            m[8]=5;
            System.out.println(m[8]);
        }
        catch (ArithmeticException e){
            System.out.println("After dividing by zero you always become zero!");
        }
        catch (NullPointerException e){
            System.out.println("It's always be null!");
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Length of array is less, then index! ");
        }
    }
}
