package shuo.laoma.collection.c35;

import org.apache.poi.ss.formula.functions.T;

public class GenericDemo {

//	seachal  annotation： 泛型方法，一个方法是不是泛型的，与它所在的类是不是泛型没有什么关系。
	public static <T> int indexOf(T[] arr, T elm){
	    for(int i=0; i<arr.length; i++){
	        if(arr[i].equals(elm)){
	            return i;
	        }
	    }
	    return -1;
	}
	
	public static <U,V> Pair<U,V> makePair(U first, V second){
	    Pair<U,V> pair = new Pair<>(first, second);
	    return pair;
	}

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

//	sca:  泛型方法 <T> 不能作为返回类型，
	public static<T>  void  max1(T[] arr){
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
