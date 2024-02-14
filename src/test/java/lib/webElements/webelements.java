package lib.webElements;

import com.codeborne.selenide.SelenideElement;

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
}
