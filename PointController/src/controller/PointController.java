//zad. 23
//ćw. 1
package controller;

import data.Point;

public class PointController {
    public void addX(Point p) {
        p.setCoordinateX(p.getCoordinateX()+1);
    }

    public void minusX(Point p) {
        p.setCoordinateX(p.getCoordinateX()-1);
    }

    public void addY(Point p) {
        p.setCoordinateY(p.getCoordinateY()+1);
    }

    public void minusY(Point p) {
        p.setCoordinateY(p.getCoordinateY()-1);
    }
}
