package shuo.laoma.collection.c35;

/**
 * 8.1.5类型参数的限定
 * @param <U>
 * @param <V>
 *
 *
 */

// 可以定义一个子类 Number Pair,限定两个类型参数必须为 Number
public class NumberPair<U extends Number, V extends Number> extends Pair<U, V> {

    public NumberPair(U first, V second) {
        super(first, second);
    }

//    比如,对于 Number Pairz类,frst和 secondz变量就可以当作Numberi进行处理了。比如可以定义一个求和方法
    public double sum(){
        return getFirst().doubleValue()
                +getSecond().doubleValue();
    }
    
    public static void main(String[] args){
//        例如使用 String 编译器会报错。
//        NumberPair<String, Double> pair = new NumberPair<>(10, 12.34);
    	NumberPair<Integer, Double> pair = new NumberPair<>(10, 12.34);
    	double sum = pair.sum();
//    	seachal add:
    	System.out.println("sum:"+sum);
    }
}    
/**
 *
 * seachal  add
 * */