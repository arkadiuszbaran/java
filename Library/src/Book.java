//zad. 14
//zad. 18
//zad. 20
public class Book {
    String title;
    String author;
    int release;
    int pages;
    String publisher;
    String isbn;

    Book(String title, String author, int release, int pages,
         String publisher, String isbn) {
        this(title, author, release, pages, publisher);
        this.isbn = isbn;
    }

    Book(String title, String author, int release, int pages,
         String publisher) {
        this.title = title;
        this.author = author;
        this.release = release;
        this.pages = pages;
        this.publisher = publisher;
    }

    void printInfo() {
        String info = title + "; " + author + "; " + release + "; "
                + pages + "; " + publisher + "; " + isbn;
        System.out.println(info);
    }
}
