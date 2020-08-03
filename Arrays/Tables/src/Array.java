//zad. 29
//ćw. 1
public class Array {
    public static void main(String[] args) {
        int[] table1 = {5,6,13};
        int[] table2 = {1,4,2};

        System.out.print("Suma: ");
        System.out.println(table1[0] + table1[1] + table1[2] + table2[0] + table2[1] + table2[2]);

        ArraySum as = new ArraySum();
        System.out.println("Suma (metoda): " + as.Addition(table1, table2));
    }
}
