package ACollection;

import ACollection.array.Array;

public class Main {

    public static final String PURPLE_BRIGHT = "\u001B[95m";
    public static final String YELLOW_BRIGHT = "\u001B[93m";
    public static final String CYAN_BRIGHT = "\u001B[96m";
    public static final String RESET = "\u001B[0m";


    public static final String BORDER = CYAN_BRIGHT + "≫" + RESET;

    private static String createBorder(int length, String symbol) {
        StringBuilder border = new StringBuilder();
        for (int i = 0; i < length; i++) {
            border.append(symbol);
        }
        return border.toString();
    }

    public static void main(String[] args) {




        System.out.println();
        System.out.println("  " + createBorder(110, BORDER));
        System.out.println(PURPLE_BRIGHT +
                " ███╗   ███╗██╗   ██╗     ██████╗ ██████╗ ██╗     ██╗     ███████╗ ██████╗████████╗██╗ ██████╗ ███╗   ██╗" + RESET);
        System.out.println(YELLOW_BRIGHT +
                " ████╗ ████║╚██╗ ██╔╝    ██╔════╝██╔═══██╗██║     ██║     ██╔════╝██╔════╝╚══██╔══╝██║██╔═══██╗████╗  ██║" + RESET);
        System.out.println(PURPLE_BRIGHT +
                " ██╔████╔██║ ╚████╔╝     ██║     ██║   ██║██║     ██║     █████╗  ██║        ██║   ██║██║   ██║██╔██╗ ██║" + RESET);
        System.out.println(YELLOW_BRIGHT +
                " ██║╚██╔╝██║  ╚██╔╝      ██║     ██║   ██║██║     ██║     ██╔══╝  ██║        ██║   ██║██║   ██║██║╚██╗██║" + RESET);
        System.out.println(PURPLE_BRIGHT +
                " ██║ ╚═╝ ██║   ██║       ╚██████╗╚██████╔╝███████╗███████╗███████╗╚██████╗   ██║   ██║╚██████╔╝██║ ╚████║" + RESET);
        System.out.println(YELLOW_BRIGHT +
                " ╚═╝     ╚═╝   ╚═╝        ╚═════╝ ╚═════╝ ╚══════╝╚══════╝╚══════╝ ╚═════╝   ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚═══╝" + RESET);
        System.out.println("  " + createBorder(110, BORDER));
        Array array = new Array(100);
        Array array1 = new Array(100); 
        array.add(3);
        array.add(5);
        array.add(2);
        array.add(7);
        array.add(9);
        array.add(1);
        array.add(45);
        array.add(99);

        System.out.println("==================================");
        array.display();
        System.out.println("==================================");
        System.out.println("the length of this arr is => "+array.len());

        System.out.println("==================================");
        System.out.println("is the array contain the number 99 => "+array.contains(99));

        System.out.println("==================================");
        System.out.println("the max of this array is => "+array.max());

        System.out.println("==================================");
        System.out.println(array.delete(100));

        System.out.println("==================================");
        System.out.println(array.delete(2));

        System.out.println("==================================");
        System.out.println("the last update of the array is :");
        array.display();

        System.out.println("==================================");
        System.out.println("let's see the elm of index 3");
        System.out.println(array.get(3));

        System.out.println("==================================");
        System.out.println("let's set the value 707 in the index 5");

        System.out.println("==================================");
        System.out.println("the last update of the array is :");
        array.set(5,707);
        array.display();

        System.out.println("==================================");
        System.out.println("let's see the index of the value 707 ");
        System.out.println(array.indexOf(707));

        System.out.println("==================================");
        System.out.println("is it our array is empty ? "+ array.isEmpty());

        System.out.println("==================================");
        System.out.println("is it our array1 is empty ? "+ array1.isEmpty());

        System.out.println("==================================");
        System.out.println("our unsorted array is :");
        array.display();

        System.out.println("our sorted array is :");
//        array.bubbleSort();
        array.selectionSort();
        array.display();






    }
}