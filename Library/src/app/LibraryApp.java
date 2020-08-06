//zad. 9
//zad. 14
//zad. 18
//zad. 20
//zad. 30
//zad. 33
//zad. 38
//zad. 40

package app;

public class LibraryApp {
    public static void main(String[] args) {
        private static final String APP_NAME = "Biblioteka v1.0";
        System.out.println(APP_NAME);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}