/*
You have just purchased a stereo system that cost $1,000 on the following credit
plan: no down payment, an interest rate of 18% per year (and hence 1.5% per
month), and monthly payments of $50. The monthly payment of $50 is used to
pay the interest, and whatever is left is used to pay part of the remaining debt.
Hence, the first month you pay 1.5% of $1,000 in interest. That is $15 in interest.
So, the remaining $35 is deducted from your debt, which leaves you with a debt of
$965.00. The next month, you pay interest of 1.5% of $965.00, which is $14.48.
Hence, you can deduct $35.52 (which is $50 – $14.48) from the amount you owe.
Write a program that tells you how many months it will take you to pay off the
loan, as well as the total amount of interest paid over the life of the loan. Use a loop
to calculate the amount of interest and the size of the debt after each month. (Your
final program need not output the monthly amount of interest paid and remaining
debt, but you may want to write a preliminary version of the program that does output these values.)
Use a variable to count the number of loop iterations and hence,
the number of months until the debt is zero. You may want to use other variables as
well. The last payment may be less than $50 if the debt is small, but do not forget
the interest. If you owe $50, your monthly payment of $50 will not pay off your
debt, although it will come close. One month’s interest on $50 is only 75 cents.

Savitch, Walter; Mock, Kenrick. Absolute Java (p. 169). Pearson Education. Kindle Edition.
 */

public class InterestWithAStereo {
    public static void main(String[] args) {
        //Original cost of the stereo system
        double originalCost = 1000.00;

        //18 percent yearly interest rate
        double yearlyInterest = 0.18;

        //Monthly interest
        double monthlyInterest = yearlyInterest/12;

        //50-dollar initial Monthly payment
        double monthlyPaymentIn = 50.00;

        double interestCost;
        double principalDiff;
        double nextPrincipal;

        //down-payment
        //double downpayment = 0.00;
        //initial debt

        //double debt = originalCost - downpayment;
        //do-while or for loop for each monthly payment

        int months = 0;
        double cumulativeInterest = 0;
        // TODO: Will add the loop contents later.
do
{
//interest cost
    interestCost = originalCost * monthlyInterest;

    //the principal amount minus the difference of monthly payment and interest
    principalDiff = monthlyPaymentIn - interestCost;
    nextPrincipal = originalCost - principalDiff;

    originalCost = nextPrincipal;

    System.out.printf("%.2f \n", nextPrincipal);
    months++;
    System.out.println("The principal becomes zero after " + months + " months.");
    cumulativeInterest = cumulativeInterest + interestCost;
    System.out.printf("%.2f \n", cumulativeInterest);

} while(interestCost > 0.00 && nextPrincipal > 0.00);
    }
}
