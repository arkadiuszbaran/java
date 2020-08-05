//zad. 36
//ćw. 1

import java.util.Scanner;

public class AddInputNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj ilość wprowadzanych liczb: ");
        int amount = input.nextInt();
        input.nextLine();

        double numbers = 0;

        while (amount-- > 0) {
            System.out.print("Podaj liczbę: ");
            numbers += input.nextDouble();
        }

        System.out.println("Wynik: " + numbers);
        input.close();
    }
}
