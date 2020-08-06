//zad. 39
//ćw. 1
public class Student {
    private String firstName;
    private String lastName;
    private String index;
    private static int counter = 0;

    public Student(String firstName, String lastName, String index) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.index = index;
        counter++;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIndex() {
        return index;
    }

    public static int getCounter() {
        return counter;
    }
}
