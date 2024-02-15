import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import lib.webElements.webelements;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.support.ui.ExpectedConditions.urlToBe;

public class MainPageTests {

    @BeforeAll
    @DisplayName("Размер экрана 1920х1280")
    static void start() {
        Configuration.browserSize = "1920x1280";
    }
    @Test
    @Tag("Low priority")
    @DisplayName("Переход по лого в футере")
    void GoByLogoLink()
    {
        open("https://idev.etm.ru/oneteam");
        lib.ui.LoginPageObject.TransitionToSocialNetwork(".Footer_logo_icons__pWS-2","https://idev.etm.ru/");
    }
    @Test
    @Tag("Low priority")
    @DisplayName("Переход ссылке VK")
    void GoByVkLink()
    {
        open("https://idev.etm.ru/oneteam");
        lib.ui.LoginPageObject.TransitionToSocialNetwork(".Footer_social_media_icons__qTWJ8 :nth-child(1)", "https://vk.com/etm_company");
    }
    @Test
    @Tag("Low priority")
    @DisplayName("Переход ссылке Telegram")
    void GoByTelegramLink()
    {
        open("https://idev.etm.ru/oneteam");
        lib.ui.LoginPageObject.TransitionToSocialNetwork(".Footer_social_media_icons__qTWJ8 :nth-child(2) .ant-btn-icon", "https://t.me/etm_company");
    }
    @Disabled
    @Test
    @Tag("Low priority")
    @DisplayName("Переход ссылке YouTube")
    void GoByYoutubeLink()
    {
        //Configuration.holdBrowserOpen = true;
        open("https://idev.etm.ru/oneteam");
        $(".Footer_social_media_icons__qTWJ8 :nth-child(3) .ant-btn-icon").click();
        switchTo().window(1);
        $("#inner-header-container").shouldBe(visible);
        $("#inner-header-container").shouldHave(text("Компания ЭТМ"));
        /*String actualUrl = WebDriverRunner.url();
        assert actualUrl.contains("https://www.youtube.com/");
        $("#header").shouldHave(text("Компания ЭТМ"));*/
        Selenide.closeWindow();
        switchTo().window(0);
    }

    @Test
    @Tag("Low priority")
    @DisplayName("Переход ссылке Dzen")
    void GoByDzenLink()
    {
        open("https://idev.etm.ru/oneteam");
        lib.ui.LoginPageObject.TransitionToSocialNetwork(".Footer_social_media_icons__qTWJ8 :nth-child(4) .ant-btn-icon", "https://dzen.ru/etm_company?utm_referer=www.etm.ru&utm_referrer=idev.etm.ru");
    }

    @Test
    @Tag("Low priority")
    @DisplayName("Переход по лого в футере")
    void GoToLoginPage()
    {
        open("https://idev.etm.ru/oneteam");
        $("[data-menu-id*='login']").click();
        webelements.loginFormTitle.shouldHave(text("Вход в личный кабинет"));
        webelements.backFromLoginPage.click();
        $(By.xpath("//h1")).shouldHave(text("Управляйте продажами – в одной команде с ЭТМ"));
    }
}
