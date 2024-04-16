package java8.functioninterfaceExample;

interface Shape{
    void draw();
}
public class Test {
    public static void main(String[] args) {

        Shape s=()-> System.out.println("square method");
        s.draw();
    }
}
