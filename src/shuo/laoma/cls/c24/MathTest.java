package shuo.laoma.cls.c24;

/**
 * @program: program-logic
 * @description:
 * @author: zhangxc
 * @create: 2021-01-28 17:53
 **/
public class MathTest {

    public static void main(String[] args) {
        compute2();

    }

    private  static  void compute2(){
//         compute();

//      如果没有异常处理，有异常会沿着调用传递。
        try {
            compute();
        }catch (Exception e){
            //
        }
    }
    private static void  compute(){
        int i = 1/0;
    }
}
