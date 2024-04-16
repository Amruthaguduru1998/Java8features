package java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {

        Stream<Object> s=Stream.of("a","b","c");
        s.forEach(System.out::println);

        Collection<String> collection= Arrays.asList("ammu","veera","monu");
        Stream<String> s1=collection.stream();
        s1.forEach(System.out::println);

        List<String> list= Arrays.asList("ammu","veera","monu");
        Stream<String> l=list.stream();
        l.forEach(System.out::println);

        Set<String> set= new HashSet<>(list);
        Stream<String> x=list.stream();
        x.forEach(System.out::println);
    }
}
