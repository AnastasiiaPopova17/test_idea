package homework.Main;

public class HW_15 {
    public static void main(String[] args) {
        /*
        Задача1
Написать метод, принимающий массив целых чисел и проверяющий равна ли сумма всех имеющихся там чисел 10 тридцати.
Метод возвращает false если нет и true если да.
т.е. для массива 10, 15, 10, 1, 25, 10 -> true
для массива 10, 15, 10, 1, 25, 45 -> false
Фактически, в общем виде метод проверяет равна ли сумма всех элементов массива, равных n числу m
         */
        int[] ints = {10,27,0,10,6,10};
        System.out.println(checkThirty(ints));
    }
    public static boolean checkThirty(int[] ints){

        int sumNum = 0;

        for (int element : ints) {
            if (element == 10) {
                sumNum = sumNum + element;
            } else if (sumNum == 30) {
                return false;
            }
        }
        return true;


    }
}
