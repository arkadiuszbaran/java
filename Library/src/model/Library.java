/* zad. 9, zad. 14, zad. 18, zad. 20, zad. 30,
zad. 33, zad. 38, zad. 40, zad. 45, zad. 49,
zad. 51, zad. 56, zad. 60, zad. 67 */

package model;

import java.io.Serializable;

public class Library implements Serializable {

    private static final int MAX_PUBLICATIONS = 2000;
    private int publicationsNumber;
    private Publication[] publications = new Publication[MAX_PUBLICATIONS];

    public Publication[] getPublications() {
        Publication[] result = new Publication[publicationsNumber];
        for (int i = 0; i < publicationsNumber; i++) {
            result[i] = publications[i];
        }
        return result;
    }

    public void addBook(Book book) {
        addPublication(book);
    }

    public void addMagazine(Magazine magazine) {
        addPublication(magazine);
    }

    private void addPublication(Publication publication) {
        if (publicationsNumber >= MAX_PUBLICATIONS) {
            throw new ArrayIndexOutOfBoundsException("Max publications exceeded " + MAX_PUBLICATIONS);
        }
        publications[publicationsNumber] = publication;
        publicationsNumber++;
    }
}