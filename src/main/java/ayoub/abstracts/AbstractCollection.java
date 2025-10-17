package ayoub.abstracts;

import ayoub.collections.Collection;

import java.util.Iterator;

public abstract class AbstractCollection<E> implements Collection<E> {

    // this 2 methods are abst cuz it'll be a different imp for each collection: list, linkedlist ...
    public abstract Iterator<E> iterator();
    public abstract int size();

    // imp
    public boolean isEmpty(){
        return size() == 0;
    }

    public boolean contains(Object o){
        for (Iterator<E> itr = this.iterator() ; itr.hasNext();){
            Object elm = itr.next();
            if (elm.equals(o)) return true;
        }
        return false ;
    }


}
