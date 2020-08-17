//zad. 61
//ćw. 1

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Calculator {

    private Scanner sc = new Scanner(System.in);

    public void closeScanner() {
        sc.close();
    }

    private Rectangle readRectangleData() {
        System.out.println("Podaj długość pierwszego boku prostokąta: ");
        double aRectangle = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj długość drugiego boku prostokąta: ");
        double bRectangle = sc.nextDouble();
        sc.nextLine();
        return new Rectangle(aRectangle, bRectangle);
    }

    private Triangle readTriangleData() {
        System.out.println("Podaj długość pierwszego boku trójkąta: ");
        double aTriangle = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj długość drugiego boku trójkąta: ");
        double bTriangle = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj długość trzeciego boku trójkąta: ");
        double cTriangle = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj wysokość trójkąta: ");
        double hTriangle = sc.nextDouble();
        sc.nextLine();
        return new Triangle(aTriangle, bTriangle, cTriangle, hTriangle);
    }

    private Circle readCircleData() {
        System.out.println("Podaj promień koła: ");
        double rCircle = sc.nextDouble();
        sc.nextLine();
        return new Circle(rCircle);
    }

    public Shape createShape() {
        int shapeType = sc.nextInt();
        switch (shapeType) {
            case Shape.RECTANGLE:
                return readRectangleData();
            case Shape.TRIANGLE:
                return readTriangleData();
            case Shape.CIRCLE:
                return readCircleData();
            default:
                throw new NoSuchElementException();
        }
    }

    public void clearBuffer() {
        sc.nextLine();
    }
}
