//zad. 8
//ćw. 1
public class CarInformation {
    public static void main(String[] args) {
        String brand = "Audi";
        String model = "S8";
        int yearProduction = 2009;
        int carMileage = 209_104;
        double price = 184_000;
        boolean haveAccidents = false;


        System.out.println("Dane o samochodzie:");
        System.out.println("Marka samochodu: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + yearProduction);
        System.out.println("Przebieg: " + carMileage + " km");
        System.out.println("Cena: " + price);
        System.out.println("Czy jest bezwypadkowy? " + haveAccidents);
    }
}
