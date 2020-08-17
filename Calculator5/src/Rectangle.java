//zad. 61
//ćw. 1
public class Rectangle implements Shape {

    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Prostokąt:\n");
        builder.append("Bok a: " + a + ", bok b: " + b);
        builder.append("\nPole: " + calculateArea() + ", obwód: " + calculatePerimeter());
        return builder.toString();
    }

}
