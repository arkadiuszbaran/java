//zad. 48
//ćw. 1

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.addEmployees(new Doctor("Rafał", "Poważny", 8000, 2000));
        hospital.addEmployees(new Nurse("Olga", "Tomaszczuk", 2600, 4));
        hospital.addEmployees(new Nurse("Celina", "Dobrowolska", 2500, 3));

        System.out.println("Pracownicy szpitala: ");
        System.out.println(hospital.getInfo());
    }
}
