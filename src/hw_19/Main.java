package hw_19;

public class Main {

    public static void main(String[] args) {
        Temperature temperature1 = new Temperature(199);
        Temperature temperature2 = new Temperature(-97);

        System.out.println("The temperature " + temperature1.farenheit + " farenheit in celsius is " + temperature1.convertationGrad());
        System.out.println("The temperature " + temperature2.farenheit + " farenheit in celsius is " + temperature2.convertationGrad());

    }
}
