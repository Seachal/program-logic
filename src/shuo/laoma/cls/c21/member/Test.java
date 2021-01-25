package shuo.laoma.cls.c21.member;

/**
 * @program: program-logic
 * @description:
 * @author: zhangxc
 * @create: 2021-01-22 17:50
 **/
public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner  inner =  outer.new Inner();
        inner.innerMethod();
    }
}
