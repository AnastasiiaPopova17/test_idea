package garden;

public class Tree extends Plant {
    public Tree(String name, int height, int age){
        super(name, height, age);

    }
    public int doSummer(){
        System.out.println("In Summer tree is growing, " + height);
        return height = height + 75;
    }
    public void doAutumn(){
        System.out.println( name + " isn't growing in Autumn, " + height);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
