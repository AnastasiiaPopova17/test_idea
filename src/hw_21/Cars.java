package hw_21;

import java.util.Arrays;

public class Cars {
    /*
    Написать класс, содержащий метод, который проверяет есть ли данная машина в салоне.
В случае, если машина найдена, метод выводит на экран сообщение "Эта машина имеется в наличии"
Если нет, то сообщение "Такой машины нет , возьмите ( дальше следует перечисление всех машин в салоне ) "
Результат работы метода вывести на экран в классе Main. Список машин в салоне должен передаваться через
конструктор при создании обьекта, а название заказанной машины в качестве параметра метода.
Пример:String [] salon = {"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"};

public void findCar(String carToFind)
     */
    static String[] salon;

    public Cars(String[] salon) {
        this.salon = salon;


    }
    public static void main(String[] args) {
        Cars cars = new Cars(salon);
        cars.findCar("Audi");
            }

    public void findCar(String carToFind) {
        String[] getSalon = {"Audi", "BMW", "Ford", "Honda", "Hyundai", "Kia", "Mazda"};
        for (int i = 0; i < salon.length; i++) {
                if (carToFind != salon[i]) {
                    System.out.println("Такой машины нет , возьмите " + Arrays.toString(salon));
                    return;
                } else {
                    System.out.println("Эта машина имеется в наличии");
                    return;
                }
            }
        }

    }
