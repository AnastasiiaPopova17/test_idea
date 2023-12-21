package hw_28;

public class Main {
    public static void main(String[] args) {
       Money money1 = new Money("Euro", 100);
       Wallet wallet = new Wallet("leather", "big", money1);
       Wallet wallet1 = new Wallet("plastic", "small", money1);

       System.out.println(wallet);

    }
}
