package com.plurasight;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello there! What's your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hi %s\n", name);
        System.out.println("What's your favorite color?");
        String color = scanner.nextLine();
        System.out.printf("");
    }
}
