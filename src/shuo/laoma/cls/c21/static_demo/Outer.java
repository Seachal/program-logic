package shuo.laoma.cls.c21.static_demo;


/**
 * 与其他内部类相比)。它可以访问外部类的静态变量和方法如 innermethod直接访问 shared变量,
 * 但不可以访问实例变量和方法。
 * 在类内部,可以直接使用内部静态类
 */
public class Outer {

    private static int shared = 100;
    private  int age = 100;

//   静态内部类
    public static class StaticInner {
        public void innerMethod(){
            System.out.println("inner " + shared);
//            不可访外部类实例变量
//            System.out.println("inner " + age);
        }
        public  static  void  innerStaticMethod(){
            System.out.println("inner innerStaticMethod " + shared);
        }

    }
    
    public void test(){
        StaticInner si = new StaticInner();
        si.innerMethod();
    }
}
