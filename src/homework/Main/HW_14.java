package homework.Main;

public class HW_14 {
    public static void main(String[] args) {
        int[] evenCalc = {3,2,6,8,7,4};
        System.out.println("The quantity of even cells is  " + calculateEven(evenCalc));
        int[] num = {2, 5, 8, 9};
        int[] num2 = {2, 5, 8, 9};
        System.out.println("Are array 1 equal array 2?" + " :" + areEqual(num, num2));
    }
    /*
    napisat' metod, proveryayushiy ravenstvo dvuh massivov. esli massivi ravni, metod
    vozvrashaet true. esli net - false. massivi ravni, esli oni sovsem odinakovie
     */
    public static boolean areEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;

    }
    /*
    Задача2
Есть массив целых чисел. Написать метод, находящий и возвращающий количество четных чисел в этом массиве.
 Пример: {1, 2, 8, 7} -> количество четных чисел = 2.
     */
    public static int calculateEven(int[] num) {
        int counter = 0;
        for (int i = 0; i < num.length; i++) {
          if (num[i] % 2 == 0) {
              counter++;
              }
        }
        return counter;

    }
}
