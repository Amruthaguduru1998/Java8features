package java8.methodrefernce;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class ConstructorMethodReference {

    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("apple");

        Function<List<String>, Set<String>> setFunction=(fruit)->new HashSet<>(fruit);
        System.out.println(setFunction.apply(fruits));

        Function<List<String>, Set<String>> setFunction1= HashSet::new;
        System.out.println(setFunction.apply(fruits));



    }
}
