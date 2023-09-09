import java.math.*;
import java.text.*;
import java.util.*;

/*
The value e^x can be approximated by the following sum:
1 + x + x^2/2! + x^3/3! + ... + x^n/n!
Write a program that takes a value x as input and outputs this sum for n taken to
be each of the values 1 to 10, 50, and 100.
Your program should repeat the calculation for new values of x until the user says she or he is through.
The expression n! is called the factorial of n and is defined as  n! = 1 * 2 * 3 *...* n
Use variables of type DOUBLE to store the factorials (or arrange your calculation
to avoid any direct calculation of factorials); otherwise, you are likely to produce
integer overflow, that is, integers larger than Java allows.
 */
import java.util.Scanner;

//1 + 1! + 2! + 3! + ... + n!
public class ExpXSum {
    public static void main(String[] args) {
        Scanner stoy = new Scanner(System.in);
        System.out.println("Enter a value of x.");
        double x = stoy.nextDouble(); //take a value of x from the user.
        System.out.println("Set n to 1, 5, 10, 50, and 100 and see the results.");
        double n = stoy.nextDouble(); //repeated n times.
        //I need to define the e^x double variable.
        //double expX = Math.;
        // expX = nFact several times = nFact 1 + nFact 2 + nFact 3 + ...nFactn



       // double expXFirst = 1.0; //1 to start.
        double expXCurrent;
        double expXFinal = 1.0;

        //I need to create the n factorial loop using an initial value, second factorial, and next factorial.
        double nFact = 1.0; //THIS IS THE FIRST FACTORIAL >>>> initialized at 1!
        for(double count = 1.0; count <= n; count = count + 1.0) //Multiply each increment
        {
            //say the count = 5. and N factorial is 24
            // new value of N factorial is count times N factorial = 120
            nFact = nFact * count;

            //add the next step of x^n/nFact to the preceding step.
            //say expXNext = 1^2/2!, the next step is 1^3/3!. These results should be added together into expX.
            expXCurrent = Math.pow(x, count) / nFact;
            expXFinal = expXFinal + expXCurrent; //expXFinal is being reassigned once every loop.

            System.out.println("The factorial is:");
            System.out.println(nFact + "\n");
            System.out.println("The current approximation of e^x is:");
            System.out.println(expXCurrent + "\n");
            System.out.println("The final sum approximation of e^x is:");
            System.out.println(expXFinal);

        }


        //the initial factorial will equal the second factorial while in the loop. For instance, inFac =

    }
}

//Make an assumption, test it, and then debug.