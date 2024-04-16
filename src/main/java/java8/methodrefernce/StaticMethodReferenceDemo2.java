package java8.methodrefernce;

interface Sayable{
    void say();
    static void saySomething(){
        System.out.println("hello this is static method");
    }
}

public class StaticMethodReferenceDemo2 {
    public static void main(String[] args) {

    Sayable sayable = Sayable::saySomething;
    sayable.say();
}
}
