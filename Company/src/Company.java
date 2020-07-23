//zad. 12
//ćw. 1
public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.name = "Tomasz";
        emp1.lastName = "Czerwony";
        emp1.birthYear = 1978;
        emp1.seniority = 7;

        emp2.name = "Marek";
        emp2.lastName = "Fajkowski";
        emp2.birthYear = 1988;
        emp2.seniority = 5;

        emp3.name = "Roman";
        emp3.lastName = "Przybylski";
        emp3.birthYear = 1982;
        emp3.seniority = 6;

        System.out.println("W firmie są następujący pracownicy:\n");
        System.out.println(emp1.name + " " + emp1.lastName);
        System.out.println("Rok urodzenia: " + emp1.birthYear
        + ", staż pracy: " + emp1.seniority + '\n');
        System.out.println(emp2.name + " " + emp2.lastName);
        System.out.println("Rok urodzenia: " + emp2.birthYear
        + ", staż pracy: " + emp2.seniority + '\n');
        System.out.println(emp3.name + " " + emp3.lastName);
        System.out.println("Rok urodzenia: " + emp3.birthYear
        + ", staż pracy: " + emp3.seniority);
    }
}
