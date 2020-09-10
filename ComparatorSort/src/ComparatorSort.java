//zad. 75
//ćw. 1

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ComparatorSort {
    public static void main(String[] args) {

        Integer[] tab = new Integer[20];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++)
            tab[i] = random.nextInt(50);

        System.out.println("Wylosowano następujące liczby:");
        System.out.print(Arrays.toString(tab));

        Arrays.sort(tab);
        System.out.println("Sortowanie rosnąco:");
        System.out.println(Arrays.toString(tab));

        Arrays.sort(tab, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        });
        System.out.println("Sortowanie malejąco:");
        System.out.println(Arrays.toString(tab));
    }
}
