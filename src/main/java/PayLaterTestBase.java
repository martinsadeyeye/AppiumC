import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class PayLaterTestBase {

    public static AndroidDriver<AndroidElement> capabilities(String device)
            throws MalformedURLException, InterruptedException {

        /*
         * File classpathRoot = new File(System.getProperty("user.dir")); File appDir =
         * new File(classpathRoot, "/Apps/Remita/"); File app = new File(appDir,
         * "com.systemspecs.remitamobile.apk");
         */
        AndroidDriver<AndroidElement> driver;

        // TODO Auto-generated method stub
        File appDir = new File("src");
        File app = new File(appDir, "paylater.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (device.equals("emulator")) {
            // emulator
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AdeyeyeEmulator");
        } else if (device.equals("real")) {
            // mobile device
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "GIONEE M6");//
            capabilities.setCapability(MobileCapabilityType.UDID, "MRRKOFOFGMCEBMUW");
        }
        // wait for a new command from the client before assuming the client quit and
        // ending the session
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
        capabilities.setCapability("platformName", "Android"); // Mobile OS platform to use
        capabilities.setCapability("platformVersion", "6.0"); // Mobile OS version
        //capabilities.setCapability("noReset", true); // Don't reset app state before this session, clear the app data
        //capabilities.setCapability("fullReset", false); // Don't Perform a complete reset i.e Do not uninstall the app
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.lenddo.mobile.paylater.staging");
        capabilities.setCapability("appActivity", "com.lenddo.mobile.paylater.home.activity.SplashScreenActivity");

        // if it needs to use locally started server
        // then the target_ip is 127.0.0.1 or 0.0.0.0
        // the default port is 4723
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElementByXPath("//android.widget.Button[@text='Carbon up!']").click();

        driver.findElementById("com.lenddo.mobile.paylater.staging:id/tutorial_skip").click();

        driver.findElementByXPath("//android.widget.Button[@text='Allow']").click();

        // driver.findElementByXPath("//android.widget.Button[@text='Okay']").click();

        Thread.sleep(1000);

        return driver;
    }

}
