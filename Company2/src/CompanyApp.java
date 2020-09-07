//zad. 66
//ćw. 1

import java.io.*;
import java.util.Scanner;

public class CompanyApp {
    private static final String FILE_NAME = "employees.inf";
    private static final int READ_FROM_USER = 1;
    private static final int READ_FROM_FILE = 2;

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Wybierz opcję:");
        System.out.println("Wczytanie nowych danych - " + READ_FROM_USER);
        System.out.println("Wyświetlenie pracowników - " + READ_FROM_FILE);

        int option = 0;
        boolean operationComplete = false;
        do {
            option = sc.nextInt();
            Company company = null;
            switch (option) {
                case 1:
                    sc.nextLine();
                    company = createCompany();
                    writeFile(company);
                    operationComplete = true;
                    break;
                case 2:
                    try {
                        sc.nextLine();
                        company = readFile();
                        System.out.println(company);
                        operationComplete = true;
                        break;
                    } catch (IOException | ClassNotFoundException e) {
                        System.err.println("Błąd odczytu danych");
                    }
                default:
                    System.out.println("Wybrano niepoprawna opcję. Spróbuj jeszcze raz.");
                    sc.nextLine();
            }
        } while (operationComplete);
        sc.close();
    }

    private static Company createCompany() {
        Company company = new Company();
        for (int i = 0; i < Company.MAX_EMPLOYEES; i++) {
            System.out.print("Podaj imię: ");
            String firstName = sc.nextLine();
            System.out.print("Podaj nazwisko: ");
            String lastName = sc.nextLine();
            System.out.print("Podaj wynagrodzenie: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            company.addPerson(new Employee(firstName, lastName, salary));
        }
        return company;
    }

    private static Company readFile() throws IOException, ClassNotFoundException {
        try (
                var fis = new FileInputStream(FILE_NAME);
                var ois = new ObjectInputStream(fis);
        ) {
            return (Company) ois.readObject();
        }
    }

    private static void writeFile(Company company) {
        try (
                var fis = new FileOutputStream(FILE_NAME);
                var oos = new ObjectOutputStream(fis);
        ) {
            oos.writeObject(company);
            System.out.println("Zapisano dane do pliku");
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku");
        }
    }
}

