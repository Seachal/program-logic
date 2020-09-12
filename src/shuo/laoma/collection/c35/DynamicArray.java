package shuo.laoma.collection.c35;

import org.apache.poi.ss.formula.functions.T;

import java.util.Arrays;

public class DynamicArray<E> {

    //	seachal annotation  默认容量
    private static final int DEFAULT_CAPACITY = 10;

    private int size;
    private Object[] elementData;

    public DynamicArray() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = elementData.length;
        if (oldCapacity >= minCapacity) {
            return;
        }
        int newCapacity = oldCapacity * 2;
        if (newCapacity < minCapacity)
            newCapacity = minCapacity;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public void add(E e) {
        ensureCapacity(size + 1);
        elementData[size++] = e;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elementData[index];
    }

    public int size() {
        return size;
    }

    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public <T extends E> void addAll(DynamicArray<T> c) {
        for (int i = 0; i < c.size; i++) {
            add(c.get(i));
        }
    }

//	 seachal annotaion  根据 8.1.5 添加一些代码，此写法numbers.addAll(ints);处会提示编译错误
//	public void addAll(DynamicArray<E> c){
//		for (int i = 0; i < c.size; i++) {
//			add(c.get(i));
//		}
//	}

    //	此写法可以和   public <T extends E> void addAll(DynamicArray<T> c) 达到同样的效果，
//  两种写法有什么区别呢？
    public void addAll1(DynamicArray<? extends E> c) {
        for (int i = 0; i < c.size; i++) {
            add(c.get(i));
        }
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
//       它容纳的数据类型是作为参数传递过来的, 比如,存放 Number:
        DynamicArray<Number> numbers = new DynamicArray<>();
        DynamicArray<Integer> ints = new DynamicArray<>();
        ints.add(100);
        ints.add(34);
        numbers.addAll(ints);

    }

}

/**
 * seachal annotation：
 * ## 1
 * Arrays.copyOf(T[] original, int newLength)  是ArrayList 动态扩容的重点，  copyOf 方法内部使用
 * 根据类型判断生成不同的数组。
 * ? (T[]) new Object[newLength]
 * : (T[]) Array.newInstance(newType.getComponentType(), newLength);
 *
 *
 * ## 2
 */

