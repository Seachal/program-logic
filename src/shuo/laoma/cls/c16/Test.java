package shuo.laoma.cls.c16;

public class Test {
	public static void main(String[] args) {
		Child c = new Child();
		c.test();
	}

	/**
	 * 输出结果
	 * 子类构造方法, a: 0
	 * 子类构造方法, a: 123
	 */
}



/**
 * 第一次输出为0,第二次输出为123。第一行为什么是0呢?第一次输出是在new过程中输出的,在new 过程中,首先是初始化父类,
 * 父类构造方法调用test()方法,test()方法被子类重写了,就会调用子类的test()方法,子类方法访问子类实例变量a,
 * 而这个时候子类的实例变量的赋值语句和构造方法还没有执行,所以输出的是其默认值0
 */
