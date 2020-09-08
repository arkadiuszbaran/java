//zad. 71
//ćw. 1

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer, Integer> p1 = new Pair<>(5, 235);
        Pair<String, String> p2 = new Pair<>("abc", "xyz");
        Pair<Integer, String> p3 = new Pair<>(1908, "mco");

        printPair(p1);
        printPair(p2);
        printPair(p3);
    }

    static <T,V> void printPair(Pair<T,V> p){
        System.out.println(p.gettType());
        System.out.println(p.getvType() + "\n");
    }
}
