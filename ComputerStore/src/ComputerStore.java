//zad. 16
public class ComputerStore {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        Computer comp1 = factory.create("Intel i5", 8192);
        Computer comp2 = factory.create("AMD Ryzen 1700", 16384);

        ComputerUpgrade upgrade = new ComputerUpgrade();
        upgrade.addMemory(comp1, 4096);

        System.out.println(comp1.getInfo());
        System.out.println(comp2.getInfo());
    }
}
