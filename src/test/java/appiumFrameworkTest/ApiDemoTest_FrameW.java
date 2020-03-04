package appiumFrameworkTest;

import Utilities.BaseEcommerceTest_FrameW;
import Utilities.TestData;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.Preferences;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ApiDemoTest_FrameW extends BaseEcommerceTest_FrameW {

    @Test(dataProvider = "InputData", dataProviderClass = TestData.class)
    public void apiDemosTest(String input) throws IOException, InterruptedException {

        service = startServer();
        AndroidDriver<AndroidElement> driver = Capabilities("ApiDemoApp");

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

        //using data provider, we modify the code to replace hello with input
        //driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
        driver.findElementByClassName("android.widget.EditText").sendKeys(input);

        //driver.findElementsByClassName("android.widget.Button").get(1).click();
        preferences.buttons.get(1).click();

        service.stop();
    }

}
