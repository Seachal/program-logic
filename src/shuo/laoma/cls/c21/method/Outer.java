package shuo.laoma.cls.c21.method;

public class Outer {

    private int a = 1000000000;
//  inter太大，会报错
//    private int b = 10000000000;
    private static  int s = 10;
    
    public void test(final int param){
        final String str = "hello";
        class Inner {
            public void innerMethod(){
                System.out.println("outer a " +a);
                System.out.println("param " +param);
                System.out.println("local var " +str);

                System.out.println("outer  " +s);
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }

    public static  void statictest(final int param){
        final String str = "hello";
        class Inner {
            public void innerMethod(){
//                不能访问外部非静态
//                System.out.println("outer a " +a);
                System.out.println("param " +param);
                System.out.println("local var " +str);
                System.out.println("outer  " +s);
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }

}
