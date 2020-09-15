//zad. 79
//ćw. 1

import java.util.HashMap;
import java.util.Map;

public class Company {

    Map<String, Employee> employees = new HashMap<>();

    public void addPerson(){
        System.out.print("Podaj imię: ");
        String firstName = CompanyApp.sc.nextLine();
        System.out.print("Podaj nazwisko: ");
        String lastName = CompanyApp.sc.nextLine();
        System.out.print("Podaj wynagrodzenie: ");
        double salary = CompanyApp.sc.nextDouble();
        CompanyApp.sc.nextLine();
        System.out.println("Podaj klucz: ");
        String key = CompanyApp.sc.nextLine();
        employees.put(key, new Employee(firstName, lastName, salary));
    }

    public void showEmployee(){
        System.out.println("Podaj klucz: ");
        String key = CompanyApp.sc.nextLine();
        System.out.println(employees.get(key));
    }

    public void exitProgram(){
        CompanyApp.sc.close();
        System.out.println("Zakończono pracę z programem");
    }
}
