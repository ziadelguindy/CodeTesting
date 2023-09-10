/*
Write a program that calculates the total grade for N classroom exercises as a percentage.
Use the DecimalFormat class to output the value as a percent. The user
should input the value for N followed by each of the N scores and totals. Calculate
the overall percentage (sum of the total points earned divided by the total points  possible) and output it using the DecimalFormat class.
 */

import java.math.*;
import java.text.*;
import java.util.*;
public class TotalGradeDecimalFormat {
    public static void main(String[] args) {
        Scanner oah = new Scanner(System.in);
        DecimalFormat stoy = new DecimalFormat("0.00%"); //The argument inside needs to be a variable of type String. FOR PERCENT.

        //The user should input how many exercises were completed.
        System.out.println("How many exercises?");
        int numExercise = oah.nextInt(); //corresponds to the number of exercises
        double totalAccu = 0.0; //All the achieved scores will accumulate to this variable.
        double totalPoints = 0.0; //The sum of all the possible points.

        //For the number of exercises inputted, a random score earned and possible score should be generated for each exercise.
        //Create a for loop that will generate from the statement shown above.
        for (int ex = 1; ex <= numExercise; ex++)
        {
            //I need to generate a separate double variables for each iteration of the for loop (each exercise completed).
            System.out.println("Score received for exercise " + ex);
            int exScore = oah.nextInt(); //score achieved on the exercise
            System.out.println("Total points possible for exercise " + ex);
            int exTotal = oah.nextInt(); //total points possible on the exercise.
            totalAccu = totalAccu + exScore; //totalAccu will be reassigned at the end of every loop iteration.
            totalPoints = totalPoints + exTotal; //totalPoints will be reassigned at the end of every loop iteration.
        }
        double percent = totalAccu / totalPoints;
        System.out.println("==============================");
        System.out.println("You have earned " + totalAccu + " points out of " + totalPoints + " points.");
        System.out.println("Your percent is:");
        System.out.println(stoy.format(percent));
        System.out.println("==============================");
    }
}
