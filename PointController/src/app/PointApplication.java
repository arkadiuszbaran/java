//zad. 23
//zad. 25
//ćw. 1
package app;

import data.Point;
import controller.PointController;

public class PointApplication {
    public static void main(String[] args) {

        Point p1 = new Point(10, 20);
        PointController pc = new PointController();
        System.out.println("X = " + p1.getCoordinateX() + ", Y= " + p1.getCoordinateY());

        final int add_X = 1;
        final int minus_X = 2;
        final int add_Y = 3;
        final int minus_Y = 4;

        int choose = 2;

        switch (choose) {
            case (add_X):
                pc.addX(p1);
                break;
            case (minus_X):
                pc.minusX(p1);
                break;
            case (add_Y):
                pc.addY(p1);
                break;
            case (minus_Y):
                pc.minusY(p1);
                break;
            default:
                System.out.println("Podano błędną wartość");
        }

        System.out.println("Po zmianie: X = " + p1.getCoordinateX() + ", Y= " + p1.getCoordinateY());
    }
}
