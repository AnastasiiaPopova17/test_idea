package hw_28;

public class Main {
    public static void main(String[] args) {
       Money money = new Money(250, 75);
       Money money1 = new Money(360, 20);
       Money money2 = new Money(10, 0);
       Wallet wallet = new Wallet("Haspa", 400, 40);
       Wallet wallet1 = new Wallet("Deutsche Bank", money2.euro, money2.cent);
       Wallet wallet2 = new Wallet("Revolut", money1.euro, money1.cent);

        System.out.println(wallet);
        System.out.println(wallet1);
        System.out.println(wallet2);

    }
}
