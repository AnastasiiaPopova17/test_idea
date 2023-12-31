package practice_14_12;

public class Main {
    /*
    Geometricheskie figuri
    Ispol'zuya sv-va nasledovaniya, Napisat' programmu dlya podscheta ploshadi 3 vidov figur:
     kruga, pryamougol'nika i kvadrata.

     Sozdat' klassi Circle, Rectangle, Square, soderzhashie sootv methodi.
     Zatem v metode main sozdat' massiv iz neskol'kih figur i vivesti na pechat' ploshadi kazhdoy figuri i nazvanie ee.
     primerno a takom vide:
     Circle has area of 100.0
     Rectangle has area of 400.0
     Square has area of 340.0

     */
    public static void main(String[] args) {
        Figure circle = new Circle("Circle", 10.0);
        Figure rectangle = new Rectangle("Rectangle", 5,10);
        Figure square = new Square("Square", 5);
        Figure figure = new Figure("Figure");

        Figure[] figures = {circle,rectangle,square,figure};
        for (Figure f : figures ){
        System.out.println(f.getName() + " has area of " + f.findArea());
            System.out.println();
       }
    }
}
