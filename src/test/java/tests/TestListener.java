package tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart set status Started");
        result.setStatus((ITestResult.STARTED));
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess set status SUCCES ");
        result.setStatus(ITestResult.SUCCESS);
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure set status FAILURE ");
        result.setStatus(ITestResult.FAILURE);
        takeScreenshot(result);
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped set status Skipped ");
        result.setStatus(ITestResult.SKIP);
        takeScreenshot(result);
    }

    public byte[] takeScreenshot(ITestResult iTestResult) {
        ITestContext context = iTestResult.getTestContext();

            return new byte[]{};
    }

    public void onStart(ITestContext context){
        System.out.println("onStart"+context.getStartDate());
    }
    public void onFinish(ITestContext context){
        System.out.println("onFinish"+context.getEndDate());
    }
}
