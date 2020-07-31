//zad. 23
//ćw. 1
package app;

import data.Point;
import controller.PointController;

public class PointApplication {
    public static void main(String[] args) {
        Point point = new Point(4, 6);
        PointController controller = new PointController();

        System.out.println("X = " + point.getCoordinateX() + ", Y= " + point.getCoordinateY());
        controller.addX(point);
        controller.addX(point);
        controller.addY(point);
        System.out.println("X = " + point.getCoordinateX() + ", Y= " + point.getCoordinateY());
        controller.minusX(point);
        controller.minusY(point);
        controller.minusY(point);
        System.out.println("X = " + point.getCoordinateX() + ", Y= " + point.getCoordinateY());
    }
}
