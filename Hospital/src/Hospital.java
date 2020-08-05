//zad. 37
//ćw. 2

import java.util.Scanner;

class Hospital {

    final int maxPatients = 10;
    private int actualPatients = 0;
    private Patient[] patientList = new Patient[maxPatients];

    Scanner sc = new Scanner(System.in);

    public void addPatient(Patient patient) {
        System.out.println("Podaj imie: ");
        patient.setFirstName(sc.nextLine());
        System.out.println("Podaj nazwisko: ");
        patient.setLastName(sc.nextLine());
        System.out.println("Podaj PESEL: ");
        patient.setPesel(sc.nextLine());
        patientList[actualPatients] = patient;
        actualPatients++;
    }

    public void printPatients() {
        System.out.println("Aktualna lista pacjentów: ");
        for (int i = 0; i < actualPatients; i++) {
            System.out.println(patientList[i].getFirstName() + " " + patientList[i].getLastName() + " "
                    + patientList[i].getPesel());
        }
    }

    public void hospitalCase(int choose) {
        switch (choose) {
            case 1:
                if (actualPatients == 10){
                    System.out.println("Lista pacjentów jest pełna!");
                    break;
                }
                else {
                    Patient patient = new Patient();
                    addPatient(patient);
                    break;
                }
            case 2:
                printPatients();
                break;
            case 0:
                break;
            default:
                System.out.println("Wybrano niepoprawną opcję!");
        }
    }
}
