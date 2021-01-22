package shuo.laoma.cls.c19.c191;

import shuo.laoma.cls.c18.ChildV1;

/**
 * @program: program-logic
 * @description:
 * @author: zhangxc
 * @create: 2021-01-22 16:45
 *
 * 使用组合和接口代替继承
 **/
public class Test {

    public static void main(String[] args) {
        Child c = new Child();
        c.addAll(new int[]{1,2,3});
        System.out.println(c.getSum());
    }
}
