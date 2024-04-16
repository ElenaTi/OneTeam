import com.codeborne.selenide.Configuration;
import lib.webElements.webelements;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class UploudFilesTests {

    @BeforeAll
    @DisplayName("Авторизация")
    @Tag("TMOT-311")
    static void start() {
        //Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1280";
        lib.ui.LoginPageObject.Login("51951tes", "heph7146");
    }

    @Test
    @DisplayName("Загрузка новых товаров")
    @Tag("TMOT-312")
    void UploadNewGoods()
    {
        webelements.mainLogo.click();
        webelements.menuCatalog.click();
        webelements.menuDownloadNewGoods.click();
        webelements.title.shouldHave(text("Загрузить новые товары"));
        webelements.subTitle.shouldHave(text("Для добавления новых товаров загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        webelements.drawerTitle.shouldHave(text("Загрузка новых товаров"));
        webelements.uploadDrawer.shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        webelements.uploadDrawer.shouldHave(text("Загрузить файл в формате .csv"));
        webelements.uploadInput.uploadFromClasspath("New goods_with mistakes.csv");
        webelements.buttonSubmit.click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }

    @Test
    @DisplayName("Загрузка характеристик")
    @Tag("TMOT-313")
    void UploadCharacteristics()
    {
        webelements.mainLogo.click();
        webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.uploadSample.click();
        webelements.drawerTitle.shouldHave(text("Загрузка сопоставления характеристик товаров"));
        webelements.uploadDrawer.shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        webelements.uploadDrawer.shouldHave(text("Загрузить файл в формате .csv"));
        webelements.uploadInput.uploadFromClasspath("Characteristics_goods.csv");
        webelements.buttonSubmit.click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
    }

    @Test
    @DisplayName("Загрузка сертификатов")
    @Tag("TMOT-314")
    void UploadSerts()
    {
        webelements.mainLogo.click();
        webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.tagSerts.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.subTitle.shouldHave(text("Для управления сертификатами на товары загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        webelements.drawerTitle.shouldHave(text("Загрузка сопоставления сертификатов товаров"));
        webelements.uploadDrawer.shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        webelements.uploadDrawer.shouldHave(text("Загрузить файл в формате .csv"));
        webelements.uploadInput.uploadFromClasspath("Sertificates_of_goods.csv");
        webelements.buttonSubmit.click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
    }
    @Test
    @DisplayName("Загрузка изображений")
    @Tag("TMOT-315")
    void UploadImages()
    {
        webelements.mainLogo.click();
        webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.tagImages.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.subTitle.shouldHave(text("Для управления изображениями товаров загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        webelements.drawerTitle.shouldHave(text("Загрузка сопоставления изображений товаров"));
        webelements.uploadDrawer.shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        webelements.uploadDrawer.shouldHave(text("Загрузить файл в формате .csv"));
        webelements.uploadInput.uploadFromClasspath("Images_goods.csv");
        webelements.buttonSubmit.click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        $("div[role='alert']").shouldHave(text("Данные успешно загружены"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }
    @Test
    @DisplayName("Загрузка описаний товаров")
    @Tag("TMOT-316")
    void UploadDescriptions()
    {
        webelements.mainLogo.click();
        webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.tagDescription.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.subTitle.shouldHave(text("Для управления описаниями товаров загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        webelements.drawerTitle.shouldHave(text("Загрузка описаний товаров"));
        webelements.uploadDrawer.shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        webelements.uploadDrawer.shouldHave(text("Загрузить файл в формате .csv"));
        webelements.uploadInput.uploadFromClasspath("Descripton_goods.csv");
        webelements.buttonSubmit.click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }
    @Test
    @DisplayName("Загрузка технической информации")
    @Tag("TMOT-317")
    void UploadTechInformation()
    {
        webelements.mainLogo.click();
        webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.tagTechInfo.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.subTitle.shouldHave(text("Для управления технической информацией на товары загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        webelements.drawerTitle.shouldHave(text("Загрузка сопоставления технической информации товаров"));
        webelements.uploadDrawer.shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        webelements.uploadDrawer.shouldHave(text("Загрузить файл в формате .csv"));
        webelements.uploadInput.uploadFromClasspath("Tech_info_goods.csv");
        webelements.buttonSubmit.click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }
    @Test
    @DisplayName("Загрузка цен")
    @Tag("TMOT-318")
    void UploadPrices()
    {
        webelements.mainLogo.click();
        webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.tagPrices.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.subTitle.shouldHave(text("Для управления ценами на товары загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        webelements.drawerTitle.shouldHave(text("Загрузка цен товаров"));
        webelements.uploadDrawer.shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        webelements.uploadDrawer.shouldHave(text("Загрузить файл в формате .csv"));
        webelements.uploadInput.uploadFromClasspath("Prices_goods.csv");
        webelements.buttonSubmit.click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }
    @Test
    @DisplayName("Загрузка аналогов")
    @Tag("TMOT-319")
    void UploadAnalogs()
    {
        webelements.mainLogo.click();
        webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.tagAnalogs.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.subTitle.shouldHave(text("Для загрузки аналогов товаров загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        webelements.drawerTitle.shouldHave(text("Загрузка аналогов товаров"));
        webelements.uploadDrawer.shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        webelements.uploadDrawer.shouldHave(text("Загрузить файл в формате .csv"));
        webelements.uploadInput.uploadFromClasspath("Analog_goods.csv");
        webelements.buttonSubmit.click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }
    @Test
    @DisplayName("Загрузка конструктора товаров")
    @Tag("TMOT-320")
    void UploadKonstructor()
    {
        webelements.mainLogo.click();
        webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.tagKonstructor.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.subTitle.shouldHave(text("Для загрузки конструктора товаров загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        webelements.drawerTitle.shouldHave(text("Загрузка конструктора товаров"));
        webelements.uploadDrawer.shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        webelements.uploadDrawer.shouldHave(text("Загрузить файл в формате .csv"));
        webelements.uploadInput.uploadFromClasspath("Konstructor_goods.csv");
        webelements.buttonSubmit.click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }
    @Test
    @DisplayName("Загрузка однотипных товаров")
    @Tag("TMOT-321")
    void UploadSametypes()
    {
        webelements.mainLogo.click();
        webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.tagSametypes.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        webelements.subTitle.shouldHave(text("Для загрузки однотипных товаров загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        webelements.drawerTitle.shouldHave(text("Загрузка однотипных товаров"));
        webelements.uploadDrawer.shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        webelements.uploadDrawer.shouldHave(text("Загрузить файл в формате .csv"));
        webelements.uploadInput.uploadFromClasspath("Sametypes_goods.csv");
        webelements.buttonSubmit.click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }
    @Test
    @DisplayName("Загрузка статуса товара на складе")
    @Tag("TMOT-322")
    void UploadGoodsStatus()
    {
        webelements.mainLogo.click();
        webelements.menuLogistics.click();
        webelements.menuLogisticsData.click();
        webelements.title.shouldHave(text("Управление логистическими данными"));
        webelements.subTitle.shouldHave(text("Для управления логистическими данными загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        webelements.drawerTitle.shouldHave(text("Загрузка статусов товаров на складе"));
        webelements.uploadDrawer.shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        webelements.uploadDrawer.shouldHave(text("Загрузить файл в формате .csv"));
        webelements.uploadInput.uploadFromClasspath("Goods_status_logistics.csv");
        webelements.buttonSubmit.click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }
    @Test
    @DisplayName("Загрузка сроков изготовления и доставки")
    @Tag("TMOT-323")
    void UploadDeliveryTerms()
    {
        webelements.mainLogo.click();
        webelements.menuLogistics.click();
        webelements.menuLogisticsData.click();
        webelements.tagDeliveryTerms.click();
        webelements.title.shouldHave(text("Управление логистическими данными"));
        webelements.subTitle.shouldHave(text("Для управления сроками загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        webelements.drawerTitle.shouldHave(text("Загрузка сроков изготовления и доставки товаров"));
        webelements.uploadDrawer.shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        webelements.uploadDrawer.shouldHave(text("Загрузить файл в формате .csv"));
        webelements.uploadInput.uploadFromClasspath("Delivery_timelines_logistics.csv");
        webelements.buttonSubmit.click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }
    @Test
    @DisplayName("Загрузка складского ассортимента")
    @Tag("TMOT-324")
    void UploadStorageAssortment()
    {
        webelements.mainLogo.click();
        webelements.menuLogistics.click();
        webelements.menuLogisticsAssortment.click();
        webelements.title.shouldHave(text("Управление складским ассортиментом"));
        webelements.subTitle.shouldHave(text("Для создания заявки на ввод ассортимента на склады ЭТМ загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        webelements.uploadSample.click();
        webelements.drawerTitle.shouldHave(text("Загрузка заявки на ввод ассортимента"));
        webelements.uploadDrawer.shouldHave(text("Нажмите или перетащите файл в эту область, чтобы загрузить"));
        webelements.uploadDrawer.shouldHave(text("Загрузить файл в формате .csv"));
        webelements.uploadInput.uploadFromClasspath("Storage_assortment_logistics.csv");
        webelements.buttonSubmit.click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        webelements.alert.shouldHave(text("Данные успешно загружены"));
    }
}
