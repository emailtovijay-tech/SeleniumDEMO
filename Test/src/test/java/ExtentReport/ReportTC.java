package ExtentReport;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ReportTC {

    @Test (priority = 1)
    void testPass() {
        Assert.assertTrue(true);
    }

    @Test (priority = 2)
    public void testFail() {
        Assert.assertTrue(false, "Forcing Failure");
    }

    @Test (priority = 3)
    public void testSkip() {
        throw new SkipException("Skipping this test");
    }
}
