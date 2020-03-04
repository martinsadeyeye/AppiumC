package Utilities;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "InputData")
    public Object[][] getDataforEditField() {
        Object[][] obj = new Object[][]
                {
                        {"Hello"}, {"#$%^&*&&"}
                };

        return obj;
    }
}
