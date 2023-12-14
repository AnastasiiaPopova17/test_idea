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
        Figure circle1 = new Circle(8);
        Figure rectangle1 = new Rectangle(4, 7.89);
        Figure square1 = new Square(5, 5);

        Figure[] figures = {circle1,rectangle1,square1};
        for (Figure figure : figures ){
        System.out.println(figure);
        figure.area();

       }
    }
}
