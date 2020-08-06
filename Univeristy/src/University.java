//zad. 39
//ćw. 1
public class University {
    public static void main(String[] args) {
        Student student1 = new Student("Maciej", "Biały", "151256");
        Student student2 = new Student("Jakub", "Nieśmiały", "214144");
        System.out.println("Liczba studentów: " + Student.getCounter());
    }
}
