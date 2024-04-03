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
    public static SelenideElement buttonSubmit = $("[type='submit']");
    public static SelenideElement menuContainer =  $("[class*=Menu_menu_container]");
    public static SelenideElement menuCollapse = $("[class*=ant-layout-sider-trigger]");
    public static SelenideElement menuCatalog = $("[data-menu-id*='catalog']");
    public static SelenideElement menuDownloadNewGoods = $("[data-menu-id*='download']");
    public static SelenideElement menuLogistics = $("[data-menu-id*='logistics']");
    public static SelenideElement menuProductInformation = $("[data-menu-id*='control']");
    public static SelenideElement menuLogisticsData = $("[data-menu-id*='info']");
    public static SelenideElement menuLogisticsAssortment = $("[data-menu-id*='management']");
    public static SelenideElement menuVendorForm = $("[data-menu-id*='vendorForm']");
    public static SelenideElement tagDeliveryTerms = $("[data-node-key='2']");
    public static SelenideElement backFromLoginPage = $("[aria-label=arrow-left]");
    public static SelenideElement buttonLogout = $("[data-menu-id*='logout']");
    public static SelenideElement loginFormTitle = $(".LoginForm_title__R4WVI ");
    public static SelenideElement buttonProfile = $("[data-menu-id*='profile']");
    public static SelenideElement buttonHelp =  $("[data-menu-id*='help']");
    public static SelenideElement title = $(By.xpath("//h1"));
    public static SelenideElement subTitle = $(By.xpath("//h1/following::div"));
    public static SelenideElement alert = $("div[role='alert']");
    public static SelenideElement tagSerts = $("[data-node-key='2']");
    public static SelenideElement tagImages = $("[data-node-key='3']");
    public static SelenideElement tagDescription = $("[data-node-key='4']");
    public static SelenideElement tagTechInfo = $("[data-node-key='5']");
    public static SelenideElement tagPrices = $("[data-node-key='6']");
    public static SelenideElement tagAnalogs = $("[data-node-key='7']");
    public static SelenideElement tagKonstructor = $("[data-node-key='8']");
    public static SelenideElement tagSametypes = $("[data-node-key='9']");
    public static SelenideElement uploadSample = $("[aria-label = 'upload']");
    public static SelenideElement drawerTitle = $("[class*='Drawer_title']");
    public static SelenideElement uploadInput = $("input[id=files]");
    public static SelenideElement uploadDrawer = $(".ant-upload-drag");
    public static SelenideElement mainLogo = $("[class*='Menu_logo_container']");
    public static SelenideElement buttonSendVendorForm = $(By.xpath("//button[contains(.,'Отправить заявку')]"));
}
