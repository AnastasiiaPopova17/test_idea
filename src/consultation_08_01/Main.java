package consultation_08_01;

public class Main {
    /*
    Пусть  есть строка, состоящая только из букв английского алфавита. Написать метод,
    проверяющий являются ли все буквы в строке уникальными ( не повторяющимися).
    ( Все буквы в строке в одном регистре)
     */
    public static void main(String[] args) {
        System.out.println(AreUnique("frttgh"));

    }
    public static boolean AreUnique(String word){
        char[] chars = word.toCharArray();
        for (int i = 0; i < word.length() - 1; i++){
         if (chars[i] == chars[i+1]){
             return false;
         }
         //return true;
     }

        return true;
    }

}
