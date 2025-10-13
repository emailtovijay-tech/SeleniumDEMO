package org.example.Keywords;

 final class Final {
    final int x = 100;
    final void m1()
    {
        System.out.println("This is Final keyword");
    }
}
/*
 class Final2 extends Final // We can not extend Final class
{
    // void m1() // We can not override final method
    {
        System.out.println("This is overide method");
    }

    public static void main(String[] args) {

        Final f = new Final();
        f.x = 200;   // We can not change value of final variable
        System.out.println(f.x);
        f.m1();



    }
}

            */