package truck;

public class PassengerCar extends Car{
    int numOfSeats;

    public PassengerCar(String model, String manufacturer, int year, String color, String owner, int numOfSeats) {
        super(model, manufacturer, year, color, owner);
        this.numOfSeats = numOfSeats;
        }
    public void move(){
        System.out.println(" passenger car is driving");
    }
    public void stop(){
        System.out.println("passenger car is stopping");
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "numOfSeats=" + numOfSeats +
                super.toString();

    }
}
