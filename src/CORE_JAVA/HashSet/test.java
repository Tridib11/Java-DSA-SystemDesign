package CORE_JAVA.HashSet;
import java.util.*;
public class test {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>(); //usnique elements
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(5);
        set.add(7);
        set.add(9);
        System.out.println(set);
        //Search
        if(set.contains(2)){
            System.out.println("True");
        }else{
            System.out.println("false");
        }

        //delete
        set.remove(1);
        if(set.contains(1)){
            System.out.println("True");
        }else{
            System.out.println("false");
        }

        //Length


        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
