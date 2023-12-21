package homework.Main;

import java.util.Arrays;

public class HW_17 {
    public static void main(String[] args) {
        System.out.println(isAnagram("abc", "bac"));
        System.out.println(isAnagram("abc", "bak"));
        System.out.println(removeCharAtIndex("Hello", 3));


    /*Задача 2
    Написать метод, принимающий строку и целое число(индекс) и возвращающий строку без символа,
     находящегося по этому индексу.

    Пример:
    int index = 3
    String str = "Hello"

    public static String removeCharAtIndex( String str, int index) -> "Helo"
    */
    }

    public static boolean isAnagram(String str1, String str2) {
        /*
        abcd
        bcad
         */
        if (str1.length() != str2.length())
            return false;

            char[] chars1 = str1.toCharArray();
            char[] chars2 = str2.toCharArray();

            Arrays.sort(chars1);
            Arrays.sort(chars2);
            for (int i = 0; i < chars1.length; i++) {
                if (chars1[i] != chars2[i])
                    return false;
            }

            return true;
        }

    public static String removeCharAtIndex( String str, int index){
        return str.substring(0,index) + str.substring(index + 1);
    }

    public static String ourSubstring(String string, int begin, int end){
        String res = "";

        for (int i = begin; i < string.length() && i < end; i++){
            res = res + string.charAt(i);
            }
        return res;
    }
}





