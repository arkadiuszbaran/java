//zad. 19
//ćw. 1
public class CalcTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int a = 55;
        int b = 31;
        int c = 14;

        System.out.println("" + a + " + " + b + " = " + calc.add(a, b));
        System.out.println("" + a + " + " + b + " + " + c + " = " + calc.add(a, b, c));
        System.out.println("" + a + " - " + b + " = " + calc.subtract(a, b));
        System.out.println("" + a + " - " + b + " - " + c + " = " + calc.subtract(a, b, c));
    }
}
