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

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import java.time.Duration;

public class VendorFormTests {
    @BeforeAll
    @DisplayName("Размер экрана 1920х1280")
    static void start() {
        Configuration.browserSize = "1920x1280";
        lib.ui.LoginPageObject.Login("9215642te", "rikb0444");
    }
    @Test
    @DisplayName("Сабмит анкеты с незаполненными полями")
    @Tag("TMOT-326")
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
    @Tag("TMOT-327")
    void SuccessSendingWithRequiredFields(){
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
        webElementsVendorForm.goodsCategory.pressEnter();
        webElementsVendorForm.orgName.click();
        webElementsVendorForm.brands.setValue("Бренд 1, Бренд 2, Бренд 3");
        webElementsVendorForm.orgSite.setValue("idev.etm.ru");
        webElementsVendorForm.orgCatalogLink.setValue("тест.рф");
        webElementsVendorForm.juroAddress.setValue("Санкт-Петербург, ул. Советская, ул. Ленинградская, д.123, корпус 123, квартира 123");
        webElementsVendorForm.warehousesMainField.setValue("Санкт-Петербург, Всеволожск, ул. Московская");
        webElementsVendorForm.signTheContractNO.click();
        webElementsVendorForm.sumOfSupplies.setValue("1234567");
        webElementsVendorForm.buttonSendVendorForm.click();
        webelements.alert.shouldHave(text("Данные успешно загружены"));
        webElementsVendorForm.successResultTitle.shouldHave(text("Анкета успешно отправлена на согласование."));
        webElementsVendorForm.successResultSubtitle.shouldHave(text("Мы сообщим вам статус согласования после обработки анкеты."));
    }

    @Test
    @DisplayName("Успешная отправка, выбор и отмена выбора третьей категории товаров без файлов")
    @Tag("TMOT-328")
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
        webElementsVendorForm.brands.setValue("Значение Бренда 123, Значение бренда 678987, Brand 98765, decraft и разные другие");
        webElementsVendorForm.orgSite.setValue("тест.этм.рф");
        webElementsVendorForm.orgCatalogLink.setValue("idev.etm.ru/catalog");
        webElementsVendorForm.juroAddress.setValue("Санкт-Петербург, ул. Советская, корпус 567, здание 67, офис 34567");
        webElementsVendorForm.factoAddress.setValue("Санкт-Петербург, Ржевка, ул. Всеволожская, строение fGHJHF, корпус РОР, офис 5678");
        webElementsVendorForm.warehousesMainField.setValue("Санкт-Петербург, Всеволожск, ул.Мира, строение 50000, корпус FHJG");
        webElementsVendorForm.signTheContractYES.click();
        webElementsVendorForm.sumOfSupplies.setValue("98765445678");
        webElementsVendorForm.buttonSendVendorForm.click();
        webelements.alert.shouldHave(text("Данные успешно загружены"));
        webElementsVendorForm.successResultTitle.shouldHave(text("Анкета успешно отправлена на согласование."));
        webElementsVendorForm.successResultSubtitle.shouldHave(text("Мы сообщим вам статус согласования после обработки анкеты."));
    }
    @Test
    @DisplayName("Отправка анкеты без файлов")
    @Tag("TMOT-329")
    void SuccessSendVendorFormWithoutFiles() {
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
        webElementsVendorForm.brands.setValue("Бренд 1234, Товары без бренда 9876, IEK");
        webElementsVendorForm.orgSite.setValue("idev.");
        webElementsVendorForm.orgSiteHelp.shouldHave(text("Введен некорректный url"));
        webElementsVendorForm.orgSite.setValue("etm.ru");
        webElementsVendorForm.orgSiteHelp.shouldNot(exist);
        webElementsVendorForm.orgCatalogLink.setValue("те");
        webElementsVendorForm.orgCatalogLinkHelp.shouldHave(text("Введен некорректный url"));
        webElementsVendorForm.orgCatalogLink.setValue("ст.рф");
        webElementsVendorForm.orgCatalogLinkHelp.shouldNot(exist);
        webElementsVendorForm.juroAddress.setValue("Санкт-Петербург, ул. Советская, корпус 568, строение 2345, офис GHY, кабинет 34567");
        webElementsVendorForm.factoAddress.setValue("Санкт-Петербург, Невский пр., дом 3567, корпус ПР, офс 568");
        webElementsVendorForm.warehousesMainField.setValue("Санкт-Петербург, Романовка, ул. Московская, строение 6789");
        webElementsVendorForm.signTheContractYES.click();
        webElementsVendorForm.sumOfSupplies.setValue("9876543");
        webElementsVendorForm.buttonSendVendorForm.click();
        webelements.alert.shouldHave(text("Данные успешно загружены"));
        webElementsVendorForm.successResultTitle.shouldHave(text("Анкета успешно отправлена на согласование."));
        webElementsVendorForm.successResultSubtitle.shouldHave(text("Мы сообщим вам статус согласования после обработки анкеты."));
    }

    @Test
    @DisplayName("Отправка анкеты с файлами")
    @Tag("TMOT-330")
    void SuccessSendVendorFormWithFiles() throws InterruptedException{
        Configuration.holdBrowserOpen = true;
        webelements.mainLogo.click();
        webelements.menuVendorForm.click();
        webelements.title.shouldHave(text("Анкета поставщика"));
        webElementsVendorForm.orgCategorySelect.click();
        webElementsVendorForm.orgCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.orgCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.orgCategory.pressEnter();
        webElementsVendorForm.goodsExtraCategory.setValue("Другие категории товаров, Самые разные товары");
        webElementsVendorForm.goodsCategorySelect.click();
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.pressEnter();
        webElementsVendorForm.orgName.click();
        webElementsVendorForm.brands.setValue("Бренд 1, Бренд 2, Бренд 3");
        webElementsVendorForm.orgSite.setValue("тест.рф");
        webElementsVendorForm.orgCatalogLink.setValue("idev.etm.ru");
        webElementsVendorForm.juroAddress.setValue("Санкт-Петербург, ул. Советская,  д.123, корпус 123, квартира 123");
        webElementsVendorForm.factoAddress.setValue("Санкт-Петербург, ул. Советская,  д.123, корпус 123, квартира 123");
        webElementsVendorForm.warehousesMainField.setValue("Санкт-Петербург, Романовка, ул. Московская");
        webElementsVendorForm.signTheContractYES.click();
        webElementsVendorForm.sumOfSupplies.setValue("1234567");
        $("[class*='FileInput_main_text']").shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        $("[class*='FileInput_hint_text']").shouldHave(text(".pdf, .jpg, .png, .xlsx, .csv, .xls, .txt, .jpeg, .doc, .docx, .zip, .7z, .rar"));
        webElementsVendorForm.fileUploadVendorForm.uploadFromClasspath("CDR.cdr");
        webElementsVendorForm.uploadFilesHelp.shouldHave(text("Вы пытаетесь загрузить файл с недопустимым расширением, удалите его и загрузите файлы с расширением .pdf, .jpg, .png, .xlsx, .csv, .xls, .txt, .jpeg, .doc, .docx, .zip, .7z, .rar"));
        Thread.sleep(1000);
        $(By.xpath("//span[@class='ant-upload-list-item-actions']/button/span/span")).click();
        webElementsVendorForm.uploadFilesHelp.shouldNot(exist);
        webElementsVendorForm.fileUploadVendorForm.uploadFromClasspath("RAR.rar");
        Thread.sleep(100);
        webElementsVendorForm.buttonSendVendorForm.click();
        webelements.alert.shouldHave(text("Данные успешно загружены"));
        webElementsVendorForm.successResultTitle.shouldHave(text("Анкета успешно отправлена на согласование."));
        webElementsVendorForm.successResultSubtitle.shouldHave(text("Мы сообщим вам статус согласования после обработки анкеты."));
    }

    @Test
    @DisplayName("Добавление и удаление двух складов, не заполненных")
    @Tag("TMOT-331")
    void AddingWarehousesWithoutFilling() throws InterruptedException{
        webelements.mainLogo.click();
        webelements.menuVendorForm.click();
        webelements.title.shouldHave(text("Анкета поставщика"));
        webElementsVendorForm.orgCategorySelect.click();
        webElementsVendorForm.orgCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.orgCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.orgCategory.pressEnter();
        webElementsVendorForm.goodsExtraCategory.setValue("Другие категории товаров, Самые разные товары");
        webElementsVendorForm.goodsCategorySelect.click();
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.sendKeys(Keys.ARROW_DOWN);
        webElementsVendorForm.goodsCategory.pressEnter();
        webElementsVendorForm.orgName.click();
        webElementsVendorForm.brands.setValue("Бренд 1, Бренд 2, Бренд 3");
        webElementsVendorForm.orgSite.setValue("idev.etm.ru");
        webElementsVendorForm.orgCatalogLink.setValue("тест.рф");
        webElementsVendorForm.juroAddress.setValue("Санкт-Петербург, ул. Советская, д.123, корпус 123, квартира 123");
        webElementsVendorForm.factoAddress.setValue("Санкт-Петербург, ул. Советская, д.123, корпус 123, квартира 123");
        webElementsVendorForm.warehousesMainField.setValue("Санкт-Петербург, Романовка, ул.Московская");
        webElementsVendorForm.signTheContractYES.click();
        webElementsVendorForm.addingWareHouses.click();
        webElementsVendorForm.addingWareHouses.click();
        webElementsVendorForm.buttonSendVendorForm.click();
        $("#warehouses_1_help").shouldHave(text("Пожалуйста, заполните обязательное поле"));
        $("#warehouses_2_help").shouldHave(text("Пожалуйста, заполните обязательное поле"));
        webElementsVendorForm.sumOfSuppliesHelp.shouldHave(text("Пожалуйста, заполните обязательное поле"));
        Thread.sleep(500);
        webElementsVendorForm.deletingWareHouses.click();
        webElementsVendorForm.deletingWareHouses.click();
        webElementsVendorForm.signTheContractYES.click();
        webElementsVendorForm.sumOfSupplies.setValue("1234567");
        $("[class*='FileInput_main_text']").shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        $("[class*='FileInput_hint_text']").shouldHave(text(".pdf, .jpg, .png, .xlsx, .csv, .xls, .txt, .jpeg, .doc, .docx, .zip, .7z, .rar"));
        webElementsVendorForm.fileUploadVendorForm.uploadFromClasspath("7Z.7z");
        webElementsVendorForm.buttonSendVendorForm.click();
        webelements.alert.shouldHave(text("Данные успешно загружены"));
        webElementsVendorForm.successResultTitle.shouldHave(text("Анкета успешно отправлена на согласование."));
        webElementsVendorForm.successResultSubtitle.shouldHave(text("Мы сообщим вам статус согласования после обработки анкеты."));
    }

    @Test
    @DisplayName("Отправка анкеты с двумя складами+ изменение имени организации")
    @Tag("TMOT-332")
    void AddingWarehousesWithFilling(){
        webelements.mainLogo.click();
        webelements.menuVendorForm.click();
        webelements.title.shouldHave(text("Анкета поставщика"));
        webElementsVendorForm.orgName.setValue(" + тест");
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
        webElementsVendorForm.juroAddress.setValue("Санкт-Петербург, ул. Советская, д.123, корпус 123, квартира 123");
        webElementsVendorForm.factoAddress.setValue("Санкт-Петербург, Невский пр., д.123, корпус 123, квартира 123");
        webElementsVendorForm.warehousesMainField.setValue("Санкт-Петербург, Романовка, ул. Московская");
        webElementsVendorForm.addingWareHouses.click();
        webElementsVendorForm.signTheContractYES.click();
        webElementsVendorForm.sumOfSupplies.setValue("1234567");
        $("[class*='FileInput_main_text']").shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        $("[class*='FileInput_hint_text']").shouldHave(text(".pdf, .jpg, .png, .xlsx, .csv, .xls, .txt, .jpeg, .doc, .docx, .zip, .7z, .rar"));
        webElementsVendorForm.fileUploadVendorForm.uploadFromClasspath("RAR.rar");
        $("#warehouses_1").setValue("Санкт-Петербург, Шушары, ул. Московская, склад №2");
        webElementsVendorForm.buttonSendVendorForm.click();
        webelements.alert.shouldHave(text("Данные успешно загружены"));
        webElementsVendorForm.successResultTitle.shouldHave(text("Анкета успешно отправлена на согласование."));
        webElementsVendorForm.successResultSubtitle.shouldHave(text("Мы сообщим вам статус согласования после обработки анкеты."));
    }

    @Test
    @DisplayName("Отправка анкеты с невалидным файлом-сбой загрузки")
    @Tag("TMOT-333")
    void SendVendorFormWithUnvalidFile() throws InterruptedException {
        //Configuration.holdBrowserOpen = true;
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
        webElementsVendorForm.juroAddress.setValue("Санкт-Петербург, ул. Советская, д.123, корпус 123, квартира 123");
        webElementsVendorForm.factoAddress.setValue("Санкт-Петербург, Невский пр., д.123, корпус 123, квартира 123");
        webElementsVendorForm.warehousesMainField.setValue("Санкт-Петербург, Романовка, ул. Московская");
        webElementsVendorForm.addingWareHouses.click();
        webElementsVendorForm.signTheContractNO.click();
        webElementsVendorForm.sumOfSupplies.setValue("1234567");
        $("[class*='FileInput_main_text']").shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        $("[class*='FileInput_hint_text']").shouldHave(text(".pdf, .jpg, .png, .xlsx, .csv, .xls, .txt, .jpeg, .doc, .docx, .zip, .7z, .rar"));
        webElementsVendorForm.fileUploadVendorForm.uploadFromClasspath("sample-50-MB.pdf");
        $("#warehouses_1").setValue("Санкт-Петербург, Шушары, ул. Московская, склад №2");
        webElementsVendorForm.buttonSendVendorForm.click();
       // Thread.sleep(70000);
        $("[role='dialog']").shouldBe(visible,Duration.ofMillis(180000));
        //$("[role='dialog']").shouldBe(visible);
        $("[role='dialog']").shouldHave(text("Результаты загрузки"));
        $(By.xpath("//button[@aria-label='Close']")).click();
        webelements.title.shouldHave(text("Анкета поставщика"));
        $(By.xpath("//button[@title='Удалить файл']")).click();
        webElementsVendorForm.fileUploadVendorForm.uploadFromClasspath("DOC.doc");
        webElementsVendorForm.buttonSendVendorForm.click();
        webelements.alert.shouldHave(text("Данные успешно загружены"));
        webElementsVendorForm.successResultTitle.shouldHave(text("Анкета успешно отправлена на согласование."));
        webElementsVendorForm.successResultSubtitle.shouldHave(text("Мы сообщим вам статус согласования после обработки анкеты."));
    }

}
