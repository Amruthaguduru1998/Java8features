package java8.functioninterfaceExample;

@FunctionalInterface
public interface MyFuncationInterface {
    void print(String msg);

    default void m1(){
        System.out.println("default method");
    }

    static void m2(){
        System.out.println("static method");
    }
}
