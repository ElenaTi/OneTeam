import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class MainPageTests {


    @Test
    @Tag("Low priority")
    @DisplayName("Переход по ссылкам в соцсети из футера")
    void GoToLoginPage()
    {
        //Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1280";
        open("https://idev.etm.ru/oneteam");
        lib.ui.LoginPageObject.TransitionToSocialNetwork(".Footer_logo_icons__pWS-2","https://idev.etm.ru/");
        lib.ui.LoginPageObject.TransitionToSocialNetwork(".Footer_social_media_icons__qTWJ8 :nth-child(1)", "https://vk.com/etm_company");
        lib.ui.LoginPageObject.TransitionToSocialNetwork(".Footer_social_media_icons__qTWJ8 :nth-child(2) .ant-btn-icon", "https://t.me/etm_company");
        $(".Footer_social_media_icons__qTWJ8 :nth-child(3) .ant-btn-icon").click();
        switchTo().window(1);
        /*String actualUrl = WebDriverRunner.url();
        assert actualUrl.contains("https://www.youtube.com/");
        $("#header").shouldHave(text("Компания ЭТМ"));*/
        Selenide.closeWindow();
        switchTo().window(0);
        lib.ui.LoginPageObject.TransitionToSocialNetwork(".Footer_social_media_icons__qTWJ8 :nth-child(4) .ant-btn-icon", "https://dzen.ru/etm_company?utm_referer=www.etm.ru&utm_referrer=idev.etm.ru");
        $("[data-menu-id*='login']").click();
        $(".LoginForm_title__R4WVI ").shouldHave(text("Вход в личный кабинет"));
        $("[class*=LoginPage_btn_back]").click();
        $(By.xpath("//h1")).shouldHave(text("Управляйте продажами – в одной команде с ЭТМ"));
    }
}
