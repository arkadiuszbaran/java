//zad. 61
//ćw. 1
public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


    @Override
    public double calculateArea() {
        return Shape.PI * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Shape.PI * r;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Koło:\n");
        builder.append("Promień: " + r);
        builder.append("\nPole: " + calculateArea() + ", obwód: " + calculatePerimeter());
        return builder.toString();
    }
}
