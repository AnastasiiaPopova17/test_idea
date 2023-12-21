package homework.Main;

import java.util.Arrays;

public class HW_16 {
    public static void main(String[] args) {

        /*
        Задача 1
Написать метод, принимающий строку и возвращающий целое число, равное двойной длине строки
Пример: Hello -> 10
         */
        System.out.println(doubleString("Hello world!"));

        System.out.println(concatStr("Hello", "There"));

        System.out.println(changeLetter("abcd"));

        }
    public static int doubleString(String str){
        return str.length()*2;
    }

    /*
    Задача 2
Написать метод, принимающий две строки и возвращающий эти строки, соединенные вместе, но без первых букв и в верхнем регистре.
Пример: "Hello", "There" -> ELLOHERE
     */
    public static String concatStr(String str1, String str2){
       String concatString = str1.substring(1) + str2.substring(1);


        return concatString.toUpperCase();
    }

    /*
    Задача 3*
Написать метод, принимающий строку и возвращающий эту строку с переставленной в конец строки первой буквой.
Примет: abcd -> bcda
     */
    public static String changeLetter(String name){
        String newName = name.substring(1)+name.substring(0,1);
        //char str2 = str.charAt(0);
        //return = str + str2;

        return newName;

}

}

