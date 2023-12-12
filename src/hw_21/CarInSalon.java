package hw_21;

import java.util.Arrays;

public class CarInSalon {
       String[] salon;

    public CarInSalon(String[] salon) {
        this.salon = salon;
    }
    public static void main(String[] args) {
        String[] salon = {"Audi", "BMW", "Ford", "Honda", "Hyundai", "Kia", "Mazda"};
        CarInSalon carInSalon = new CarInSalon(salon);
        carInSalon.findCar("BMW");
        carInSalon.findCar("Mercedes");
            }

    public void findCar(String carToFind) {

        for (int i = 0; i < salon.length; i++) {
            if (salon[i].equalsIgnoreCase(carToFind)) {
                System.out.println("Эта машина имеется в наличии");
                return;
            }
        }
        System.out.println("Такой машины нет , возьмите: ");
        //for (String car : salon)
          //  System.out.print(car + " ");
        System.out.println(Arrays.toString(salon));
        }

    }
