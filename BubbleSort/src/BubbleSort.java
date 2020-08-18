//zad. 64
//ćw. 1
public class BubbleSort {
    public static void main(String[] args) {
        int[] tab = {215, 26, 234, 66, 776, 2, 347, 11, 124};

        Sortable sorter = new Sortable() {
            @Override
            public void sort(int[] tab) {
                for (int i = 0; i < tab.length; i++) {
                    for (int j = 1; j < tab.length - i; j++) {
                        if (tab[j - 1] > tab[j]) {
                            int tmp = tab[j];
                            tab[j] = tab[j - 1];
                            tab[j - 1] = tmp;

                        }
                    }
                }
            }
        };

        printArray(tab);
        sorter.sort(tab);
        printArray(tab);
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private interface Sortable {
        void sort(int[] array);
    }
}

