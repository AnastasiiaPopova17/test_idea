package hw_45;

import lambda_expressions.Checkable;
import lambda_expressions.Concatable;
import lambda_expressions.Transformable;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
     /*
        Переписать лямбда выражения из класса Main пакета our_interfaces (см.код)
         с использованием стандартных функциональных интерфейсов
         */
     public static void main(String[] args) {
         //Concatable concatable = (a, b) -> Integer.toString(a) + b;
         BinaryOperator<Integer> concatable = (a,b) -> a+b;
         System.out.println(concatable.apply(1,3));

         //Checkable checkable = s -> s.length() == 3;
         Predicate<String> checkable = s -> s.length() == 3;
         System.out.println(checkable.test("abc"));
         System.out.println(checkable.test("abcd"));

         System.out.println("------checkable even------");
         checkable = s -> s.length() % 2 == 0;
         System.out.println(checkable.test("abc"));
         System.out.println(checkable.test("abcd"));

         //Transformable transformable = s -> s.toUpperCase();
         UnaryOperator<String> transformable = s -> s.toUpperCase();
         System.out.println(transformable.apply("abcDe"));

         //Transformable transformable1 = s -> s.length() == 4? "****" : s;
         Function<String,String> transformable1 = s -> s.length() == 4? "****" : s;
         System.out.println(transformable1.apply("ab"));
         System.out.println(transformable1.apply("abcd"));

     }
}
