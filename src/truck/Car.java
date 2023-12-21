package truck;

public class Car {
     private String model;

     private String manufacturer;

     private int year;

     private String color;
    private String owner;

     public Car(String model, String manufacturer, int year, String color, String owner){
         this.model = model;
         this.manufacturer = manufacturer;
         this.color = color;
         this.year = year;
         this.owner = owner;
     }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public String getOwner(){
         return owner;
    }
    public void move(){
        System.out.println("A car moves");
    }
    public void stop(){
        System.out.println("A car stops");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
