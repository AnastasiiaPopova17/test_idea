package hw_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    /*
    Задача 1
Написать метод, принимающий лист имен, в котором некоторые имена повторяются и печатающий
имена из листа без печати повторений. При решении использовать Stream API
     */
    public static void main(String[] args) {
        List<String> newList = new ArrayList<>();
        newList.add("Jack");
        newList.add("Ann");
        newList.add("Kate");
        newList.add("Ann");
        newList.add("Bill");
        newList.add("Kate");

        printWithoutRepeat(newList);
        System.out.println();

        Address address1 = new Address("Fifth Avenue",34 );
        Address address2 = new Address("Baker Street",2216 );
        Address address3 = new Address("Piccadilly street",25 );
        Address address4 = new Address("Broadway",176 );
        Address address5 = new Address("Wall street",8 );

        Person person1 = new Person("Jo Black", 16, address1);
        Person person2 = new Person("Sherlock Holmes", 42, address2);
        Person person3 = new Person("Mary Young", 12, address3);
        Person person4 = new Person("Leonardo Dicaprio", 39, address4);
        Person person5 = new Person("Steve Jobs", 56, address5);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        printOlder17(persons);
    }
    public static void printWithoutRepeat(List<String> listOfNames){
        listOfNames.stream().distinct().forEach(System.out :: println);
    }

    /*
    Задача 2
Есть класс Address с полями String street и int houseNumber и класс Person с полями String name,
int age, Address address. Используя Stream API написать метод, принимающий лист Person и
печатающий адреса тех, кто старше 17 лет
     */

    public static void printOlder17(List<Person> personList){
        personList.stream()
                .filter(person -> person.getAge() > 17)
                .map(person -> person.getName() + ", " + person.getAge() + " : " + person.address)
                .forEach(System.out :: println);
    }
}
