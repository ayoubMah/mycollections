package ayoub.impl;

public class Arrays<E> {
    private E [] arr;
    private int nElm;

    public Arrays(int capacity){
        E[] arr = (E[]) new Object[capacity];
        this.arr = arr;
        nElm = 0;
    }

    // insert method
    public void add(E elm){
        arr[nElm] = elm;
        nElm ++ ;
    }

    // the length of the array
    public int len(){
        return nElm;
    }

    // is an elm in the array
    public boolean contains(E elm){
        int j;
        for (j=0; j < nElm; j++){
            if (arr[j].equals(elm)) break;
        }
        if (j == nElm) return false; // or just with a simple syntax return j != nElm;
        else return true;
    }

    // delete a specific elm
    public boolean delete(E elm){
        int j;
        for (j = 0; j < nElm; j++){
            if (arr[j].equals(elm)) break;
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
        System.out.print("[ ");
        for (j = 0; j < nElm; j++){
            System.out.print(arr[j] + "  ");
        }
        System.out.print("]");
        System.out.println(" ");
    }

    // get the max of an array
//    public int max(){
//        int j = 0;
//        int max = arr[j];
//        for (j = 0; j < nElm; j++){
//            if (arr[j] > max){
//                max = arr[j];
//            }
//        }
//        return max;
//    }

    // get an element of a specific index
    public E get(int index){
        if (index < 0 || index > nElm) return null;
        return arr[index];
    }
//    public String get(int index){
//        int j;
//        for(j = 0; j < nElm; j++){
//            if(j == index) break;
//        }
//        if(j == nElm){
//            System.out.println("this index is out of the bound so you'll get empty string");
//            return "";
//        }
//        return arr[j].toString();
//
//    }

    // set an element of a specific index => override it if an othe elm exist in this index
    public void set(int index, E value){
        int j;
        for(j = 0; j < nElm; j++){
            if(j == index) break;
        }
        if(j == nElm){
            System.out.println("this index is out of the bound we don't set anything :)");
        }
        arr[j] = value;
        System.out.println("the new value of the index: "+index+" is => "+value);
    }


    // indexOf(elm): to get the index of the elm if it is exist in the array if not you'll get -1
    public int indexOf(E elm){
        int j;
        for(j = 0; j < nElm; j++){
            if(arr[j].equals(elm)) break;
        }
        if(j == nElm){
            System.out.println("the elm "+elm+" doesn't exist in the array so you'll get -1");
            return -1;
        }
        return j;
    }

    public boolean isEmpty(){
        if(nElm == 0) return true;
        return false;
    }

    // TODO: clear() method not completed
//    public void clear(){
//        int j;
//        for(j = 0; j < nElm; j++){
//            if(arr[j] != null) break;
//        }
//    }


    // TODO: addAt method not completed

//    public void addAt(int index, int value){
//        int j = 0;
//        while (j < index) {
//            j++;
//        }
//        nElm++;
//        for (int k = j+1 ; k < nElm ; k++){
//            this.add(arr[k]);
//        }
//        arr[index] = value;
//
//
//        for (int k = j + 1  ; k < nElm ; k++,j++){
//            arr[k] = arr[k+1];
//        }
//        nElm ++;
//    }

    // bubble sort
    // i'll call the swap method to swap 2 elms
//    public void swapi(int index1, int index2){
//        Object temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//    }

//    public void bubbleSort(){
//        int i,j;
//        for(j = nElm - 1; j > 0; j-- ){
//            for (i = 0; i < j; i++ ){
//                if(arr[i] > arr[i+1]){
//                    swap(i, i+1);
//                }
//            }
//        }
//    }
//
//    public void selectionSort(){
//        int i, j, min;
//        for(i = 0; i < nElm - 1; i++){
//            min = i;
//            for(j = i + 1; j < nElm; j++){
//                if(arr[j] < arr[min]){
//                    min = j;
//                }
//            }
//            if(min != i) {
//                swap(i, min);
//            }
//        }
//    }
//
//    public void insertionSort(){
//        int i, j;
//        for(i = 1; i < nElm; i++){
//            int temp = arr[i];
//            j = i - 1;
//            while(j >= 0 && arr[j] > temp){
//                arr[j + 1] = arr[j];
//                j--;
//            }
//            arr[j + 1] = temp;
//        }
//    }
}
