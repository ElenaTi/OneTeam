import com.codeborne.selenide.Configuration;
import lib.webElements.webelements;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class UploudFilesTests {

    @BeforeAll
    @DisplayName("Авторизация")
    static void start() {
        Configuration.browserSize = "1920x1280";
        lib.ui.LoginPageObject.Login("51951tes", "heph7146");
        webelements.menuCatalog.click();
    }

    @Test
    @DisplayName("Загрузка новых товаров")
    void UploadNewGoods()
    {
        webelements.menuCatalog.click();
        webelements.menuDownloadNewGoods.click();
        webelements.title.shouldHave(text("Загрузить новые товары"));
        webelements.subTitle.shouldHave(text("Для добавления новых товаров загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        $("[class*='Drawer_title']").shouldHave(text("Загрузка новых товаров"));
        $("input[id=files]").uploadFromClasspath("New goods_with mistakes.csv");
        $("button[type='submit']").click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }

    @Test
    @DisplayName("Загрузка характеристик")
    void UploadCharacteristics()
    {
        //lib.ui.LoginPageObject.Login("51951tes", "heph7146");
        //webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.uploadSample.click();
        $("[class*='Drawer_title']").shouldHave(text("Загрузка сопоставления характеристик товаров"));
        $("input[id=files]").uploadFromClasspath("characteristics.csv");
        $("button[type='submit']").click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
    }

    @Test
    @DisplayName("Загрузка сертификатов")
    void UploadSerts()
    {
        Configuration.browserSize = "1920x1280";
        webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.tagSerts.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.subTitle.shouldHave(text("Для управления сертификатами на товары загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        $("[class*='Drawer_title']").shouldHave(text("Загрузка сопоставления сертификатов товаров"));
         $("input[id=files]").uploadFromClasspath("Sertificates_of_goods.csv");
        $("button[type='submit']").click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
    }
    @Test
    @DisplayName("Загрузка изображений")
    void UploadImages()
    {
        webelements.menuProductInformation.click();
        webelements.tagImages.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.subTitle.shouldHave(text("Для управления изображениями товаров загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        $("[class*='Drawer_title']").shouldHave(text("Загрузка сопоставления изображений товаров"));
        $("input[id=files]").uploadFromClasspath("Images_goods.csv");
        $("button[type='submit']").click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        $("div[role='alert']").shouldHave(text("Данные успешно загружены"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }
    @Test
    @DisplayName("Загрузка описаний товаров")
    void UploadDescriptions()
    {
        webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.tagDescription.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.subTitle.shouldHave(text("Для управления описаниями товаров загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        $("[class*='Drawer_title']").shouldHave(text("Загрузка описаний товаров"));
        $("input[id=files]").uploadFromClasspath("Descripton_goods.csv");
        $("button[type='submit']").click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }
    @Test
    @DisplayName("Загрузка технической информации")
    void UploadTechInformation()
    {
        webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.tagTechInfo.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.subTitle.shouldHave(text("Для управления технической информацией на товары загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        $("[class*='Drawer_title']").shouldHave(text("Загрузка сопоставления технической информации товаров"));
        $("input[id=files]").uploadFromClasspath("Tech_info_goods.csv");
        $("button[type='submit']").click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }
    @Test
    @DisplayName("Загрузка цен")
    void UploadPrices()
    {
        webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.tagPrices.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.subTitle.shouldHave(text("Для управления ценами на товары загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        $("[class*='Drawer_title']").shouldHave(text("Загрузка цен товаров"));
        $("input[id=files]").uploadFromClasspath("Prices_goods.csv");
        $("button[type='submit']").click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }
    @Test
    @DisplayName("Загрузка аналогов")
    void UploadAnalogs()
    {
        webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.tagAnalogs.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.subTitle.shouldHave(text("Для загрузки аналогов товаров загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        $("[class*='Drawer_title']").shouldHave(text("Загрузка аналогов товаров"));
        $("input[id=files]").uploadFromClasspath("Analog_goods.csv");
        $("button[type='submit']").click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }
    @Test
    @DisplayName("Загрузка конструктора товаров")
    void UploadKonstructor()
    {
        webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.tagKonstructor.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.subTitle.shouldHave(text("Для загрузки конструктора товаров загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        $("[class*='Drawer_title']").shouldHave(text("Загрузка конструктора товаров"));
        $("input[id=files]").uploadFromClasspath("Konstructor_goods.csv");
        $("button[type='submit']").click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }
    @Test
    @DisplayName("Загрузка однотипных товаров")
    void UploadSametypes()
    {
        webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.tagSametypes.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.subTitle.shouldHave(text("Для загрузки однотипных товаров загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        $("[class*='Drawer_title']").shouldHave(text("Загрузка однотипных товаров"));
        $("input[id=files]").uploadFromClasspath("Sametypes_goods.csv");
        $("button[type='submit']").click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }
}
