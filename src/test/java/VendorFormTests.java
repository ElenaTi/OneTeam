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
    }
    @Test
    @DisplayName("Заполнение Анкеты")
    @Tag("")
    void VendorForm() {
        lib.ui.LoginPageObject.Login("9215642te", "rikb0444");
        webelements.titleMainPage.shouldHave(text("Анкета поставщика"));
        $(By.xpath("//h1/following::div")).shouldHave(text("При рассмотрении вашей анкеты компания ЭТМ может запросить документы для подтверждения указанной информации"));
    }
}
