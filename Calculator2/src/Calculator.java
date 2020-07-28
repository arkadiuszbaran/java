//zad. 19
//ćw. 1
public class Calculator {
    int a, b, c;

    int add(int a, int b) {
        this.a = a;
        this.b = b;
        return a + b;
    }

    int add(int a, int b, int c) {
        this.c = c;
        return add(a, b) + c;
    }

    int subtract(int a, int b) {
        this.a = a;
        this.b = b;
        return a - b;
    }

    int subtract(int a, int b, int c) {
        this.c = c;
        return subtract(a, b) - c;
    }
}
