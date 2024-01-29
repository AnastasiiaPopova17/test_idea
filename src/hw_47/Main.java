package hw_47;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Jo", 18);
        Person person2 = new Person("Jack", 27);
        Person person3 = new Person("Joseph", 15);
        Person person4 = new Person("Jill", 47);

        List<Person> personList = Arrays.asList(person1,person2,person3,person4);

        System.out.println(ageOfPersons(personList));

        System.out.println(sumOfAgesOlder18(personList));

        System.out.println(nameOfOlderThen18(personList));

        System.out.println(numOfWords("aaaaaaa cccc ab bbbbb a ff aaa", "aaa"));
        System.out.println(numOfWords("aaaaaaa cccc ab bbbbb a ff aaa", "a"));

    }
    /*  Задача 1
      Пусть есть класс Person с полями имя и возраст. Написать метод,
      принимающий список Person и возвращающий мапу, где возраст является ключом,
      а лист людей этого возраста значением
   */
    public static Map<Integer, String> ageOfPersons(List<Person> personList){
        return  personList.stream()
                .collect(Collectors.toMap(Person::getAge, Person::getName));
    }
    /*
    Задача 2
Есть тот же класс Person с полями String name, int age.

Написать метод,принимающий список Person и возвращающий суммарный возраст тех, кто старше 18 лет
Написать метод,принимающий список Person и возвращающий имена тех, кто старше 18 лет в виде такой строки:
"At the moment John and Ann and Bill are of legal age "
( имена и текст могут быть любыми, по вашему выбору, структура предложения должна сохраняться)
     */
    public static Optional<Integer> sumOfAgesOlder18(List<Person> personList){
       return personList.stream()
               .filter(person -> person.getAge() > 18)
               .map(Person :: getAge)
               .reduce((a, b)-> {
                   return a + b;
               });
     }

       public static String nameOfOlderThen18(List<Person> personList){
        List<String> returnList = personList.stream()
                .filter(person -> person.getAge() > 18)
                .map(Person :: getName)
                .collect(Collectors.toList());

                return returnList.stream().
                        collect(Collectors.joining(" and ", "At the moment ",  " are of legal age"));
    }
    /*
    Задача 3
Написать метод, принимающий в качестве параметров две строки.
Первая строка состоит из слов, разделенных пробелом.
Метод возвращает количество слов первой строки, начинающихся со второй строки
Пример : Первая строка "aaaaaaa cccc ab bbbbb a ff aaa"
Если вторая строка а, то ответ 4
Если вторая строка ааа, ответ 2
Если вторая строка aaaa, ответ 1
     */
    public static long numOfWords(String str1, String str2){
        String[] strings = str1.split(" ");
        return Arrays.stream(strings).filter(s -> s.startsWith(str2)).count();
    }

}
