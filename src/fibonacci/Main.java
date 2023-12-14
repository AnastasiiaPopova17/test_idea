package fibonacci;

import java.sql.Array;

public class Main {
    /*
    0 1 2 3 4 5 6 7  8  9  10
    0 1 1 2 3 5 8 13 21 34 55
    Написать метод, который принимает целое число (номер числа Фибоначчи) и  возвращает само число фибоначчи.
     При написании метода использовать массив.
     */
    public static void main(String[] args) {
        System.out.println(fibViaArray(3));
        System.out.println(fibViaArray(5));
    }
    public static long fibViaArray(int n) {
        long[] fib = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        for (int i = 0; i < n; i++) {

            fib[n] = fib[n-1] + fib[n-2];
        }
        return fib[n];
    }
}
