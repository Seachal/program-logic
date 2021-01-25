package shuo.laoma.cls.c21.member;

public class Outer {
    private int a = 100;
    
    public class Inner {
        private int b = 100;
//        会报错
//        private static  int sc = 100;

        public void innerMethod(){
            System.out.println("outer a " +a);
            Outer.this.action();
        }
    }
    
    private void action(){
        System.out.println("action");
    }
    
    public void test(){
        Inner inner = new Inner();
        inner.innerMethod();
    }
}
