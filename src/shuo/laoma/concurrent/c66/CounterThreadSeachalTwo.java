package shuo.laoma.concurrent.c66;


/**
 *
 *
 */
public class CounterThreadSeachalTwo extends Thread {
    Counter counter;

    public CounterThreadSeachalTwo(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
    	for(int i= 0; i<1000; i++) {
    		counter.incr();
		}
    }

    public static void main(String[] args) throws InterruptedException {
        int num = 1000;
        int num1 = 500;
        Counter counter = new Counter();
        Counter counter1 = new Counter();
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; i++) {
            threads[i] = new CounterThreadSeachalTwo(counter);
            threads[i].start();
        }

        Thread[] threads1 = new Thread[num1];
        for (int i = 0; i < num1; i++) {
            threads1[i] = new CounterThreadSeachalTwo(counter1);
            threads1[i].start();
        }


        for (int i = 0; i < num; i++) {
            threads[i].join();
        }

        for (int i = 0; i < num1; i++) {
            threads1[i].join();
        }
        System.out.println(counter.getCount());
        System.out.println(counter1.getCount());
    }
}

