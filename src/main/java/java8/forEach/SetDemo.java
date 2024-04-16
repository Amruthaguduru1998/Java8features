package java8.forEach;

import java.util.ArrayList;
import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Person> set=new HashSet<>();
        set.add(new Person("Ammu",27));
        set.add(new Person("Veera",30));
        set.add(new Person("lali",55));
        set.add(new Person("monu",5));
        set.add(new Person("chasu",2));

        for (Person person:set) {
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
        set.forEach((p)->{
            System.out.println(p.getName());
            System.out.println(p.getAge());
        });

        set.stream().forEach(x-> System.out.println(x));
    }
}
