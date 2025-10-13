package org.example.Interface;

public interface I2 {

    int b = 200; // Final and Static variable
    void m2 (); // abstract method

    static void a2() //static method, can be accessed directly into the class without using the object
    {
        System.out.println(b);
    }
}
