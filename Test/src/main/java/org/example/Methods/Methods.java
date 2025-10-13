package org.example.Methods;

public class Methods {

    void m1()  // No Param and No Retrun type
    {
        System.out.println("Hi Vijay...");
    }

    String m2() // No Param but Retrun type
    {
        return ("Hi Vijay, How are you");
    }

    void m3(String name, int age) // Param with No return type
    {
        System.out.println("Your name is " + name);
        System.out.println("Your Age is " + age);
    }

    String m4(String name) // Param with No return type
    {
        return ("Your friend name is " + name);
    }

    public static void main(String[] args) throws InterruptedException
    {

        Methods m = new Methods();
        m.m1(); // 1st method call
        String s = m.m2();   // 2nd method call
        System.out.println(s);
        m.m3("Vijay", 30); // 3rd method call
        String s1 = m.m4("John");  // 4th method call
        System.out.println(s1);
    }
}