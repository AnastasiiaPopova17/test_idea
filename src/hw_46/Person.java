package hw_46;

public class Person {
    private String name;
    private int age;
    Address address;

    public Person(String name, int age, Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
