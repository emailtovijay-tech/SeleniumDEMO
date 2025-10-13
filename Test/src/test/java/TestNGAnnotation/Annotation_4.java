package TestNGAnnotation;

import org.testng.Assert;
import org.testng.annotations.*;

public class Annotation_4 {

    @BeforeSuite
    void m1 ()
    {
        System.out.println("This is Before Suite");
    }

    @AfterSuite
    void m2 ()
    {
        System.out.println("This is After Suite");

    }
    @BeforeTest
    void m3 ()
    {
        System.out.println("This is Before Test");

    }
    @AfterTest
    void m4 ()
    {
        System.out.println("This is After Test");
    }

    @BeforeClass
    void m5 ()
    {
        System.out.println("This is Before Class");
    }
    @AfterClass
    void m6 () {
        System.out.println("This is After Class");
    }

    @BeforeMethod
    void m7 ()
    {
        System.out.println("This is Before Method");
    }
    @AfterMethod
    void m8 () {
        System.out.println("This is After Method");
    }
    @Test (priority = 1)
    void m9 ()
    {
        System.out.println("This is Test 1");
        Assert.assertEquals(1,2);
    }
    @Test (dependsOnMethods = {"m9"})
    void m10 () {
        System.out.println("This is Test 2");
        Assert.assertNotEquals(1,2);
    }
}
