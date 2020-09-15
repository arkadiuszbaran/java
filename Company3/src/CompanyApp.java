//zad. 79
//ćw. 1

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyApp {

    public static final int ADD_PERSON = 1;
    public static final int FIND_PERSON = 2;
    public static final int EXIT = 3;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Company company = new Company();
        int option = 0;
        do {
            try {
                printOptions();
                option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case ADD_PERSON:
                        company.addPerson();
                        break;
                    case FIND_PERSON:
                        company.showEmployee();
                        break;
                    case EXIT:
                        company.exitProgram();
                        break;
                    default:
                        System.out.println("Wybrano niepoprawną opcję");
                }
            } catch (InputMismatchException e) {
                System.out.println("Zły format wprowadzonej opcji");
                sc.nextLine();
            }
        } while (option != 3);
    }

    static void printOptions(){
        System.out.println("Wybierz opcję:");
        System.out.println("1. Dodaj pracownika");
        System.out.println("2. Szukaj pracownika");
        System.out.println("3. Wyjście z programu");
    }
}
