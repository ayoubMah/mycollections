package ACollection.interfaces;

// this interface "MyList" will represent the same List interface in java collection framework
// we can't directly instantiate an instance from it but we'll pass with MyArrayList and MyLindedList

public interface MyList<E> {
    public int size();
    public boolean isEmpty();
    boolean add(E e);
    public E get(int index);
    public void set(int index , E elm);
    public void display();
    public boolean contains(E elm);
    public boolean remove(E elm);
    public int indexOf(E elm);


}
