package consultation_7;

public class Main_2 {
    /*
    Пусть есть строка, состоящая только из маленьких латинских букв такого вида aaaabbccccd
    Нужно написать метод, возвращающий строку в таком виде 4a2b4cd
     */
    public static void main(String[] args) {
        System.out.println(calculateSymbol("aaabbc"));


    }
    public static String calculateSymbol(String string){
        StringBuilder str = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i++)){
                counter++;
                str.append(counter).append(str.charAt(i));
            }

        }
        return str.toString();


    }

}
