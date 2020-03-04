import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class UiautomatorTest extends baseTest {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //driver.findElementByAndroidUIAutomator("attribute("value")");

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        // validate clickable feature for all options

        //driver.findElementByAndroidUIAutomator("new Uiselector().property(value)");

        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());

    }
}
