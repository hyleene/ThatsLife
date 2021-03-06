

import cards.SalaryCard;
import cards.action_cards.collect_from_player.FileALawsuit;
import cards.career_cards.Accountant;
import cards.career_cards.Athlete;
import core.Bank;
import core.Player;

/**
 * Test script for <code>FileALawsuit</code> class
 */
public class FileALawsuitTestScript {
    public static void main(String[] args) {

        FileALawsuit c1;
        FileALawsuit c2;
        FileALawsuit c3;

        Player p1;
        Player p2;

        Accountant career1;
        Athlete career2;

        SalaryCard salary1;
        SalaryCard salary2;

        Bank b;

        /* Player, CareerCard, SalaryCard, and Bank objects are created to
         *  test the FileALawsuit object methods. */
        p1 = new Player("Player One");
        career1 = new Accountant();
        salary1 = new SalaryCard();

        p2 = new Player("Player Two");
        career2 = new Athlete();
        salary2 = new SalaryCard();

        b = new Bank(3);

        /* Players are assigned careers and salaries (for testing purposes) by keeping the
         *  created career and salary cards. */
        p1.keepCareerCard(career1);
        p1.keepSalaryCard(salary1);

        p2.keepCareerCard(career2);
        p2.keepSalaryCard(salary2);

        /* Constructor: FileALawsuit ()
         *  Three FileALawsuit objects are created (to test the random generation of amounts). */
        c1 = new FileALawsuit();
        c2 = new FileALawsuit();
        c3 = new FileALawsuit();

        System.out.println("execute()");

        /* Method: execute(Player currPlayer, Player otherPlayer, Bank b)
         *  Test case 1: The effect of FileALawsuit is executed on p1.
         *  Expected output: The cash of p1 will increase by the randomly generated amount
         *  stored in c1, and the cash of p2 will decrease by the same amount. */
        System.out.println("Test case 1: The effect of FileALawsuit is executed on p1.");

        System.out.println("Stats before FileALawsuit execution:");
        System.out.println("p1: Cash = " + p1.getCash());
        System.out.println("p2: Cash = " + p2.getCash());
        System.out.println("p2: Number of Loans = " + p2.getCurrNumLoans());
        System.out.println("c1: Amount = " + c1.getAmount());

        c1.execute(p1, p2, b);

        System.out.println("Stats after FileALawsuit execution:");
        System.out.println("p1: Cash = " + p1.getCash());
        System.out.println("p2: Cash = " + p2.getCash());
        System.out.println("p2: Number of Loans = " + p2.getCurrNumLoans());

        /* Method: execute(Player currPlayer, Player otherPlayer, Bank b)
         *  Test case 2: The effect of FileALawsuit is executed on p1.
         *  Expected output: The cash of p1 will increase by the randomly generated amount
         *  stored in c2, and the cash of p2 will decrease by the same amount. */
        System.out.println("Test case 2: The effect of FileALawsuit is executed on p1.");

        System.out.println("Stats before FileALawsuit execution:");
        System.out.println("p1: Cash = " + p1.getCash());
        System.out.println("p2: Cash = " + p2.getCash());
        System.out.println("p2: Number of Loans = " + p2.getCurrNumLoans());
        System.out.println("c2: Amount = " + c2.getAmount());

        c2.execute(p1, p2, b);

        System.out.println("Stats after FileALawsuit execution:");
        System.out.println("p1: Cash = " + p1.getCash());
        System.out.println("p2: Cash = " + p2.getCash());
        System.out.println("p2: Number of Loans = " + p2.getCurrNumLoans());

        /* Method: execute(Player currPlayer, Player otherPlayer, Bank b)
         *  Test case 3: The effect of FileALawsuit is executed on p1.
         *  Expected output: The cash of p1 will increase by the randomly generated amount
         *  stored in c3, and the cash of p2 will decrease by the same amount. */
        System.out.println("Test case 3: The effect of FileALawsuit is executed on p1.");

        System.out.println("Stats before FileALawsuit execution:");
        System.out.println("p1: Cash = " + p1.getCash());
        System.out.println("p2: Cash = " + p2.getCash());
        System.out.println("p2: Number of Loans = " + p2.getCurrNumLoans());
        System.out.println("c3: Amount = " + c3.getAmount());

        c3.execute(p1, p2, b);

        System.out.println("Stats after FileALawsuit execution:");
        System.out.println("p1: Cash = " + p1.getCash());
        System.out.println("p2: Cash = " + p2.getCash());
        System.out.println("p2: Number of Loans = " + p2.getCurrNumLoans());

        System.out.println();
        System.out.println("getInfo()");

        /* Method: getInfo()
         *  Test case 1: The getInfo() method of c1 is called.
         *  Expected output: The string "You have won a lawsuit. Collect "
         *  + getAmount() + " from a player of your choosing.", where getAmount()
         *  indicates the randomly generated amount (used to indicate the execution
         *  of the action card in the GameMaster class). */
        System.out.println ("Test case 1: The getInfo() method of c1 is called.");

        System.out.println (c1.getInfo());

        /* Method: getInfo()
         *  Test case 2: The getInfo() method of c2 is called.
         *  Expected output: The string "You have won a lawsuit. Collect "
         *  + getAmount() + " from a player of your choosing.", where getAmount()
         *  indicates the randomly generated amount (used to indicate the execution
         *  of the action card in the GameMaster class). */
        System.out.println ("Test case 2: The getInfo() method of c2 is called.");

        System.out.println (c2.getInfo());

        /* Method: getInfo()
         *  Test case 3: The getInfo() method of c3 is called.
         *  Expected output: The string "You have won a lawsuit. Collect "
         *  + getAmount() + " from a player of your choosing.", where getAmount()
         *  indicates the randomly generated amount (used to indicate the execution
         *  of the action card in the GameMaster class). */
        System.out.println ("Test case 3: The getInfo() method of c3 is called.");

        System.out.println (c3.getInfo());

        System.out.println();
        System.out.println("toString()");

        /* Method: Overridden toString()
         *  Test case 1: The FileALawsuit object c1 is printed (using the toString() method).
         *  Expected output: The name of the card and the amount to be paid by
         *  otherPlayer to currPlayer. */
        System.out.println ("Test case 1: The FileALawsuit object c1 is printed (using the toString() method).");

        System.out.println (c1);

        /* Method: Overridden toString()
         *  Test case 2: The FileALawsuit object c2 is printed (using the toString() method).
         *  Expected output: The name of the card and the amount to be paid by
         *  otherPlayer to currPlayer. */
        System.out.println ("Test case 2: The FileALawsuit object c2 is printed (using the toString() method).");

        System.out.println (c2);

        /* Method: Overridden toString()
         *  Test case 3: The FileALawsuit object c3 is printed (using the toString() method).
         *  Expected output: The name of the card and the amount to be paid by
         *  otherPlayer to currPlayer. */
        System.out.println ("Test case 3: The FileALawsuit object c3 is printed (using the toString() method).");

        System.out.println (c3);
    }
}


