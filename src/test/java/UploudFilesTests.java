import com.codeborne.selenide.Configuration;
import lib.webElements.webelements;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
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
        lib.webElements.webelements.menuCollapse.click();
        webelements.menuCatalog.click();
        webelements.menuDownloadNewGoods.click();
        $(By.xpath("//h1")).shouldHave(text("Загрузить новые товары"));
        $(By.xpath("//h1/following::div")).shouldHave(text("Для добавления новых товаров загрузите заполненный файл в формате .csv, разделитель - точка с запятой"));
        $(By.xpath("//h1/following::div")).shouldHave(text("Скачать шаблон"));
        $("[aria-label = 'upload']").click();
        $("[class*='Drawer_title']").shouldHave(text("Загрузка новых товаров"));
        $("input[id=files]").uploadFromClasspath("1 — копия (1).csv");
        $("button[type='submit']").click();
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("В очереди"));
        $(By.xpath("//tbody/tr[2]")).shouldHave(text("51951tes"));
        $("div[role='alert']").shouldHave(text("Данные успешно загружены"));
    }
}
