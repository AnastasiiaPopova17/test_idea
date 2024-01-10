package praxice_08_01;

public abstract class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private String secondName;
    private double hour;

    public Employee(int id, String name, String secondName, double hour){
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.hour = hour;
    }
    public abstract double calculateSalary();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public double getHour(){
        return hour;
    }


        /*
    Задача 1
В проекте Accounting добавить возможность сортировки сотрудников по фамилии.
(Вам может понадобится вариант метода sort, принимающий массив и индексы элементов начала и конца сортировки)
     */
    public int compareTo(Employee e){
        return getSecondName().compareTo(e.getSecondName());

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", hours=" + hour +
                '}';
    }
}
