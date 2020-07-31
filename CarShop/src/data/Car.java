//zad. 22
package data;

//zad. 11
public class Car {
    private int year;
    private String brand;
    private String model;
    private String color;

    public Car(int year, String brand, String model, String color) {
        this(year, brand, model);
        this.color = color;
    }

    public Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Rok musi być większy od 0!");
        }
    }

    public void print() {
        System.out.println(brand + " " + model + " " + color + " " + year);
    }
}
