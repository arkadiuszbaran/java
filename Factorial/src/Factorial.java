//zad. 69
//ćw. 1

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.println("Wynik: " + factorial(number));
        sc.close();

    }

    static int factorial(int n) {
        return n > 1 ? n * factorial(n - 1) : 1;
    }
}
