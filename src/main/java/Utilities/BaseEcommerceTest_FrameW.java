package Utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseEcommerceTest_FrameW {

    public static AppiumDriverLocalService service;
    protected static AndroidDriver<AndroidElement> driver;


    // in case u are unable to start appium server or ports are messed up
    // use taskkill /F /IM node.exe

    public AppiumDriverLocalService startServer() {
        // This method helps us to start server

        boolean flag = checkIfServerIsRunning(4723);
        if ( !flag ) {
            service = AppiumDriverLocalService.buildDefaultService();
            service.start();
        }

       /* if ( service == null || !service.isRunning() ) {
            throw new AppiumServerHasNotBeenStartedLocallyException(
                    "An appium server node is not started!");
        }
*/
        return service;

    }

    public static boolean checkIfServerIsRunning(int port) {

        boolean isServerRunning = false;
        ServerSocket serverSocket;

        try {
            serverSocket = new ServerSocket(port);
            serverSocket.close();
        } catch (IOException e) {
            // If the control comes here, then it means the port is in use
            isServerRunning = true;
        } finally {
            serverSocket = null;
        }
        return isServerRunning;
    }

    public static void startEmulator() throws IOException, InterruptedException {
        //C:\Users\MARTINS\Desktop\PaylaterApp\src\main\java\resources\startEmulator.bat
        Runtime.getRuntime().exec(System.getProperty("user.dir") + "/src/main/java/resources/startEmulator.bat");
        Thread.sleep(6000);
    }

    public static void killAllProcessRunning() throws IOException, InterruptedException {

        //taskkill /F /IM node.exe
        Runtime.getRuntime().exec("taskkill /F /IM node.exe");
        Thread.sleep(3000);
    }

    // com.lenddo.mobile.paylater.staging.
    // com.lenddo.mobile.paylater.home.activity.SplashScreenActivity'
    public static AndroidDriver<AndroidElement> Capabilities(String appName) throws IOException, InterruptedException {

        //  AndroidDriver<AndroidElement> driver;

        File classpathRoot = new File(System.getProperty("user.dir"));

        FileInputStream fileInputStream = new FileInputStream(classpathRoot + "/src/main/java/Utilities/global.properties/");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        properties.get(appName);

        File appDir = new File(classpathRoot, "/apk");
        File app = new File(appDir, (String) properties.get(appName));

        DesiredCapabilities cap = new DesiredCapabilities();

        //String device = (String) properties.get("device");
        //if(properties.get(deviceName))
        String device = System.getProperty("deviceName");

        if ( device.contains("Emulator") ) {
            startEmulator();
        }

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, device);

        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");//new step
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);

        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),
                cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;

    }

    // static  makes u access the class in other classes without creating the object of the class
    public static void getScreenShot(String fileName) throws IOException {

        // Cast get screen shot method to Take screen shot using driver class
        File screenshortfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshortfile, new File(System.getProperty("user.dir") + "/" + fileName + new SimpleDateFormat("yyyyMMddhhmm").format(new Date()) + ".png"));
    }
}