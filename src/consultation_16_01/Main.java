package consultation_16_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    /*
    есть список с именами : John, Ann, Bill, Benjamin.
     Написать метод, который вернет лист , в котором не содержатся
     имена исходного списка длиной 4
     */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Ann");
        names.add("Bill");
        names.add("Benjamin");
        System.out.println(names);
        System.out.println("After remove:");

        Main main = new Main();
        System.out.println(main.removeFourLetterName(names, 4));

    }

    public List<String> removeFourLetterName(List<String> input, int n) {
        List<String> result = new ArrayList<>();
        for (String r : input) {
            if (r.length() != n) {
                result.add(r);
            }
        }
        return result;
    }
}
