 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/** *
* @author WanMohammedAdam
*/

public class Individual {
    /**
   * @param args the command line arguments 
     * @throws java.lang.Exception 
   */
   
  public static void main(String[] args) throws Exception { 
    // TODO code application logic here
     Bank bank = new Bank();
     menu();
      try ( //Creating scanner object
              Scanner sc = new Scanner(System.in)) {
          while (menu()) {
              int choice = 0;
              System.out.print("Enter Your Selection : ");
              choice = Integer.parseInt(sc.nextLine());
              switch (choice) {
                  case 1 -> bank.addAccount();
                  
                  case 2 -> {
                      System.out.print("Enter account number : ");
                      int accountNumberUpdate = Integer.parseInt(sc.nextLine()); 
                      bank.updateAccount(accountNumberUpdate);
                  }
                  
                  case 3 -> bank.displayAccounts();
                  
                  case 4 -> {
                      System.out.print("Enter account number : ");
                      int accountNumber = Integer.parseInt(sc.nextLine());
                      bank.findAccount(accountNumber);
                  }
                  
                  case 5 -> {
                      System.out.print("Enter account number : ");
                      int accountNumberDel = Integer.parseInt(sc.nextLine());
                      bank.deleteAccount(accountNumberDel);
                  }
                  
                  case 6 -> {
                      System.out.print("Enter account number : ");
                      int accountNumBal = Integer.parseInt(sc.nextLine());
                      bank.checkBal(accountNumBal);
                  }
                  
                  case 7 -> {
                      System.out.print("Enter account number : ");
                      int accountNum = Integer.parseInt(sc.nextLine());
                      bank.dep(accountNum);
                  }
                  
                  case 8 -> {
                      System.out.print("Enter account number : ");
                      int accountNumWithdraw = Integer.parseInt(sc.nextLine());
                      bank.with(accountNumWithdraw);
                  }
                  
                  case 9 -> {
                      System.out.print("Enter account number : ");
                      int accountNumMir = Integer.parseInt(sc.nextLine());
                      bank.monthlyInterestRate(accountNumMir);
                  }
                  
                  case 10 -> {
                      bank.writeToAFile();
                      System.out.println("Thank you for using the program. Goodbye!"); //exit program
                      System.exit(0);
                  }
                  
                  default -> System.out.println("Enter valid choice ");
              }
          }
      }
  }
  /** *
  * @return
  */
  public static boolean menu() {
    System.out.println("\n" + "1: Create a new account.\n" + "2: Edit an account information.\n" + "3: Display all accounts/ View All Accounts.\n" + "4: Find Account.\n" + "5: Delete Account.\n" + "6: Check balance of an account.\n" + "7: Deposit a specified amount to the account.\n" + "8: Withdraws a specified amount from the account.\n" + "9: Display the monthly interest rate of an account.\n" + "10: Quit\n");
      
  System.out.print("Enter your option: ");
  return true; 
  }
}

