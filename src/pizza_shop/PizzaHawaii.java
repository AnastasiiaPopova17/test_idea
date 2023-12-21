package pizza_shop;

public class PizzaHawaii extends Pizza{

   private static String TYPE = "Pizza Hawaii";
   public PizzaHawaii(){
       super(TYPE);
   }
   protected void prepare(){
       System.out.println("Preparing pizza with pineapple and cheese");
   }
}
