//zad. 48
//ćw. 1

public class Hospital {
    private static int MAX_EMPLOYEES = 3;
    private int employeesNumber = 0;

    private Person[] employees = new Person[MAX_EMPLOYEES];

    void addEmployees(Person person) {
        if (employeesNumber < MAX_EMPLOYEES) {
            employees[employeesNumber] = person;
            employeesNumber++;
        }
    }

    String getInfo() {
        String result = "";
        for (int i = 0; i < employeesNumber; i++)
            result += employees[i].getInfo() + "\n";
        return result;
    }


}
