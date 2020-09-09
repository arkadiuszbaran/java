//zad. 72
//ćw. 1

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Jan", "Hebel", "87103119342");
        Person p2 = new Person("Karol", "Las", "91092293844");
        Person p3 = new Person("Romuald", "Rybacki", "7902039584738");

        PersonDatabase database = new PersonDatabase();

        database.add(p1);
        database.add(p2);
        System.out.println("Ilość osób: " + database.size());

        database.add(p3);
        System.out.println("Ilość osób: " + database.size());

        System.out.println("Osoba pod indeksem 2: " + database.get(2));

        database.remove(p2);
        System.out.println("Ilość osób po usunięciu: " + database.size());
        System.out.println(database.toString());

    }
}
