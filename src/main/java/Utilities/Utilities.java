package Utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;


public class Utilities {

    AndroidDriver<AndroidElement> driver;

    public Utilities(AndroidDriver<AndroidElement> driver) {

        this.driver = driver;
    }

    public void scrollingToSubElement(String text) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                + "new UiSelector().text(\"" + text + "\"));");
    }

    public void clickSubElement(String text) {
        driver.findElement(By.xpath("//*[@text= '" + text + "']")).click();
    }

/*
    // a method to get the data from xls file
    public static Object[][] getDataFromExcelSheet(String testName) {
        // return test data
        // read test data from xlsx
        if ( datatable == null ) {
            // Load the MS XLSX file sheet
            datatable = new Xls_Reader(System.getProperty("user.dir") + "//src//config//ePaymentConnector.xlsx");
            // datatable = new
            // Xls_Reader(System.getProperty("user.dir")+"//src//config//ePaymentConnectorGhana.xlsx");

        }

        int rows = datatable.getRowCount(testName) - 1;
        if ( rows <= 0 ) {
            // I am assuming there is test but without test data.
            // so the test should run at least once
            Object[][] testData = new Object[1][0];
            return testData;

        }
        rows = datatable.getRowCount(testName); // 3
        int cols = datatable.getColumnCount(testName);
        System.out.println("Test Name -- " + testName);
        System.out.println("Total rows -- " + rows);
        System.out.println("Total cols -- " + cols);
        Object data[][] = new Object[rows - 1][cols];

        // start iterating from number 2 bcos data start there
        for (int rowNum = 2; rowNum <= rows; rowNum++) {
            for (int colNum = 0; colNum < cols; colNum++) {
                data[rowNum - 2][colNum] = datatable.getCellData(testName, colNum, rowNum);
            }
        }

        return data;

    }*/
}
