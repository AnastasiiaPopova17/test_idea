package our_stringbuilder;

public class Main {

    /*
    S pomosch'yu stringbuildera mozhno izmenyat' stroki
     */
    public static void main(String[] args) {
        String a = "Hello";
        a = "Java";

        /*
        Nekotorie konstruktori:
        StringBuilder() - sozdaet pustoy stringbuilder s nachalnoy
        StringBuilder(String str) - sozdaet stringbuilder iz stroki
        StringBuilder(32)
         */

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(sb2);

        // metodi StringBuilder
        // append() - prisoedinyaet stroku k uzhe sushestvuyushey
        sb2.append(" Java");
        System.out.println(sb2);
        sb2.append(" !").append(12345);
        System.out.println(sb2);

        System.out.println(sb2.reverse());

        sb2.insert(1, "AAA");
    }
}
