package lib.ui;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lib.BaseSeleniumPage;
import lib.ui.MainPageObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AuthPageObject extends BaseSeleniumPage {
    MainPageObject MainPageObject = new MainPageObject();



    public void Authorization(String LOGIN, String PASSWORD) throws InterruptedException
    {
        Thread.sleep(500);
        MainPageObject.waitForElementClearAndSendKeys("//input[@id='login']", LOGIN,"not found and click city in header", 5);
        MainPageObject.waitForElementClearAndSendKeys("//input[@id='password']", PASSWORD,"not found and click city in header", 5);
        //driver.findElement(By.xpath("//button[@data-testid='go-to-system']")).click();
    }

        public void AddCoockie(String sessionId) throws InterruptedException {
        //driver.navigate().to(SITE_URL);
        Cookie cookie = new Cookie("session-id", sessionId);
        driver.manage().addCookie(cookie);
        Cookie driverCookie = driver.manage().getCookieNamed("session-id");

        assertThat(driverCookie.getValue(), equalTo(sessionId));
        }
    public static String getCurrentSession(String login, String pass) {
        String sessionId = null;
        try {
            String postUrl = "https://idev.etm.ru/api/ipro/user/login";
            HttpClient httpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(postUrl);

            List<NameValuePair> params = new ArrayList<>();
            params.add(new BasicNameValuePair("log", login));
            params.add(new BasicNameValuePair("pwd", pass));
            httpPost.setEntity(new UrlEncodedFormEntity(params));

            HttpResponse response = httpClient.execute(httpPost);
            HttpEntity entity = response.getEntity();
            BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent()));
            StringBuilder responseText = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                responseText.append(line);
            }

            JsonParser parser = new JsonParser();
            JsonObject jsonResponse = parser.parse(responseText.toString()).getAsJsonObject();

            sessionId = jsonResponse.getAsJsonObject("data").get("session").getAsString();
            httpClient.getConnectionManager().shutdown();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sessionId;
    }
}