//zad. 22
package logic;

import data.Car;

//zad. 11
public class CarShop {
    public static void main(String[] args) {
        Car audiA5 = new Car(2014, "Audi", "A5", "Czarne");
        System.out.println("Rocznik: " + audiA5.getYear());
        audiA5.setYear(2015);
        System.out.println("Rocznik: " + audiA5.getYear());
        audiA5.setYear(-500);
        System.out.println("Rocznik: " + audiA5.getYear());
    }
}