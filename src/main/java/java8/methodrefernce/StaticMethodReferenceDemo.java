package java8.methodrefernce;

import java.util.function.BiFunction;
import java.util.function.Function;

public class StaticMethodReferenceDemo {

    static  int addition(int a,int b){

        return a+b;
    }
    public static void main(String[] args) {

        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(4));

        Function<Integer,Double> fn=Math::sqrt;
        System.out.println(fn.apply(16));

        BiFunction<Integer,Integer,Integer> biFunction=(a,b)->StaticMethodReferenceDemo.addition(a,b);
        System.out.println(biFunction.apply(10,20));

        BiFunction<Integer,Integer,Integer> biFunction1=StaticMethodReferenceDemo::addition;
        System.out.println(biFunction1.apply(20,20));
    }
}


