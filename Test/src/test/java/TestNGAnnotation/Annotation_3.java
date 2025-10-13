package TestNGAnnotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_3
    {
    @BeforeTest
    void Login ()
    {
        System.out.println("Login into the app");
    }
    @AfterTest
    void Logout ()
    {
        System.out.println("Logout from the app");
    }
   @Test (priority = 1)
    void Search ()
    {
        System.out.println("Searching... ");
    }
    @Test  (priority = 2)
    void Adv_Search ()
    {
        System.out.println("Advance Search......");
    }
    }
