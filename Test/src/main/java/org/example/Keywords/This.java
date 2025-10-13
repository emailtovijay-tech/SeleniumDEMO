package org.example.Keywords;

 class B1
 {
    int a = 10;
    int b = 20;

     int x1 (int a)
     {
        return this.a; // Getting value of Class variable because used This keyword.

     }

     int x2 (int b)
     {
         return b;    // Getting value of local variable
     }

     public static void main(String[] args) {
         B1 aobj = new B1();
         System.out.println(aobj.x1(20));
         System.out.println(aobj.x2(30));

     }

}


