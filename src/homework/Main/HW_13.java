package homework.Main;

public class HW_13 {
    public static void main(String[] args) {
        int[] ints = {7,4,8,9,43,17};
        System.out.println(findMin(ints));

        /*
        Задача1
-Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
-Вывести созданный массив на экран используя цикл for.
-Заменить в созданном массиве значение первого элемента на Kiwi (т.е. присвоить первому элементу значение Kiwi)
-Вывести измененный массив на экран используя цикл for.
Задание можно выполнить непосредственно в методе main, не создавая отдельный метод.
         */

        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println();
        fruits[1] = "Kiwi";
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        /*
        Задача2
Используя цикл for вывести на экран все четные элементы массива fruits из первой задачи.
Задание можно выполнить непосредственно в методе main либо создать отдельный метод.
         */
        System.out.println();
        for (int i = 0; i < fruits.length;i++) {
            if (i % 2 == 0)
            {
                System.out.println(fruits[i]);
            }

        }
    }
        /*
        Задача3
Дан массив целых чисел. Написать метод, возвращающий наименьший элемент массива.
public static int findMin(int[] ints)

         */
    public static int findMin(int[] ints){

        int min = ints[0];
        for (int i =1; i < ints.length; i++){
            if (ints[i] < min)
                min = ints[i];
        }
        return min;

    }


}
