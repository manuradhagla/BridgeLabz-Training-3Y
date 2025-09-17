import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZoneDisplay {
    public static void main(String[] args) {
        displayTime("GMT", ZoneId.of("GMT"));
        displayTime("IST", ZoneId.of("Asia/Kolkata"));
        displayTime("PST", ZoneId.of("America/Los_Angeles"));
    }

    static void displayTime(String label, ZoneId zone) {
        ZonedDateTime time = ZonedDateTime.now(zone);
        System.out.println(label + " Time: " + time);
    }
}

