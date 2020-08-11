//zad. 50
//ćw. 1
public class DataStore {
    private final static int MAX_NOTEBOOKS = 100;
    private int notebooksNumber;

    private Computer[] notebooks = new Computer[MAX_NOTEBOOKS];

    public Computer[] getNotebooks() {
        Computer[] ntbks = new Computer[notebooksNumber];
        for (int i = 0; i < notebooksNumber; i++)
            ntbks[i] = notebooks[i];
        return ntbks;
    }

    public void add(Computer newNotebook) {
        if (notebooksNumber < MAX_NOTEBOOKS && newNotebook != null) {
            notebooks[notebooksNumber] = newNotebook;
            notebooksNumber++;
        }
    }

    int checkAvailability(Computer check) {
        if (check == null)
            return 0;

        int count = 0;
        for (int i = 0; i < notebooksNumber; i++) {
            if (check.equals(notebooks[i]))
                count++;
        }
        return count;
    }
}
