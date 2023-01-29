package BankingUpdated;

import java.util.Random;

public class CurrentAc extends Account {

    @Override
    public void display() {
        Customer c = new Customer();
        minimumbalance = 500;
        description = "Current bank account is opened by businessmen who have a \n"
                + "higher number of regular transactions with the bank.\n"
                + "It includes deposits, withdrawals, and contra transactions.\n "
                + "It is also known as Demand Deposit Account.\n"
                + "Current account can be opened in co-operative bank and commercial bank.\n"
                + "In current account, amount can be deposited and withdrawn at any time without giving any notice.\n"
                + "It is also suitable for making payments to creditors by using cheques. \n"
                + "Cheques received from customers can be deposited in this account for collection.\n";

        Random rand = new Random();
        System.out.println("You have successfully created the account  \nWelcome!!");
        accountid = rand.nextLong();
        System.out.println("This Type of account means : " + description);
        System.out.println("\nYour Account id is: CUR" + accountid);
        System.out.println("Minimum Balance you need to submit for Savings account is : " + minimumbalance);
        c.login();

    }
}
