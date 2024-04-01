import com.codeborne.selenide.Configuration;
import lib.webElements.webelements;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class UploudFilesTests {

    String loginURL = "https://idev.etm.ru/oneteam/login";
    @Test
    @DisplayName("Загрузка новых товаров")
    void UploadNewGoods()
    {
        Configuration.browserSize = "1920x1280";
        //Configuration.holdBrowserOpen =true;
        lib.ui.LoginPageObject.Login("51951tes", "heph7146");
        //lib.webElements.webelements.menuCollapse.click();
        webelements.menuCatalog.click();
        webelements.menuDownloadNewGoods.click();
        webelements.title.shouldHave(text("Загрузить новые товары"));
        webelements.subTitle.shouldHave(text("Для добавления новых товаров загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        webelements.subTitle.shouldHave(text("Скачать шаблон"));
        $("[aria-label = 'upload']").click();
        $("[class*='Drawer_title']").shouldHave(text("Загрузка новых товаров"));
        $("input[id=files]").uploadFromClasspath("Новые товары.csv");
        $("button[type='submit']").click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        $("div[role='alert']").shouldHave(text("Данные успешно загружены"));
    }

    @Test
    @DisplayName("Загрузка характеристик]")
    void UploadCharacteristics()
    {
        Configuration.browserSize = "1920x1280";
        Configuration.holdBrowserOpen =true;
        lib.ui.LoginPageObject.Login("51951tes", "heph7146");
        //$(By.xpath("/div/a[contains(.,'Каталог')]")).click();
        webelements.menuCatalog.click();
        webelements.menuProductInformation.click();
        webelements.title.shouldHave(text("Управление данными о товарах"));
        //webelements.subTitle.shouldHave(text("Для добавления новых товаров загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        //webelements.subTitle.shouldHave(text("Скачать шаблон"));
        $("[aria-label = 'upload']").click();
        $("[class*='Drawer_title']").shouldHave(text("Загрузка сопоставления характеристик товаров"));
        $("input[id=files]").uploadFromClasspath("characteristics.csv");
        $("button[type='submit']").click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
    }
}
