package com.plurasight;

import java.util.Scanner;

public class ReadingMixedInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hi" + name + "! What's your age?");
        int age = scanner.nextInt();
        System.out.print("That's crazy, I once was " + age + "too! what is your favorite color?");
        String favColor = scanner.nextLine();
        System.out.println("!");
        // why is the

        /*

        Create a new class called InputExercise
        You are going to ask the user for the following details and store it in 3 variables:
        Favorite animal

        First tool that comes to mind
        Number of day of birthday
        You are going to print this in a silly sentence like:
        You're favorite animal is elephant, first tool that comes to mind is a saw and the 24 is the day you were born.

        * public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite animal: ");
        String animal = scanner.nextLine();
        System.out.println("What is your first tool that comes in mind ");
        String tool = scanner.nextLine();
        System.out.println("What is your birth date ");
        int date = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("You're favorite animal is %s, first tool that comes to mind is %s and the day you were born is %d",
                animal, tool, date);
    }
}
        * */
    }
}
