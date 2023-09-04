/*
In the game of craps, a pass line bet proceeds as follows: Two six-sided dice are
rolled; the first roll of the dice in a craps round is called the “come out roll.”
A come out roll of 7 or 11 automatically wins, and a come out roll of 2, 3, or 12
automatically loses. If 4, 5, 6, 8, 9, or 10 is rolled on the come out roll, that number
becomes “the point.” The player keeps rolling the dice until either 7 or the point is
rolled. If the point is rolled first, then the player wins the bet. If a 7 is rolled first,
then the player loses.
Write a program that simulates a game of craps using these rules without human  input. Instead of asking for a wager,
the program should calculate whether the player would win or lose.
The program should simulate rolling the two dice and
calculate the sum.
Add a loop so that the program plays 10,000 games. Add
counters that count how many times the player wins and how many times the
player loses.
At the end of the 10,000 games, compute the probability of winning  [i.e., Wins/ (Wins + Losses)] and output this value.
Over the long run, who  is going to win the most games, you or the house?
 */
//Import the random class.
import java.util.*;
import java.text.*;
public class CrapsWhile {
    public static void main(String[] args) {
        //10,000
        //counter
        //num of wins, losses
        //probability calculated outisde only once.
        Random randomGenerator = new Random();
        //the (integer) numbers in that statement are possibilities for if statements.
        //Generate the integer for the come-out roll as a random int ranging between 2 and 12.
        int wins = 0;
        int losses = 0;

        //Create a while or for loop when the number of games played.
int game = 0;
        while (game < 10000) //within that for loop, if 7 is the first number rolled, the player loses.
        {
            int comeOutRoll = (int) (Math.random() * 10) + 2; //For example, comeOutRoll = 5 typecasted as an integer.

            //In the line above, The difference between the max an min dice combos (12-2 = 10). Range is (0 to 10) offset by 2.
            System.out.println("START    ((((((((((((   " + comeOutRoll);

            // Condition of wining is either 7 or 11
            if (comeOutRoll == 7 || comeOutRoll == 11) //In Craps, if the come out roll is 7 or 11, the player automatically wins.
            {
                System.out.println("YOU WON! YOU DID IT! I KNEW YOU WOULD, I JUST KNEW YOU WOULD!");
                wins = wins + 1;

            }
            // Condition of losing is either 2, 3, or 12
            if (comeOutRoll == 2 || comeOutRoll == 3 || comeOutRoll == 12)
            {
                System.out.println("You get... NOTHING! YOU LOSE!!! GOOD DAY SIR!");
                losses = losses + 1;
            }
            // It is neither a win or a loss.  Will Keep looping
            else if (comeOutRoll == 4 || comeOutRoll == 5 || comeOutRoll == 6 || comeOutRoll == 8 || comeOutRoll == 9 || comeOutRoll == 10)
            {
                int thePoint = comeOutRoll;
                System.out.println("The Point is ??????? " + thePoint);

                int inRoll = (int) (Math.random() * 10) + 2;
                System.out.println("++++++++++" + inRoll);
                //I would rather use a switch statement instead.
                //if the first roll after the point is 7, the player loses the bet.
                if (inRoll == 7 && game == 1) {
                    System.out.println("You get... NOTHING! YOU LOSE!!! GOOD DAY SIR!");
                    losses = losses + 1;
                }
                //if the first roll after the point is seven,  the player loses the bet.
                else
                {
                    inRoll = (int) (Math.random() * 10) + 2;
                }
                //you matched the point.  Winll is 7, the player loses the bet.
                if (inRoll == thePoint) {
                    System.out.println("YOU WON! YOU DID IT! I KNEW YOU WOULD, I JUST KNEW YOU WOULD!");
                    wins = wins + 1;
                }

                if (inRoll == 7 && game != 1) {
                    System.out.println("YOU WON! YOU DID IT! I KNEW YOU WOULD, I JUST KNEW YOU WOULD!");
                    wins = wins + 1;
                }


            }
            System.out.println("END  >>>>> Current Random " + comeOutRoll + " Over " + game + " rolls, There are " + wins + " wins" + " and " + losses + " losses.");

        }
        double chanceOfVictory = wins / (wins + losses);
        System.out.println("=============================================================");
        System.out.println("There are " + wins + " wins");
        System.out.println("and " + losses + " losses.");
        System.out.println("The probability of victory is ");
        System.out.println((chanceOfVictory * 100) + " percent.");
        System.out.println("=============================================================");

    }
}
