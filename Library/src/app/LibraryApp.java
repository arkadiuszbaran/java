//zad. 9
//zad. 14
//zad. 18
//zad. 20
//zad. 30
//zad. 33
//zad. 38

package app;

public class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.9";
        System.out.println(appName);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}