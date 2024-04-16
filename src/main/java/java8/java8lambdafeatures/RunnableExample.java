package java8.java8lambdafeatures;

class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("run method" );
    }
}
public class RunnableExample {
    public static void main(String[] args) {
        Thread thread=new Thread(new ThreadDemo());
        thread.start();
        Runnable runnable=()-> System.out.println("run method using lambda");
       Thread threadlambda=new Thread(runnable);
       threadlambda.start();
    }
}
