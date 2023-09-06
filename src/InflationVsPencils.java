/*
It is difficult to make a budget that spans several years, because prices are not stable.
If your company needs 200 pencils per year, you cannot simply use this year’s price
as the cost of pencils two years from now. Because of inflation, the cost is likely to
be higher than it is today. Write a program to gauge the expected cost of an item in
a specified number of years. The program asks for the cost of the item, the number
of years from now that the item will be purchased, and the rate of inflation. The
program then outputs the estimated cost of the item after the specified period.
Have the user enter the inflation rate as a percentage, such as 5.6 (percent). Your
program should then convert the percent to a fraction, such as 0.056 and should
use a loop to estimate the price adjusted for inflation.

TODO Assume the inflation rate is fixed.
 */

import java.util.*;
import java.text.*;

public class InflationVsPencils {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat.getCurrencyInstance(Locale.US);
String response;
        do {
            System.out.println("Input the cost and round to two decimal places.");
            double cost = input.nextDouble();

            System.out.println("Enter the number of years.");
            double years = input.nextDouble();

            System.out.println("Enter the inflation rate in percent.");
            double inflPercent = input.nextDouble();
            double inflation = inflPercent / 100.0;

            double finalCost = cost * Math.pow((1 + inflation), years);
            System.out.println("The cost after that time is");
            System.out.printf("%.2f", finalCost);
            System.out.println("\n Additional changes in price/inflation rate? If so, please enter the cost in the previous cycle.");
            response = input.next();
        } while (response.equalsIgnoreCase("yes"));

        //TODO: add a while/do-while/for loop.





    }

}
