package hw_28;

public class Wallet {
    String creditcard;
    int euro;
    int cent;
    public Wallet(String creditcard, int euro, int cent){
        this.creditcard = creditcard;
        this.euro = euro;
        this.cent = cent;

    }

    @Override
    public String toString() {
        return "Wallet{" +
                "creditcard='" + creditcard + '\'' +
                ", euro=" + euro +
                ", cent=" + cent +
                '}';
    }
}
