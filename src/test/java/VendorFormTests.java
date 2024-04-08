import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import lib.webElements.webElementsVendorForm;
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
        webelements.mainLogo.click();
        webelements.menuVendorForm.click();
        webelements.title.shouldHave(text("Анкета поставщика"));
        webelements.subTitle.shouldHave(text("При рассмотрении вашей анкеты компания ЭТМ может запросить документы для подтверждения указанной информации"));
        webelements.alert.shouldHave(text("При рассмотрении вашей анкеты компания ЭТМ может запросить документы для подтверждения указанной информации"));
        webElementsVendorForm.buttonSendVendorForm.click();
        webElementsVendorForm.orgCategoryHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorForm.goodsCategoryHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorForm.brandsHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorForm.orgSiteHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorForm.orgCatalogLinkHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorForm.juroAddressHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorForm.wareHousesMainFieldHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorForm.signTheContractHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorForm.sumOfSuppliesHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
    }
    @Test
    @DisplayName("Отправка Анкеты только с обязательными полями выбор двух категорий товаров")
    @Tag("")
    void SuccessSendingWithRequiredFields(){
        webelements.mainLogo.click();
        //Configuration.holdBrowserOpen = true;
        webelements.menuVendorForm.click();
        webelements.title.shouldHave(text("Анкета поставщика"));
        webElementsVendorForm.orgCategorySelect.click();
        webElementsVendorForm.orgCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.orgCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.orgCategory.pressEnter();
        webElementsVendorForm.goodsCategorySelect.click();
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.pressEnter();
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.pressEnter();
        webElementsVendorForm.orgName.click();
        webElementsVendorForm.brands.setValue("Бренд 1, Бренд 2, Бренд 3");
        webElementsVendorForm.orgSite.setValue("idev.etm.ru");
        webElementsVendorForm.orgCatalogLink.setValue("тест.рф");
        webElementsVendorForm.juroAddress.setValue("Санкт-Петербург, ул. Советская");
        webElementsVendorForm.warehousesMainField.setValue("Санкт-Петербург, Всеволожск");
        webElementsVendorForm.signTheContractNO.click();
        webElementsVendorForm.sumOfSupplies.setValue("1234567");
        webElementsVendorForm.buttonSendVendorForm.click();
        webelements.alert.shouldHave(text("Данные успешно загружены"));
        webElementsVendorForm.successResultTitle.shouldHave(text("Анкета успешно отправлена на согласование."));
        webElementsVendorForm.successResultSubtitle.shouldHave(text("Мы сообщим вам статус согласования после обработки анкеты."));
    }

    @Test
    @DisplayName("Успешная отправка, выбор и отмена выбора третьей категории товаров без файлов")
    @Tag("")
    void SuccessSendingChangingNameOrganization(){
        webelements.mainLogo.click();
        webelements.menuVendorForm.click();
        webelements.title.shouldHave(text("Анкета поставщика"));
        webElementsVendorForm.orgCategorySelect.click();
        webElementsVendorForm.orgCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.orgCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.orgCategory.pressEnter();
        webElementsVendorForm.goodsCategorySelect.click();
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.pressEnter();
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.pressEnter();
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.pressEnter();
        webElementsVendorForm.goodsCategory.pressEnter();
        //webElementsVendorForm.orgName.click();
        //webElementsVendorForm.orgName.setValue("TEst");
        webElementsVendorForm.brands.setValue("Бренд 1, Бренд 2, Бренд 3");
        webElementsVendorForm.orgSite.setValue("тест.этм.рф");
        webElementsVendorForm.orgCatalogLink.setValue("idev.etm.ru/catalog");
        webElementsVendorForm.juroAddress.setValue("Санкт-Петербург, ул. Советская");
        webElementsVendorForm.factoAddress.setValue("Санкт-Петербург, Ржевка");
        webElementsVendorForm.warehousesMainField.setValue("Всеволожск, ул.Мира");
        webElementsVendorForm.signTheContractYES.click();
        webElementsVendorForm.sumOfSupplies.setValue("1234567");
        webElementsVendorForm.buttonSendVendorForm.click();
        webelements.alert.shouldHave(text("Данные успешно загружены"));
        webElementsVendorForm.successResultTitle.shouldHave(text("Анкета успешно отправлена на согласование."));
        webElementsVendorForm.successResultSubtitle.shouldHave(text("Мы сообщим вам статус согласования после обработки анкеты."));
    }
    @Test
    @DisplayName("Отправка анкеты без файлов")
    @Tag("")
    void SuccessSendVendorFormWithoutFiles(){
        webelements.mainLogo.click();
        webelements.menuVendorForm.click();
        webelements.title.shouldHave(text("Анкета поставщика"));
        webElementsVendorForm.orgCategorySelect.click();
        webElementsVendorForm.orgCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.orgCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.orgCategory.pressEnter();
        webElementsVendorForm.goodsExtraCategory.setValue("Товары");
        webElementsVendorForm.goodsCategorySelect.click();
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.pressEnter();
        webElementsVendorForm.orgName.click();
        webElementsVendorForm.brands.setValue("Бренд 1, Бренд 2, Бренд 3");
        webElementsVendorForm.orgSite.setValue("idev.etm.ru");
        webElementsVendorForm.orgCatalogLink.setValue("тест.рф");
        webElementsVendorForm.juroAddress.setValue("Санкт-Петербург, ул. Советская");
        webElementsVendorForm.factoAddress.setValue("Санкт-Петербург, Невский пр.");
        webElementsVendorForm.warehousesMainField.setValue("Санкт-Петербург, Романовка");
        webElementsVendorForm.signTheContractYES.click();
        webElementsVendorForm.sumOfSupplies.setValue("1234567");
        webElementsVendorForm.buttonSendVendorForm.click();
        webelements.alert.shouldHave(text("Данные успешно загружены"));
        webElementsVendorForm.successResultTitle.shouldHave(text("Анкета успешно отправлена на согласование."));
        webElementsVendorForm.successResultSubtitle.shouldHave(text("Мы сообщим вам статус согласования после обработки анкеты."));
    }

    @Test
    @DisplayName("Отправка анкеты с файлами")
    @Tag("")
    void SuccessSendVendorFormWithFiles(){
        webelements.mainLogo.click();
        webelements.menuVendorForm.click();
        webelements.title.shouldHave(text("Анкета поставщика"));
        webElementsVendorForm.orgCategorySelect.click();
        webElementsVendorForm.orgCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.orgCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.orgCategory.pressEnter();
        webElementsVendorForm.goodsExtraCategory.setValue("Товары");
        webElementsVendorForm.goodsCategorySelect.click();
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.pressEnter();
        webElementsVendorForm.orgName.click();
        webElementsVendorForm.brands.setValue("Бренд 1, Бренд 2, Бренд 3");
        webElementsVendorForm.orgSite.setValue("idev.etm.ru");
        webElementsVendorForm.orgCatalogLink.setValue("тест.рф");
        webElementsVendorForm.juroAddress.setValue("Санкт-Петербург, ул. Советская");
        webElementsVendorForm.factoAddress.setValue("Санкт-Петербург, Невский пр.");
        webElementsVendorForm.warehousesMainField.setValue("Санкт-Петербург, Романовка");
        webElementsVendorForm.signTheContractYES.click();
        webElementsVendorForm.sumOfSupplies.setValue("1234567");
        $("[class*='FileInput_main_text']").shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        $("[class*='FileInput_hint_text']").shouldHave(text(".pdf, .jpg, .png, .xlsx, .csv, .xls, .txt, .jpeg, .doc, .docx, .zip, .7z, .rar"));
        $("#files").uploadFromClasspath("RAR.rar");
        webElementsVendorForm.buttonSendVendorForm.click();
        webelements.alert.shouldHave(text("Данные успешно загружены"));
        webElementsVendorForm.successResultTitle.shouldHave(text("Анкета успешно отправлена на согласование."));
        webElementsVendorForm.successResultSubtitle.shouldHave(text("Мы сообщим вам статус согласования после обработки анкеты."));
    }

    @Test
    @DisplayName("Добавление нового поля для склада, не заполненного")
    @Tag("")
    void AddingWarehousesWithoutFilling(){
        webelements.mainLogo.click();
        webelements.menuVendorForm.click();
        webelements.title.shouldHave(text("Анкета поставщика"));
        webElementsVendorForm.orgCategorySelect.click();
        webElementsVendorForm.orgCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.orgCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.orgCategory.pressEnter();
        webElementsVendorForm.goodsExtraCategory.setValue("Товары");
        webElementsVendorForm.goodsCategorySelect.click();
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.pressEnter();
        webElementsVendorForm.orgName.click();
        webElementsVendorForm.brands.setValue("Бренд 1, Бренд 2, Бренд 3");
        webElementsVendorForm.orgSite.setValue("idev.etm.ru");
        webElementsVendorForm.orgCatalogLink.setValue("тест.рф");
        webElementsVendorForm.juroAddress.setValue("Санкт-Петербург, ул. Советская");
        webElementsVendorForm.factoAddress.setValue("Санкт-Петербург, Невский пр.");
        webElementsVendorForm.warehousesMainField.setValue("Санкт-Петербург, Романовка");
        webElementsVendorForm.addingWareHouses.click();
        webElementsVendorForm.signTheContractYES.click();
        webElementsVendorForm.sumOfSupplies.setValue("1234567");
        $("[class*='FileInput_main_text']").shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        $("[class*='FileInput_hint_text']").shouldHave(text(".pdf, .jpg, .png, .xlsx, .csv, .xls, .txt, .jpeg, .doc, .docx, .zip, .7z, .rar"));
        $("#files").uploadFromClasspath("RAR.rar");
        webElementsVendorForm.buttonSendVendorForm.click();
        $("#warehouses_1_help").shouldHave(text("Пожалуйста, заполните обязательное поле"));
    }

    @Test
    @DisplayName("Добавление и удаление нового поля для склада")
    @Tag("")
    void AddingAndDeletingWarehousesWithoutFilling(){
        Configuration.holdBrowserOpen = true;
        webelements.mainLogo.click();
        webelements.menuVendorForm.click();
        webelements.title.shouldHave(text("Анкета поставщика"));
        webElementsVendorForm.orgCategorySelect.click();
        webElementsVendorForm.orgCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.orgCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.orgCategory.pressEnter();
        webElementsVendorForm.goodsExtraCategory.setValue("Товары");
        webElementsVendorForm.goodsCategorySelect.click();
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.pressEnter();
        webElementsVendorForm.orgName.click();
        webElementsVendorForm.brands.setValue("Бренд 1, Бренд 2, Бренд 3");
        webElementsVendorForm.orgSite.setValue("idev.etm.ru");
        webElementsVendorForm.orgCatalogLink.setValue("тест.рф");
        webElementsVendorForm.juroAddress.setValue("Санкт-Петербург, ул. Советская");
        webElementsVendorForm.factoAddress.setValue("Санкт-Петербург, Невский пр.");
        webElementsVendorForm.warehousesMainField.setValue("Санкт-Петербург, Романовка");
        webElementsVendorForm.addingWareHouses.click();
        webElementsVendorForm.signTheContractYES.click();
        webElementsVendorForm.sumOfSupplies.setValue("1234567");
        $("[class*='FileInput_main_text']").shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        $("[class*='FileInput_hint_text']").shouldHave(text(".pdf, .jpg, .png, .xlsx, .csv, .xls, .txt, .jpeg, .doc, .docx, .zip, .7z, .rar"));
        $("#files").uploadFromClasspath("RAR.rar");
        //webElementsVendorForm.buttonSendVendorForm.click();
       // $("#warehouses_1_help").shouldHave(text("Пожалуйста, заполните обязательное поле"));
        $(By.xpath("//textarea[@id='warehouses_1']/../../../../../following-sibling::button")).click();
        webElementsVendorForm.buttonSendVendorForm.click();
        /*webelements.alert.shouldHave(text("Данные успешно загружены"));
        webElementsVendorForm.successResultTitle.shouldHave(text("Анкета успешно отправлена на согласование."));
        webElementsVendorForm.successResultSubtitle.shouldHave(text("Мы сообщим вам статус согласования после обработки анкеты."));*/
    }
}
