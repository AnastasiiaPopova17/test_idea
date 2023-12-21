package hw_30;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    /*
    Задача 1
Написать программу, которая при вводе с клавиатуры дня недели отвечает на вопрос
является ли этот день выходным. (true/false) Использовать Enum !
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weekend day");
        String weekendDay = scanner.nextLine().toUpperCase();
        Weekend[] day = Weekend.values();
        boolean isWeekend;
        if((weekendDay.equals(day[5].toString().toUpperCase())) || (weekendDay.equals(day[6].toString().toUpperCase()))){
            isWeekend = true;
            System.out.println(isWeekend);
            return;

        }else{
            isWeekend = false;
            System.out.println(isWeekend);
            return;
        }
    }
}







