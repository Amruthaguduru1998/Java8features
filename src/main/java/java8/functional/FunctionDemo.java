package java8.functional;

import java.util.function.Function;

//class FunctionalImp implements Function<String,Integer>{
//
//
//    @Override
//    public Integer apply(String s) {
//        return s.length();
//    }
//}
public class FunctionDemo {

    public static void main(String[] args) {

        Function<String,Integer> fn=(s)->
             s.length();
        System.out.println(fn.apply("Amrutha"));
    }
}
