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
        list.add(88);
        list.add(100);
        list.display();

        System.out.println("========================================");
        System.out.println("let's clear out list ");
        System.out.println("========================================");
        list.clear();
        list.display();

        System.out.println("========================================");
        System.out.println("let's fill it again");
        System.out.println("========================================");
        list.add("ff");
        list.add("coc");
        list.add("vovo");
        list.add("gigi");
        list.add("ff");
        list.add("ff");
        list.display();

//  ================================================================================================================
        list.remove("ff");
        System.out.println("the list after removing the first ff");
        list.display();

        System.out.println("the list after removing all ff");
        list.removeAll("ff");
        list.display();

        list.remove("ayoub");
        list.display();

    }
}
