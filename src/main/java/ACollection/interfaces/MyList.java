package ACollection.interfaces;

// this interface "MyList" will represent the same List interface in java collection framework
// we can't directly instantiate an instance from it but we'll pass with MyArrayList and MyLindedList

public interface MyList {
    public void add(int e);
    public int get(int index);
    public void set(int index , int e);
    public int size();
    public void display();
    public int max();
    public int min();
    public boolean isEmpty();

}
