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
        String str1 = "New".substring(1);
        String str2 = "Year".substring(1);

        System.out.println(concatStr(str1,str2));

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
       String concatString = str1.concat(str2).toUpperCase();

        return concatString;
    }

    /*
    Задача 3*
Написать метод, принимающий строку и возвращающий эту строку с переставленной в конец строки первой буквой.
Примет: abcd -> bcda
     */
    public static String changeLetter(String name){
        String newName = name.substring(1)+name.substring(0,1);

        return newName;

}

}

