package ACollection.array;

public class Array {
    private int [] arr;
    private int nElm;

    public Array(int max){
        arr = new int[max];
        nElm = 0;
    }

    // insert method
    public void add(int elm){
        arr[nElm] = elm;
        nElm ++ ;
    }

    // the length of the array
    public int len(){
        return nElm;
    }

    // is an elm in the array
    public boolean contain(int elm){
        int j;
        for (j=0; j < nElm; j++){
            if (arr[j] == elm) break;
        }
        if (j == nElm) return false; // or just with a simple syntax return j != nElm;
        else return true;
    }

    // delete a specific elm
    public boolean delete(int elm){
        int j;
        for (j = 0; j < nElm; j++){
            if (arr[j] == elm) break;
        }
        if (j == nElm) {
            System.out.println("the elm "+ elm+ " do not exist in the array");
            return false;
        }
        else {
            for (int k = j; k < nElm - 1; k++){
                arr[k] = arr[k+1];
            }
            nElm -- ; // reduce the size bye one
            System.out.println("the elm "+ elm+ " removed successfully!");
            return true;
        }
    }

    // display the array as string
    public void display(){
        int j;
        for (j = 0; j < nElm; j++){
            System.out.print(arr[j] + "  ");
        }
        System.out.println(" ");
    }

    // get the max of an array
    public int max(){
        int j = 0;
        int max = arr[j];
        for (j = 0; j < nElm; j++){
            if (arr[j] > max){
                max = arr[j];
            }
        }
        return max;
    }
}
