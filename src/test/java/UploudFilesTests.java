import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class UploudFilesTests {

    String loginURL = "https://idev.etm.ru/oneteam/login";
    @Test
    void UploadNewGoods()
    {
        Configuration.holdBrowserOpen =true;
        open(loginURL);
        lib.ui.LoginPageObject.Login("51951tes", "heph7146");
        lib.webElements.webelements.menuCollapse.click();

    }
}
