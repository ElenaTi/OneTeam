import com.codeborne.selenide.Configuration;
import lib.webElements.webElementsVendorContract;
import lib.webElements.webelements;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;

public class VendorContractTests {
        @BeforeAll
        @DisplayName("Размер экрана 1920х1280")
        static void start() {
            Configuration.browserSize = "1920x1280";
            lib.ui.LoginPageObject.Login("9215642te", "rikb0444");
        }

    @Test
    void SubmitContractStep0WithotFilling(){
            Configuration.holdBrowserOpen = true;
            webelements.mainLogo.click();
            webelements.menuVendorContract.click();
            webelements.title.shouldHave(text("Договор поставщика"));
            webelements.alert.shouldHave(text("Все данные, которые вы добавляете, автоматически вносятся в текст договора. Вам останется только распечатать его, подписать, прикрепить скан-копию и отправить его нам"));
            webElementsVendorContract.buttonSubmitStep0.click();
            webElementsVendorContract.radiobuttonStep0Help.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        }
}
