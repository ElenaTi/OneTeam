import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.Configuration;
import lib.webElements.webelements;
import static com.codeborne.selenide.Condition.visible;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.urlToBe;
import org.junit.jupiter.api.AfterEach;
import com.codeborne.selenide.Selenide;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.SelenideElement;

public class LoginTests {
    String loginURL = "https://idev.etm.ru/oneteam/login";

    @BeforeAll
    @DisplayName("Открытие страницы авторизации")
    static void start() {
        Configuration.browserSize = "1920x1280";
    }

    @Test
    @DisplayName("Авторизация с Невалидным паролем")
    void LoginUnvalidPassword() {
        //Configuration.holdBrowserOpen = true;
        open(loginURL);
        webelements.loginFormTitle.shouldHave(text("Вход в личный кабинет"));
        webelements.loginInput.setValue("51951tes");
        webelements.passwordInput.setValue("heph8888");
        webelements.buttonEnter.shouldHave((text("войти"))).click();
        webelements.loginFormErrorMessage.shouldHave(text("Неверный логин или пароль"));
    }

    @Test
    @DisplayName("Авторизация с Невалидным логином")
    void LoginUnvalidLogin() {
        //Configuration.holdBrowserOpen = true;
        open(loginURL);
        webelements.loginFormTitle.shouldHave(text("Вход в личный кабинет"));
        webelements.loginInput.setValue("51951te");
        webelements.passwordInput.setValue("heph7146");
        webelements.buttonEnter.shouldHave((text("войти"))).click();
        webelements.loginFormErrorMessage.shouldHave(text("Неверный логин или пароль"));
    }

    @Test
    @DisplayName("Сабмит формы авторизации без логина и пароля")
    void LoginWithoutData() {
        open(loginURL);
        $("[type='submit']").shouldHave((text("войти"))).click();
        webelements.loginHelpMessage.shouldHave(text("Введите логин"));
        webelements.passwordHelpMessage.shouldHave(text("Введите пароль"));
    }

    @Test
    @DisplayName("Сабмит формы авторизации без логина")
    void LoginWithoutLoginData() {
        open(loginURL);
        webelements.passwordInput.setValue("heph7146");
        webelements.buttonEnter.shouldHave((text("войти"))).click();
        webelements.loginHelpMessage.shouldHave(text("Введите логин"));
    }

    @Test
    @DisplayName("Сабмит формы авторизации без пароля")
    void LoginWithoutPasswordData() {
        open(loginURL);
        webelements.loginInput.setValue("51951tes");
        webelements.buttonEnter.shouldHave((text("войти"))).click();
        webelements.passwordHelpMessage.shouldHave(text("Введите пароль"));
    }

    @Test
    @DisplayName("Авторизация пользователя с dostuplkp=on с полным доступом")
    void LoginFullRightsDostuplkp() {
        //Configuration.browser = "firefox";
        lib.ui.LoginPageObject.Login("51951cka", "zlwo4445");
        $(By.xpath("//h1")).shouldHave(text("Ежедневник"));
        $("button[class*=ant-btn-primary]").shouldHave(text("Создать встречу"));
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
        webelements.buttonLogout.click();
        $(".LoginForm_title__R4WVI ").shouldHave(text("Вход в личный кабинет"));
    }

    @Test
    @DisplayName("Авторизация пользователя с dostuplkp=on с ограниченным доступом")
    void LogiLimitedRightsDostuplkp() {
        //Configuration.browser = "firefox";
        lib.ui.LoginPageObject.Login("51951tee", "swfl6157");
        $(By.xpath("//h1")).shouldHave(text("Ежедневник"));
        $(By.xpath("//h1/following::div")).shouldNotHave(text("Создать встречу"));
        webelements.menuCollapse.click();
        webelements.menuContainer.shouldHave(text("Каталог"));
        webelements.menuContainer.shouldHave(text("Ассортимент и логистика"));
        webelements.menuContainer.shouldHave(text("Коммуникации"));
        webelements.menuContainer.shouldHave(text("Заказы"));
        webelements.menuContainer.shouldHave(text("Интеграция"));
        webelements.menuContainer.shouldHave(text("Аналитика"));
        webelements.menuContainer.shouldNotHave(text("Проектная работа"));
        webelements.menuContainer.shouldNotHave(text("Финансы"));
        webelements.menuContainer.shouldNotHave(text("Маркетинг"));
        $("[data-menu-id*='profile']").shouldHave(text("Профиль"));
        $("[data-menu-id*='help']").shouldHave(text("Помощь"));
        $("[data-menu-id*='logout']").shouldHave(text("Выйти"));
        webelements.menuCollapse.click();
        webelements.buttonLogout.click();
        $(".LoginForm_title__R4WVI ").shouldHave(text("Вход в личный кабинет"));
    }

    @Test
    @DisplayName("Авторизация пользователя с dostuplkp=on + limitedAccessOneTeam=on с полным доступом")
    void LoginMixRights() {
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
        webelements.buttonLogout.click();
        $(".LoginForm_title__R4WVI ").shouldHave(text("Вход в личный кабинет"));
    }

    @Test
    @DisplayName("Авторизация пользователя с limitedAccessOneTeam=on")
    void LoginLimitedAccessOneTeamON() {
        lib.ui.LoginPageObject.Login("9215641te", "goyz7736");
        $(By.xpath("//h1")).shouldHave(text("Анкета поставщика"));
        webelements.menuCollapse.click();
        webelements.menuContainer.shouldHave(text("Анкета поставщика"));
        webelements.menuContainer.shouldHave(text("Каталог"));
        $("[data-menu-id*='help']").shouldHave(text("Помощь"));
        $("[data-menu-id*='logout']").shouldHave(text("Выйти"));
        webelements.buttonLogout.click();
        $(By.xpath("//h1")).shouldHave(text("Управляйте продажами – в одной команде с ЭТМ"));
    }

    @Test
    @DisplayName("Авторизация физ.лица")
    void LoginMarket()
    {
        lib.ui.LoginPageObject.Login("9119569663", "ntqz5730");
        webelements.loginFormErrorMessage.shouldHave(text("Неверный логин или пароль"));
        webelements.backFromLoginPage.click();
        refresh();
        $("[role='alert']").shouldHave(text("Доступ запрещен"));
        webelements.menuContainer.find("[data-menu-id*=catalog]").shouldBe(visible);
        webelements.menuContainer.find("[data-menu-id*=help]").shouldBe(visible);
        webelements.menuContainer.find("[aria-label=logout]").shouldBe(visible);
        webelements.buttonLogout.click();
        webelements.loginFormTitle.shouldHave(text("Вход в личный кабинет"));
    }

    @Test
    @DisplayName("Авторизация пользователя Ipro без dostuplkp=on")
    void LoginIpro()
    {
        Configuration.holdBrowserOpen = true;
        lib.ui.LoginPageObject.Login("60004392tes", "rvfa8424");
        Wait().until(urlToBe("https://idev.etm.ru/"));
        open("https://idev.etm.ru/oneteam");
        webelements.menuContainer.find("[data-menu-id*=catalog]").shouldBe(visible);
        webelements.menuContainer.find("[data-menu-id*=help]").shouldBe(visible);
        webelements.menuContainer.find("[aria-label=logout]").shouldBe(visible);
        webelements.buttonLogout.click();
        webelements.loginFormTitle.shouldHave(text("Вход в личный кабинет"));
        webelements.backFromLoginPage.click();
        webelements.menuContainer.find("[data-menu-id*=catalog]").shouldNot(exist);
    }

 }
