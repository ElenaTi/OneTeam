import lib.CoreTestCase;
import lib.ui.AuthPageObject;
import lib.ui.MainPageObject;
import org.junit.jupiter.api.Test;

public class Auth extends CoreTestCase {
    String SITE_URL = "https://idev.etm.ru/oneteam/login";
    AuthPageObject AuthPageObject = new AuthPageObject();
    MainPageObject MainPageObject = new MainPageObject();

    String LOGIN_VENDOR = "51951tes";
    String PASSWORD_VENDOR = "gvuq3266";

    @Test
    public void Authorization() throws InterruptedException {
        driver.get(SITE_URL);
        AuthPageObject.Authorization(LOGIN_VENDOR, PASSWORD_VENDOR);
        //MainPageObject.waitForElementAndClick("//button[@id='login']", "not found and click city in header", 5);
    }
}