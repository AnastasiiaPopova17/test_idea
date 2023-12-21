package pizza_shop;

public class PizzaMargarita extends Pizza{
    private static String TYPE = "Pizza Margarita";

    public PizzaMargarita(){
        super(TYPE);
    }
    protected void prepare(){
        System.out.println("Preparing pizza with mozarella cheese and tomatoes");
    }
}
