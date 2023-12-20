package garden;

public class Flower extends Plant {
    public Flower (String name, int height, int age){
        super(name, height, age);
    }
    public int doSummer(){
        System.out.println("In Summer " + name +" isn't growing. It is blooming, " + height);
        return height;
    }

    public void doAutumn(){
        height = height-10;
        System.out.println("In Autumn " + name + " is being cut, " + height );

    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
