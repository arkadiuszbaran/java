//zad. 14
//zad. 18
//zad. 20
//zad. 22
//zad. 26

package model;

public class Book {
    private String title;
    private String author;
    private int release;
    private int pages;
    private String publisher;
    private String isbn;

    public Book(String title, String author, int release, int pages,
                String publisher, String isbn) {
        this(title, author, release, pages, publisher);
        this.isbn = isbn;
    }

    public Book(String title, String author, int release, int pages,
                String publisher) {
        this.title = title;
        this.author = author;
        this.release = release;
        this.pages = pages;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void printInfo() {
        String info = title + "; " + author + "; " + release + "; "
                + pages + "; " + publisher;
        if (isbn != null)
            info += "; " + isbn;
        System.out.println(info);
    }
}
