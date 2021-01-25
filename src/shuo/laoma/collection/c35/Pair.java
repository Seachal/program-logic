package shuo.laoma.collection.c35;


/**
 * 8.1.1 个简单泛型类
 *  * 1 基本概念
 * @param <U>
 * @param <V>
 */
public class Pair<U, V> {

    U first;
    V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    /**
     *
     */
    public static void main(String[] args) {
//        8.1.1 一个简单泛型类 *1 基本概念
        Pair<String, Integer> pair = new Pair<String, Integer>("29", 100);
        System.out.println("fiset:" + pair.getFirst());
        System.out.println("second:" + pair.getSecond());


/*
//      8.1.1  一个简单泛型类 *3  优点缺点
//     泛型的优点，更好的可读性，更好的安全性。
        Pair<String, Integer> pair1 = new Pair<>("29", 1);
        Integer id = pair1.getFirst();//有编译错误
        String name = pair1.getSecond();//有编译错误 */


    }
}