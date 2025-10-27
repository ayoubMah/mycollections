package ayoub;


public class Main {

    /*static class TestMyCollection<E> extends AbstractMyCollection<E> {
        private final List<E> data = new ArrayList<>();

        @Override
        public Iterator<E> iterator() {
            return data.iterator();
        }

        @Override
        public int size() {
            return data.size();
        }

        @Override
        public boolean add(E e) {
            return data.add(e);
        }
    }*/



    //======================================================================================================================
    public static final String PURPLE_BRIGHT = "\u001B[95m";
    public static final String YELLOW_BRIGHT = "\u001B[93m";
    public static final String CYAN_BRIGHT = "\u001B[96m";
    public static final String RESET = "\u001B[0m";
    public static final String BORDER = CYAN_BRIGHT + "≫" + RESET;
    private static String createBorder(int length, String symbol) {
        StringBuilder border = new StringBuilder();
        for (int i = 0; i < length; i++) { border.append(symbol);}
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
        // ========================================================================================

        /*TestMyCollection col = new TestMyCollection<>();
        col.add("ayoub");
        col.add("simo");
        col.add("bard");
        col.add(null);
        col.add("youssef");

        System.out.println("Size : " + col.size());

        System.out.println("is my collection has ayoub? =>" + col.contains("ayoub"));
        System.out.println("is my collection has null? =>" + col.contains(null));

        System.out.println("to array");
        col.toArray();
        col.looks();

        System.out.println("let's remove simo");
        col.remove("simo");
        System.out.println("the new collection looks like");
        col.looks();


        System.out.println("let's remove null");
        col.remove(null);
        System.out.println("the new collection looks like");
        col.looks();

        System.out.println("let's clean this collection");
        col.clear();
        col.looks();*/


    }
}
