package org.example.Overloading;

public class Overloading {

    int a = 10;
    int b = 20;

    void add()   // Same method, No parameter
    {
        System.out.println(a+b);
    }

    void add(int x, int y)  // Same method, number of parameter
    {
        System.out.println(x+y);
    }

    void add(double c, int d)  // Same method with same number of parameter but data type is different
    {
        System.out.println(c+d);
    }

    void add (int g, double h) // Same method with same number of parameter with same data types but order is different
    {
        System.out.println(g+h);
    }

    public static void main(String[] args) {

        Overloading m = new Overloading();
        m.add();
        m.add(10, 20);
        m.add(10.5, 10);
        m.add(20, 30);
    }
}
