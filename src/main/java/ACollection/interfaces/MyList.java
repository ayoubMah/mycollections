package ACollection.interfaces;

// this interface "MyList" will represent the same List interface in java collection framework
// we can't directly instantiate an instance from it but we'll pass with MyArrayList and MyLindedList

public interface MyList<E> {
    public boolean add(E e);
    public E get(int index);
    // set return the elem prev that was in this index
    public E set(int index , E e);
    public E remove(int index);
    public int size();
}
