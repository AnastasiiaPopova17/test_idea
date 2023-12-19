package Consultation_6;

public class Secretary extends HR{
    public Secretary(String name,String surname,int salary){
        super(name,surname,salary);
    }
    public void work(){
        System.out.println("Secretary answers the phone and makes coffe");
    }

    @Override
    public String toString() {
        return "Secretary{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
