package shuo.laoma.concurrent.c66;

public class CounterThreadSeachal extends Thread {
    Counter4 counter;

    public CounterThreadSeachal(Counter4 counter) {
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
        Counter4 counter = new Counter4();
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; i++) {
            threads[i] = new CounterThreadSeachal(counter);
            threads[i].start();
        }
        for (int i = 0; i < num; i++) {
            threads[i].join();
        }


        System.out.println(counter.getCount());
    }
}

    /**
     *
     * 1.多个线程是可以同时执行同一个synchronized实例方法的， 只要他们访问的对象是不同的即可
     * 2. synchronized实际保护的是 同一个 对象 的 方法 调用，对于同一个对象中的非synchronized方法，
     * 非synchronized方法不会被保护，会被同时执行。
     *
     * 总结，synchronized 实际保护 同一个 对象，防止{ }内被同时调用。
     *  Counter counter1 = new Counter();
     *
     *
     *
     */
