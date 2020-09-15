//zad. 78
//ćw. 1

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class SortNames {
    public static void main(String[] args) {
        String fileName = "namespl.txt";
        TreeSet<String> tree = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

        try (
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader);
        ) {
            String nextLine = null;
            while ((nextLine = reader.readLine()) != null)
                tree.add(nextLine);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Liczba unikalnych imion: " + tree.size());
        System.out.println("Pierwsze imię: " + tree.first());
        System.out.println("Ostatnie imię: " + tree.last() + "\n");
        System.out.println("Lista imion:");
        System.out.println(tree);
    }
}
