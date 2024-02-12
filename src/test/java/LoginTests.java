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
import lib.ui.LoginPageObject;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import lib.ui.LoginPageObject;


public class LoginTests {
    String loginURL = "https://idev.etm.ru/oneteam/login";
    private final SelenideElement loginInput = $("#login");
    private final SelenideElement passwordInput = $("#password");
    private final SelenideElement loginFormErrorMessage = $("[class*='LoginForm_error_message']");
    private final SelenideElement loginHelpMessage = $("#login_help div");
    private final SelenideElement passwordHelpMessage = $("#password_help div");

    private final SelenideElement buttonEnter = $("[type='submit']");



    @Test
    void GoToLoginPage()
    {
        Configuration.holdBrowserOpen = true;
        open("https://idev.etm.ru/oneteam");
        lib.ui.LoginPageObject.TransitionToSocialNetwork(".Footer_logo_icons__pWS-2","https://idev.etm.ru/");
        lib.ui.LoginPageObject.TransitionToSocialNetwork(".Footer_social_media_icons__qTWJ8 :nth-child(1)", "https://vk.com/etm_company");
        lib.ui.LoginPageObject.TransitionToSocialNetwork(".Footer_social_media_icons__qTWJ8 :nth-child(2) .ant-btn-icon", "https://t.me/etm_company");
        /*$(".Footer_social_media_icons__qTWJ8 :nth-child(3) .ant-btn-icon").click();
        switchTo().window(1);*/
        lib.ui.LoginPageObject.TransitionToSocialNetwork(".Footer_social_media_icons__qTWJ8 :nth-child(4) .ant-btn-icon", "https://dzen.ru/etm_company?utm_referer=www.etm.ru&utm_referrer=idev.etm.ru");
        $("[data-menu-id*='login']").click();
        $(".LoginForm_title__R4WVI ").shouldHave(text("Вход в личный кабинет"));
    }


    @Test
        //Авторизация с Невалидным паролем
    void LoginUnvalidPassword()
    {
        //Configuration.holdBrowserOpen = true;
        open(loginURL);
        $(".LoginForm_title__R4WVI ").shouldHave(text("Вход в личный кабинет"));
        loginInput.setValue("51951tes");
        passwordInput.setValue("heph8888");
        buttonEnter.shouldHave((text("войти"))).click();
        loginFormErrorMessage.shouldHave(text("Неверный логин или пароль"));
    }

    @Test
        //Авторизация с Невалидным логином
    void LoginUnvalidLogin()
    {
        //Configuration.holdBrowserOpen = true;
        open(loginURL);
        $(".LoginForm_title__R4WVI ").shouldHave(text("Вход в личный кабинет"));
        loginInput.setValue("51951te");
        passwordInput.setValue("heph7146");
        buttonEnter.shouldHave((text("войти"))).click();
        loginFormErrorMessage.shouldHave(text("Неверный логин или пароль"));
    }

    @Test
        // Сабмит формы авторизации без логина и пароля
    void LoginWithoutData()
    {
        open(loginURL);
        $("[type='submit']").shouldHave((text("войти"))).click();
        loginHelpMessage.shouldHave(text("Введите логин"));
        passwordHelpMessage.shouldHave(text("Введите пароль"));
    }

    @Test
        //Сабмит формы авторизации без логина
    void LoginWithoutLoginData()
    {
        open(loginURL);
        passwordInput.setValue("heph7146");
        buttonEnter.shouldHave((text("войти"))).click();
        loginHelpMessage.shouldHave(text("Введите логин"));
    }

    @Test
        //Сабмит формы авторизации без пароля
    void LoginWithoutPasswordData()
    {
        open(loginURL);
        loginInput.setValue("51951tes");
        buttonEnter.shouldHave((text("войти"))).click();
        passwordHelpMessage.shouldHave(text("Введите пароль"));
    }

    @Test
    // Успешная авторизация - пользователь с dostuplkp=on с полным доступом
    void Login()
    {
        //Configuration.browser = "firefox";
        open(loginURL);
        $(".LoginForm_title__R4WVI ").shouldHave(text("Вход в личный кабинет"));
        loginInput.setValue("51951cka");
        passwordInput.setValue("zlwo4445").pressEnter();
        $(By.xpath("//h1")).shouldHave(text("Ежедневник"));
        $("[aria-label='logout']").click();
    }

    @Test
        // Успешная авторизация - пользователь с dostuplkp=on + limitedAccessOneTeam=on с полным доступом
    void LoginMixRights()
    {
        //Configuration.browser = "firefox";
        open(loginURL);
        $(".LoginForm_title__R4WVI ").shouldHave(text("Вход в личный кабинет"));
        loginInput.setValue("51951tes");
        passwordInput.setValue("heph7146").pressEnter();
        $(By.xpath("//h1")).shouldHave(text("Ежедневник"));
        $("[aria-label='logout']").click();
    }

    @Test
        // Успешная авторизация - пользователь с limitedAccessOneTeam=on
    void LoginLimitedAccessOneTeamON()
    {
        open(loginURL);

        $(".LoginForm_title__R4WVI ").shouldHave(text("Вход в личный кабинет"));
        loginInput.setValue("9215641te");
        passwordInput.setValue("goyz7736").pressEnter();
        $(By.xpath("//h1")).shouldHave(text("Анкета поставщика"));
        $("[aria-label='logout']").click();
    }

 }
