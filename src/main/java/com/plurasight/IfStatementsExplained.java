package com.plurasight;

import java.util.Scanner;

/**
 *
 */
public class IfStatementsExplained {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What time is it? ");
        int hour =scanner.nextInt();
        if(hour>=12){
            System.out.println("You are on the day!");
        }
    }
}
