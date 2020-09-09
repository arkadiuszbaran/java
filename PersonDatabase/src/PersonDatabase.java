//zad. 72
//ćw. 1

import java.util.Arrays;

public class PersonDatabase {
    private final int INITIAL_CAPACITY = 1;
    private Person[] persons = new Person[INITIAL_CAPACITY];
    private int emptyPlace = 0;

    public void add(Person p) {
        if (p == null)
            throw new NullPointerException("Nie podano żadnych danych");
        if (persons.length == emptyPlace)
            persons = Arrays.copyOf(persons, persons.length * 2);
        persons[emptyPlace] = p;
        emptyPlace++;
    }

    public void remove(Person p) {
        if (p.equals(null))
            throw new NullPointerException("Nie podano żadnych danych");
        for (int i = 0; i < persons.length; i++) {
            boolean check = false;
            if (p.equals(persons[i])) {
                persons[i] = persons[i + 1];
                check = true;
            }
            if (check) {
                persons[persons.length - 1] = null;
                emptyPlace--;
                check = false;
            }
        }
    }

    public Person get ( int index){
        if (index < 0 || index >= persons.length)
            throw new ArrayIndexOutOfBoundsException("Niepoprawny index");
        return persons[index];
    }

    public int size() {
        return emptyPlace;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Lista osób:\n");
        for (int i = 0; i < emptyPlace; i++) {
            builder.append(" * ");
            builder.append(persons[i].toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}

