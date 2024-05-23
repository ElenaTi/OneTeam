import com.codeborne.selenide.Configuration;
import lib.webElements.webElementsVendorContract;
import lib.webElements.webelements;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class VendorContractTestsSecondStep {
    @BeforeAll
    @DisplayName("Размер экрана 1920х1280, Авторизация")
    static void start() {
        //Configuration.browser = "firefox";
        //Configuration.browser = "edge";
        Configuration.browserSize = "1920x1280";
        lib.ui.LoginPageObject.Login("9215642te", "rikb0444");
    }

    @Test
    @Tag("")
    @DisplayName("Проверка отображения Шага 2")
    void CheckDisplayStep2() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.FillingStep1();
        webElementsVendorContract.buttonSubmitStep1.click();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        webElementsVendorContract.step0IsFinished.should(exist);
        webElementsVendorContract.step1IsActive.shouldNot(exist);
        webElementsVendorContract.step2IsActive.should(exist);
        webElementsVendorContract.defermentTitleStep2.shouldHave(attribute("title", "Отсрочка платежа не менее (30/45/90/120) дней"));
        webElementsVendorContract.columnGroupTitleStep2.shouldHave(text("Товарная группа"));
        webElementsVendorContract.columnNameTitleStep2.shouldHave(text("Наименование товара"));
        webElementsVendorContract.columnDiscountTitleStep2.shouldHave(text("Скидка"));
        webElementsVendorContract.columnActionTitleStep2.shouldHave(text("Действие"));
        webElementsVendorContract.questionStep2.click();
        webElementsVendorContract.tooltipStep2.should(exist);
        webElementsVendorContract.buttonAddLineStep2.should(exist);
        webElementsVendorContract.buttonBackStep2.should(exist);
        webElementsVendorContract.buttonSubmitStep2.should(exist);
    }
    @Test
    @Tag("")
    @DisplayName("Сабмит Шага 2 без заполнения")
    void SubmitSte2WithoutFilling() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        webElementsVendorContract.buttonSubmitStep2.click();
        webElementsVendorContract.step2DefermentHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2DefermentHelp.shouldHave(text("Может принимать только целое значение до 999"));
        webElementsVendorContract.step2ProductGroupHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2NameOfProductHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2DiscountHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2DiscountHelp.shouldHave(text("Может принимать значение от 0 до 100"));
    }
    @Test
    @Tag("")
    @DisplayName("Сабмит Шага 2 без заполнения, переход на Шаг 1")
    void ReturnToStep1FromStep2()throws InterruptedException {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        webElementsVendorContract.buttonSubmitStep2.click();
        Thread.sleep(50);
        webElementsVendorContract.buttonBackStep2.click();
        webElementsVendorContract.step1IsActive.should(exist);
        lib.ui.VendorContractPageObgect.SubmitStep1();
        webElementsVendorContract.step2DefermentHelp.shouldNot(exist);
        webElementsVendorContract.step2ProductGroupHelp.shouldNot(exist);
        webElementsVendorContract.step2NameOfProductHelp.shouldNot(exist);
        webElementsVendorContract.step2DiscountHelp.shouldNot(exist);
    }

    @Test
    @Tag("")
    @DisplayName("Проверка заполнения поля Отсрочка платежа")
    void CheckInputDeferment() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        webElementsVendorContract.defermentStep2.setValue("0,1");
        webElementsVendorContract.step2DefermentHelp.shouldHave(text("Может принимать только целое значение до 999"));
        webElementsVendorContract.defermentStep2.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.defermentStep2.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.defermentStep2.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.step2DefermentHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2DefermentHelp.shouldHave(text("Может принимать только целое значение до 999"));
        webElementsVendorContract.defermentStep2.setValue("0.1");
        webElementsVendorContract.step2DefermentHelp.shouldHave(text("Может принимать только целое значение до 999"));
        webElementsVendorContract.defermentStep2.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.defermentStep2.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.defermentStep2.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.step2DefermentHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2DefermentHelp.shouldHave(text("Может принимать только целое значение до 999"));
        webElementsVendorContract.defermentStep2.setValue("1000");
        webElementsVendorContract.step2DefermentHelp.shouldHave(text("Может принимать только целое значение до 999"));
        webElementsVendorContract.defermentStep2.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.step2DefermentHelp.shouldNot(exist);
    }
    @Test
    @Tag("")
    @DisplayName("Проверка заполнения поля Скидка")
    void heckInputDiscount() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        webElementsVendorContract.discountStep2.setValue("101");
        webElementsVendorContract.step2DiscountHelp.shouldHave(text("Может принимать значение от 0 до 100"));
        webElementsVendorContract.discountStep2.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.discountStep2.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.discountStep2.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.step2DiscountHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2DiscountHelp.shouldHave(text("Может принимать значение от 0 до 100"));
        webElementsVendorContract.discountStep2.setValue("-9");
        webElementsVendorContract.defermentStep2.click();
        webElementsVendorContract.step2DiscountHelp.shouldHave(text("Может принимать значение от 0 до 100"));
        webElementsVendorContract.discountStep2.shouldHave(attribute("value", "-9"));
        webElementsVendorContract.discountStep2.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.discountStep2.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.discountStep2.setValue("9,9");
        webElementsVendorContract.defermentStep2.click();
        webElementsVendorContract.discountStep2.shouldHave(attribute("value", "9.9"));
        webElementsVendorContract.step2DiscountHelp.shouldNot(exist);
        webElementsVendorContract.discountStep2.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.discountStep2.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.discountStep2.sendKeys(Keys.BACK_SPACE);
        webElementsVendorContract.discountStep2.setValue("99.9");
        webElementsVendorContract.defermentStep2.click();
        webElementsVendorContract.discountStep2.shouldHave(attribute("value", "99.9"));
        webElementsVendorContract.step2DiscountHelp.shouldNot(exist);
    }
    @Test
    @Tag("")
    @DisplayName("Заполнение и сабмит шага 2, переход на Шаг 3")
    void FillingAndSubmitStep2() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        webElementsVendorContract.defermentStep2.setValue("102");
        webElementsVendorContract.groupStep2.setValue("Электрические товары");
        webElementsVendorContract.nameStep2.setValue("Светильник потолочный 109768");
        webElementsVendorContract.discountStep2.setValue("10,1");
        webElementsVendorContract.buttonSubmitStep2.click();
        webElementsVendorContract.step0IsFinished.should(exist);
        webElementsVendorContract.step3IsActive.should(exist);
    }
    @Test
    @Tag("")
    @DisplayName("Заполнение и сабмит шага 2, возврат назад")
    void SubmitStep2ComingBack() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.FillingStep2();
        lib.ui.VendorContractPageObgect.SubmitStep2();
        webElementsVendorContract.sibtitleTable1Step3.shouldHave(text("Порядок формирования каталога продукции поставщика"));
        webElementsVendorContract.buttonBackStep3.click();
        webElementsVendorContract.defermentStep2.shouldHave(attribute("value", "102"));
        webElementsVendorContract.groupStep2.shouldHave(attribute("value", "Электрические товары"));
        webElementsVendorContract.nameStep2.shouldHave(attribute("value", "Светильник потолочный 109768"));
        webElementsVendorContract.discountStep2.shouldHave(attribute("value", "10.1"));
        webElementsVendorContract.step2IsActive.should(exist);
        webElementsVendorContract.step3IsActive.shouldNot(exist);
    }
    @Test
    @Tag("")
    @DisplayName("Заполнение шага 2, возврат На Шаг 1 и назад")
    void FillingStep2GoToStep1ComingBack() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.FillingStep2();
        webElementsVendorContract.buttonBackStep2.click();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        webElementsVendorContract.defermentStep2.shouldHave(attribute("value", "102"));
        webElementsVendorContract.groupStep2.shouldHave(attribute("value", "Электрические товары"));
        webElementsVendorContract.nameStep2.shouldHave(attribute("value", "Светильник потолочный 109768"));
        webElementsVendorContract.discountStep2.shouldHave(attribute("value", "10.1"));
    }
    @Test
    @Tag("")
    @DisplayName("Добавление и удаление строк товаров на Шаге 2")
    void AddingLineForProductGroupStep2() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        webElementsVendorContract.buttonAddLineStep2.click();
        webElementsVendorContract.buttonAddLineStep2.click();
        webElementsVendorContract.groupLine2Step2.should(exist);
        webElementsVendorContract.nameLine2Step2.should(exist);
        webElementsVendorContract.discountLine2Step2.should(exist);
        $(By.xpath("//table//tbody/tr[4]")).should(exist);
        webElementsVendorContract.buttonDeleteLine2Step2.should(exist);
        $(By.xpath("//table//tbody/tr[4]//button[contains(.,'Удалить')]")).should(exist);
        webElementsVendorContract.buttonDeleteLine2Step2.click();
        $(By.xpath("//table//tbody/tr[4]")).shouldNot(exist);
        webElementsVendorContract.groupLine2Step2.should(exist);
        webElementsVendorContract.nameLine2Step2.should(exist);
        webElementsVendorContract.discountLine2Step2.should(exist);
        webElementsVendorContract.buttonDeleteLine2Step2.should(exist);
        webElementsVendorContract.buttonDeleteLine2Step2.click();
        webElementsVendorContract.buttonDeleteLine2Step2.shouldNot(exist);
        webElementsVendorContract.groupLine2Step2.shouldNot(exist);
        webElementsVendorContract.nameLine2Step2.shouldNot(exist);
        webElementsVendorContract.discountLine2Step2.shouldNot(exist);
    }
    @Test
    @Tag("")
    @DisplayName("Добавление строк товаров на Шаге 2 сабмит формы")
    void AddingLineForProductGroupStep2AndSubmit() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        webElementsVendorContract.buttonAddLineStep2.click();
        webElementsVendorContract.buttonAddLineStep2.click();
        webElementsVendorContract.buttonSubmitStep2.click();
        webElementsVendorContract.step2ProductGroupHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2NameOfProductHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2DiscountHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2DiscountHelpLine2.shouldHave(text("Может принимать значение от 0 до 100"));
        webElementsVendorContract.step2ProductGroupHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2NameOfProductHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2DiscountHelpLine3.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2DiscountHelpLine3.shouldHave(text("Может принимать значение от 0 до 100"));
    }
    @Test
    @Tag("")
    @DisplayName("Добавление строки товаров с заполнением на Шаге 2")
    void AddingLineForProductGroupWithFilling() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        webElementsVendorContract.buttonAddLineStep2.click();
        webElementsVendorContract.buttonSubmitStep2.click();
        webElementsVendorContract.step2ProductGroupHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2NameOfProductHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2DiscountHelpLine2.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2DiscountHelpLine2.shouldHave(text("Может принимать значение от 0 до 100"));
        webElementsVendorContract.groupLine2Step2.setValue("Товарная группа номер 2");
        webElementsVendorContract.nameLine2Step2.setValue("Наименование товара из товарной группы номер 2");
        webElementsVendorContract.discountLine2Step2.setValue("0.9");
        webElementsVendorContract.step2ProductGroupHelpLine2.shouldNotHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2NameOfProductHelpLine2.shouldNotHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorContract.step2DiscountHelpLine2.shouldNotHave(text("Пожалуйста, заполните обязательное поле"));
    }
    @Test
    @Tag("")
    @DisplayName("Добавление строки товаров с заполнением и сабмитом на Шаге 2")
    void AddingLineForProductGroupWithFillingAndSubmit() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.FillingStep2();
        webElementsVendorContract.buttonAddLineStep2.click();
        lib.ui.VendorContractPageObgect.FillingLine2OnStep2();
        lib.ui.VendorContractPageObgect.SubmitStep2();
        webElementsVendorContract.buttonBackStep3.click();
        webElementsVendorContract.groupLine2Step2.shouldHave(attribute("value", "Товарная группа номер 2"));
        webElementsVendorContract.nameLine2Step2.shouldHave(attribute("value", "Наименование товара из товарной группы номер 2"));
        webElementsVendorContract.discountLine2Step2.shouldHave(attribute("value", "0.9"));
    }
    @Test
    @Tag("")
    @DisplayName("Добавление строки товаров с заполнением на Шаге 2, возврат на Шаг 1 и назад")
    void AddingLineForProductGroupWithFillingComingToStep1() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        webElementsVendorContract.buttonAddLineStep2.click();
        lib.ui.VendorContractPageObgect.FillingStep2();
        lib.ui.VendorContractPageObgect.FillingLine2OnStep2();
        webElementsVendorContract.buttonBackStep2.click();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        webElementsVendorContract.defermentStep2.shouldHave(attribute("value", "102"));
        webElementsVendorContract.groupStep2.shouldHave(attribute("value", "Электрические товары"));
        webElementsVendorContract.nameStep2.shouldHave(attribute("value", "Светильник потолочный 109768"));
        webElementsVendorContract.discountStep2.shouldHave(attribute("value", "10.1"));
        webElementsVendorContract.groupLine2Step2.shouldHave(attribute("value", "Товарная группа номер 2"));
        webElementsVendorContract.nameLine2Step2.shouldHave(attribute("value", "Наименование товара из товарной группы номер 2"));
        webElementsVendorContract.discountLine2Step2.shouldHave(attribute("value", "0.9"));
        lib.ui.VendorContractPageObgect.SubmitStep2();
    }
    @Test
    @Tag("")
    @DisplayName("Заполнение Договора на Шаге 2, переход в Анкету")
    void FillingContractOnStep2ComingToVendorForm() {
        lib.ui.VendorContractPageObgect.OpenVendorContractPage();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.SubmitStep0ToStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        lib.ui.VendorContractPageObgect.FillingStep1();
        lib.ui.VendorContractPageObgect.SubmitStep1();
        lib.ui.VendorContractPageObgect.CheckVendorContractHeader();
        webElementsVendorContract.buttonAddLineStep2.click();
        lib.ui.VendorContractPageObgect.FillingStep2();
        lib.ui.VendorContractPageObgect.FillingLine2OnStep2();
        webelements.menuVendorForm.click();
        webelements.menuVendorContract.click();
        webElementsVendorContract.buttonSubmitStep0.click();
        webElementsVendorContract.radiobuttonStep0Help.shouldHave(text("Пожалуйста, заполните обязательное поле"));
    }
}
