package appiumFrameworkTest;

import Utilities.BaseEcommerceTest_FrameW;
import Utilities.Utilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.CheckOutPage;
import pageObjects.FormPage;
import pageObjects.ProductPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Ecommerce_tc_4_FrameW extends BaseEcommerceTest_FrameW {

    @BeforeTest
    public void killAllProcess() throws IOException, InterruptedException {

       killAllProcessRunning();
    }

    @Test
    public void TotalValidationTest() throws IOException, InterruptedException {

        service = startServer();
        AndroidDriver<AndroidElement> driver = Capabilities("GeneralStoreApp");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        FormPage formPage = new FormPage(driver);// driver from capabilities is sent to forn as an argument

        //formPage.nameField.sendKeys("Hello");
        // this is if you declare the webelement as public from the formpage
        formPage.getNameField().sendKeys("Hello");
        driver.hideKeyboard();

        formPage.getFemaleOption().click();

        formPage.getCountrySelection().click();

        Utilities utilities = new Utilities(driver);
        utilities.scrollingToSubElement("Argentina");

        utilities.clickSubElement("Argentina");

        formPage.getLetsShopButton().click();

        ProductPage productPage = new ProductPage(driver);

        productPage.getItemList().get(0).click();

        productPage.getItemList().get(1).click();

        productPage.getaddToCartButton().click();

        Thread.sleep(4000);

        int count = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
        double sum = 0;

        CheckOutPage checkOutPage = new CheckOutPage(driver);

        for (int i = 0; i < count; i++) {
            String productprice = checkOutPage.getProductList().get(i).getText();
            double productamountValue = getAmount(productprice);
            sum = sum + productamountValue;
        }

        Thread.sleep(3000);

        String totalPurchaseItem = checkOutPage.totalAmount.getText();
        System.out.println(totalPurchaseItem);

        totalPurchaseItem = totalPurchaseItem.substring(1);
        double totalPurchaseItemValue = Double.parseDouble(totalPurchaseItem);
        System.out.println("Total Purchase Item is : " + totalPurchaseItemValue);

        Assert.assertEquals(sum, totalPurchaseItemValue);

        service.stop();
    }

    public static double getAmount(String productamount) {

        productamount = productamount.substring(1);
        return Double.parseDouble(productamount);
    }

}