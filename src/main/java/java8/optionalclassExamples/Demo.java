package java8.optionalclassExamples;

import java.util.Objects;
import java.util.Optional;

public class Demo {
    public static <Int> void main(String[] args) {
       String s="ammu";
       String str=null;

        //Optional.empty()
        Optional<Objects> optionalInteger = Optional.empty();
        System.out.println(optionalInteger);

        //optional.of
        Optional<String> optionalInteger1=Optional.of(s);
        System.out.println(optionalInteger1);

        //Optional.ofNullable
        Optional<String> optionalS=Optional.ofNullable(str);
//        if (optionalS.isPresent()) {
//            System.out.println(optionalS.get());
//        }else {
//            System.out.println("no vale");
//        }

        //orElse
        String st=optionalS.orElse("veera");
        System.out.println(st);

        //orElseGet
        String s1 = optionalS.orElseGet(() -> "monu");
        System.out.println(s1);

//        String string_not_present = optionalS.orElseThrow(() -> new IllegalArgumentException("string not present"));
//        System.out.println(string_not_present);

        //ifpresrnt

        Optional<String> op=Optional.of("AMMU");
        op.ifPresent(x-> System.out.println("valu is present"));

//        Optional<String> ope=Optional.empty();
//        ope.ifPresent(y-> System.out.println("value not present"));

        String res="abc";

        Optional<String> optionalS1=Optional.of(res);
        optionalS1.filter(p->p.contains("abc"))
                .ifPresent(x-> System.out.println(x));


        String rest=" abc ";
        Optional<String> optionalS2=Optional.of(rest);
        optionalS1.filter(p->p.contains("abc"))
                .map(String::trim)
                .ifPresent(x-> System.out.println(x));


    }
}
