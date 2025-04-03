package oneWeekPreperationKit;

public class TimeConversion {
    public static String timeConversion(String s) {

        char timeFormat = s.charAt(8);
        int hours = Integer.parseInt(s.substring(0, 2));

        if (timeFormat == 'A') {
            hours = hours % 12;
            return String.format("%s:%s", hours >= 10 ? hours : "0" + hours, s.substring(3, 8));

        } else {
            if (hours == 12) {
                return s.substring(0, 8);
            } else {
                hours+=12;
                return String.format("%d:%s", hours, s.substring(3, 8));
            }
        }


    }
}