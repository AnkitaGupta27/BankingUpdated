package BankingUpdated;

import java.util.Scanner;

public class Customer implements Validation {

    Scanner sc = new Scanner(System.in);
    String name, cn, p;
    String username;
    String Pass;
    int age, acct;
    String ssn;
    String address;
    String email;
    long phone, num1;
    float balance = 0;

    public void openAcct() {
        Customer c1 = new Customer();
        System.out.println("Create a new account: ");
        System.out.println("Enter the name: ");
        name = sc.next();

        System.out.println("Enter the Username: ");
        username = sc.next();

        System.out.println("Enter the password: ");
        Pass = sc.next();

        System.out.println("Enter the age: ");
        age = sc.nextInt();
        c1.validateage(age);

        System.out.println("Enter the SSN: ");
        ssn = sc.next();
        c1.validateSSN(ssn);

        System.out.println("enter the Address only city: ");
        address = sc.next();

        System.out.println("Enter Email: ");
        email = sc.next();

        System.out.println("Enter the phone Number: ");
        phone = sc.nextLong();

        System.out.println("Types of Account you can apply for: ");
        System.out.println("1.Saving \n2.Current\n3.Back");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                Account a1 = new Savings();
                a1.display();

                break;
            case 2:
                Account a2;
                a2 = new CurrentAc();
                a2.display();
                break;
            case 3:
               Customer c = new Customer();
                c.openAcct();
                break;
            default:
                System.out.println("Invalid input \nTRY AGAIN!!");
                break;
        }

    }

    public void login() {
        String username1 = "Ankita27";
        String pass = "Ankita";
        System.out.print("Enter Username : ");
        cn = sc.next();
        System.out.print("Enter Password : ");
        p = sc.next();
        if (cn.equals(username1) && p.equals(pass)) {

            System.out.println("Please select the option :");
            System.out.print(" 1.Deposit \n 2.Withdrawal \n 3.Check Balance \n 4.Edit Profile \n 5.Change password \n 6.EXIT \n---> ");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdrawal();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    editProfile();
                    break;
                case 5:
                    changePassword();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } else if (cn.equals(username) && p.equals(Pass)) {
            System.out.println("Please select the option :");
            System.out.print(" 1.Deposit \n 2.Withdrawal \n 3.Check Balance \n 4.Edit Profile \n 5.Change password \n 6.EXIT \n---> ");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdrawal();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    editProfile();
                    break;
                case 5:
                    changePassword();
                    break;
                case 6:
                    exit1();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } else {
            System.out.println("Invalid Username or Password!! Please try again.");
            login();
        }
    }

    public void deposit() {
        System.out.print("Enter the amount you want to deposit: ");
        double d = sc.nextDouble();
        balance += d;
        System.out.println("Rupees " + d + " deposited successfully!");
        System.out.println("Your current balance is Rupees " + balance);
        System.out.print("Do you want to continue?(y/n)");
        char ch = sc.next().charAt(0);
        if (ch == 'y') {
            login();
        } else {
            System.out.println("Logged Out Successfully...Thank You! Visit Again!!");
            System.exit(0);
        }
    }

    public void withdrawal() {
        System.out.print("Enter the amount you want to withdraw : ");
        int amt = sc.nextInt();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Rupees " + amt + " withdrawn successfully!!");
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
        }
        System.out.print("Do you want to continue?(y/n)");
        char ch = sc.next().charAt(0);
        if (ch == 'y') {
            login();
        } else {
            System.out.print("Logged Out Successfully...Thank You! Visit Again!!");
            System.exit(0);
        }

    }

    public void checkBalance() {
        System.out.println("You have rupees " + balance + " in your account");
        System.out.print("Do you want to continue?(y/n)");
        char ch = sc.next().charAt(0);
        if (ch == 'y') {
            login();
        } else {
            System.out.print("Logged Out Successfully...Thank You! Visit Again!!");
            System.exit(0);
        }

    }

    public void editProfile() {
        Customer c2 = new Customer();
        System.out.println("Please select what do you want to edit: ");
        System.out.print(" 1.Name \n 2.Email \n 3.Username \n 4.Age \n 5.Address \n 6.Phone \n---> ");
        int z = sc.nextInt();
        switch (z) {
            case 1:
                System.out.print("Enter the new Name : ");
                String a = sc.next();
                this.name = a;
                System.out.println("Name changed successfully!! \nNew Name is " + a);
                break;
            case 2:
                System.out.print("Enter the new Email : ");
                String e = sc.next();
                this.email = e;

                System.out.println("Email changed successfully!! \nNew Email is " + e);
                break;
            case 3:
                System.out.print("Enter the new UserName : ");
                String u = sc.next();
                this.username = u;
                System.out.println("Username changed successfully!! \nNew Username is " + u);
                break;
            case 4:
                System.out.print("Enter the new Age : ");
                int ag = sc.nextInt();
                this.age = age;
                c2.validateage(age);

                System.out.println("Age changed successfully!! \nNew Age is " + ag);
                break;
            case 5:
                System.out.print("Enter the new Address : ");
                String ad = sc.next();
                this.address = ad;
                System.out.println("Address changed successfully!! \n New Address is " + ad);
                break;
            case 6:
                System.out.print("Enter the new Phone : ");
                long p = sc.nextLong();
                this.phone = p;
                System.out.println("Contact changed successfully!! \n New Contact is " + p);
                break;
            default:
                System.out.println("Invalid Input!!");
                break;
        }
        System.out.print("Do you want to continue?(y/n)");
        char ch = sc.next().charAt(0);
        if (ch == 'y') {
            login();
        } else {
            System.out.println("Logged Out Successfully...Thank You! Visit Again!!");
            System.exit(0);
        }

    }

    public void changePassword() {
        System.out.println("Enter the old password ");
        String op = sc.next();
        if (op.equals(Pass)) {
            System.out.print("Enter the new Password : ");
            String pa = sc.next();
            Pass = pa;
            System.out.println("Password changed successfully!! \n New password is " + Pass);
            System.out.print("Do you want to continue?(y/n)");
            char ch = sc.next().charAt(0);
            if (ch == 'y') {
                login();
            } else {
                System.exit(0);
            }
        } else {
            System.out.println("Wrong Password !");
        }
        System.exit(0);
    }

    @Override
    public void validateSSN(String ssn) {
        if (ssn.matches("\\d{9}")) {
            System.out.println("Valid SSN");
        } else {
            System.out.println("Invalid SSN \nSSN must have 9 digits");
            System.out.println("Please enter a valid ssn number and restart again.");
            Customer c1 = new Customer();
            c1.openAcct();
        }
    }

    @Override
    public void validateage(int age) {
        if (age >= 18) {
            System.out.println("Age is valid for a new account");
            
        } else {
            System.out.println("Not a valid age , it must be greater than 18.");
            System.out.println("Please enter a valid age and restart again.");
            Customer c1 = new Customer();
            c1.openAcct();

        }
    }

    public void exit1() {
        System.out.print("Logged Out Successfully...Thank You! Visit Again!!");
        System.exit(0);
    }
}
