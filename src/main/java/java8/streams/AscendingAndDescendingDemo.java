package java8.streams;

import java.util.*;
import java.util.stream.Collectors;

public class AscendingAndDescendingDemo {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");


        //ascending order
        fruits.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        fruits.stream().sorted().forEach(System.out::println);
        fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).forEach(System.out::println);

        System.out.println("---------------------");
        //descending oder
        fruits.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);
        fruits.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
