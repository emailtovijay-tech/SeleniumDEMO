package org.example.Interface;

public interface I1 {

    int a = 100; // Final and Static variable
    void m1 (); // abstract method

    default void a1() // default method
    {
        System.out.println(a);
    }

}


