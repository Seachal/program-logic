package shuo.laoma.basic.c11;

public class Array {

	public static void reset(int[] arr){
	    for(int i=0;i<arr.length;i++){
	        arr[i] = i;
	    }
	}

	public static void main(String[] args) {
	    int[] arr = {10,20,30,40};
//		arr2t 这种写法是错误的
//	    int[] arr2t = new int[2]{2,3};
	    int[] arr2 = new int[]{2,3};
	    reset(arr);
	    for(int i=0;i<arr.length;i++){
	        System.out.println(arr[i]);
	    }

		int[] arrA = {1,2,3};
	    int[] arrB = {4,5,6,7};
	    arrA = arrB;

	}

}
