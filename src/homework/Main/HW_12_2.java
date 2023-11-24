package homework.Main;

public class HW_12_2 {
    public static void main(String[] args) {
        writeTriangle(7);

    }
    static void writeTriangle (int m){
        /*
        Написать метод, выводящий на печать треугольник, состоящий из цифр от 1 до числа n такого вида:
        1
        12
        123
        1234
        12345
        123456
        Переписать задачу про треугольник из предыдущего дз используя циклы for
         */
        int i;
        for (i = 1; i <= m; i++){

            for (int j = 1; j < i; j++){
                System.out.print(j);
            }
            System.out.println(i);


        }
      }
    }


