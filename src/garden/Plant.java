package garden;

public abstract class Plant {
    String name;
    int height;
    int age;

    public Plant(String name, int height, int age){
        this.name = name;
        this.height = height;
        this.age = age;
        }
    public void doSpring(){
        System.out.println("The " + name + " has grown, " + height);
    }
    public void doWinter(){
        System.out.println("The " + name +  " hasn't grown in winter, " + height);
    }
    public abstract int doSummer();
    public abstract void doAutumn();

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}


