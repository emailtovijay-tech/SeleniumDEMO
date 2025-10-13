package org.example.Interface;

public class MainClass {

    public static void main(String[] args)

    {
        C2 cobj = new C2();
        cobj.m1();   // Calling abstract method
        cobj.m2();  // Calling abstract method
        cobj.a1(); // Default method
        C2.sub(); // Calling Normal class static method
        I2.a2();  // Calling Static method using the interface
        cobj.add(); // Accessing method from the different class using inheritance
    }

}
