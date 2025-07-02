package ACollection.lists;

import ACollection.interfaces.MyList;

public class MyArrayList<E> implements MyList<E> {

    E [] arr;

    @Override
    public boolean add(Object e) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E e) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
