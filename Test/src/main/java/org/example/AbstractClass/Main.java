package org.example.AbstractClass;

public class Main extends AbstractClass
{
    void abc ()
    {
        System.out.println("This is Abstract method"); // Implementation of Abstract method
    }

    public static void main(String[] args)
    {
        Main mobj = new Main();
        System.out.println(mobj.x);
        System.out.println(mobj.y);
        System.out.println(AbstractClass.z);
        mobj.m1();
    }
}
