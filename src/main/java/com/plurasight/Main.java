package com.plurasight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Exercise - Variables - Declare each variable with the correct data types:
        //Q1 -a vehicle identification number in the range 1000000 - 9999999 - int
        int  vin = 1234567;
        //Q2 - a vehicle make /model (i.e. Ford Explorer) - String
        String carModel = "Honda Civic";
        //Q3 - Vehicle Color - String
        String carColor = "Gray";
        //Q4- whether the vehicle has a towing package - Boolean value
        boolean hasTowingPackage = true;
        //Q5- an odometer reading
        int odometer = 0;
        //Q6- a price
        double price = 19.99;
        //Q7- a quality rating (A, B, or C)
        char qualityRating = 'A';
        //Q8- a phone number
        String phoneNumber = "2068529654";
        //Q9- a social security number
        String SSN = "741-852-963";
        //Q10- a zip code
        String zipCode = "98122";

        System.out.println(vin);
        System.out.println(carModel);
        System.out.println(carColor);
        System.out.println(hasTowingPackage);
        System.out.println(odometer);
        System.out.println(price);
        System.out.println(qualityRating);
        System.out.println(phoneNumber);
        System.out.println(SSN);
        System.out.println(zipCode);



// https://github.com/BrightBoost/learningjava/blob/main/exercises/operatorExercise.md
        // Challenge A: Double Trouble
        //Create a double with any value you like.
        //Multiply it by 2.
        //Print both the original and the doubled value.
        double grade = 3.14;


    }

    /**
    EXERCISE 3
    Create a Java application named com.plurasight.Main.BasicCalculator that reads in two floating point
    numbers and then asks the user whether they want to add, subtract, multiply or
    divide the two numbers.

    For this exercise, only code the questions. We won’t calculate add, subtract,
    multiply or divide. For this exercise, always multiply.

    **/
    public static class BasicCalculator {
        public static void main(String[] args) {
            System.out.println("WELCOME! THIS IS A BASIC CALCULATOR");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Enter second number: ");
            int secondNumber = scanner.nextInt();
            System.out.println("Possible calculations: " + " (A)dd\n" + " (S)ubtract\n" + " (M)ultiply\n" + " (D)ivide");
            scanner.nextLine();
            System.out.print("Please select an option: ");
            String option = scanner.nextLine();
            int result = firstNumber * secondNumber;
            System.out.println("The result is: " + result);
            //
        }
    }

    /**
     * Create a Java application named com.plurasight.Main.PayrollCalculator that prompts the user to enter:
     * - their name
     * - their hours worked (a floating point number)
     * - their pay rate (a floating point number) Calculate their gross pay.
     * Display the employee's name and their gross pay.
     *
     */

    public static class PayrollCalculator {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter your name: ");
            String name = scan.nextLine();
            System.out.print("Please enter how many hours your worked: ");
            int hours = scan.nextInt();
            System.out.print("Please enter your pay rate: ");
            float payRate = scan.nextFloat();
            System.out.print("Hi " + name + " After working " + hours + " hours and with the pay rate of " + payRate + "you gross pay is ." + hours*payRate);

        }
    }
}