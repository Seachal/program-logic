package shuo.laoma.collection.c36;

import java.util.Arrays;

public class DynamicArray<E> {

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

    public void addAll(DynamicArray<? extends E> c) {
        for (int i = 0; i < c.size; i++) {
            add(c.get(i));
        }
    }

    public void copyTo(DynamicArray<? super E> dest) {
        for (int i = 0; i < size; i++) {
            dest.add(get(i));
        }
    }

    public void copyTo01(DynamicArray<E> dest) {
        for (int i = 0; i < size; i++) {
            dest.add(get(i));
        }
    }


    public static <D, S extends D> void copy(DynamicArray<D> dest, DynamicArray<S> src) {
        for (int i = 0; i < src.size(); i++) {
            dest.add(src.get(i));
        }
    }

    public static <D> void copy2(DynamicArray<D> dest, DynamicArray<? extends D> src) {
        for (int i = 0; i < src.size(); i++) {
            dest.add(src.get(i));
        }
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        DynamicArray<Number> numbers = new DynamicArray<>();
        DynamicArray<Integer> ints = new DynamicArray<>();
        ints.add(100);
        ints.add(34);
        numbers.addAll(ints);


        DynamicArray<Integer> ints1 = new DynamicArray<>();
        DynamicArray<? extends Number> numbers1 = ints1;
        Integer a = 200;
//        主要是因为 add 的限制，'DynamicArray<? extends Number> numbers1 = ints1;' 没报错
//        numbers1.add(a);
//        numbers1.addAll(a);


//        ints.copyTo01(ints1);
//        ints.copyTo01(numbers);


        ints.copyTo(numbers);

    }

}
