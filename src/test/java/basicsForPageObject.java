import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomePage;
import pageObjects.Preferences;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class basicsForPageObject extends baseTest {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = Capabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // when you create object of a classm its constructor of the class will be invoked
        HomePage homePage = new HomePage(driver);
        // Constructor can be defined with arguments
        // you can call the methods or variable of the class with class object

        Preferences preferences = new Preferences(driver);

        //driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        homePage.preferences.click();

        //driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        preferences.dependencies.click();


        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("hello");

        //driver.findElementsByClassName("android.widget.Button").get(1).click();
        preferences.buttons.get(1).click();

    }

}
