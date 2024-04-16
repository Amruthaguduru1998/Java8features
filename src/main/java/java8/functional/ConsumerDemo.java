package java8.functional;

import java.util.function.Consumer;

//class ConsumerImpl implements Consumer<String>{
//
//    @Override
//    public void accept(String s) {
//        System.out.println(s);
//    }
//}
public class ConsumerDemo {
    public static void main(String[] args) {

//    Consumer<String> consumer=new ConsumerImpl();
//    consumer.accept("Hello");

    Consumer<String> consumer1=(s)-> System.out.println(s);
    consumer1.accept("HelloWorld");
    }
}

