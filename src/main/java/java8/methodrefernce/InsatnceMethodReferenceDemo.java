package java8.methodrefernce;

import java.util.Arrays;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
    void print(String msg);
}

public class InsatnceMethodReferenceDemo {

    void dispaly(String msg){
       msg= msg.toUpperCase();
        System.out.println(msg);
    }

    public static void main(String[] args) {

        InsatnceMethodReferenceDemo insatnceMethodReferenceDemo = new InsatnceMethodReferenceDemo();
        insatnceMethodReferenceDemo.dispaly("Amrutha");

        Printable printable = (msg) -> insatnceMethodReferenceDemo.dispaly(msg);
        printable.print("hello");

        Printable print=insatnceMethodReferenceDemo::dispaly;
        print.print("amrutha");

        Function<String,String> function=(msg)->msg.toUpperCase();
        System.out.println(function.apply("veera"));

        //specific type input
        Function<String,String> function1= String::toUpperCase;
        System.out.println(function1.apply("Bhrami"));

        String[] strArray={"A","d","b","g","l","c","e"};
        Arrays.sort(strArray, String::compareTo);

    }
}
