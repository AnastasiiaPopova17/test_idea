package hw_23;

public class Main {
    /*
    Задача 1
Написать как минимум одну иерархию классов в которой будет один родительский класс и два наследника, расширяющих его функционал

     */
    public static void main(String[] args) {
        System.out.println("There are 1 billion and 338 millions cubic km water in world ocean");
        WorldOcean worldOcean = new WorldOcean();
        Ocean ocean = new Ocean();
        Sea sea = new Sea();

        worldOcean.structure();
        ocean.structure();
        sea.structure();

    }
}
