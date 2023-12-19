package Consultation_6;

public class Sales_manager extends HR {
    public Sales_manager(String name, String surname, int salary) {
        super(name, surname, salary);
    }

    public void work() {
        System.out.println("Sales manager is responsible for sales");
    }

    @Override
    public String toString() {
        return "Sales_manager{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}