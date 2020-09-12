package shuo.laoma.concurrent.c66;

/**
 * @program: program_logic
 * @description: 非同步锁
 * @author: zhangxc
 * @create: 2019-04-09 11:10
 **/
public class CounterSeachal {
    private int count;

    public synchronized void incr() {
        count++;
    }

/*    public  void decr() {
        count--;
    }
    没有synchronized 修饰时， 989892
    因为 synchronized不能防止非synchronized方法同时被执行。
    */


    /**
     * 990000
     */
    public synchronized void decr() {
        count--;
    }

    public synchronized int getCount() {
        return count;
    }


}
