package java8.java8lambdafeatures;

interface  Addable{
    int add(int a,int b);
}

class AddableImpl implements Addable{

    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
public class LambdaParameters {
    public static void main(String[] args) {
        Addable addition = (int a, int b) -> (a + b);
        System.out.println( addition.add(4,5));

    }

}
