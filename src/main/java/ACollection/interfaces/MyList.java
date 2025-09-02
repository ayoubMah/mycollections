package ACollection.interfaces;

// this interface "MyList" will represent the same List interface in java collection framework
// we can't directly instantiate an instance from it but we'll pass with MyArrayList and MyLindedList

public interface MyList<E> {
    int size();
    boolean isEmpty();
    boolean add(E e);
    E get(int index);
    void set(int index , E elm);
    void display();
    boolean contains(E elm);
    boolean remove(E elm);
    boolean removeAll(E elm); // remove all elms 'elm' from the list
    int indexOf(E elm);
    void clear();
    E[] toArray();

    // TODO : iterator, containsAll, addAll, removeAll, retainAll,  lastIndexOf, listItirator, subList


}