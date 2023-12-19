package Consultation_6;

public abstract class HR {
    String name;
    String surname;
    int salary;
    public HR(String name,String surname, int salary){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
    public abstract void work();

    @Override
    public String toString() {
        return "HR{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
