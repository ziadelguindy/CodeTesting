import java.util.*;
import java.math.*;
import java.text.*;
/*
The game of Pig is a simple two-player dice game in which the first player to
reach 100 or more points wins. Players take turns. On each turn, a player rolls a
six-sided die:
• If the player rolls a 1, then the player gets no new points and it becomes the other
player’s turn.
• If the player rolls 2 through 6, then he or she can either
• ROLL AGAIN or  • HOLD.
At this point, the sum of all rolls is added to the player’s score, and it  becomes the other player’s turn.
Write a program that plays the game of Pig, where one player is a human and the
other is the computer. When it is the human’s turn, the program should show the
score of both players and the previous roll. Allow the human to input “r” to roll
again or “h” to hold.  The computer program should play according to the following rule:
• Keep rolling when it is the computer’s turn until it has accumulated 20 or
more points, then hold. If the computer wins or rolls a 1, then the turn ends
immediately.  Allow the human to roll first.
 */
public class Pig {
    public static void main(String[] args) {
        Scanner player = new Scanner(System.in);
        int hRoll; //the human rolls first. it is a random integer between 1 and 6.

        int cRoll;

        int hScore = 0;
        int hSubScore = 0;
        int cScore = 0;
        int cSubScore = 0;
        char turn = 'h'; //The turn variable is a character. In the game of Pig, the human will go first.
        String action;

        while (hScore < 100 || cScore < 100)
        {
            hRoll = (int) ((5 * Math.random()) + 1);
            System.out.println("The player has rolled " + hRoll);
            cRoll = (int) ((5 * Math.random()) + 1);
            System.out.println("and the computer has rolled " + cRoll);

            if (hRoll == 1 && turn == 'h') //make a nested if statement for that if the current player is human, it will turn to robot and vice-versa.
            {
//If the current turn is the human,

                turn = 'c'; //then the next turn will be the computer's turn.
                System.out.println("It's the computer's turn.");

            }

            if (cRoll == 1 && turn == 'c') //If the current turn is the computer,
                {
                    turn = 'h'; //then the next turn is the human's turn.
                    System.out.println("It's the player's turn.");

                }

            if (hRoll > 1 && turn == 'h')
            {
                System.out.println("Do you want to roll again or hold?");
                action = player.next();

                if (action.equalsIgnoreCase("again") && hRoll > 1)
                {
                    hRoll = (int) ((5 * Math.random()) + 1);
                    System.out.println("You now rolled a " + hRoll + ". ");
                    if (hRoll > 1)
                        hSubScore= hSubScore + hRoll;
                    else
                        turn = 'c';
                        continue;

                }

                if(action.equalsIgnoreCase("hold"))
                {
                    hScore = hScore + hSubScore;
                    System.out.println("Your current score is " + hScore + " out of 100 points.");
                    turn = 'c';
                }

            }

            if (cRoll > 1 && turn == 'c')
            {
                while (cSubScore < 20 && cRoll > 1)
                {
                    cRoll = (int) ((5 * Math.random()) + 1);
                    System.out.println("The computer has rolled a " + cRoll + ".");
                    if (cRoll > 1)
                    {
                        cSubScore = cSubScore + cRoll;
                        cScore = cScore + cSubScore;
                    }
                    else
                        turn = 'h';

                }
                if (cRoll == 1)
                {
                    turn = 'h';
                }
            }
            System.out.println("The current player score is " + hScore + " and the current computer score is " + cScore + ".");
            }

        if (hScore >= 100)
            System.out.println("Player wins!");

        if (cScore >= 100)
            System.out.println("Computer wins!");





        }




    }


