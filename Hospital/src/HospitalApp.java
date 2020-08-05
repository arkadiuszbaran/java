import java.util.Scanner;

//zad. 37
//ćw. 2
public class HospitalApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choose;
        Hospital hsp = new Hospital();

        do {
            System.out.println("Wybierz opcję: ");
            System.out.println("1. Dopisz pacjenta");
            System.out.println("2. Wyświetl pacjentów");
            System.out.println("0. Wyjście");
            choose = sc.nextInt();
            sc.nextLine();
            hsp.hospitalCase(choose);
        } while (choose != 0);

        System.out.println("Zakończono działanie programu");
    }
}
