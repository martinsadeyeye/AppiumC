import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class dragAndDropDemo extends baseTest {

        public static void main(String[] args) throws MalformedURLException {

            AndroidDriver<AndroidElement> driver = Capabilities();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
            driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();

            TouchAction t = new TouchAction(driver);
            //t/longpress(source)/move(destination)/release(duration).perform
            WebElement source = driver.findElementsByClassName("android.view.View").get(0);
            WebElement destination = driver.findElementsByClassName("android.view.View").get(1);

            t.longPress(element(source)).moveTo(element(destination)).release().perform();
        }
}
