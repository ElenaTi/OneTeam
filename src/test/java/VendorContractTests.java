import com.codeborne.selenide.Configuration;
import lib.webElements.webElementsVendorContract;
import lib.webElements.webelements;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;

public class VendorContractTests {
        @BeforeAll
        @DisplayName("Размер экрана 1920х1280")
        static void start() {
            Configuration.browserSize = "1920x1280";
            lib.ui.LoginPageObject.Login("9215642te", "rikb0444");
        }

    @Test
    @Tag("")
    @DisplayName("Сабмит Шага 0 без выбора чекбокса")
    void SubmitContractStep0WithotFilling(){
        //Configuration.holdBrowserOpen = true;
            webelements.mainLogo.click();
            webelements.menuVendorContract.click();
            webelements.title.shouldHave(text("Договор поставщика"));
            webelements.alert.shouldHave(text("Все данные, которые вы добавляете, автоматически вносятся в текст договора. Вам останется только распечатать его, подписать, прикрепить скан-копию и отправить его нам"));
            webElementsVendorContract.subtitleVendorContract.shouldHave(text("Ознакомьтесь с шаблоном договора поставщика:"));
            webElementsVendorContract.buttonSubmitStep0.click();
            webElementsVendorContract.radiobuttonStep0Help.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        }
    @Test
    @Tag("")
    @DisplayName("Сабмит Шага 1 без заполнения, Возврат на Шаг 0")
    void ReturnToStep0FromStep1(){
        Configuration.holdBrowserOpen = true;
        webelements.mainLogo.click();
        webelements.menuVendorContract.click();
        webelements.title.shouldHave(text("Договор поставщика"));
        webelements.alert.shouldHave(text("Все данные, которые вы добавляете, автоматически вносятся в текст договора. Вам останется только распечатать его, подписать, прикрепить скан-копию и отправить его нам"));
        webElementsVendorContract.radiobuttonStepONO.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.subtitleVendorContract.shouldHave(text("Ознакомьтесь с шаблоном договора поставщика:"));
        webElementsVendorContract.subtitleStep1.shouldHave(text("Данные о юридическом лице"));
        webElementsVendorContract.buttonSubmitStep1.click();
        webElementsVendorContract.step1ManagementHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1OGRNHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1FIOSignatoryHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1PositionSignatoryHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1FIOPropsHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1PositionPropsHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1EmailHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1JuroAddressHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1FactoAddressHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1RightToSignHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1RightToSignNumberHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1BIKHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1NameBankHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1CorrespondentAccountHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step1CurrentAccountHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.buttonBackStep1.click();
        webElementsVendorContract.selectedCheckbox.shouldHave(text("У меня ещё нет договора, хочу перейти к заполнению данных для его генерации"));
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.subtitleStep1.shouldHave(text("Данные о юридическом лице"));
        webElementsVendorContract.step1ManagementHelp.shouldNot(exist);
        webElementsVendorContract.step1OGRNHelp.shouldNot(exist);
        webElementsVendorContract.step1FIOSignatoryHelp.shouldNot(exist);
        webElementsVendorContract.step1FIOSignatoryExtra.shouldHave(text("Например: Иванова Ивана Ивановича"));
        webElementsVendorContract.step1PositionSignatoryHelp.shouldNot(exist);
        webElementsVendorContract.step1PositionSignatoryExtra.shouldHave(text("Например: Руководителя отдела"));
        webElementsVendorContract.step1FIOPropsHelp.shouldNot(exist);
        webElementsVendorContract.step1FIOPropsExtra.shouldHave(text("Например: Иванов И.И."));
        webElementsVendorContract.step1PositionPropsHelp.shouldNot(exist);
        webElementsVendorContract.step1PositionPropsExtra.shouldHave(text("Например: Руководитель отдела"));
        webElementsVendorContract.step1EmailHelp.shouldNot(exist);
        webElementsVendorContract.step1JuroAddressHelp.shouldNot(exist);
        webElementsVendorContract.step1FactoAddressHelp.shouldNot(exist);
        webElementsVendorContract.step1RightToSignHelp.shouldNot(exist);
        webElementsVendorContract.step1RightToSignNumberHelp.shouldNot(exist);
        webElementsVendorContract.step1BIKHelp.shouldNot(exist);
        webElementsVendorContract.step1NameBankHelp.shouldNot(exist);
        webElementsVendorContract.step1CorrespondentAccountHelp.shouldNot(exist);
        webElementsVendorContract.step1CurrentAccountHelp.shouldNot(exist);
    }

}
