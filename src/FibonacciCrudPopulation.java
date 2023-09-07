/*
The Fibonacci numbers Fn are defined as follows: F0 is 1, F1 is 1, and
Fi+2 = Fi + Fi+1  i = 0, 1, 2,.... In other words, each number is the sum of the previous two numbers.
The first few Fibonacci numbers are 1, 1, 2, 3, 5, and 8. One place where these
numbers occur is as certain population growth rates. If a population has no deaths,
then the series shows the size of the population after each time period. It takes an
organism two time periods to mature to reproducing age, and then the organism
reproduces once every time period. The formula applies most straightforwardly to
asexual reproduction at a rate of one offspring per time period. In any event, the
green crud population grows at this rate and has a time period of five days. Hence, if
a green crud population starts out as 10 pounds of crud, then in 5 days, there is still
10 pounds of crud; in 10 days, there is 20 pounds of crud; in 15 days, 30 pounds;  in 20 days, 50 pounds; and so forth.
Write a program that takes both the initial size
of a green crud population (in pounds) and a number of days as input and outputs
the number of pounds of green crud after that many days.
Assume that the population size is the same for four days and then increases every fifth day. Your program
should allow the user to repeat this calculation as often as desired.

INPUT 1 - Intial size of green crud in pounds
INPUT 2 - Number of days

OUTPUT 1 - Pounds of green crud after that many days

GIVEN 1 - Period = 5 days
GIVEN 2 - Fibonacci equation

 */
import java.util.Scanner;
public class FibonacciCrudPopulation {
    public static void main(String[] args) {
        Scanner nyet = new Scanner(System.in);
    int initialCrud = 10; //10 pounds of crud in the start.
        int secondCrud = 10; //

        System.out.println("Enter how many 5-day sets you want for the crud to grow.");
        int fiveDaySet = nyet.nextInt();
        int nextCrud;

        for(int i = 0; i < fiveDaySet; i++) //Repeat for however long five days sets that the user has entered.
            {
                nextCrud = initialCrud + secondCrud;   //>>>>>>>>>>>>>>>>>>>>>>

                System.out.println("In 5-day set #" + (i + 1) + ", (" + ((i+1)* 5) + " days have passed)");
                System.out.println(initialCrud + " + " + secondCrud + " = " + nextCrud + " pounds of crud. \n");


                initialCrud = secondCrud; //This goes first.
                secondCrud = nextCrud; //followed by that.

//The order of the value updating is what is important, the initial value should be updated first.
        }





//TODO Add a loop and ask the user for additional crud growth.


    }
}
