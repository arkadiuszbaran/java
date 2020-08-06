//zad. 41
//ćw. 1

import java.util.Scanner;

public class BlockScheme {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        Scanner sc = new Scanner(System.in);

        while ((number = sc.nextInt()) <= 100) {
            sum += number;
        }

        if (sum % 2 == 0)
            System.out.println("Liczba jest parzysta");
        else
            System.out.println("Liczba jest nieparzysta");
    }
}
