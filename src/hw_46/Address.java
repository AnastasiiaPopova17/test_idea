package hw_46;

public class Address {
    private String street;
    private int houseNumber;

    public Address(String street, int houseNumber){
        this.street = street;
        this.houseNumber = houseNumber;
    }
    public String getStreet(){
        return street;
    }
    public int getHouseNumber(){
        return houseNumber;
    }
    public String toString(){
        return street + " " + houseNumber;
    }
}
