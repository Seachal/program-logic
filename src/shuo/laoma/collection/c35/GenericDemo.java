package shuo.laoma.collection.c35;

import org.apache.poi.ss.formula.functions.T;


public class GenericDemo {

	/**
	 * 泛型方法
	 * @param arr
	 * @param elm
	 * @param <T>
	 * @return
	 */
//	seachal  annotation： 泛型方法，一个方法是不是泛型的，与它所在的类是不是泛型没有什么关系。
	public static <T> int indexOf(T[] arr, T elm){
	    for(int i=0; i<arr.length; i++){
	        if(arr[i].equals(elm)){
	            return i;
	        }
	    }
	    return -1;
	}

	/**
	 *  泛型方法
	 * @param first
	 * @param second
	 * @param <U>
	 * @param <V>
	 * @return  Pair<U,V>
	 */
	public static <U,V> Pair<U,V> makePair(U first, V second){
	    Pair<U,V> pair = new Pair<>(first, second);
	    return pair;
	}


	/**
	 * 泛型接口
	 * @param arr
	 * @param <T>
	 * @return
	 */
//	sca: 因为 <T extends Comparable<T>> 对 T 进行了修饰， 所以 T 可以作为一个返回类型，
	public static <T extends Comparable<T>> T max(T[] arr){
	    T max = arr[0];
	    for(int i=1; i<arr.length; i++){
	        if(arr[i].compareTo(max)>0){
	            max = arr[i];
	        }
	    }
	    return max;
	}

//	sca:  泛型方法   <T> 不能作为返回类型，
	public static <T>  void  max1(T[] arr){
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("泛型方法："+GenericDemo.indexOf(new Integer[]{1,2,3},2));
//		与泛型类不同,调用方法时一般并不需要特意指定类型参数的实际类型, Java编译器可以自动推断-
//		出来。 泛型类 Pair<String, Integer> 声明类型时，指定了类型参数的实际类型。
		System.out.println("泛型方法2："+GenericDemo.makePair(1,2).getSecond());
	}

}
