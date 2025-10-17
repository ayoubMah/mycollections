package ayoub.abstracts;

import ayoub.collections.MyCollection;

import java.util.Iterator;

public abstract class AbstractMyCollection<E> implements MyCollection<E> {

    // this 2 methods are abst cuz they'll be different in imp for each collection: list, linkedlist ...
    public abstract Iterator<E> iterator();
    public abstract int size();

    // imp
    public boolean isEmpty(){
        return size() == 0;
    }

    public boolean contains(Object o){
        Iterator<E> it = this.iterator();
        while (it.hasNext()){
            E elm = it.next();
            if (elm == null){
                if (o == null) return true;
                return false;
            } else if (elm.equals(o)) {
                return true;
            }
            return false;
        }
        return false ;
    }

}
