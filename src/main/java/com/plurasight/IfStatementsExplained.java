package com.plurasight;

import java.util.Scanner;

/**
 *
 */
public class IfStatementsExplained {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("What time is it? ");
//        int hour =scanner.nextInt();
//        if(hour>=12){
//            System.out.println("You are on the day!");
//        }

        double temp = 62;
        if (temp <= 62){
            System.out.println("It is cold");
        } else{
            System.out.println("It is not cold");
        }

        boolean tryToSleep = false;
        boolean isDark = true;
        boolean lightOn = true;

        if(tryToSleep && lightOn){
            System.out.println("Turn light off");
        }
    }
}
