package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElementsDemo {
    public static void main(String[] args) {
        List<Integer> lis= Arrays.asList(1,2,3,2,1);
        Optional<Integer> first = lis.stream().findFirst();
        if (first.isPresent()){
            System.out.println(first.get());
        }else {
            System.out.println("stream is empty");
        }
        System.out.println(first.get());

        System.out.println("=========");
        Optional<Integer> first1 = lis.stream().findAny();
        if (first1.isPresent()){
            System.out.println(first1.get());
        }else {
            System.out.println("stream is empty");
        }
        System.out.println(first1.get());
    }
}
