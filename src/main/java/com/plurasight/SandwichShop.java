package com.plurasight;
/**
 * Step 1 - Exercise 2
 * Prompt the user for the size of the sandwich (1 or 2):
 * a. 1: Regular: base price $5.45
 * b. 2: Large: base price $8.95
 * Prompt the user if they would like the sandwich "loaded" (yes/no). If so there is
 * an additional cost for a loaded sandwich
 * a. Regular: $1.00
 * b. Large: $1.75
 * Prompt the user for their age:
 * a. Student (17 years old or younger) — receive a 10% discount
 * b. Seniors (65 years old or older) — receive a 20% discount
 */

/**
 * Step 1 - Exercise 1
 * Prompt the user for the size of the sandwich (1 or 2):
 * a. 1: Regular: base price $5.45
 * b. 2: Large: base price $8.95
 * Prompt the user for their age:
 * a. Student (17 years old or younger) — receive a 10% discount
 * b. Seniors (65 years old or older) — receive a 20% discount
 * Display the cost of the sandwich to the screen
 */

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");
        System.out.print("Please select the size of sandwich: ");
        int size = scanner.nextInt();


        System.out.print("Would you like the sandwich loaded with additional price?: ");
        String option = scanner.nextLine();
        if (option.equals("yes")) {
            System.out.println("There would be addition of 1 dollar for the regular and 1.75 for the large.");
        } else{
            System.out.println("You are processing without the load option!");
        }

        System.out.print("How old are you?: ");
        int age  = scanner.nextInt();


        double price = 0;
        if (size == 1) {
            price = 5.45;
        } else if (size == 2) {
            price = 8.95;
        } else {
            System.out.println("Invalid sandwich size selected.");
        }

        if (age <= 17) {
            System.out.println("Teen discount applied (10%).");
            price *= 0.90;
        } else if (age >= 65) {
            System.out.println("Senior discount applied (20%).");
            price *= 0.80;
        }

        System.out.println("Your final price is: $" + price);
    }
}
