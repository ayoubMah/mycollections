package ACollection;

import ACollection.lists.MyArrayList;

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


        MyArrayList list = new MyArrayList(2);
        System.out.println("empty list:");
        list.display();
        System.out.println("the size of the list is: " + list.size());
        System.out.println("========================================");
        list.add(55);
        list.add(15);
        list.add(30);
        list.add(20);
        list.display();
        System.out.println("the size of the list is: " + list.size());

        System.out.println("let's remove the elm 30");
        list.remove(30);
        list.display();
        System.out.println("the size of the list is: " + list.size());




    }
}