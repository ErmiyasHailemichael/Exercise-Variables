package com.plurasight;

public class Recaptuseday {
    public static void main(String[] args) {
        // Challenge A: Double Trouble
        //Create a double with any value you like.
        //Multiply it by 2.
        //Print both the original and the doubled value.
        double grade = 12.0;
        double finalgrade = grade * 2;
        System.out.println(finalgrade);
        System.out.println(grade);

        // Challenge B: Name + Number
        //Make a String with your name.
        //Make an int with your favorite number.
        //Print them in one sentence using concatenation.
        String name = "Ermi";
        int favNum = 7;
        System.out.println("My name is " + name + " and my favourite number is "+ favNum + ".");

        // Challenge C: Random Surprise
        //Generate a random number between 0 and 10.
        //Print it.
        //Add 5 to it and print the new value.
        long randomNumber = Math.round(Math.random() * 10);
        System.out.println(randomNumber);
        randomNumber = randomNumber - 10;
        System.out.println(randomNumber);


        /*
        Bonus exercises: more challenging
        Bonus 1: Clock Math ⏰
        Take a number of hours (e.g. 27) and calculate what hour that would be on a 24-hour clock. Use % 24*/

        int currentClock = 27;
        int clockIn24 = 27 % 24;
        System.out.println(clockIn24);

        /*
        Bonus 2: Minutes to Hours and Minutes ⏳
        Take a number of minutes (e.g. 130) and figure out how many full hours and leftover minutes that is.

        Hours = minutes / 60
        Leftover = minutes % 60
        */


        /*
        Bonus 3: Time Calculator 📅
        Yes! 🙌 Here’s how you could turn that into a step-by-step exercise for your students.
        It starts very basic and nudges them towards the final solution with nrhours, nrminutes, and minutestoadd.
         */




        // Exercise: Time Calculator (No if statements)
        // You are given a starting time and some extra minutes to add. Write a program that calculates the final time on a 24-hour clock.
        /* Step 1: Start with variables
            int nrHours = 3;
            int nrMinutes = 23;
            int minutesToAdd = 183;*/



        // Step 2: Find the new hours

        // Step 3: Find the leftover minutes

        // Step 4: Print the final time
        //Finally, show the result as hours:minutes.
        // System.out.println("Final time: " + newHours + ":" + newMinutes);



    }
}
// https://github.com/BrightBoost/learningjava/blob/main/exercises/recapTuesday.md

// https://www.youtube.com/watch?v=4hwmRUup7BE&list=PL7LtGuh_nbfphuB58q2SQ7C9k52THkRoN

// https://github.com/BrightBoost/learningjava/blob/main/exercises/operatorExercise.md