package ACollection.lists;


import ACollection.interfaces.MyList;

import java.util.Arrays;

public class MyArrayList<E> implements MyList {
    private final int DEFAULT_CAPACITY = 10; // the default capacity of my array i guess it is the same as ArrayList in java
    private E [] arr;
    private int size;

    // the default constructor
    public MyArrayList(){
        E[] arr = (E[]) new Object[DEFAULT_CAPACITY];
        this.arr = arr;
        size = 0;
    }

    // if i want to create an instance of MyArrayList with an explicite capacity
    public MyArrayList(int initialCapacity){
        arr = (E[]) new Object[initialCapacity];;
        size = 0;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(Object o) {
        ensureCapacity(size+1);
        arr[size++] = (E) o; // it is the same as i do arr[size] = o; size ++;
        return true;
    }

    // TODO later: ensure the mincapacity > 0
    private void ensureCapacity(int minCapacity){
        if(minCapacity > arr.length){
            grow(minCapacity);
        }

    }
    // TODO later: handel the case of newCapacity > MaxArraysize declare it later
    private void grow(int minCapacity){
        int oldCapacity = arr.length;
        int newCapacity = oldCapacity + oldCapacity >> 1; // but i'm not sure if the library utils in java grow the capacity by 50%
        if(newCapacity - minCapacity < 0){
            newCapacity = minCapacity;
        }
        arr = Arrays.copyOf(arr, newCapacity);
    }

    @Override
    public E get(int index) {
        rangeCheck(index);
        return arr[index];
    }
    public boolean rangeCheck(int index) {
        return index >= 0 && index < size;
    }

    @Override
    public void set(int index, Object elm) {
        rangeCheck(index);
        arr[index] = (E) elm;
    }

    @Override
    public void display() {
        int j;
        System.out.print("[");
        for (j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.print("]");
        System.out.println("");
    }

    @Override
    public boolean contains(Object elm) {
        return indexOf(elm) != -1;
    }

//    @Override
//    public boolean remove(Object elm) {
//        return false;
//    }

    @Override
    public int indexOf(Object elm) {
        if (elm == null) {
            for(int i = 0; i < size; i++){
                if(arr[i] == null){
                    return i;
                }
            }
        }else {
            for(int i = 0; i < size; i++){
                if(arr[i].equals(elm)){
                    return i;
                }
            }
        }
        return -1;
    }

}
