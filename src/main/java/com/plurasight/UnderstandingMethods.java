package com.plurasight;

/**
 * From page 100 on workbook 1d - Intro to Java
 */
public class UnderstandingMethods {
    public static void main(String[] args) {
        foo();
        moo();
        makePancake(3);
        makeMangoSmoothie("Mango", 3);
        addAndDisplay(10, 3);

        int a = 4, b =9, c=10, d=3;

       addAndDisplayNums(a,b);
       addAndDisplayNums(b,c);
       addAndDisplayNums(a,d);
    }
    public static void foo() {
        System.out.println("Foo");
    }
    public static void moo() {
        System.out.println("Moo");
    }
    /**
     * Passing Data to Methods
     * Arguments -
     * Parameters -
     **/
    public static void makePancake(int eggs) {
        System.out.println("I used " + eggs + " eggs to make pancakes!");
    }

    public static void makeMangoSmoothie(String fruits, int cup) {
        System.out.println("I made " + cup + " cups of " + fruits + " juice!");
    }
    // calculator using passing method
    public static void addAndDisplay(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }

    public static void addAndDisplayNums(int num1, int num2) {
        int sum = num1 + num2;
        System.out.printf("%d + %d = %d\n", num1, num2, sum);
    }

    /**
     * Returning Data from Methods - page 104
     *
     */
}


