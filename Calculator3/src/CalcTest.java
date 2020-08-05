//zad. 32
//ćw. 1

import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadz pierwsza liczbę: ");
        double number1 = input.nextDouble();
        input.nextLine();

        System.out.print("Wybierz działanie: ");
        String choose = input.nextLine();

        System.out.print("Wprowadz drugą liczbę: ");
        double number2 = input.nextDouble();
        input.nextLine();

        Calculator calc = new Calculator();

        System.out.println("Wynik: " + calc.calculate(number1, number2, choose));

    }
}
