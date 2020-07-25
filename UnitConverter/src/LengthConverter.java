//zad. 17
//ćw. 2
public class LengthConverter {
    double meters;
    double centimeters;
    double milimeters;

    double metersToCentimeters(double meters) {
        return meters * 100;
    }

    double metersToMilimeters(double meters) {
        return meters * 1000;
    }

    double centimetersToMeters(double centimeters) {
        return centimeters / 100;
    }

    double milimetersToMeters(double milimeters) {
        return milimeters / 1000;
    }

    LengthConverter(double ms, double cms, double mms){
        meters = ms;
        centimeters = cms;
        milimeters = mms;

        System.out.println("Podano do konwersji: " + ms + " m, " + cms + " cm, " + mms + " mm");
        System.out.println("" + ms + " m = " + metersToCentimeters(ms) + " cm");
        System.out.println("" + ms + " m = " + metersToMilimeters(ms) + " mm");
        System.out.println("" + cms + " cm = " + centimetersToMeters(cms) + " m");
        System.out.println("" + mms + " mm = " + milimetersToMeters(mms) + " m");
    }
}
