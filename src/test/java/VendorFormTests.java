import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import lib.webElements.webelements;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class VendorFormTests {
    @BeforeAll
    @DisplayName("Размер экрана 1920х1280")
    static void start() {
        Configuration.browserSize = "1920x1280";
        lib.ui.LoginPageObject.Login("9215642te", "rikb0444");
    }
    @Test
    @DisplayName("Сабмит анкеты с незаполненными полями")
    @Tag("")
    void VendorFormWithoutData() {
        webelements.menuVendorForm.click();
        webelements.title.shouldHave(text("Анкета поставщика"));
        $(By.xpath("//h1/following::div")).shouldHave(text("При рассмотрении вашей анкеты компания ЭТМ может запросить документы для подтверждения указанной информации"));
        webelements.alert.shouldHave(text("При рассмотрении вашей анкеты компания ЭТМ может запросить документы для подтверждения указанной информации"));
        webelements.buttonSendVendorForm.click();
        $("#orgCategory_help").shouldHave(text("Пожалуйста, заполните обязательное поле"));
        $("#goodsCategory_help").shouldHave(text("Пожалуйста, заполните обязательное поле"));
        $("#brands_help").shouldHave(text("Пожалуйста, заполните обязательное поле"));
        $("#orgSite_help").shouldHave(text("Пожалуйста, заполните обязательное поле"));
        $("#orgCatalogLink_help").shouldHave(text("Пожалуйста, заполните обязательное поле"));
        $("#deJuroAddress_help").shouldHave(text("Пожалуйста, заполните обязательное поле"));
        $("#warehouses_0_help").shouldHave(text("Пожалуйста, заполните обязательное поле"));
        $("#signTheContract_help").shouldHave(text("Пожалуйста, заполните обязательное поле"));
        $("#sum_help").shouldHave(text("Пожалуйста, заполните обязательное поле"));
    }
    @Test
    @DisplayName("Отправка Анкеты только с обязательными полями")
    @Tag("")
    void CheckingLinkOnSamples(){
        Configuration.holdBrowserOpen = true;
        webelements.menuVendorForm.click();
        //$(By.xpath("//a[@target='_blank' and text()='Договор поставщика']")).click();
        webelements.title.shouldHave(text("Анкета поставщика"));
        $(By.xpath("//*[@id=\"root\"]/div/div/main/form/div[3]/div[2]/div/div/div[2]/div/div/div")).click();
        $("#orgCategory").sendKeys(Keys.ARROW_DOWN);
        $("#orgCategory").sendKeys(Keys.ARROW_DOWN);
        $("#orgCategory").pressEnter();
        $(By.xpath("//*[@id=\"root\"]/div/div/main/form/div[3]/div[3]/div/div/div[2]/div/div/div")).click();
        $("#goodsCategory").sendKeys(Keys.ARROW_DOWN);
        $("#goodsCategory").sendKeys(Keys.ARROW_DOWN);
        $("#goodsCategory").pressEnter();
        $("#goodsCategory").sendKeys(Keys.ARROW_DOWN);
        $("#goodsCategory").sendKeys(Keys.ARROW_DOWN);
        $("#goodsCategory").pressEnter();
        $("#orgName").click();
        $("#brands").click();
        $("#brands").setValue("Бренд 1, Бренд 2, Бренд 3");
        $("#orgSite").click();
        $("#orgSite").setValue("idev.etm.ru");
        $("#orgCatalogLink").click();
        $("#orgCatalogLink").setValue("тест.рф");
        $("#deJuroAddress").click();
        $("#deJuroAddress").setValue("Санкт-Петербург, ул. Советская");
        $("#warehouses_0").click();
        $("#warehouses_0").setValue("Санкт-Петербург, Всеволожск");
        $("[value='Нет']").click();
        $("#sum").click();
        $("#sum").setValue("1234567");
        webelements.buttonSendVendorForm.click();
        webelements.alert.shouldHave(text("Данные успешно загружены"));
        $(".ant-result-title").shouldHave(text("Анкета успешно отправлена на согласование."));
        $(".ant-result-subtitle").shouldHave(text("Мы сообщим вам статус согласования после обработки анкеты."));

    }
    @Test
    @DisplayName("Отправка анкеты без файлов")
    @Tag("")
    void SuccessSendVendorFormWithoutFiles(){
        webelements.menuVendorForm.click();
        webelements.title.shouldHave(text("Анкета поставщика"));
        $(By.xpath("//*[@id=\"root\"]/div/div/main/form/div[3]/div[2]/div/div/div[2]/div/div/div")).click();
        $("#orgCategory").sendKeys(Keys.ARROW_DOWN);
        $("#orgCategory").sendKeys(Keys.ARROW_DOWN);
        $("#orgCategory").pressEnter();
        $("#goodsExtraCategory").click();
        $("#goodsExtraCategory").setValue("Товары");
        $(By.xpath("//*[@id=\"root\"]/div/div/main/form/div[3]/div[3]/div/div/div[2]/div/div/div")).click();
        $("#goodsCategory").sendKeys(Keys.ARROW_DOWN);
        $("#goodsCategory").sendKeys(Keys.ARROW_DOWN);
        $("#goodsCategory").pressEnter();
        $("#orgName").click();
        $("#brands").click();
        $("#brands").setValue("Бренд 1, Бренд 2, Бренд 3");
        $("#orgSite").click();
        $("#orgSite").setValue("idev.etm.ru");
        $("#orgCatalogLink").click();
        $("#orgCatalogLink").setValue("тест.рф");
        $("#deJuroAddress").click();
        $("#deJuroAddress").setValue("Санкт-Петербург, ул. Советская");
        $("#deFactoAddress").click();
        $("#deFactoAddress").setValue("Санкт-Петербург, Невский пр.");
        $("#warehouses_0").click();
        $("#warehouses_0").setValue("Санкт-Петербург, Романовка");
        $("[value='Да']").click();
        $("#sum").click();
        $("#sum").setValue("1234567");
        webelements.buttonSendVendorForm.click();
        webelements.alert.shouldHave(text("Данные успешно загружены"));
        $(".ant-result-title").shouldHave(text("Анкета успешно отправлена на согласование."));
        $(".ant-result-subtitle").shouldHave(text("Мы сообщим вам статус согласования после обработки анкеты."));
    }

}
