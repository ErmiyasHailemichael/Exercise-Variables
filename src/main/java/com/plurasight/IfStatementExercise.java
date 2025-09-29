package com.plurasight;

import java.util.Scanner;

public class IfStatementExercise {
    public static void main(String[] args) {
        // Exercise 1: Is it positive?
        int number = 7;
        // TODO: print "Positive number" if number > 0, otherwise "Not positive"
        if (number > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is not positive");
        }

        // Exercise 2: Even or odd
        int x = 10;
        // TODO: print "Even" if x is divisible by 2, otherwise "Odd"
        if (x % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        // Exercise 3: Temperature check
        int temperature = 30; // celcius
        // TODO: print "Hot" if temperature > 25, otherwise "Not hot"
        if (temperature > 25) {
            System.out.println("The temperature is hot");
        } else{
            System.out.println("The temperature is not hot");
        }


        // Exercise 4: Teenager check
        int age = 15;
        // TODO: print "Teenager" if age is between 13 and 19, otherwise "Not a teenager"
        if (age >= 13 && age <= 18) {
            System.out.println("The age group is Teenager");
        } else {
            System.out.println("The age group is not Teenager");
        }

        // Exercise 5: Can vote?
        int age2 = 17;
        // TODO: print "Can vote" if age2 >= 18, otherwise "Too young to vote"
        if (age2 >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("Too young to vote! You can't decide your fate by this age!!!");
        }

        // Exercise 6: Multiple of both
//        int y = 39;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is divisible by 3 and 5?: ");
        int y = sc.nextInt();
        // TODO: print "Divisible by 3 and 5" if divisible by both, otherwise "Not divisible by 3 and 5"
        if (y % 3 == 0 && y % 5 == 0) {
            System.out.println("The number is divisible by 3 and 5");
        } else {
            System.out.println("The number is not divisible by 3 and 5");
        }

        // Exercise 7: Outside safe range
//        int speed = 120;
        // TODO: print "Unsafe speed" if speed < 30 or speed > 100, otherwise "Safe speed"
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Check if the speed is safe or unsafe: ");
        int speed = sc2.nextInt();
        if (speed < 30 || speed > 100) {
            System.out.println("The speed is unsafe");
        } else {
            System.out.println("The speed is safe ");
        }

        // Exercise 8: Leap year check (simplified)
        int year = 2025;
        // TODO: print "Leap year" if year divisible by 4 and not divisible by 100, otherwise "Not leap year"

        // Exercise 9: Bigger number
        int a = 8;
        int b = 12;
        // TODO: print which one is bigger (a or b)

        // Exercise 10: Grade check
        int score = 55;
        // TODO: print "Pass" if score >= 50, otherwise "Fail"
        System.out.println(); // sout to write this whole line
    }
}
