package BankingUpdated;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Customer c = new Customer();
        System.out.println("***************Welcome to ABC Bank Limited***************");
        System.out.println("Choose :\n1.Register as a new customer.\n2.Login as an old customer.");
        int ch1 = sc.nextInt();
        switch (ch1) {
            case 1:
                Customer C[] = new Customer[1];
                for (int i = 0; i < C.length; i++) {
                    C[i] = new Customer();
                    C[i].openAcct();
                }
                break;
            case 2:
                c.login();
                break;
            default:
                System.out.println("Invalid Choice!!");
                System.exit(0);
                break;
        }

    }
}
