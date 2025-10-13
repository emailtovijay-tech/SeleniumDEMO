package org.example.Exceptionhandling;

public class ExceptionHandling {

    public static void main(String[] args) {
        {
            int[] numbers = {10, 20, 30, 40, 60};

            try
            {
                System.out.println(numbers[8]);

            } catch (Exception e)
            {

            }
            System.out.println ("This is executing...");

        }

    }
}
