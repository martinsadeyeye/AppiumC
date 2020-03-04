package pageObjects;

import io.appium.java_client.pagefactory.AndroidBy;
import org.openqa.selenium.WebElement;

public class Dependencies {

    @AndroidBy(xpath = "//android.widget.TextView[@text='Preference']")
    public WebElement dependencies;
}
