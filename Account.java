package BankingUpdated;

import Banking.CurrentAcc;
import Banking.Saving;
import java.util.Scanner;

public abstract class Account {

    long accountid;
    String description;
    int minimumbalance;
    Scanner sc = new Scanner(System.in);

    abstract void display();

}
