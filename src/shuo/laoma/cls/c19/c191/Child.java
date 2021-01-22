package shuo.laoma.cls.c19.c191;



public class Child  implements  IAdd {
	//	优先使用组合而非继承
	private Base base;
	private long sum;

	public Child(){
		base = new Base();
	}

	@Override
	public void add(int number) {
		base.add(number);
		sum+=number;
	}

	@Override
	public void addAll(int[] numbers) {
		base.addAll(numbers);
		for(int i=0;i<numbers.length;i++){
			sum+=numbers[i];
		}
	}

	public long getSum() {
		return sum;
	}
}