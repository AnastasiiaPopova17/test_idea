package Consultation_6;

public class Director extends HR{
    public Director(String name,String surname, int salary){
        super(name,surname,salary);
    }
    public void work(){
        System.out.println("Director manages the company");
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
