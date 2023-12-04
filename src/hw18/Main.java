package hw18;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jack", 25);
        Student student1 = new Student("Name", 24);
        Student student2 = new Student("Maria", 23);

        System.out.println("Student " + student.name + " is "+ student.age + " years old");
        System.out.println("Student " + student1.name + " is "+ student1.age + " years old");
        System.out.println("Student " + student2.name + " is "+ student2.age + " years old");
    }
}
