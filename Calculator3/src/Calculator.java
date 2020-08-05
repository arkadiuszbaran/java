//zad. 32
//ćw. 1
public class Calculator {

    final String add = "+";
    final String sub = "-";
    final String mlt = "*";
    final String div = "/";

    double calculate(double num1, double num2, String choose) {
        double result = 0;

        switch (choose) {
            case add:
                result = num1 + num2;
                break;
            case sub:
                result = num1 - num2;
                break;
            case mlt:
                result = num1 * num2;
                break;
            case div:
                result = num1 / num2;
                break;
            default:
                System.out.println("Wybrałeś niepoprawną opcję.");
        }

        return result;
    }

}
