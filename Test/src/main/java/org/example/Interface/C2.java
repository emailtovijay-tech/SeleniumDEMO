package org.example.Interface;

public class C2 extends C1 implements I1, I2  // Hybrid inheritance (Hierarchy + multiple inheritance)

{
    public void m1()
    {
        System.out.println("this is abstract method from the I1 interface");
    }

    public void m2()
    {
        System.out.println("this is abstract method from the I2 interface");
    }

    static void sub()
    {
        System.out.println("This is normal static method");
    }

}
