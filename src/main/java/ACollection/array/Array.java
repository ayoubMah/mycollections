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
    public boolean contains(int elm){
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

    // get an element of a specific index
    public int get(int index){
        int j;
        for(j = 0; j < nElm; j++){
            if(j == index) break;
        }
        if(j == nElm){
            System.out.println("this index is out of the bound so you'll get -1");
            return -1;
        }
        return arr[j];

    }

    // set an element of a specific index => override it if an othe elm exist in this index
    public void set(int index, int value){
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
    public int indexOf(int elm){
        int j;
        for(j = 0; j < nElm; j++){
            if(arr[j] == elm) break;
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
    public void clear(){
        int j;
        for(j = 0; j < nElm; j++){
            if(arr[j] != null) break;
        }
    }


    // TODO: addAt method not completed

    public void addAt(int index, int value){
        int j = 0;
        while (j < index) {
            j++;
        }
        nElm++;
        for (int k = j+1 ; k < nElm ; k++){
            this.add(arr[k]);
        }
        arr[index] = value;


//        for (int k = j + 1  ; k < nElm ; k++,j++){
//            arr[k] = arr[k+1];
//        }
        //nElm ++;
    }
}
