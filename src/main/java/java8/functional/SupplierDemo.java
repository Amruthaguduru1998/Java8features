package java8.functional;

import java.time.LocalDateTime;
import java.util.function.Supplier;

//class SupplierIml implements Supplier<LocalDateTime> {
//
//    @Override
//    public LocalDateTime get() {
//        return LocalDateTime.now();
//    }
//}
public class SupplierDemo {
    public static void main(String[] args) {

//    Supplier<LocalDateTime> supplier = new SupplierIml();
//        System.out.println(supplier.get());

        Supplier<LocalDateTime> sur = ()-> LocalDateTime.now();
        System.out.println(sur.get());
}
}
