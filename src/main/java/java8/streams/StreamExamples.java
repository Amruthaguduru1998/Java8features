package java8.streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        Stream<Integer> stream =Stream.of(1,2,3,4,5,6,7,8,9);
        System.out.println(stream.count());

        Stream<Integer> stream1 =Stream.of(1,2,3,4,5,6,7,8,9);
        Integer integer=stream1.min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("min: " +integer);

        Stream<Integer> stream2 =Stream.of(1,2,3,4,5,6,7,8,9);
        Integer intege=stream2.max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("min: " +intege);
    }
}
