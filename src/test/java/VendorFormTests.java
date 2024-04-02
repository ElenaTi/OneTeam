import com.codeborne.selenide.Configuration;
import lib.webElements.webelements;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

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
    void VendorForm() {
        webelements.menuVendorForm.click();
        webelements.title.shouldHave(text("Анкета поставщика"));
        $(By.xpath("//h1/following::div")).shouldHave(text("При рассмотрении вашей анкеты компания ЭТМ может запросить документы для подтверждения указанной информации"));
        webelements.alert.shouldHave(text("При рассмотрении вашей анкеты компания ЭТМ может запросить документы для подтверждения указанной информации"));
        webelements.buttonSubmit.click();
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
}
