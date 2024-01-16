package hw_38;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Задача 1
Написать метод, принимающий два листа целых чисел одинаковой длины и возвращающий лист, содержащий элементы Yes или No,
 где значения на i-м месте зависит от того, равны ли элементы этих двух листов под номером i. Например, {1,2,3,4} и {5,2,3,8}
  вернет {No, Yes, Yes, No}
Протестировать.
         */

        List<Integer>ints1 = new ArrayList<>();
        ints1.add(1);
        ints1.add(2);
        ints1.add(3);
        ints1.add(4);

        List<Integer>ints2 = new ArrayList<>();
        ints2.add(5);
        ints2.add(2);
        ints2.add(3);
        ints2.add(8);

        System.out.println(changeNumToString(ints1, ints2));

    }
    public static List<String> changeNumToString (List<Integer> ints1, List<Integer> ints2 ){
        List<String> returnYesOrNo = new ArrayList<>();
        for (int i =0; i < ints1.size(); i++){
            if (ints1.get(i) == ints2.get(i)){
                returnYesOrNo.add("YES");
            }else {
                returnYesOrNo.add("No");
            }
        }
        return returnYesOrNo;
    }

}
