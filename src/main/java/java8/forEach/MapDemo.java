package java8.forEach;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,Person > map=new HashMap();
        map.put(1,new Person("Ammu",27));
        map.put(2,new Person("Veera",30));
        map.put(3,new Person("lali",55));
        map.put(4,new Person("monu",5));
        map.put(5,new Person("chasu",2));

        //for each loop
        for (Map.Entry<Integer,Person> entry:map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().getName());
        }
        
        //for each for lambda
        map.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v.getName());
        });


    }
}
