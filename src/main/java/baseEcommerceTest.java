import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class baseEcommerceTest {

    // com.lenddo.mobile.paylater.staging.
    // com.lenddo.mobile.paylater.home.activity.SplashScreenActivity'
    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {

        File appDir = new File("src");
        File app = new File(appDir, "General-Store.apk");

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "FemiEmulator");

        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");//new step
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);

        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),
                cap);
        return driver;


    }
}
