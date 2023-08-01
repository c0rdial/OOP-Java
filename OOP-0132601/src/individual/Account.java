/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package individual;

/**
 *
 * @author wanadam
 */


import java.util.Date;
import java.util.Scanner;

public class Account {
    private int id;
    private String accountHolder; 
    private String icNumber;
    private double balance;
    private double annualInterestRate; 
    private Date date;

  /**
  * A no‐arg constructor that creates a default account. */

    public Account() { 
      this.id = 0;
      this.balance = 0; 
      this.annualInterestRate = 0; 
      this.date = new Date(); 
      this.accountHolder = ""; 
      this.icNumber = "";
    }

    /**
    * A constructor that creates an account with the specified id and initial
    * balance. *
    * @param id
    * @param balance */
    public Account(int id, double balance) { 
    this.id = id;
    this.balance = balance; 

    }
    /**
    * Get the value of accountHolder *
    * @return the value of accountHolder */
    public String getAccountHolder() { 
      return accountHolder;
    }
    /**
    * Set the value of accountHolder *
    * @param accountHolder new value of accountHolder */
    public void setAccountHolder(String accountHolder) { 
      this.accountHolder = accountHolder;
    }
    /**
    * Get the value of icNumber *
    * @return the value of icNumber */
    public String getIcNumber() { 
      return icNumber;
    }
    /**
    * Set the value of icNumber *
    * @param icNumber new value of icNumber */
    public void setIcNumber(String icNumber) { 
      this.icNumber = icNumber;
    }
    /**
    * Get the value of date *
    * @return the value of date */
    public Date getDate() { 
      return date;
    }
    /**
    * Set the value of date *
    * @param date new value of date */
    public void setDate(Date date) { 
      this.date = date;
    }
    /**
    * Get the value of annualInterestRate *
    * @return the value of annualInterestRate */
    public double getAnnualInterestRate() { 
      return annualInterestRate / 100;
    }
    /**
    * Set the value of annualInterestRate *
    * @param annualInterestRate new value of annualInterestRate
     * @throws java.lang.Exception */
    public void setAnnualInterestRate(double annualInterestRate) throws Exception {
      if (annualInterestRate >= 0 && annualInterestRate <= 100) { 
        this.annualInterestRate = annualInterestRate;

      } else {
        throw new Exception("Annual interest rate should be between 1 and 100");
      } 
    }
    /**
    * Get the value of balance *
    * @return the value of balance */
    public double getBalance() { 
      return balance;
    }
    /**
    * Set the value of balance *
    * @param balance new value of balance */
    public void setBalance(double balance) { 
      this.balance = balance;
    }
    /**
    * Get the value of id *
    * @return the value of id */
    public int getId() { 
      return id;
    }
    /**
    * Set the value of id *
    * @param id new value of id */
    public void setId(int id) { 
      this.id = id;
    }
    /**
    * Get the value of annualInterestRate *
    * @return the value of annualInterestRate */
    public double getMonthlyInterestRate() { 
      return getAnnualInterestRate() / 12;
    }
    /**
    * Get the value of annualInterestRate *
    * @return the value of annualInterestRate */
    public double getMonthlyInterest() {
      return balance * getMonthlyInterestRate();
    }
    public void deposit() {

      //Creating scanner object
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the amount to be deposited into the account : "); 
      double amount = scanner.nextDouble();
      if (amount > 0) {
         balance += amount;
         System.out.println("Deposit completed successfully."); 
         System.out.println("Account Balance : " + balance);
      } else if (amount <= 0) { 
          System.out.println("Invalid amount.");
    } 
  }
    public void withdraw() {

    //Creating scanner object
     Scanner scanner = new Scanner(System.in);
     System.out.print("enter the amount to be withdrawn from the account : ");

     double amountW = scanner.nextDouble(); 
     if (amountW <= 0) {
       System.out.println("Invalid amount."); 
       } else if (amountW > balance) {
         System.out.println("Insufficient fund. Please enter a smaller amount."); 
       } else if (amountW <= balance) {
          balance -= amountW;
           System.out.println("Withdawal completed. Your remaining balance is: " + balance); 
         }
    }
    @Override
    public String toString() {
      return "Account{" + "id=" + id + ", accountHolder=" + accountHolder + ", icNumber=" + icNumber + ", balance=" + balance + ", annualInterestRate=" + getAnnualInterestRate() + ", date=" + date + '}';
      } 

}
