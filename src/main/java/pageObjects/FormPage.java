package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    public FormPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    //public WebElement nameField;
    private WebElement nameField; // making this private forces you to use the method specifies inthe class i.e getNameField


    @AndroidFindBy(xpath = "//*[@text='Female']")
    //public WebElement femaleOption;
    private WebElement femaleOption;

    @AndroidFindBy(id = "android:id/text1")
    // public WebElement countrySelection;
    private WebElement countrySelection;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    private WebElement letsShopButton;

    //allows logging after execution
    // calling each pageobject as method is better for logging
    public WebElement getNameField() {
        System.out.println("entering name field");
        return nameField;
    }

    public WebElement getCountrySelection() {
        System.out.println("Selecting a country from dropdown list");
        return countrySelection;
    }

    public WebElement getFemaleOption() {
        System.out.println("Selecting gender option");
        return femaleOption;
    }

    public WebElement getLetsShopButton() {
        System.out.println("Clicking on the LetsShop button");
        return letsShopButton;
    }
}
