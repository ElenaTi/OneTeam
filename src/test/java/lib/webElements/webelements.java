package lib.webElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class webelements {
    public static SelenideElement loginInput = $("#login");
    public static SelenideElement passwordInput = $("#password");
    public static SelenideElement loginFormErrorMessage = $("[class*='LoginForm_error_message']");
    public static SelenideElement loginHelpMessage = $("#login_help div");
    public static SelenideElement passwordHelpMessage = $("#password_help div");
    public static SelenideElement buttonEnter = $("[type='submit']");
    public static SelenideElement menuContainer =  $("[class*=Menu_menu_container]");
    public static SelenideElement menuCollapse = $("[class*=ant-layout-sider-trigger]");
    public static SelenideElement menuCatalog = $("[data-menu-id*='catalog']");
    public static SelenideElement menuDownloadNewGoods = $("[data-menu-id*='download']");
    public static SelenideElement backFromLoginPage = $("[aria-label=arrow-left]");
    public static SelenideElement buttonLogout = $("[data-menu-id*='logout']");
    public static SelenideElement loginFormTitle = $(".LoginForm_title__R4WVI ");
    public static SelenideElement buttonProfile = $("[data-menu-id*='profile']");
    public static SelenideElement buttonHelp =  $("[data-menu-id*='help']");
    public static SelenideElement titleMainPage = $(By.xpath("//h1"));

}
