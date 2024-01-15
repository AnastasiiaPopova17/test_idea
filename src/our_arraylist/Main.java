package our_arraylist;

public class Main {
    public static void main(String[] args) {
        OurList<String> ourList1 = new OurArrayList<>();
        OurList<Integer> ourList2 = new OurArrayList<>();

        ourList1.append("One");
        ourList1.append("Two");
        ourList1.append("Three");
        System.out.println(ourList1);
        System.out.println(ourList1.size());
        ourList1.removeById(0);
        System.out.println("After remove One:");
        System.out.println(ourList1);

        System.out.println();
        ourList2.append(1);
        ourList2.append(2);
        ourList2.append(3);
        ourList2.append(4);
        System.out.println(ourList2);
        System.out.println(ourList2.size());
        ourList2.remove(2);
        System.out.println("After remove 2:");
        System.out.println(ourList2);
        ourList2.set(6,0);
        System.out.println("After change 1 to 6:");
        System.out.println(ourList2);


    }
}
