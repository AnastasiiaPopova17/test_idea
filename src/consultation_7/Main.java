package consultation_7;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeCharacter("Hello", 'e'));

    }
    public static String removeCharacter(String str, char ch){

        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (char x : charArray){
            if (x != ch){
                stringBuilder.append(x);
            }
        }
        return stringBuilder.toString();



    }
}
