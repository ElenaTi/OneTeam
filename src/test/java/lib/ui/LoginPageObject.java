package lib.ui;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
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
}
