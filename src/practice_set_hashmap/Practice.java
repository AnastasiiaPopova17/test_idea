package practice_set_hashmap;

import java.util.*;

public class Practice {
    /*
    s isp mnozhestv(Set) napisat' metod, kotoriy
    vernet list bez povtoryayushihsya el-v

     */
    public static void main(String[] args) {
        Practice practice = new Practice();
        List<String> list = new ArrayList<>();
        list.add("john");
        list.add("ann");
        list.add("john");
        list.add("ann");
        list.add("bill");
        System.out.println(practice.removeDupLicates(list));

        System.out.println(practice.getDuplicates(list));
    }

    public List<String> removeDupLicates (List<String> input){
        Set<String> set = new HashSet<>(input);
        return new ArrayList<>(set);
    }


    /*
    /*
    C использованием множеств написать метод, который вернет из списка
    имен повторяющиеся элементы
    {John, Mary, Peter, John, ,John, Mary, Ann} -> John, Mary
     */
    public List<String> getDuplicates( List<String> input){
      Set<String> set = new HashSet<>();
      List<String> duplicates = new ArrayList<>();
      for (String s : input){
          if (!set.add(s) && !duplicates.contains(s))
              duplicates.add(s) ;
      }
      return duplicates;
    }
}
