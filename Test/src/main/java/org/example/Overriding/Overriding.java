package org.example.Overriding;

class Bank
{
    double roi()
    {
       return 0;
    }
}

class Icici extends Bank
{
    double roi ()
    {
        return 8.5;
    }
}

class SBI extends Bank
{
    double roi ()
    {
        return 9.5;
    }
}

public class Overriding {

    public static void main(String[] args) {

        Icici ic = new Icici();
        System.out.println(ic.roi());
        SBI sb = new SBI();
        System.out.println(sb.roi());

    }

}
