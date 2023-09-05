/*
One way to estimate the adult height of a child is to use the following formula,
which uses the height of the parents:
TODO Hmale_child = ((Hmother * 13/12) + Hfather) / 2
TODO Hfemale_child = ((Hfather * 12/13) + Hmother) / 2
TODO All heights are in inches.
Write a program that takes as input the gender of the
child, the height of the mother in inches, and the height of the father in inches,
and outputs the estimated adult height of the child in inches. The program should
allow the user to enter a new set of values and output the predicted height until the
user decides to exit. The user should be able to input the heights in feet and inches,
and the program should output the estimated height of the child in feet and inches.
TODO Use the int data type to store the heights.

Savitch, Walter; Mock, Kenrick. Absolute Java (p. 168). Pearson Education. Kindle Edition.
 */

import java.util.*;
public class AdultChildHeight {
    public static void main(String[] args) {
        int hMother, hFather, hMaleChild, hFemaleChild; //The height will be measured in inches as an integer.
        //for feet and inches, the feet will be inches / 12, inches as a mixed number will be the remainder inches % 12.
        Scanner input = new Scanner(System.in); //creating the system input from the console

        /* Create a while or do-while loop for if the user wants to measure again, the loop will repeat.
        If not, the program will exit the loop, thus terminating the program.
         */
        String response;

        do {
            System.out.println("Is the child male or female?");
            //If statement if the gender does not equal male or female.
            String gender = input.next();

            System.out.println("Enter the mother's height in inches.");
            hMother = input.nextInt();
            System.out.println("Enter the father's height in inches.");
            hFather = input.nextInt();

            if (gender.equalsIgnoreCase("male")) {
                hMaleChild = ((hMother * 13 / 12) + hFather) / 2; //Create the male's height in inches first.
                int hMaleChildFt = hMaleChild / 12;
                int hMaleChildIn = hMaleChild % 12;
                System.out.println("The male's height is " + hMaleChildFt + " feet and " + hMaleChildIn + " inches.");

            }

            if (gender.equalsIgnoreCase("female")) {
                hFemaleChild = ((hFather * 12 / 13) + hMother) / 2; //Create the female's height in inches first.
                int hFemaleChildFt = hFemaleChild / 12;
                int hFemaleChildIn = hFemaleChild % 12;
                System.out.println("The female's height is " + hFemaleChildFt + " feet and " + hFemaleChildIn + " inches.");

            }

            System.out.println("Do you want to make another measurement?");
            response = input.next();

          } while (response.equalsIgnoreCase("yes"));
    }
}
