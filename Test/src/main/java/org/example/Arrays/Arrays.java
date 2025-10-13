package org.example.Arrays;


public class Arrays {

    public static void main(String[] args) {
        int i;
        int j;

        //  int [] arr = new int [5];
        //  int [] arr;
        //  arr = new int [5];
        //  arr[0] = 10;
        //    arr[1] = 20;
        //   arr[2] = 30;
        //  arr[3] = 40;
        //  arr[4] = 50;
        int[] arr = {15, 204, 366, 407, 504, 607}; // declaration and initialization and memory allocation of an arrar

        System.out.println(arr.length); // array length

        for (i = 0; i < arr.length; i++) { // Displaying array using for loop
            System.out.println(arr[i]);
        }
        for (i = arr.length - 1; i >= 0; i--) {  // Displaying array using for loop and Printing in reverse order
            System.out.println(arr[i]);
        }

        for (int element : arr) {
            System.out.println(element);
        }

        int[][] flats = new int[3][4];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[0][3] = 104;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        flats[1][3] = 204;
        flats[2][0] = 301;
        flats[2][1] = 302;
        flats[2][2] = 303;
        flats[2][3] = 304;

        for (i = 0; i < flats.length; i++) {
            for (j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");

            }
            System.out.println("\n");
        }
    }
}
