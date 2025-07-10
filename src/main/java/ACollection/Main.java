package ACollection;

import ACollection.array.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("  __  __        _____      _ _             _   _             ");
        System.out.println(" |  \\/  |      / ____|    | | |           | | (_)            ");
        System.out.println(" | \\  / |_   _| |     ___ | | | ___   __ _| |_ _  ___  _ __  ");
        System.out.println(" | |\\/| | | | | |    / _ \\| | |/ _ \\ / _` | __| |/ _ \\| '_ \\ ");
        System.out.println(" | |  | | |_| | |___| (_) | | | (_) | (_| | |_| | (_) | | | |");
        System.out.println(" |_|  |_|\\__, |\\_____\\___/|_|_|\\___/ \\__,_|\\__|_|\\___/|_| |_|");
        System.out.println("          __/ |                                              ");
        System.out.println("         |___/                                               ");
        System.out.println();
        System.out.println("  Your custom Java Data Structures library");
        System.out.println("  =========================================");
        System.out.println();
        System.out.println("        \\   ^__^");
        System.out.println("         \\  (oo)\\_______");
        System.out.println("            (__)\\       )\\/\\");
        System.out.println("                ||----w |");
        System.out.println("                ||     ||");
        System.out.println();
        System.out.println();

        Array array = new Array(100);
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
        System.out.println("is the array contain the number 99 => "+array.contain(99));

        System.out.println("==================================");
        System.out.println("the max of this array is => "+array.max());

        System.out.println("==================================");
        System.out.println(array.delete(100));

        System.out.println("==================================");
        System.out.println(array.delete(2));

        System.out.println("==================================");
        System.out.println("the new array is");
        array.display();

        System.out.println("==================================");
        System.out.println("let's add 33 in the index 3");
        array.addAt(3, 33);
        System.out.println("the new array is");
        array.display();


    }
}