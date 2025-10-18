package ayoub.collections;

public interface MyCollection<E> extends Iterable<E>{
    // Adding elements
    boolean add(E e);
    //boolean addAll(Collection<? extends E> c);

    // Removing elements
    //boolean remove(Object o);
    //boolean removeAll(Collection<?> c);
    //void clear();

    // Querying
    boolean contains(Object o);
    //boolean containsAll(Collection<?> c);
    int size();
    boolean isEmpty();

    // Conversion
    Object[] toArray();
    //<T> T[] toArray(T[] a);

    // From Iterable
    //Iterator<E> iterator();

    // later i'll add the java8 features like streams and parallelstream ...
}
