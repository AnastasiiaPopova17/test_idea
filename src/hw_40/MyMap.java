package hw_40;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    /*
    Задача 1
Дана Map<String, String> map, написать метод, который вернет Мап, такую,
что если в исходной map есть ключи ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’
с суммой значений от ключей a и b. Если нет, ничего не менять.
Примеры:
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
     */
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("a","hi");
        map.put("b","There");
        System.out.println(map);
        System.out.println(changeMap1(map));
    }

//    public static Map<String, String> changeMap (Map<String,String> map){
//        Map<String, String> reMap = new HashMap<>();
//        String newKey = "" ;
//        String newValue = "";
//
//        for (String key : map.keySet()){
//            if (map.size()>1){
//                newKey = newKey.concat(map.get(key));
//               newValue = newValue + map.values();
//               reMap.put(newKey,newValue);
//            }
//        }
//        return reMap;

    public static Map<String,String> changeMap1 (Map<String,String> map){
        Map<String,String> newMap = new HashMap<>();
        StringBuilder result = new StringBuilder();
        StringBuilder result1 = new StringBuilder();

        for (String key: map.keySet()){
            result = result.append(map.keySet());
            result1 = result1.append(map.values());
            newMap.put(result.toString(), result1.toString());
            break;
        }
        return newMap;

    }

}
