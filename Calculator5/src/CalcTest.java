//zad. 61
//ćw. 1

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Shape shape = null;

        boolean readComplete = false;

        while (!readComplete) {
            try {
                readOpitons();
                shape = calc.createShape();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Niepoprawny format danych. Spróbuj jeszcze raz.");
            } catch (NoSuchElementException e) {
                System.out.println("Niepoprawny wybór. Spróbuj jeszcze raz.");
            } finally {
                calc.clearBuffer();
            }
        }

        System.out.println(shape);
        calc.closeScanner();
    }

    private static void readOpitons() {
        System.out.println("Wybierz figurę:");
        System.out.println(Shape.RECTANGLE + " - prostokąt");
        System.out.println(Shape.TRIANGLE + " - trójkąt");
        System.out.println(Shape.CIRCLE + " - koło");
    }
}