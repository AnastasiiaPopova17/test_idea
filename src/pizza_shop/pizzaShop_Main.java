package pizza_shop;

import java.util.Scanner;

public class pizzaShop_Main {
    /*
    sozdat' magazin fabriku po proizvodstvu i prodazhe pizzi
    programma dolzhna umet' gotovit':
    1. Gawaii, Margarita, Salyami.
    2. Kazhdiy vid picci dolzhen umet': podgotavlivat'sya (nakladivat' ingredienti),
    pech'sya, upakovivat'sya
    3. V kazhdom sluchae dolzhno bit' ponyatno,o kakoy picce idet rech'
    4.Klass OnlinePiccaShop ne dolzhen sozdavat' noviy ob'ekt picci, a iz nego dolzhen
    postupat' zakaz na izgotovlenie trebuemogo vida picci(ob'ekta) v klasse PizzaChoice, kotoriy
    i dolzhen vibrat' nuzhnuyu piccu dlya izgotovleniya
    5. Vibor picci osushestvlyaetsya klientom s klaviaturi v klasse OnlinePizzaShop, pri etom nuzhno
    obespechit' proverku pravil'nosti vibora klientom picci i vozmozhnost' zakaza eshe pizzu

     Klassi:
     1. Pizza - rodklass
     2. salyami, margarita gawaii - dochernie

     V etih klassah dolzhno bit' min 3 metoda, otrazhayushih process prigotovleniya iz TZ
     prepare()
     bake()
     pack()
     orderPizza()

     3. PizzaChoice - syuda v sootvetstvuyushiy metod budet peredevet'sya vibor klienta i v zavisimosti
     ot etogo vibora cherez switch vozvr noviy ob'ekt sootv pizzi, v kotorom uzhe budet vizivat'sya metod
     createPizza(String type) - return novuyu pizzu

     Posledovatel'nost' deystviy pri zakaze:
     Vvedite nazv pizzi
     Peredaetsya v PizzaChoise -> sozdaetsya ob'ekt pizzi
     vozvrashaetsya default
     Prepearing pizza with mozarella cheese....
     Baking pizza Margarita..
     Paking pizza M...
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PizzaChoise choiseClass = new PizzaChoise();

        do {
            System.out.println("Hi, choose pizza: 1 - Salami, 2 - Margarita, 3 - Hawaii");
            String pizzaChoice = scanner.nextLine();

            Pizza newPizza = choiseClass.choosePizza(pizzaChoice);

            while (newPizza == null){
                System.out.println("You have made the wrong choice. " +
                        "Please choose pizza : 1 -Salami, 2- Margarita, 3 - Hawaii");
                pizzaChoice = scanner.nextLine();
                newPizza = choiseClass.choosePizza(pizzaChoice);
            }

            newPizza.orderPizza();

            System.out.println("Do you want to order another pizza? pres 'no', if not or " + " press any other key to order another pizza");

        } while (!scanner.nextLine().equalsIgnoreCase("no"));

        System.out.println("Thank you for your order! We hope to see you soon");






      }



    }






