import java.util.Scanner;

//zad. 52
//ćw. 1
public class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Dostępne pizze: ");
        for (Pizza p : Pizza.values()) {
            System.out.println(p);
        }

            Scanner sc = new Scanner(System.in);
            System.out.print("Wybierz pizzę: ");
            Pizza pizza = Pizza.valueOf(sc.nextLine().toUpperCase());

            System.out.println("Pizza " + pizza.name() + " została zamówiona");
            sc.close();
        }
    }
