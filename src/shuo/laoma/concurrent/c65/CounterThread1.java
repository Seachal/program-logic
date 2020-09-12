package shuo.laoma.concurrent.c65;


/*
 *  seachal
 */
public class CounterThread1 extends Thread {
    private Counter1 counter;


    public CounterThread1(Counter1 counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incr();
            String name = String.valueOf(counter.getCount());
            counter.setName(name);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        int num = 1000;
        Counter1 counter1 = new Counter1();
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; i++) {
            threads[i] = new CounterThread1(counter1);
            threads[i].start();
        }

        for (int i = 0; i < num; i++) {
            threads[i].join();
        }

//        join的方式使得，最后插入的线程都执行完，最后再接着执行main Thread。
        System.out.println("counter:" + counter1.getCount());
        System.out.println("name:" + counter1.getName());
    }
}

/**
 * 几率问题，不是每次都是1000000，有几率出现如996839这样的值，
 */