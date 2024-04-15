package lib.webElements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class webElementsVendorContract {
    public static SelenideElement radiobuttonStep0Help = $("#pathwise_radio_help");
    public static SelenideElement buttonSubmitStep0 = $(By.xpath("//button[contains(.,'Продолжить')]"));
}
