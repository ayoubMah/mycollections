package ayoub.abstracts;

import ayoub.collections.MyList;

import java.util.Iterator;

public abstract class AbstractMyList<E> extends AbstractMyCollection<E> implements MyList<E> {

    // add() and remove() are abstract now
    public abstract void add(int index, E elm);
    public abstract E remove(int index);

    // imp methods
    public E get(int index){
        Iterator<E> it = this.iterator();
        if (index < 0) {
            System.out.println("the index should be positif");
            return null;
        } else {
            if (index == 0) return it.next();
            int i = 0;
            while (index != i){
                i++;
                it.next();
            }
            return it.next();
        }
    }
}
