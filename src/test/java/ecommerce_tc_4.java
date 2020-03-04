import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ecommerce_tc_4 extends baseEcommerceTest {

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

        driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(0).click();

        // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"$120.0\"));");

        driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(1).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

        Thread.sleep(4000);

        String productprice1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
        System.out.println(productprice1);
        productprice1 = productprice1.substring(1);
        double product1Value = Double.parseDouble(productprice1);
        System.out.println(product1Value);


        String productprice2 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
        System.out.println(productprice2);
        productprice2 = productprice2.substring(1);
        double product2Value = Double.parseDouble(productprice2);
        System.out.println(product2Value);

        double totalProductValue = product1Value + product2Value;
        System.out.println("Sum of Two Item Selected : " + totalProductValue);

        Thread.sleep(3000);
        String totalPurchaseItem = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
        System.out.println(totalPurchaseItem);
        totalPurchaseItem = totalPurchaseItem.substring(1);
        double totalPurchaseItemValue = Double.parseDouble(totalPurchaseItem);
        System.out.println("Total Purchase Item is : " + totalPurchaseItemValue);

        Assert.assertEquals(totalProductValue, totalPurchaseItemValue);
    }

}

