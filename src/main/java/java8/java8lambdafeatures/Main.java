package java8.java8lambdafeatures;


interface Shape{
    void draw();
}

class Rectangle implements  Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle draw method");
    }
}

class Square implements  Shape{

    @Override
    public void draw() {
        System.out.println("square draw method");
    }
}

class Circle implements  Shape{

    @Override
    public void draw() {
        System.out.println("circle draw method");
    }
}

public class Main {
    public static void main(String[] args) {


        print(()-> System.out.println("rectangle ,methos draw"));
        print(()-> System.out.println("square ,methos draw"));
        print(()-> System.out.println("circle ,methos draw"));
    }

    public static  void print(Shape shape){
        shape.draw();
    }
}