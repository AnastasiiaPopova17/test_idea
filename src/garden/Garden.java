package garden;

import java.util.Arrays;

public class Garden {
    /*
    Proekt Sadovod- lyubitel'
    Budem virashivat' rasteniya v techenii neskol'kih let i smotret', chto poluchilos'


    Zadacha:
    Virashivaem derev'ya i cveti
    Kazhdiy iz etih vidov imeet sled harak-ki:
    -displayName
    -height
    -age

    Kazhdiy iz nih virastaet za sezon na raznuyu visotu, odinakovuyu dlya vseh derev'ev i vseh cvetov.
    Kazhdiy sezon sostoit iz 4 vremen goda, v kotorie rasteniya vedut sebya ne vsegda odinakovo:
    Dlya cvetov: sezon nachinaetsya vesnoy i oni rastut. zimoy oni ne rastut, letom oni ne rastut, a cvetut, osen'yu ih srezayut
    Dlya derev'ev: sezon nachinaetsya vesnoy i oni rastut, zimoy oni ne rastut, letom rastut, osen'yu ne rastut

    V klasse Garden nuzhno sozdat' metod growPlants(), v kotorom budet otrazhen process rosta min 2 rasteniy (dereva i cvetka) v techenii neskol'kih let:
    chto proishodit vo vse sezoni s nimi, ih razmer v kazhdoe vremya goda i kakogo oni rosta i vozvrasta v konce.

    Growing plants for 2 years:

    Tulip has grown in Spring, 20
    Tulip is not growing in summer, 20
    .......
    ........
    Pine tree has grown in Summer, 220


    Tulip has height: 25 and is 3 years old
    Pine has height 150 and is 3 years old
     */
    public static void main(String[] args) {
        Plant flower = new Flower("Tulip", 10, 0);
        Plant tree = new Tree("Oak", 100, 3);

        flower.doSpring();
        flower.doSummer();
        flower.doAutumn();
        flower.doWinter();
        System.out.println("********************");

        tree.doSpring();
        tree.doSummer();
        tree.doAutumn();
        tree.doWinter();

        Plant[] plants = {flower, tree};
        for (Plant plant : plants){
            System.out.println(plant);
        }

        }





        }





