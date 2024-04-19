package lib.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainPageObject {

    public static String getDayTwoDaysAgo()
    {
        LocalDate currentDate = LocalDate.now();
        int today = currentDate.getDayOfMonth();
        int twoDaysAgo;
        if (today == 1 || today == 2) {
            LocalDate previousMonth = currentDate.minusMonths(1);
            int numberOfDaysPreviousMonth = previousMonth.lengthOfMonth();
            twoDaysAgo = numberOfDaysPreviousMonth + today - 2;
        } else {
            twoDaysAgo = today - 2;
        }
        return String.valueOf(twoDaysAgo);
    }
    public static String GetFullDateTwoDaysAgo(){
        LocalDate currentDate = LocalDate.now();
        LocalDate twoDaysAgo = currentDate.minusDays(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String fullDateTwoDaysAgo = twoDaysAgo.format(formatter);
        return fullDateTwoDaysAgo;
    }

}
