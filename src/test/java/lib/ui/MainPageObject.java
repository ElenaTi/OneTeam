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
    public static String GetFullDateTwoDaysAgo(){
        LocalDate currentDate = LocalDate.now();
        LocalDate twoDaysAgo = currentDate.minusDays(2);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String fullDateTwoDaysAgo = twoDaysAgo.format(formatter);
        return fullDateTwoDaysAgo;
    }
    public static String GetYesterday() {
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

    public static String getToday()
    {
        LocalDate currentDate = LocalDate.now();
        int today = currentDate.getDayOfMonth();
        return  String.valueOf(today);
    }
    public static String GetWeekAfterToday()
    {
        LocalDate currentDate = LocalDate.now();
        LocalDate dateWeekAfterToday = currentDate.plusDays(7);
        int weekAfterToday = dateWeekAfterToday.getDayOfMonth();
        int monthOfDayWeekAfterToday = dateWeekAfterToday.getMonthValue();
        if (dateWeekAfterToday.getMonthValue() != currentDate.getMonthValue()) {
            $(By.xpath("//button[@class ='ant-picker-header-next-btn']")).click();
        }
        return String.valueOf(weekAfterToday);
    }
    public static String GetFullDateWeekAfterToday(){
        LocalDate currentDate = LocalDate.now();
        LocalDate weekAfterToday = currentDate.plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String fullDateWeekAfterToday = weekAfterToday.format(formatter);
        return fullDateWeekAfterToday;
    }

}
