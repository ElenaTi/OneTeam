package lib.ui;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import lib.webElements.webelements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginPageObject {

    public static void TransitionToSocialNetwork(String icon, String expectedUrl)
    {
        $(icon).click();
        switchTo().window(1);
        String actualUrl = WebDriverRunner.url();
        assertThat(expectedUrl, equalTo(actualUrl));
        Selenide.closeWindow();
        switchTo().window(0);
    }

    public static void Login(String login, String password)
    {
        String loginURL = "https://idev.etm.ru/oneteam/login";
        open(loginURL);
        webelements.loginFormTitle.shouldHave(text("Вход в личный кабинет"));
        webelements.loginInput.setValue(login);
        webelements.passwordInput.setValue(password).pressEnter();
    }
}
