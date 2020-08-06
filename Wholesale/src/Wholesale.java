//zad. 44
//ćw. 1
public class Wholesale {
    public static void main(String[] args) {
        Tire tire = new Tire(12415, "StachuMotoSport", "BlackSlick", 98,
                18, 36);
        ExhaustPart exhaustpart = new ExhaustPart(1204405, "Plumkacz", "świrGOT",
                552, false);

        System.out.print("Opony: ");
        tire.printInfo();
        System.out.println("Końcówka tłumika: ");
        exhaustpart.printInfo();
    }
}
