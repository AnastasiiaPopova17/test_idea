package truck;

public class Truck {
   // int i;
    //boolean b;
    //String s;

    private String model;

    private String manufacturer;

    private int year;

    private String color;

    private int maxWeight;

    private int currentWeight = 0;

    private int currentFuel = 0;

    private int maxFuel;

    private String owner;

    public Truck(String model, String manufacturer, int year, String color, int maxWeight, int maxFuel, String owner) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
        this.owner = owner;
    }

    public void load(int weight){
        currentWeight = currentWeight + weight;
        if (currentWeight > maxWeight){
            System.out.println("The weight is more, than " + maxWeight);
        } else if (currentWeight < maxWeight) {
            System.out.println("The weight is less, than " + maxWeight + ". You can load " + (maxWeight-currentWeight));
          }
        System.out.println("Loading " + currentWeight + " tons");
    }
    public void unload(int unloadingWeight){
        if (unloadingWeight > currentWeight){
            System.out.println("The current weight is less, than the weight you try to unload!");
        } else if (unloadingWeight < 0) {
            System.out.println("You try to unload the weight less 0");
        } else if (unloadingWeight < currentWeight) {
            System.out.println("You can unload else " + (unloadingWeight - currentWeight));
        }
        System.out.println("Unloading" + unloadingWeight + " tons");

    }
    public void move(){
        if (currentFuel == 0){
            System.out.println("You need to fill the Fuel");
        } else if (currentWeight == 0) {
            System.out.println("You need loading");
        } else if (currentWeight > 0 && currentFuel > 0) {
            System.out.println("The truck can move");

        }

    }
    public void stop(){
        if (currentFuel == 0){
            System.out.println("You need to stop and refuel");
        }

    }
    public String fillFuel(int currentFuel) {
        if (maxFuel == currentFuel) {
            System.out.println("You have refueled");
        }
    }
    public String getOwner(){
        return "The owner is" + owner;
    }
    private void printRemainingCapacity(){
        //pechataet, skol'ko ostaetsya eshe gruza na bortu
    }
    public String toString(){
        return "";
    }
}
