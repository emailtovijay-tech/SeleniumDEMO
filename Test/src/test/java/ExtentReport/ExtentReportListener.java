package ExtentReport;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportListener implements ITestListener {
    ExtentSparkReporter spark;
    ExtentReports extent;
    ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onStart(ITestContext context) {
        spark = new ExtentSparkReporter("C:/Users/user/IdeaProjects/Reports/MyReport.html");
        spark.config().setDocumentTitle("Extent Report");
        spark.config().setReportName("New Report");
        spark.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Tester", "Vijay");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Computer Name", "localhost");
        extent.setSystemInfo("Browser Name", "Chrome");
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().pass("Test Passed: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.get().fail("Test Failed: " + result.getMethod().getMethodName());
        test.get().fail(result.getThrowable()); // logs the exception
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().skip("Test Skipped: " + result.getMethod().getMethodName());
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
