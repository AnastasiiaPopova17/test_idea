package truck;

public class PassengerCar extends Car{
    int numOfPass;
    String typeOfFuel;

    public PassengerCar(String model, String manufacturer, int year, String color, int numOfPass, String typeOfFuel) {
        super(model, manufacturer, year, color);
        this.numOfPass = numOfPass;
        this.typeOfFuel = typeOfFuel;
    }
    public void move(){
        System.out.println("Every car can move");
    }
    public void stop(){
        System.out.println("Stopping...");
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "numOfPass=" + numOfPass +
                ", typeOfFuel='" + typeOfFuel + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
