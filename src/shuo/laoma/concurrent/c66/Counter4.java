package shuo.laoma.concurrent.c66;

/**
 * @program: program_logic
 * @description: 非同步锁
 * @author: zhangxc
 * @create: 2019-04-09 11:10
 **/
public class Counter4 {
    private int count;

    public  void incr(){
        count ++;
    }

    public  int getCount() {
        return count;
    }
}
