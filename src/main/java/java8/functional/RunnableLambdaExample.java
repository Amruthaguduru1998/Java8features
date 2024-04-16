package java8.functional;

//class ThreadDemo implements Runnable {
//
//
//    @Override
//    public void run() {
//        System.out.println("run method");
//    }
//}
public class RunnableLambdaExample {

    public static void main(String[] args) {
//        Thread t=new Thread(new ThreadDemo());
//        t.start();

        Runnable r=()-> System.out.println("run method()");


        Thread t1=new Thread(r);
        t1.start();
    }
}
