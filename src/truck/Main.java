package truck;

import java.util.Arrays;

public class Main {
    /*
   Создать класс грузовик Truck, содержащий общие характеристики грузовиков:
   model, manufacturer,year (год выпуска),colour,maxWeight (грузоподьемность),
   maxFuel (  обьем топливного бака), имя владельца
   и имеющий следующее поведение:
   1.должен уметь загружаться (load)  и при этом сообщать, если превышена его грузоподьемность а также сообщать
       сколько еще можно загрузить груза
   2.разгружаться и  при этом сообщать в случае если пытаются разгрузить больше чем имеющийся у него на борту груз
   или пытаются разгрузить отрицательный груз. Также должен сообщать вес остающегося на борту груза
   3. В случае отсутствия топлива или отсутствия груза на борту сообщать о невозможности ехать
   4. Должен уметь ездить и останавливаться
   4. уметь заправляться топливом
   5. уметь сообщать имя владельца

   Создать несколько грузовиков, протестировать их работу , сложить в массив и вывести на экран


    */
    public static void main(String[] args) {
       Car truck = new Truck("SuperTruck",
                            "Volvo",
                                 2020,
                                 "red",
                             5000,
                                500,
                                 "John Black");

        System.out.println(truck);


        truck.move();
        ((Truck) truck).setCurrentFuel(600);
        truck.move();

        truck.stop();


        Car truck1 = new Truck("SuperTruck1",
                "MAN",
                2018,
                "black-yellow",
                10000,
                400,
                 "Jack White" );
        Car[] autos = {(Car) truck,truck1,};
        //System.out.println(Arrays.toString(autos));

        for (Car tr : autos){
            System.out.println("truck " + tr.getManufacturer() + " :  " + tr.getOwner());
        }

        Car passengerCar = new PassengerCar("Golf",
                "VW",
                2021,
                "red",
                "Bill",
                 5);

        System.out.println(passengerCar);
        passengerCar.move();
        passengerCar.stop();
    }
}
