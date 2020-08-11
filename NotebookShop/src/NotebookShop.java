//zad. 50
//ćw. 1
public class NotebookShop {
    public static void main(String[] args) {
        DataStore datastore = new DataStore();
        datastore.add(new Computer("MSI", 5125));
        datastore.add(new Computer("DELL", 4155));
        datastore.add(new Computer("DELL", 4155));
        datastore.add(new Computer("ASUS", 6236));
        datastore.add(new Computer("HP", 9080));
        datastore.add(new Computer("HP", 9080));
        datastore.add(new Computer("HP", 9080));

        Computer notebookCheck = new Computer("HP", 9080);
        int notebooksFound = datastore.checkAvailability(notebookCheck);
        System.out.println("Liczba laptopów: " + notebookCheck + ": " + notebooksFound);

        System.out.println("Dostępne laptopy: ");
        for (Computer ntbk : datastore.getNotebooks())
            System.out.println(ntbk);
    }
}
