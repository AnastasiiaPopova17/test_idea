package hw_28;

public class Money {
    int euro;
    int cent;
    public Money(int euro, int cent){
        this.euro = euro;
        this.cent = cent;
    }

    @Override
    public String toString() {
        return "Money{" +
                "euro='" + euro + '\'' +
                ", cent='" + cent + '\'' +
                '}';
    }
}
