import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class PaylaterSignInTest extends PayLaterTestBase {


    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        // TODO Auto-generated method stub

        AndroidDriver<AndroidElement> driver = capabilities("real");

        driver.findElementByXPath("//android.widget.Button[@text='Carbon up!']").click();
        // driver.findElementByAndroidUIAutomator("text(\"Carbon up!\")").click();

        driver.findElementById("com.lenddo.mobile.paylater.staging:id/tutorial_skip").click();

        driver.findElementByXPath("//android.widget.Button[@text='Allow']").click();

        driver.findElementByXPath("//android.widget.Button[@text='Okay']").click();

        // Click on Sign in Button
        driver.findElementByXPath("//android.widget.Button[@text='Sign In']").click();

        // Enter your phone number
        driver.findElementByXPath("//android.widget.EditText[@text='Phone number']").sendKeys("08990001101");

        // Enter your PIN
        driver.findElementByXPath("//android.widget.EditText[@text='Enter PIN']").sendKeys("1234");

        // Click Sign in to login
        driver.findElementByXPath("//android.widget.Button[@text='Sign in']").click();

        // Check if the Resend SMS button is on the screen
        System.out.println(driver.findElementByXPath("//android.widget.TextView[@text='Resend SMS']").getText());

        driver.findElementByXPath("//android.widget.ScrollView[@index='2']").click();

        // Enter verification code
        driver.getKeyboard().sendKeys("123456");

//		driver.findElementByXPath("//android.widget.TextView[@index='2']").sendKeys("1");
//		driver.findElementByXPath("//android.widget.TextView[@index='3']").sendKeys("2");
//		driver.findElementByXPath("//android.widget.TextView[@index='4']").sendKeys("3");
//		driver.findElementByXPath("//android.widget.TextView[@index='5']").sendKeys("4");
//		driver.findElementByXPath("//android.widget.TextView[@index='6']").sendKeys("5");
//		driver.findElementByXPath("//android.widget.TextView[@index='7']").sendKeys("6");

        // Click Not right now
        driver.findElementByXPath("//android.widget.TextView[@text='Not right now']").click();

        // verify if Apply for a loan text/button is displayed
        System.out.println(driver.findElementByXPath("//android.widget.Button[@text='Apply for a loan']").getText());

        // System.out.println(driver.findElementsByAndroidUIAutomator("new
        // UISelector().clickable(true)").size());

        /*
         * AndroidElement Apply4loanButton =driver.
         * findElementByXPath("//android.widget.Button[@text='Apply for a loan']");
         * Apply4loanButton.isEnabled(); String ButtonText = "Apply for a loan"; //
         * assertEquals(ButtonText, Apply4loanButton.getText());
         */

    }
}
