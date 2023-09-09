/*
In cryptarithmetic puzzles, mathematical equations are written using letters. Each
letter can be a digit from 0 to 9, but no two letters can be the same. Here is a
sample problem:  SEND + MORE = MONEY
A solution to the puzzle is S = 9, R = 8, O = 0, M = 1, Y = 2, E = 5, N = 6,
D = 7. Write a program that finds a solution to the cryptarithmetic puzzle of the
following:  TOO + TOO + TOO + TOO = GOOD
The simplest technique is to use a nested loop for each unique letter (in this case T,  O, G, D).
The loops would systematically assign the digits from 0 to 9 to each  letter.
For example, it might first try T = 0, O = 0, G = 0, D = 0, then T = 0, O = 0,  G = 0, D = 1, then T = 0, O = 0, G = 0, D = 2, etc.,
up to T = 9, O = 9, G = 9,  D = 9. In the loop body, test that each variable is unique and that the equation is
satisfied. Output the values for the letters that satisfy the equation.
 */
import java.math.*;
public class CryptoarithmeticPuzzle {
    public static void main(String[] args) {
        int T;
        int O = 99;
        int G = 99;
        int D = 99; //These are the four variables which will be used to solve the cryptarithmetic equation.
        int TOO;
        int GOOD;
        for(T = 0; T <= 9; T++)
        {
            if (T == G || T == O || T == D)
            {
                continue;
            }
            for (O = 0; O <= 9; O++)
            {
                if (O == G || O == D || O == T)
                {
                    continue;
                }
                for (G = 0; G <= 9; G++)
                {
                    if (G == D || G == O || G == T)
                    {
                        continue;
                    }
                    for (D = 0; D <= 9; D++)
                    {
                        if (D == G || D == O || D == T)
                        {
                            continue;

                        }
                        TOO = T * 100 + O * 10 + O * 1;
                        GOOD = G * 1000 + O * 100 + O * 10 + D * 1;

                        if (GOOD == 4 * TOO)
                        {
                            System.out.println("GOOD = " + GOOD + " and TOO equals " + TOO + ".");
                            System.out.println("T is " + T + ", G is " + G + ", O is " + O + ", and D is " + D + ".");
                            System.exit(0);
                        }
                        System.out.println("That did not work. T = " + T + " and O = " + O + " and G = " + G + " and D = " + D + ". TOO = " + TOO + " and GOOD = " + GOOD);
                    }
                }
            }
        }
    }
}
/*
We have learned that to break out of an iteration of a loop, use the keyword "continue".
To exit out of a loop in its entirety, use the keyword "break".

We made a graphic display of what the values of the four characters (T, O, G, and D) should be in order to find a valid solution.
We tested the solution by hand to see how it works.

WE ALSO LEARNED HOW TO A STRING AS AN INTEGER USING (ones, tens, hundred, thousands, etc.)
 */
