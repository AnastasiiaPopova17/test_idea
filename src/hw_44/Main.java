package hw_44;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /*Task 1
    Создать следующие интерфейсы:
    Printable, содержащий метод void print(String s)
    Producable, содержащий метод String produce()
    Используя эти интерфейсы написать 2 лямбды, реализующие метод соответствующего интерфейса таким образом:

    строка распечатывается в виде !строка!
    возвращается строка "Hello World"


    */
    public static void main(String[] args)throws IOException {
        Printable printable = (p)->{
            System.out.println("!" + p + "!");
        };
        printable.print("Hi");

        Producable producable = ()->{
            return "Hello world";
        };
        System.out.println(producable.produce());

        List<Person> personList = new ArrayList<>();
        personList.add(0, new Person("Ann", 43));
        personList.add(1, new Person("Kate", 33));
        personList.add(2, new Person("Ben", 51));
        personList.add(3, new Person("Mary", 28));

        savePersons("personsList.txt", personList );
    }
    /*
     Task 2
Написать метод, принимающий имя файла и лист Person.
Метод сохраняет в этот файл обьекты класса Person из листа
( класс Person имеет 2 поля name и age- см код занятия).
     */
    public static void savePersons(String fileName, List<Person> personList)throws IOException {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))){
            for (Person p : personList){
                bufferedWriter.write(p.name + " " + p.age + " years old");
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }
    }
}
