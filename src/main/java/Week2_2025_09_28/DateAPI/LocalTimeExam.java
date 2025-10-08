package Week2_2025_09_28.DateAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalTimeExam {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println(date+" "+time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        String strDate = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate parsed = LocalDate.parse("2025-10-03", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(parsed);
    }
}
