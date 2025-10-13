package TestNGAnnotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Annotation_2 {

    @Test (priority = 1)
    void open ()
        {
            System.out.println("Opening the Browser");
        }
    @Test  (priority = 2)
    void login()
    {
        System.out.println("Login into the app");
    }
    @Test (priority = 3)
    void logout()
        {
            System.out.println("Logout from the app");
            Assert.assertEquals(1, 1);
        }

}
