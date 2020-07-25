//zad. 17
//ćw. 2
public class TimeConverter {
    int hours;

    int hoursToMinutes(int hours) {
        return hours * 60;
    }

    int minutesToSeconds(int minutes) {
        return minutes * 60;
    }

    int secondsToMiliseconds(int seconds) {
        return seconds * 1000;
    }

    TimeConverter(int h) {
        hours = h;

        System.out.println("Podano do konwersji: " + h + " godz.");
        System.out.println("" + h + " godz. = " + hoursToMinutes(hours) + " min = "
                + minutesToSeconds(hoursToMinutes(hours)) + " s = "
                + secondsToMiliseconds(minutesToSeconds(hoursToMinutes(hours))) + " ms");
    }
}
