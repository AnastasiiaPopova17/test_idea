package hw_39;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    /*
    Задача 1
Написать метод, принимающий не пустой лист строк и возвращающий строку, которая встречается раньше
в листе - самую короткую или самую длинную. Все строки в листе разной длины
     */
    public static void main(String[] args) {
        Main main = new Main();
        List<String> stringList = new ArrayList<>();

        stringList.add("Life");
        stringList.add("is");
        stringList.add("beautiful");
        stringList.add("!");

        System.out.println("Before:");
        System.out.println(stringList);
        System.out.println("After:");
        System.out.println(findFirstSmallString(stringList));

    }

    public static String findFirstSmallString(List<String> list) {
        String minLenght = list.get(0);
        String maxLenght = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (minLenght.length() > list.get(i).length()) {
                minLenght = list.get(i);
            }
            if (list.get(i).length() > maxLenght.length()) {
                maxLenght = list.get(i);
            }
        }
        return list.indexOf(minLenght)<list.indexOf(maxLenght) ? minLenght : maxLenght;
    }
}
