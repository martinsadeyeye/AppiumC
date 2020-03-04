import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class ChromeTest extends baseChrome {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();

        driver.get("https://facebook.com");


        driver.findElementByName("email").sendKeys("engradeyeyemartins@yahoo.com");
        driver.findElementByName("pass").sendKeys("engradeyeyemartins@yahoo.com");
        driver.findElementByName("login").click();


    }
}
