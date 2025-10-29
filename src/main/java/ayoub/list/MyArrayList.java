package ayoub.list;


import ayoub.abstracts.MyAbstractList;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> extends MyAbstractList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private E[] arr;
    private int size;

    public MyArrayList(){
        arr = (E[])new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void rangeCheck(int index) {
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("index: "+index + ", size: "+size);
        }
    }

    // this is the magic behind dynamic list
    // it's just creating a new array with a length bigger then the first one by 50%
    // and then copy/paste the odl elms of the prev array to the new one
    public void ensureCapacity(int minCapacity){
        if (minCapacity > arr.length){
            int newCap = arr.length + (arr.length >> 1); // 50%
            arr = Arrays.copyOf(arr, newCap); // todo: it'll be good if you imp yourself the logic of copy/paste
        }

    }

    @Override
    public E get(int index) {
        // before we return it -> we should verify if the index not out of the array
        rangeCheck(index);
        return arr[index];
    }

    // return the prev elm that was reserved in arr[index]
    @Override
    public E set(int index, E elm) {
        rangeCheck(index);
        E prevElm = arr[index];
        arr[index] = elm;
        return prevElm;
    }

    @Override
    public void add(int index, E elm) {
        ensureCapacity(size+1); // the minimum capacity accepted to add one elm is size+1
        arr[index] = elm;
        size++;
    }

    @Override
    public boolean add(E elm) {
        ensureCapacity(size + 1);
        arr[size + 1] = elm;
        return true;
    }

    // we should get a new array with size - 1 as length
    @Override
    public E remove(int index) {
        rangeCheck(index);
        int newLength = size - 1;

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }


    /*private final int DEFAULT_CAPACITY = 10; // the default capacity of my array i guess it is the same as ArrayList in java
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
    public boolean add(E o) {
        ensureCapacity(size+1);
        arr[size++] = o; // it is the same as i do arr[size] = o; size ++;
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
    public void set(int index, E elm) {
        rangeCheck(index);
        arr[index] =  elm;
    }
    // we should not display null => so if the value is null, it should be empty
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
    public boolean contains(E elm) {
        return indexOf(elm) != -1;
    }

    // remove the first founded elm if it was many of them
    @Override
    public boolean remove(E elm) {
        int index = indexOf(elm);
        if (contains(elm)){
            for (int i = index; i < size -1; i++ ){ // size -1 to not get out of bound exception
                arr[i] = arr[i+1];
            }
            arr[--size] = null; // or arr[size -1] = null; size --;
        }
        return false;
    }

  // remove the elms 'elm' from the list 
  // for example if we have the list [5,3,6,6,2,5,6,8,9,4]
  // and we want to remove the elm 6 so we get [5,3,2,5,8,9,4]
    @Override
    public boolean removeAll(E elm) {
      while (indexOf(elm) != -1) {
        this.remove(elm);
      }
      return false;
    }


    @Override
    public int indexOf(E elm) {
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
// [1  2  3  5  4]
    @Override
    public void clear() {
        while(!this.isEmpty()){
            for(E elm: arr){
                this.remove(elm);
            }
        }
        System.out.println("the arr is empty");
    }
    // TODO imp toArray method
    @Override
    public E[] toArray() {
        return null;
    }*/


}
