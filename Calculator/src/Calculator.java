//zad. 16
//ćw. 1
public class Calculator {
    double a;
    double b;

    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    Calculator(double x, double y) {
        a = x;
        b = y;

        double addResult = add(x, y);
        double subtractResult = subtract(x, y);
        double multiplyResult = multiply(x, y);
        double divideResult = divide(x, y);

        System.out.println("Wyniki po działaniu na liczbach " + x + " i " + y + ":");
        System.out.println("" + x + " + " + y + " = " + addResult);
        System.out.println("" + x + " - " + y + " = " + subtractResult);
        System.out.println("" + x + " * " + y + " = " + multiplyResult);
        System.out.println("" + x + " / " + y + " = " + divideResult);
    }
}