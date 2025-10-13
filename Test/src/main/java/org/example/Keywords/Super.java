package org.example.Keywords;

import net.bytebuddy.implementation.bind.annotation.Super;

class A1 {

    int x = 100;
    void m2 ()
    {
        System.out.println("This is parent class method");
    }

}

class A2 extends A1
{
    int x = 200;
    void m1 ()
    {
        System.out.println(super.x);   // Used super keyword to access the immidiate parent variable
    }

    void m2 ()
    {
        // System.out.println("This is child class method");
        super.m2();   // Used super keyword to access the immidiate parent method
    }


    public static void main(String[] args)
        {
     A2 xobj = new A2();
     xobj.m1();
     xobj.m2();

     }

     }
