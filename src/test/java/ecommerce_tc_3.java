import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ecommerce_tc_3 extends baseEcommerceTest {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> driver = Capabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("android:id/text1")).click();

        // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
        //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));

        AndroidElement list = driver.findElementByClassName("android.widget.ListView");
        list.getText();

        MobileElement Country = list
                .findElement(MobileBy
                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().text(\"Argentina\"));"));


        driver.findElementByClassName("android.widget.ListView").getText();
        //driver.findElement(By.xpath("//*[@text='Argentina']")).click();

        Country.click();

        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");

        driver.hideKeyboard();

        driver.findElement(By.xpath("//*[@text='Female']")).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        System.out.println(driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size());

        // driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Jordan 6 Rings\"));"));
//
//        AndroidElement productList = driver.findElement(By.id("com.androidsample.generalstore:id/rvProductList"));
//        MobileElement productGroup = productList
//                .findElement(MobileBy
//                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
//                                + "new UiSelector().text(\"Jordan 6 Rings\"));"));
//
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));

        int count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

        for (int i = 0; i < count; i++) {

            String text = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();

            if (text.equalsIgnoreCase("Jordan 6 Rings")) {

                driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();

                break;
            }
        }

        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

        String lastpageText = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();

        //driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();

        Assert.assertEquals("Jordan 6 Rings", lastpageText);

    }

}

