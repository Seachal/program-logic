package shuo.laoma.collection.c35;

public class NumberPair<U extends Number, V extends Number> extends Pair<U, V> {

    public NumberPair(U first, V second) {
        super(first, second);
    }
    
    public double sum(){
        return getFirst().doubleValue()
                +getSecond().doubleValue();
    }
    
    public static void main(String[] args){
//        sca: 例如把 10 改为"10"就会报错。
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