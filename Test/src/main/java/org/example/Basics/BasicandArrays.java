package org.example.Basics;

public class BasicandArrays {
    public static void main (String[] args) {
        int day = 3;
        String dayname = "";
        int a = 1;
        int b = 2;
        int c = 3;
        int n;
        int j;


        if (a > b) {
            System.out.println("a is less than b");
        } else if (b > c) {
            System.out.println("b is less than c");
        }
        {
            System.out.println("a is greater than c");
        }

        switch (day) {
            case 1:
                dayname = "Monday";
                break;
            case 2:
                dayname = "Tuesday";
                break;
            case 3:
                dayname = "Wednesday";
                break;
            case 4:
                dayname = "Invalid Day";
                break;

        }
        System.out.println(dayname);

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i = i + 1;
        }
        for (i=1; i<=100; i++)
        {
            System.out.println(i);
        }

        do
        {
            System.out.println(i);
            i++;
        }while (i<=102);


    }
        }





        
