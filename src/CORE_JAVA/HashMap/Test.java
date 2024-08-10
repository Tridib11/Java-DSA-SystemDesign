package CORE_JAVA.HashMap;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",1);
        map.put("US",2);
        map.put("China",3);
        System.out.println(map);
        map.put("China",180);
        System.out.println(map);


        if(map.containsKey("China")){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


        //for(int val:arr)

        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());

        }
    }
}
