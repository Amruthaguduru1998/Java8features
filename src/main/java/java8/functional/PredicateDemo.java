package java8.functional;

import java.util.function.Predicate;

//class  PredicateImp implements Predicate<Integer>{
//
//    @Override
//    public boolean test(Integer x) {
//      if(x%2==0){
//          return true;
//      }
//      else {
//          return false;
//      }
//    }
//}
public class PredicateDemo {

    public static void main(String[] args) {
//        Predicate<Integer> p=new PredicateImp();
//        System.out.println(p.test(7));

        Predicate<Integer> p1=x->{
            if(x%2==0){
                return true;
            }
            else {
                return false;
            }
        };
        System.out.println(p1.test(8));
    }
}
