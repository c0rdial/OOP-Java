
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import individual.Account;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author WanMohammedAdam
 */
public class Bank {

    //A collection of all the accounts created (from the Account class) at this Bank's branch.
    ArrayList<Account> accountList;

    /**
     * Default Constructor.
     */
    public Bank() {
        this.accountList = new ArrayList<>();
    }

    /**
     * Find Account.
     *
     * A method to get a specific account by its account number.
     *
     * @param accountNumber
     */
    public void findAccount(int accountNumber) {
        boolean found = false;
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getId() == (accountNumber)) {
                System.out.print(accountList.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Account Not Found!!");
        }
    }

    /**
     * Deposit.
     *
     * @param accountNumber
     */
    public void dep(int accountNumber) {
        boolean found = false;
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getId() == (accountNumber)) {
                System.out.println("");
                System.out.println("Account Found : " + accountList.get(i));
                found = true;
                accountList.get(i).deposit();
            }
        }
        if (!found) {
            System.out.println("Account Not Found!!");
        }
    }

    /**
     * Withdraw.
     *
     * @param accountNumber
     */
    public void with(int accountNumber) {
        boolean found = false;
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getId() == (accountNumber)) {
                System.out.println("");
                System.out.println("Account Found : " + accountList.get(i));
                found = true;
                accountList.get(i).withdraw();
            }
        }
        if (!found) {
            System.out.println("Account Not Found!!");
        }
    }

    /**
     *
     * @param accountNumber
     */
    public void checkBal(int accountNumber) {
        boolean found = false;
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getId() == (accountNumber)) {
                System.out.println("");
                System.out.println("Account Found : " + accountList.get(i));
                found = true;
                System.out.println("Current Account Balance : " + accountList.get(i).getBalance());
            }
        }
        if (!found) {
            System.out.println("Account Not Found!!");
        }
    }

    /**
     * Add Account.
     *
     * @throws Exception
     */
    public void addAccount() throws Exception {

        Scanner scannerAdd = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter Account ID : ");
        int accountID = Integer.parseInt(scannerAdd.nextLine());
        System.out.print("Enter Account Balance : ");
        double accountBalance = Double.parseDouble(scannerAdd.nextLine());

        Account newAccount = new Account(accountID, accountBalance);
        //create the account object and add this account to the Bank's collection of accounts. 
        accountList.add(newAccount);

        System.out.print("Enter Account Anual Interest Rate (0 -100): ");
        int anualInterestRate = Integer.parseInt(scannerAdd.nextLine());
        System.out.print("Enter Account IC Number (Example - 771212-10-1011): ");
        String icNumber = scannerAdd.nextLine();
        newAccount.setAnnualInterestRate(anualInterestRate);
        newAccount.setIcNumber(icNumber);
        newAccount.setDate(java.util.Calendar.getInstance().getTime());
        System.out.println("New Account Added ");
    }

    /**
     * Display All Accounts.
     */
    public void displayAccounts() {

        if (accountList.isEmpty()) {
            System.out.println("No Accounts Found!!");
            return;
        }
        for (Account account : accountList) {
            System.out.println(account.toString());
        }
    }

    /**
     * Remove Account.
     *
     * @param accountNumber
     */
    public void deleteAccount(int accountNumber) {
        Account accountDel = null;
        // Iterate accountList.
        for (Account st : accountList) {
            //Find Account to be deleted by id.
            if (st.getId() == (accountNumber)) {
                accountDel = st;
            }
        }
        //If Account is null, then show error message, 
        //otherwise remove the Account from Account list.
        if (accountDel == null) {
            System.out.println("Invalid Account Id");
        } else {

            Scanner scanneDel = new Scanner(System.in);
            System.out.println("");
            //A confirmation message to complete the deletion.
            System.out.print("Do you want to delete : ");
            System.out.println("\n1. Yes");
            System.out.println("2. No");
            System.out.print("Enter your option: ");

            String deleteConfirmation = scanneDel.nextLine();
            switch (deleteConfirmation) {

                case "1":
                    accountList.remove(accountDel);
                    System.out.println("Successfully removed Account  ");
                    break;
                case "2":
                    return;

                default:
                    System.out.println("Invalid Entry!");
                    break;
            }

        }
    }

    /**
     *
     * Update Account.
     *
     * @param accountNumber
     * @throws java.lang.Exception
     */
    public void updateAccount(int accountNumber) throws Exception {
        Account accountDel = null;
        // Iterate accountList.
        for (Account st : accountList) {
            //Find Account to be updated by id.
            if (st.getId() == (accountNumber)) {
                accountDel = st;
            }
        }
        //If Account is null, then show error message, 
        //otherwise remove the Account from Account list.
        if (accountDel == null) {
            System.out.println("Invalid Account Id");
        } else {

            Scanner scannerAdd = new Scanner(System.in);
            System.out.println("");
            System.out.print("Enter Account Number : ");
            int acntNumber = Integer.parseInt(scannerAdd.nextLine());
            System.out.print("Enter Account Name : ");
            String accountName = scannerAdd.nextLine();
            System.out.print("Enter Account Balance : ");
            double accountBalance = Double.parseDouble(scannerAdd.nextLine());

            accountDel.setId(acntNumber);
            accountDel.setAccountHolder(accountName);
            accountDel.setBalance(accountBalance);

            System.out.println("Successfully Updated Account  ");
        }
    }

    /**
     * Monthly interest rate
     *
     * @param accountNumber
     */
    public void monthlyInterestRate(int accountNumber) {
        boolean found = false;
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getId() == (accountNumber)) {
                System.out.println("");
                System.out.println("Account Found : " + accountList.get(i));
                found = true;
                System.out.println("Monthly interest rate: " + accountList.get(i).getMonthlyInterestRate());
            }
        }
        if (!found) {
            System.out.println("Account Not Found!!");
        }
    }

    /**
     * Writing accounts to a textfile
     */
    public void writeToAFile() {
        System.out.println("Writing accounts to a textfile");
        FileWriter writer = null;
        try {
            writer = new FileWriter("data.txt");
            int size = accountList.size();
            for (int i = 0; i < size; i++) {
                String str = accountList.get(i).toString();
                writer.write(str);
                if (i < size - 1)//This prevent creating a blank like at the end of the file**
                {
                    writer.write("\n");
                }
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}