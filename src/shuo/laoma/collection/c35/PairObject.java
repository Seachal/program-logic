package shuo.laoma.collection.c35;


/**
 * 8.1.1 个简单泛型类
 *  * 2 基本原理
 */
public class PairObject {
// 将类型T擦除,替换为 Objec;  插入必要的类型转换
    Object first;
    Object second;

    public PairObject(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

    /**
     *
     */
    public static void main(String[] args) {
        Pair minmax =new Pair(1, 100);
//插入必要的类型转换
        Integer min=(Integer) minmax.getFirst();
        Integer max =(Integer ) minmax.getSecond();
        Pair kv= new Pair("name","老马");
        String key = (String) kv.getFirst();
        String value =(String )kv.getSecond();
    }
}