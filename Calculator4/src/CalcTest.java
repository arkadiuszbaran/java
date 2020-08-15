//zad. 59
//ćw. 1

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double number1 = 0;
        double number2 = 0;
        String operator = null;

        boolean readComplete = false;
        do {
            try {
                System.out.print("Wprowadz pierwsza liczbę: ");
                number1 = input.nextDouble();
                input.nextLine();

                System.out.print("Wybierz działanie: ");
                operator = input.nextLine();

                System.out.print("Wprowadz drugą liczbę: ");
                number2 = input.nextDouble();
                input.nextLine();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono niepoprawne dane, spróbuj jeszcze raz.");
                input.nextLine();
            }
        } while (!readComplete);

        Calculator calc = new Calculator();
        try {
            System.out.println("Wynik: " + calc.calculate(number1, number2, operator));
//            double result =  calc.calculate(number1, number2, operator);
//            System.out.println(result);
        } catch (UnknownOperatorException | ArithmeticException e) {
            System.err.println(e.getMessage());
            System.out.println("Nie udało się obliczyć wyniku wyrażenia " + number1 + operator + number2);
        }
    }
}
