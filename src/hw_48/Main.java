package hw_48;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    /*
    Получить и вывести на экран:
-текущую дату
-текущий год, месяц и день
Создать дату , например день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран текущее время
текущее время + 3 часа
Создать дату на неделю позже сегодняшней
Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
     */
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Today is: " + localDate);

        LocalDate myDate = LocalDate.of(1987,12,17);
        System.out.println("My birthday is on: " + myDate);

        LocalDate localDate1 = LocalDate.of(2024, 8, 16);
        LocalDate localDate2 = LocalDate.of(2024, 8, 16);
        LocalDate localDate3 = LocalDate.of(2014, 8, 16);
        LocalDate localDate4 = LocalDate.of(2024, 8, 26);
        System.out.println("The time difference is equal to: " + localDate1.compareTo(localDate2) + " days");
        System.out.println("The time difference is equal to: " + localDate1.compareTo(localDate3) + " days");
        System.out.println("The time difference is equal to: " + localDate1.compareTo(localDate4) + " days");

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime localTimePlus3 = localTime.plusHours(3);
        System.out.println("Plus 3 hours: " + localTimePlus3);

        LocalDate localDate5 = localDate.plusWeeks(1);
        System.out.println("Plus 1 week: " + localDate5);

        LocalDate yesterday = localDate.minusDays(1);
        System.out.println("Is yesterday before today? " + yesterday.isBefore(localDate));

        LocalDate tomorrow = localDate.plusDays(1);
        System.out.println("Is tomorrow after today? " + tomorrow.isAfter(localDate));

    }
}
