package resources;

import Utilities.BaseEcommerceTest_FrameW;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

//ITestListener interface which implements Testng listeners
public class Listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub

        System.out.println("I successfully executed Listeners Pass code");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        //screenshot code when test Failed

        //System.out.println("I failed executed Listeners Pass code" + result.getName());

        String s = result.getName();
        try {
            BaseEcommerceTest_FrameW.getScreenShot(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub

    }

}