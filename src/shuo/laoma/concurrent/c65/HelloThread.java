package shuo.laoma.concurrent.c65;

public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println("thread name: " + Thread.currentThread().getName());
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Thread thread = new HelloThread();

        System.out.println("start:Priority" + thread.getPriority());
        thread.start();

        Thread thread1 = new HelloThread();
        System.out.println("run:Priority" + thread.getPriority());
        thread1.run();
    }
}
