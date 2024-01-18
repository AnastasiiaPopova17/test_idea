package hw_41;

import java.util.*;

public class Main {
    /*
    Задача 1
Задача на мапы: Дан список имен, в котором некоторые имена повторяются.
Написать метод, который по имени вернет количество вхождений этого имени в список.
 т.е. метод принимает лист и имя и возвращает число, соответствующее количеству раз ,
  которое это имя встречается в листе
     */
    public static void main(String[] args) {
        Main main = new Main();
    List<String> names =  Arrays.asList("Ann", "Bill", "Ann", "Kate");
        System.out.println(main.findNameOccurence(names, "Bill"));

    }
    public int findNameOccurence(List<String> names, String name){
    Map<Integer,String> map = new HashMap<>();
    int counter = 0;
    for (String s : names){
        if (name.equals(s)){
            map.put(counter++,s);
        }
    }
    return counter;

    }
}
