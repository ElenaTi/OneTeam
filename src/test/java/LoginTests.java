import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.Configuration;
import lib.webElements.webelements;
import static com.codeborne.selenide.Condition.visible;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.urlToBe;

import com.codeborne.selenide.Selenide;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.SelenideElement;

public class LoginTests {
    String loginURL = "https://idev.etm.ru/oneteam/login";

    @BeforeAll
    @DisplayName("Размер экрана 1920х1280")
    static void start() {
        Configuration.browserSize = "1920x1280";
    }

    @Test
    @DisplayName("Авторизация с Невалидным паролем")
    @Tag("TMOT-275")
    void LoginUnvalidPassword() {
        //Configuration.holdBrowserOpen = true;
        open(loginURL);
        webelements.loginFormTitle.shouldHave(text("Вход в iPRO OneTeam"));
        webelements.loginInput.setValue("51951tes");
        webelements.passwordInput.setValue("heph8888");
        webelements.buttonEnter.shouldHave((text("войти"))).click();
        webelements.loginFormErrorMessage.shouldHave(text("Неверный логин или пароль"));
    }

    @Test
    @DisplayName("Авторизация с Невалидным логином")
    @Tag("TMOT-277")
    void LoginUnvalidLogin() {
        //Configuration.holdBrowserOpen = true;
        open(loginURL);
        webelements.loginFormTitle.shouldHave(text("Вход в iPRO OneTeam"));
        webelements.loginInput.setValue("51951te");
        webelements.passwordInput.setValue("heph7146");
        webelements.buttonEnter.shouldHave((text("войти"))).click();
        webelements.loginFormErrorMessage.shouldHave(text("Неверный логин или пароль"));
    }

    @Test
    @DisplayName("Сабмит формы авторизации без логина и пароля")
    @Tag("TMOT-278")
    void LoginWithoutData() {
        open(loginURL);
        webelements.buttonEnter.shouldHave((text("войти"))).click();
        webelements.loginHelpMessage.shouldHave(text("Введите логин"));
        webelements.passwordHelpMessage.shouldHave(text("Введите пароль"));
    }

    @Test
    @DisplayName("Сабмит формы авторизации без логина")
    @Tag("TMOT-279")
    void LoginWithoutLoginData() {
        open(loginURL);
        webelements.passwordInput.setValue("heph7146");
        webelements.buttonEnter.shouldHave((text("войти"))).click();
        webelements.loginHelpMessage.shouldHave(text("Введите логин"));
    }

    @Test
    @DisplayName("Сабмит формы авторизации без пароля")
    @Tag("TMOT-280")
    void LoginWithoutPasswordData() {
        open(loginURL);
        webelements.loginInput.setValue("51951tes");
        webelements.buttonEnter.shouldHave((text("войти"))).click();
        webelements.passwordHelpMessage.shouldHave(text("Введите пароль"));
    }

    @Test
    @DisplayName("Авторизация пользователя с dostuplkp=on с полным доступом")
    @Tag("TMOT-281")
    void LoginFullRightsDostuplkp() {
        //Configuration.browser = "firefox";
        lib.ui.LoginPageObject.Login("51951cka", "lxca1500");
        webelements.title.shouldHave(text("Управляйте продажами – в одной команде с ЭТМ"));
        $("[data-menu-id*='orders']").click();
        $(By.xpath("//h1")).shouldHave(text("Заказы"));
        webelements.menuContainer.shouldHave(text("Каталог"));
        webelements.menuContainer.shouldHave(text("Ассортимент и логистика"));
        webelements.menuContainer.shouldHave(text("Проектная работа"));
        webelements.menuContainer.shouldHave(text("Коммуникации"));
        webelements.menuContainer.shouldHave(text("Заказы"));
        webelements.menuContainer.shouldHave(text("Финансы"));
        webelements.menuContainer.shouldHave(text("Интеграция"));
        webelements.menuContainer.shouldHave(text("Маркетинг"));
        webelements.menuContainer.shouldHave(text("Аналитика"));
        webelements.buttonProfile.shouldHave(text("Профиль"));
        webelements.buttonHelp.shouldHave(text("Помощь"));
        webelements.buttonLogout.shouldHave(text("Выйти"));
        $("[data-menu-id*='communications']").click();
        $("[href='/oneteam/communications/diary']").click();
        $(By.xpath("//h1")).shouldHave(text("Ежедневник"));
        $("button[class*=ant-btn-primary]").shouldHave(text("Создать встречу"));
        webelements.menuCollapse.click();
        webelements.buttonLogout.click();
        webelements.loginFormTitle.shouldHave(text("Вход в iPRO OneTeam"));
        webelements.loginInput.setValue("51951cka");
        webelements.passwordInput.setValue("lxca1500").pressEnter();
        $(By.xpath("//h1")).shouldHave(text("Ежедневник"));
        webelements.buttonLogout.click();
        webelements.loginFormTitle.shouldHave(text("Вход в iPRO OneTeam"));
    }

    @Test
    @DisplayName("Авторизация пользователя с dostuplkp=on с базовым доступом")
    @Tag("TMOT-282")
    void LogiLimitedRightsDostuplkp() {
        //Configuration.browser = "firefox";
        lib.ui.LoginPageObject.Login("51951tee", "swfl6157");
        webelements.title.shouldHave(text("Управляйте продажами – в одной команде с ЭТМ"));
        $("[data-menu-id*='analytics']").click();
        $(By.xpath("//h1")).shouldHave(text("Аналитика"));
        webelements.menuContainer.shouldHave(text("Каталог"));
        webelements.menuContainer.shouldHave(text("Ассортимент и логистика"));
        webelements.menuContainer.shouldHave(text("Коммуникации"));
        webelements.menuContainer.shouldHave(text("Заказы"));
        webelements.menuContainer.shouldHave(text("Интеграция"));
        webelements.menuContainer.shouldHave(text("Аналитика"));
        webelements.menuContainer.shouldNotHave(text("Проектная работа"));
        webelements.menuContainer.shouldNotHave(text("Финансы"));
        webelements.menuContainer.shouldNotHave(text("Маркетинг"));
        webelements.buttonProfile.shouldHave(text("Профиль"));
        webelements.buttonHelp.shouldHave(text("Помощь"));
        webelements.buttonLogout.shouldHave(text("Выйти"));
        webelements.menuCollapse.click();
        webelements.buttonLogout.click();
        webelements.loginFormTitle.shouldHave(text("Вход в iPRO OneTeam"));
        webelements.loginInput.setValue("51951tee");
        webelements.passwordInput.setValue("swfl6157").pressEnter();
        $(By.xpath("//h1")).shouldHave(text("Аналитика"));
        webelements.menuCollapse.click();
        $("[data-menu-id*='communications']").click();
        $("[href='/oneteam/communications/diary']").click();
        $(By.xpath("//h1")).shouldHave(text("Ежедневник"));
        $(By.xpath("//h1/following::div")).shouldNotHave(text("Создать встречу"));
        webelements.menuCollapse.click();
        webelements.buttonLogout.click();
        webelements.loginFormTitle.shouldHave(text("Вход в iPRO OneTeam"));
    }

    @Test
    @DisplayName("Авторизация пользователя с dostuplkp=on + limitedAccessOneTeam=on с полным доступом")
    @Tag("TMOT-283")
    void LoginMixRights() {
        lib.ui.LoginPageObject.Login("51951tes", "heph7146");
        webelements.title.shouldHave(text("Управляйте продажами – в одной команде с ЭТМ"));
        $("[data-menu-id*='vendorForm']").click();
        $(By.xpath("//h1")).shouldHave(text("Анкета поставщика"));
        webelements.menuCollapse.click();
        webelements.buttonLogout.click();
        webelements.loginFormTitle.shouldHave(text("Вход в iPRO OneTeam"));
        webelements.loginInput.setValue("51951tes");
        webelements.passwordInput.setValue("heph7146").pressEnter();
        $(By.xpath("//h1")).shouldHave(text("Анкета поставщика"));
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
        webelements.buttonProfile.shouldHave(text("Профиль"));
        webelements.buttonHelp.shouldHave(text("Помощь"));
        webelements.buttonLogout.shouldHave(text("Выйти"));
        $("[data-menu-id*='communications']").click();
        $("[href='/oneteam/communications/diary']").click();
        $(By.xpath("//h1")).shouldHave(text("Ежедневник"));
        $("button[class*=ant-btn-primary]").shouldHave(text("Создать встречу"));
        webelements.menuCollapse.click();
        webelements.buttonLogout.click();
        webelements.loginFormTitle.shouldHave(text("Вход в iPRO OneTeam"));
    }

    @Test
    @DisplayName("Авторизация пользователя с limitedAccessOneTeam=on")
    @Tag("TMOT-284")
    void LoginLimitedAccessOneTeamON() {
        //Configuration.holdBrowserOpen = true;
        lib.ui.LoginPageObject.Login("9215641te", "goyz7736");
        webelements.title.shouldHave(text("Управляйте продажами – в одной команде с ЭТМ"));
        $("[data-menu-id*='vendorContract']").click();
        webelements.title.shouldHave(text("Договор поставщика"));
        webelements.menuCollapse.click();
        webelements.buttonLogout.click();
        webelements.loginFormTitle.shouldHave(text("Вход в iPRO OneTeam"));
        webelements.loginInput.setValue("9215641te");
        webelements.passwordInput.setValue("goyz7736").pressEnter();
        webelements.title.shouldHave(text("Договор поставщика"));
        webelements.menuCollapse.click();
        webelements.menuContainer.shouldHave(text("Анкета поставщика"));
        webelements.menuContainer.shouldHave(text("Каталог"));
        webelements.menuContainer.find("[data-menu-id*='profile']").shouldNot(exist);
        webelements.buttonHelp.shouldHave(text("Помощь"));
        webelements.buttonLogout.shouldHave(text("Выйти"));
        webelements.buttonLogout.click();
        webelements.loginFormTitle.shouldHave(text("Вход в iPRO OneTeam"));
        $("[aria-label='arrow-left']").click();
        webelements.title.shouldHave(text("Управляйте продажами – в одной команде с ЭТМ"));
    }

    @Test
    @DisplayName("Авторизация физ.лица")
    @Tag("TMOT-285")
    void LoginMarket()
    {
        lib.ui.LoginPageObject.Login("9119569663", "ntqz5730");
        webelements.loginFormErrorMessage.shouldHave(text("Неверный логин или пароль"));
        webelements.backFromLoginPage.click();
        webelements.title.shouldHave(text("Управляйте продажами – в одной команде с ЭТМ"));
        refresh();
        $("[role='alert']").shouldHave(text("Доступ запрещен"));
        webelements.menuContainer.find("[data-menu-id*=catalog]").shouldBe(visible);
        webelements.menuContainer.find("[data-menu-id*=help]").shouldBe(visible);
        webelements.menuContainer.find("[aria-label=logout]").shouldBe(visible);
        webelements.buttonLogout.click();
        webelements.loginFormTitle.shouldHave(text("Вход в iPRO OneTeam"));
        webelements.backFromLoginPage.click();
        webelements.title.shouldHave(text("Управляйте продажами – в одной команде с ЭТМ"));
        webelements.menuContainer.find("[data-menu-id*=catalog]").shouldNot(exist);
    }

    @Test
    @DisplayName("Авторизация пользователя Ipro без dostuplkp=on")
    @Tag("TMOT-286")
    void LoginIpro()
    {
        lib.ui.LoginPageObject.Login("60004392tes", "rvfa8424");
        //Wait().until(urlToBe("https://idev.etm.ru/"));
        //open("https://idev.etm.ru/oneteam");
        webelements.menuContainer.find("[data-menu-id*=catalog]").shouldBe(visible);
        webelements.menuContainer.find("[data-menu-id*=help]").shouldBe(visible);
        webelements.menuContainer.find("[aria-label=logout]").shouldBe(visible);
        webelements.buttonLogout.click();
        webelements.loginFormTitle.shouldHave(text("Вход в iPRO OneTeam"));
        webelements.backFromLoginPage.click();
        webelements.title.shouldHave(text("Управляйте продажами – в одной команде с ЭТМ"));
        webelements.menuContainer.find("[data-menu-id*=catalog]").shouldNot(exist);
    }
    @Test
    @DisplayName("Авторизация WI")
    @Tag("TMOT-287")
    void LoginWI()
    {
        lib.ui.LoginPageObject.Login("ayrapetova_ea_mopp", "suut6494");
        webelements.loginFormErrorMessage.shouldHave(text("Неверный логин или пароль"));
        webelements.backFromLoginPage.click();
        refresh();
        $("[role='alert']").shouldHave(text("Доступ запрещен"));
        webelements.menuContainer.find("[data-menu-id*=catalog]").shouldBe(visible);
        webelements.menuContainer.find("[data-menu-id*=help]").shouldBe(visible);
        webelements.menuContainer.find("[aria-label=logout]").shouldBe(visible);
        webelements.buttonLogout.click();
        webelements.loginFormTitle.shouldHave(text("Вход в iPRO OneTeam"));
        webelements.backFromLoginPage.click();
        webelements.title.shouldHave(text("Управляйте продажами – в одной команде с ЭТМ"));
        webelements.menuContainer.find("[data-menu-id*=catalog]").shouldNot(exist);
    }
 }
