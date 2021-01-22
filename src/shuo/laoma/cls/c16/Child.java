package shuo.laoma.cls.c16;

public class Child extends Base {
	private int a = 123 ;
	

	public Child(){
	}
	@Override
	public void test() {
		System.out.println("子类构造方法, a: "+a);
	}
}

