package ACollection.interfaces;

// this interface "MyList" will represent the same List interface in java collection framework
// we can't directly instantiate an instance from it but we'll pass with MyArrayList and MyLindedList

public interface MyList {
    public void add();
    public void get();
    public void set();
    public void remove();
    public void size();
}
