package com.capg.assessment.controller;

import java.util.Scanner;
import com.capg.assessment.service.BankService;

public class BankController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService service = new BankService();

        while (true) {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Show Balance");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Fund Transfer");
            System.out.println("6. Show Transactions");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    long accNo = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Mobile: ");
                    long mobile = sc.nextLong();
                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();
                    service.createAccount(accNo, name, mobile, balance);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    service.showBalance(sc.nextLong());
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    long dAcc = sc.nextLong();
                    System.out.print("Enter Amount: ");
                    service.deposit(dAcc, sc.nextDouble());
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    long wAcc = sc.nextLong();
                    System.out.print("Enter Amount: ");
                    service.withdraw(wAcc, sc.nextDouble());
                    break;

                case 5:
                    System.out.print("Enter Sender Account: ");
                    long from = sc.nextLong();
                    System.out.print("Enter Receiver Account: ");
                    long to = sc.nextLong();
                    System.out.print("Enter Amount: ");
                    service.fundTransfer(from, to, sc.nextDouble());
                    break;

                case 6:
                    System.out.print("Enter Account Number: ");
                    service.showTransactions(sc.nextLong());
                    break;

                case 7:
                    System.out.println("Thank you!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
