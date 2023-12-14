package truck;

public class Truck extends Car{



     int maxWeight;
     int weight;
     int unloadingWeight;

     int currentWeight = 0;

     int currentFuel = 0;

     int maxFuel;

     private String owner;

    public Truck(String model, String manufacturer, int year, String color, int maxWeight, int weight, int unloadingWeight, int maxFuel, String owner) {
        super(model, manufacturer, year, color );
        this.maxWeight = maxWeight;
        this.weight = weight;
        this.unloadingWeight = unloadingWeight;
        this.maxFuel = maxFuel;
        this.owner = owner;
    }

       public void load(){
        if (weight > getRemainingCapacity()){
            System.out.println("This is too heavy for me! Can't continue!");
            printRemainingCapacity();
            return;
        }
        currentWeight += weight;
        System.out.println("Loading " + weight + " kg.....");
        System.out.println("Loaded" + weight + " kg.");
        return;
    }
    public void unload(){
        if (unloadingWeight > currentWeight){
            System.out.println("Not enough cargo!");
            printRemainingCargo();
            return;
        }
        if (unloadingWeight < 0){
            System.out.println("Can't unload negative weight");
            return;
        }
        currentWeight -= unloadingWeight;
        System.out.println("Unloading" + unloadingWeight + " kg.....");
        System.out.println("Unloaded" + unloadingWeight + " kg.");
        printRemainingCargo();

    }
    private void printRemainingCargo(){
        System.out.println("Remaining cargo weight is " + currentWeight + " kg");
    }

    public void move(){
        if (currentFuel == 0){
            System.out.println("Not enough fuel, can't drive");
            return;
        }
        if (currentWeight == 0) {
            System.out.println("Please load the truck before driving");
            return;
        }
        System.out.println("Trying...");
        System.out.println("Trying...");
        System.out.println("Yeah, driving");

        }


    public void stop(){
        System.out.println("Stopping...");
        System.out.println("Stopping...");
        System.out.println("Yeah!");
        }

    public  void setCurrentFuel(int currentFuel) {
        this.currentFuel = maxFuel;
        if (maxFuel < currentFuel) {
            this.currentFuel = maxFuel;
            return;
        }
        this.currentFuel = currentFuel;
    }
    public String getOwner(){
        return "The owner is" + owner;

    }

    private void printRemainingCapacity(){
        System.out.println("Remaing capacity " + getRemainingCapacity() + " tons");
        //pechataet, skol'ko ostaetsya eshe gruza na bortu
    }
    private int getRemainingCapacity(){

        return maxWeight - currentWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model +
                ", manufacturer='" + manufacturer +
                ", year=" + year +
                ", color='" + color +
                ", maxWeight=" + maxWeight +
                ", currentWeight=" + currentWeight +
                ", currentFuel=" + currentFuel +
                ", maxFuel=" + maxFuel +
                ", owner='" + owner +
                '}';
    }
}
