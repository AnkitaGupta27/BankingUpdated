package BankingUpdated;

import java.util.Random;

public class Savings extends Account {

    Customer c = new Customer();

    @Override
    public void display() {
        minimumbalance = 0;
        description = "A savings account is a basic type of financial product that allows \n"
                + "you to deposit your money and typically earn a modest amount of interest.\n"
                + "A savings account is a good place to keep money for a later date, \n"
                + "separate from everyday spending cash, because of their safety, liquidity and interest-earning potential\n";

        Random rand = new Random();
        System.out.println("You have successfully created the account  \nWelcome!!");
        accountid = rand.nextLong();
        System.out.println("This Type of account means : " + description);
        System.out.println("\nYour Account id is: S" + accountid);
        System.out.println("Minimum Balance you need to submit for Savings account is : " + minimumbalance);
        c.login();

    }

}
