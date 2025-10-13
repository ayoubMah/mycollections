package ayoub.collections;

public interface Collection<E> extends Iterable{
    boolean add(E e);
    boolean addAll(Collection<? extends E> c);
    void clear(); // remove add elms of this collection
    boolean contains(Object o);
    boolean containsAll(Collection<?> c);
    boolean equals(Object o);
    int hashCode();
}
