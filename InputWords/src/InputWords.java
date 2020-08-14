//zad. 55
//cw. 1

import java.util.Scanner;

public class InputWords {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę wyrazów: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();

        StringBuilder builder = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < number; i++) {
            System.out.print("Podaj wyraz: ");
            builder.append(sc.nextLine());
            word.append(builder.charAt(builder.length() - 1));
        }

        System.out.println("Wynik: " + word.toString());

        sc.close();
    }
}
