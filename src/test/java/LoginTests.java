import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginTests {

    @Test
    void Login()
    {
        //Configuration.browser = "firefox";
        open("https://idev.etm.ru/oneteam/login");
        $(".LoginForm_title__R4WVI ").shouldHave(text("Вход в личный кабинет"));
        $("#login").setValue("51951tes");
        $("#password").setValue("heph7146").pressEnter();
        $(By.xpath("//h1")).shouldHave(text("Ежедневник"));
    }

    @Test
    void LoginWithoutData()
    {
        Configuration.holdBrowserOpen = true;
        open("https://idev.etm.ru/oneteam/login");
        $("[type='submit']").shouldHave((text("войти"))).click();


    }

 }
