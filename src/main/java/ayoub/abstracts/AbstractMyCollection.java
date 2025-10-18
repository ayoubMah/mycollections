package ayoub.abstracts;

import ayoub.collections.MyCollection;

import java.util.Iterator;

public abstract class AbstractMyCollection<E> implements MyCollection<E> {

    // this 2 methods are abst cuz they'll be different in imp for each collection: list, linkedlist ...
    public abstract Iterator<E> iterator();
    public abstract int size();

    // imp
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean contains(Object o) {
        Iterator<E> it = this.iterator();
        while (it.hasNext()) {
            E elm = it.next();
            if (elm == null ? o == null : elm.equals(o)) { // we can do it wiht Objects.equals(elm, o)
                return true;
            }
        }
        return false;
    }

    public Object[] toArray(){
        Iterator<E> it = this.iterator();
        int len = this.size();
        Object[] arr = new Object[len];
        for (int i = 0; i < len; i++){
            arr[i] = it.next();
        }
        return arr;
    }

    public void looks(){
        System.out.print("[  ");
        Iterator<E> it = this.iterator();
        for (Iterator<E> iter = it; iter.hasNext(); ) {
            E elm = iter.next();
            String string = elm.toString();
            System.out.print(string);
            System.out.print(" , ");
        }
        System.out.print("  ]");
    }
}