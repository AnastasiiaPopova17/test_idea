package Consultation_6;

import method_overloading.Employee;

public class Main_main {
    public static void main(String[] args) {


        HR director = new Director("Katya", "Ivanova", 3500);
        HR sales_manager = new Sales_manager("Vitya", "Semyenov", 2000);
        HR secretary = new Secretary("Olga", "Petrova", 1250);

        HR[] hrs = {director, sales_manager, secretary};
        for (HR hr : hrs) {
            System.out.println(hr);
            hr.work();
        }


    }
}