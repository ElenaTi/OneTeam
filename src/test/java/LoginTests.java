import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginTests {
    String loginURL = "https://idev.etm.ru/oneteam/login";
    private final SelenideElement loginInput = $("#login");
    private final SelenideElement passwordInput = $("#password");
    private final SelenideElement loginFormErrorMessage = $("[class*='LoginForm_error_message']");
    private final SelenideElement loginHelpMessage = $("#login_help div");
    private final SelenideElement passwordHelpMessage = $("#password_help div");

    private final SelenideElement buttonEnter = $("[type='submit']");

    @Test
    void Login()
    {
        //Configuration.browser = "firefox";
        open(loginURL);
        $(".LoginForm_title__R4WVI ").shouldHave(text("Вход в личный кабинет"));
        loginInput.setValue("51951tes");
        passwordInput.setValue("heph7146").pressEnter();
        $(By.xpath("//h1")).shouldHave(text("Ежедневник"));
    }

    @Test
    void LoginWithoutData()
    {
        open(loginURL);
        $("[type='submit']").shouldHave((text("войти"))).click();
        loginHelpMessage.shouldHave(text("Введите логин"));
        passwordHelpMessage.shouldHave(text("Введите пароль"));
    }

    @Test
    void LoginWithoutLoginData()
    {
        open(loginURL);
        passwordInput.setValue("heph7146");
        buttonEnter.shouldHave((text("войти"))).click();
        loginHelpMessage.shouldHave(text("Введите логин"));
    }

    @Test
    void LoginWithoutPasswordData()
    {
        open(loginURL);
        loginInput.setValue("51951tes");
        buttonEnter.shouldHave((text("войти"))).click();
        passwordHelpMessage.shouldHave(text("Введите пароль"));
    }

    @Test
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


 }
