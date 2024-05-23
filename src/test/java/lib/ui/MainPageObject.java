package lib.ui;

import org.openqa.selenium.By;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Selenide.$;

public class MainPageObject {

    public static String GetDayTwoDaysAgo()
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
    public static String GetDayToday(){
        LocalDate currentDate = LocalDate.now();
        int today = currentDate.getDayOfMonth();
        return String.valueOf(today);
    }
    public static String GetFullDateTwoDaysAgo(){
        LocalDate currentDate = LocalDate.now();
        LocalDate twoDaysAgo = currentDate.minusDays(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String fullDateTwoDaysAgo = twoDaysAgo.format(formatter);
        return fullDateTwoDaysAgo;
    }
    public static String GetFullDateYesterday(){
        LocalDate currentDate = LocalDate.now();
        LocalDate yesterday = currentDate.minusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String fullDateYesterday = yesterday.format(formatter);
        return fullDateYesterday;
    }
    public static String GetDayYesterday() {
        LocalDate currentDate = LocalDate.now();
        int today = currentDate.getDayOfMonth();
        int yesterday;
        if (today == 1) {
            LocalDate previousMonth = currentDate.minusMonths(1);
            int numberOfDaysPreviousMonth = previousMonth.lengthOfMonth();
            yesterday = numberOfDaysPreviousMonth + today - 1;
        } else {
            yesterday = today - 1;
        }
        return String.valueOf(yesterday);
    }
    public static String GetFullDateYesterdayForTitle(){
        LocalDate currentDate = LocalDate.now();
        LocalDate yesterday = currentDate.minusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fullDateYesterday = yesterday.format(formatter);
        return fullDateYesterday;
    }
    public static String GetFullDateTwoDaysAgoForTitle(){
        LocalDate currentDate = LocalDate.now();
        LocalDate twoDaysAgo = currentDate.minusDays(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fullDateTwoDaysAgoForTitle = twoDaysAgo.format(formatter);
        return fullDateTwoDaysAgoForTitle;
    }

    public static String GetTodayForTitle()
    {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fullDateToday = currentDate.format(formatter);
        return  fullDateToday;
    }

    public static String GetFullDateWeekAfterToday(){
        LocalDate currentDate = LocalDate.now();
        LocalDate weekAfterToday = currentDate.plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String fullDateWeekAfterToday = weekAfterToday.format(formatter);
        return fullDateWeekAfterToday;
    }
    public static String GetFullDateWeekAfterTodayForTitle(){
        LocalDate currentDate = LocalDate.now();
        LocalDate weekAfterToday = currentDate.plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fullDateWeekAfterToday = weekAfterToday.format(formatter);
        return fullDateWeekAfterToday;
    }

    public static String GetFullDateMonthAfterTodayForTitle(){
        LocalDate currentDate = LocalDate.now();
        LocalDate monthAfterToday = currentDate.plusMonths(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fullDateMonthAfterToday = monthAfterToday.format(formatter);
        return fullDateMonthAfterToday;
    }

    public static String GetFullDateMonthAfterToday(){
        LocalDate currentDate = LocalDate.now();
        LocalDate monthAfterToday = currentDate.plusMonths(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String fullDateMonthAfterToday = monthAfterToday.format(formatter);
        return fullDateMonthAfterToday;
    }
}
