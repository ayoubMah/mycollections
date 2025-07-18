package ACollection.lists;


import ACollection.interfaces.MyList;

public class MyArrayList implements MyList {
    private final int DEFAULT_CAPACITY = 10; // the default capacity of our array i guess it is the same value as ArrayList in java
    private int[] arr;
    private int size;

    // the default constructor
    public MyArrayList(){
        arr = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    // if i want to create an instance of MyArrayList with an explicite capacity
    public MyArrayList(int initialCapacity){
        arr = new int[initialCapacity];
        size = 0;
    }


    @Override
    public void add(int e) {
        ensureCapacity(size+1);
        arr[size++] = e;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public void set(int index, int e) {
        arr[index] = e;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void display() {
        int j;
        System.out.print("[ ");
        for (j = 0; j < size; j++){
            System.out.print(+arr[j] + "  ");
        }
        System.out.print("]");
        System.out.println(" ");

    }

    @Override
    public int max() {
        int j = 0;
        int max = arr[j];
        for (j = 0; j < size; j++){
            if (arr[j] > max){
                max = arr[j];
            }
        }
        return max;
    }

    @Override
    public int min() {
        int j = 0;
        int min = arr[j];
        for (j = 0; j < size; j++){
            if (arr[j] < min){
                min = arr[j];
            }
        }
        return min;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0){
            return true;
        }
        return false;
    }

    private void ensureCapacity(int minCapacity){
        if(minCapacity - arr.length > 0){
            growCapacity(minCapacity);
        }
    }

    private void growCapacity(int minCapacity){
        int oldCapacity = arr.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity  < minCapacity){
            newCapacity = minCapacity;
        }
        int[] newArr = new int[newCapacity];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
    }


}
