package truck;

public class Car {
     String model;

     String manufacturer;

     int year;

     String color;

     public Car(String model, String manufacturer, int year, String color){
         this.model = model;
         this.manufacturer = manufacturer;
         this.color = color;
         this.year = year;
     }
     public void load(){
         System.out.println("Any car can be loaded. The question of volume ");
     }
     public void unload(){
         System.out.println("Any car can be unload. The question is by whom");
     }
     public void move(){
         System.out.println("Every car can move");
     }
     public void stop(){
         System.out.println("Stopping...");
     }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOwner() {
         return getOwner();
    }
}
