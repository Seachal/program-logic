package shuo.laoma.cls.c21.static_demo;


/**
 * @program: program-logic
 * @description:
 * @author: zhangxc
 * @create: 2021-01-22 17:46
 **/
public class Test {

    public static void main(String[] args) {
        Outer.StaticInner si = new Outer.StaticInner();
        si.innerMethod();

//         静态内部类，调用静态方法
        Outer.StaticInner.innerStaticMethod();
    }
}
