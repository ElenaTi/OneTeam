import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static com.codeborne.selenide.Condition.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lib.webElements.webelements;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
// import lib.ui.LoginPageObject;


public class LoginTests {
    String loginURL = "https://idev.etm.ru/oneteam/login";

    @Test
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

    @Test
        //Авторизация с Невалидным паролем
    void LoginUnvalidPassword()
    {
        //Configuration.holdBrowserOpen = true;
        open(loginURL);
        $(".LoginForm_title__R4WVI ").shouldHave(text("Вход в личный кабинет"));
        webelements.loginInput.setValue("51951tes");
        webelements.passwordInput.setValue("heph8888");
        webelements.buttonEnter.shouldHave((text("войти"))).click();
        webelements.loginFormErrorMessage.shouldHave(text("Неверный логин или пароль"));
    }

    @Test
        //Авторизация с Невалидным логином
    void LoginUnvalidLogin()
    {
        //Configuration.holdBrowserOpen = true;
        open(loginURL);
        $(".LoginForm_title__R4WVI ").shouldHave(text("Вход в личный кабинет"));
        webelements.loginInput.setValue("51951te");
        webelements.passwordInput.setValue("heph7146");
        webelements.buttonEnter.shouldHave((text("войти"))).click();
        webelements.loginFormErrorMessage.shouldHave(text("Неверный логин или пароль"));
    }

    @Test
        // Сабмит формы авторизации без логина и пароля
    void LoginWithoutData()
    {
        open(loginURL);
        $("[type='submit']").shouldHave((text("войти"))).click();
        webelements.loginHelpMessage.shouldHave(text("Введите логин"));
        webelements.passwordHelpMessage.shouldHave(text("Введите пароль"));
    }

    @Test
        //Сабмит формы авторизации без логина
    void LoginWithoutLoginData()
    {
        open(loginURL);
        webelements.passwordInput.setValue("heph7146");
        webelements.buttonEnter.shouldHave((text("войти"))).click();
        webelements.loginHelpMessage.shouldHave(text("Введите логин"));
    }

    @Test
        //Сабмит формы авторизации без пароля
    void LoginWithoutPasswordData()
    {
        open(loginURL);
        webelements.loginInput.setValue("51951tes");
        webelements.buttonEnter.shouldHave((text("войти"))).click();
        webelements.passwordHelpMessage.shouldHave(text("Введите пароль"));
    }

    @Test
    // Успешная авторизация - пользователь с dostuplkp=on с полным доступом
    void Login()
    {
        //Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1280";
        //Configuration.browser = "firefox";
        lib.ui.LoginPageObject.Login("51951cka", "zlwo4445");
        $(By.xpath("//h1")).shouldHave(text("Ежедневник"));
        webelements.menuCollapse.click();
        webelements.menuContainer.shouldHave(text("Каталог"));
        webelements.menuContainer.shouldHave(text("Ассортимент и логистика"));
        webelements.menuContainer.shouldHave(text("Проектная работа"));
        webelements.menuContainer.shouldHave(text("Коммуникации"));
        webelements.menuContainer.shouldHave(text("Заказы"));
        webelements.menuContainer.shouldHave(text("Финансы"));
        webelements.menuContainer.shouldHave(text("Интеграция"));
        webelements.menuContainer.shouldHave(text("Маркетинг"));
        webelements.menuContainer.shouldHave(text("Аналитика"));
        $("[data-menu-id*='profile']").shouldHave(text("Профиль"));
        $("[data-menu-id*='help']").shouldHave(text("Помощь"));
        $("[data-menu-id*='logout']").shouldHave(text("Выйти"));
        webelements.menuCollapse.click();
        $("[aria-label='logout']").click();
        $(".LoginForm_title__R4WVI ").shouldHave(text("Вход в личный кабинет"));
    }

    @Test
        // Успешная авторизация - пользователь с dostuplkp=on + limitedAccessOneTeam=on с полным доступом
    void LoginMixRights()
    {
        lib.ui.LoginPageObject.Login("51951tes", "heph7146");
        $(By.xpath("//h1")).shouldHave(text("Ежедневник"));
        webelements.menuCollapse.click();
        webelements.menuContainer.shouldHave(text("Анкета поставщика"));
        webelements.menuContainer.shouldHave(text("Каталог"));
        webelements.menuContainer.shouldHave(text("Ассортимент и логистика"));
        webelements.menuContainer.shouldHave(text("Проектная работа"));
        webelements.menuContainer.shouldHave(text("Коммуникации"));
        webelements.menuContainer.shouldHave(text("Заказы"));
        webelements.menuContainer.shouldHave(text("Финансы"));
        webelements.menuContainer.shouldHave(text("Интеграция"));
        webelements.menuContainer.shouldHave(text("Маркетинг"));
        webelements.menuContainer.shouldHave(text("Аналитика"));
        $("[data-menu-id*='profile']").shouldHave(text("Профиль"));
        $("[data-menu-id*='help']").shouldHave(text("Помощь"));
        $("[data-menu-id*='logout']").shouldHave(text("Выйти"));
        webelements.menuCollapse.click();
        $("[aria-label='logout']").click();
        $(".LoginForm_title__R4WVI ").shouldHave(text("Вход в личный кабинет"));
    }

    @Test
        // Успешная авторизация - пользователь с limitedAccessOneTeam=on
    void LoginLimitedAccessOneTeamON()
    {
        lib.ui.LoginPageObject.Login("9215641te", "goyz7736");
        $(By.xpath("//h1")).shouldHave(text("Анкета поставщика"));
        webelements.menuCollapse.click();
        webelements.menuContainer.shouldHave(text("Анкета поставщика"));
        webelements.menuContainer.shouldHave(text("Каталог"));
        $("[data-menu-id*='help']").shouldHave(text("Помощь"));
        $("[data-menu-id*='logout']").shouldHave(text("Выйти"));
        $("[data-menu-id*='logout']").click();
        $(By.xpath("//h1")).shouldHave(text("Управляйте продажами – в одной команде с ЭТМ"));
    }

 }
