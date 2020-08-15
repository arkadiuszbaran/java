//zad. 59
//ćw. 1
public class Calculator {

    private static final String ADD = "+";
    private static final String SUB = "-";
    private static final String MLT = "*";
    private static final String DIV = "/";

    double calculate(double num1, double num2, String operator) {
        double result = 0;

        switch (operator) {
            case ADD:
                result = num1 + num2;
                break;
            case SUB:
                result = num1 - num2;
                break;
            case MLT:
                result = num1 * num2;
                break;
            case DIV:
                if (num2 == 0)
                    throw new ArithmeticException("Nie można dzielić przez 0.");
                result = num1 / num2;
                break;
            default:
                throw new UnknownOperatorException("Wybrałeś niepoprawną opcję.");
        }

        return result;
    }

}
