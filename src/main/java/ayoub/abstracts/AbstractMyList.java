package ayoub.abstracts;

import ayoub.collections.MyList;

import java.util.Iterator;

public abstract class AbstractMyList<E> extends AbstractMyCollection<E> implements MyList<E> {

    // Abstract Methods ===============================================================================================================
    public abstract E get(int index); // it's abst cuz it needs storage info
    public abstract E set(int index, E elm); // why E? cuz it's return the previous elm that was in the same position
    public abstract void add(int index, E elm);
    public abstract E remove(int index);

    // concrete imp ===============================================================================================================

    // added in the tail so it's add(size(), E elm)
    public boolean add(E elm){
        int index = size(); // the current index of it
        add(index , elm); // add the elm in the tail of the collection
        return size() == index + 1 ; // if the new size() == the prev size() + 1 , cuz we add just by one
    }

    // TODO: cas of null object => o == null!
    public int indexOf(Object o){
        int index = 0;
        while (!o.equals(get(index))){
            index ++;
        }
        return index;
    }

    // imp methods
}
