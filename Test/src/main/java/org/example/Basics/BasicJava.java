package org.example.Basics;

import java.util.Scanner;

// Class definition
public class BasicJava {

    public void display ()
    {
        int age = 25;              // integer
        double salary = 55000.50;  // decimal
        char grade = 'A';          // single character
        boolean isActive = true;   // true/false
        String name = "Vijay";     // sequence of characters
        int a = 10, b = 5;

        // Max number
        System.out.println(Math.max(10, 5));

        // Min number
        System.out.println(Math.min(10, 5));

        System.out.println(grade);

        //How to take input in Java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String Name = sc.nextLine();
        System.out.println(Name);

        // Arithmetic
        System.out.println(a + b);  // 15
        System.out.println(a - b);  // 5
        System.out.println(a * b);  // 50
        System.out.println(a / b);  // 2

        // Relational
        System.out.println(a > b);  // true
        System.out.println(a == b); // false

        // Logical
        System.out.println(a > 5 && b < 10); // true

        // Control statement
        if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }

        // Switch statement

        switch (grade) {
            case 'A': System.out.println("Excellent");
            case 'B': System.out.println("Good");
            break;
            default: System.out.println("Needs Improvement");
        }

// For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

// While loop
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

// Do-while loop
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        int[] numbers = {10, 20, 30, 40, 60};

        for (int num : numbers) {
            System.out.println(num);
        }

    }

    // Main method - entry point
    public static void main(String[] args) {
        BasicJava a = new BasicJava();
        a.display();

        Scanner sc = new Scanner(System.in);
        int usernum = 0;
        int mynumb = (int) (Math.random()*100);

        do{
            System.out.println("Guess my number.(1-100)...");
            usernum = sc.nextInt();

            if (usernum == mynumb)
            {
                System.out.println("This is correct");
                break;
            }
            else if (usernum > mynumb) {
                System.out.println("You number is too large");
            }
            else
                System.out.println("Your number is too small");
        } while (usernum >=0);
        System.out.println("My number was...");
        System.out.println(mynumb);
    }
}
