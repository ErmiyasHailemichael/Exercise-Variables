package com.plurasight;

public class SwicthConcept {
    public static void main(String[] args) {
        String day = "Monday";
        if(day.equalsIgnoreCase("Monday")) {
            System.out.println("I hate Mondays");
        } else if(day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Scientifically the most depressive day of the week");
        } else if(day.equalsIgnoreCase("Wednesday")) {
            System.out.println("Hump day");
        } else if(day.equalsIgnoreCase("Thursday")) {
            System.out.println("Almost Friday");
        } else if(day.equalsIgnoreCase("Friday")) {
            System.out.println("Friday!");
        } else if(day.equalsIgnoreCase("Saturday")) {
            System.out.println("Weekend still very long");
        } else if(day.equalsIgnoreCase("Sunday")) {
            System.out.println("you can still do whatever, but...");
        } else {
            System.out.println("I don't know that day");
        }
    }
}
