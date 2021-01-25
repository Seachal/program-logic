package shuo.laoma.cls.c21.anonymous;

import shuo.laoma.cls.c14.Point;

public class Outer {
    public void test(final int x, final int y){
// 建 Point对象的时候,定义了一个匿名内部类,这个类的父类是 Point,创建对象的时候,
// 给父类构造方法传递了参数2和3,重写了 distance()方法,在方法中访问了外部方法final参数x和y
        Point p = new Point(2,3){                
                                               
            @Override                              
            public double distance() {             
                return distance(new Point(x,y));     
            }                                      
        };                                       
                                                 
        System.out.println(p.distance());        
    }

}
