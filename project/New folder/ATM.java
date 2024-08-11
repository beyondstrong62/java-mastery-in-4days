import java.util.ArrayList;
import java.util.Scanner;
class ATM{
    private double balance;
    private String pin;
    private ArrayList<String> transactionHistory;
    public ATM(double  intialbalance, String initialpin){
        this .balance= intialbalance;
        this.pin=initialpin;
        this.transactionHistory= new ArrayList<>();
    }
    //method to check balance 
    public void checkbalance(){
        System.out.println("CurrentBalance:$"+balance);
        transactionHistory.add("Checked Balnce: $"+balance);
    }
    // method to withdraw balance
    public void withdraw(double amount){
        if(amount<= balance){
            balance-= amount;
            System.out.println("Successfully withdraw: $"+amount);
        }
        else{
            System.out.println("Insufficient Balance");
            transactionHistory.add("Failed withdrawl Attrmpt!");
        }
    }

    //method to printtrancsaction
    public void printtrancsaction(){
        System.out.println("transaction history:"); 
        for (String transaction : transactionHistory) {  // Iterates through each transaction in the history
            System.out.println(transaction);  // Prints each transaction
        }
    }

    //method to deposite
     public void deposite(double amount){
        balance+= amount;
        System.out.println("Depositted Successfully: $"+amount); 
        transactionHistory.add("Deposited :$"+amount);
    }
    //method to change pin
    public void changepin(String newPin){
        pin=newPin;

        System.out.println("Successfulluy Pin is changed ");
        transactionHistory.add("PIN is changed");

    }
    //method to verify pin
    public boolean verifyPin(String enteredPin){
        return pin.equals(enteredPin);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        ATM atm= new ATM(1000,"12345");
        System.out.println("Welcome to the Atm");
        System.out.println("enter your Pin:");
        String enterdPin= sc.nextLine();
        if(atm.verifyPin(enterdPin)){
            int choice;
            do{
                //ATm menu options 
                System.out.println("1.Check balance");
                System.out.println("2.witdraw cash");
                System.out.println("3.Deposite cash");
                System.out.println("4.Change Pin");
                System.out.println("5.Transaction History");
                System.out.println("6.exit");
                choice= sc.nextInt();

            switch (choice) {  // Executes different actions based on the user's choice
                    case 1:
                        atm.checkbalance();  // Checks and prints the current balance
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: $");  // Prompts the user to enter the withdrawal amount
                        double withdrawAmount = sc.nextDouble();  // Reads the withdrawal amount
                        atm.withdraw(withdrawAmount);  // Attempts to withdraw the entered amount
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: $");  // Prompts the user to enter the deposit amount
                        double depositAmount = sc.nextDouble();  // Reads the deposit amount
                        atm.deposite(depositAmount);  // Deposits the entered amount
                        break;
                        case 4:
                        System.out.print("Enter new PIN: ");  // Prompts the user to enter a new PIN
                        sc.nextLine();  // Consumes the newline character left by nextInt()
                        String newPin = sc.nextLine();  // Reads the new PIN
                        atm.changepin(newPin);  // Changes the PIN
                        break;
                    case 5:
                        atm.printtrancsaction();  // Prints the transaction history
                        break;
                    case 6:
                        System.out.println("Thank you for using the ATM. Goodbye!");  // Prints a goodbye message
                        break;
                    default:
                        System.out.println("Invalid option! Please try again.");  // Prints an error message for invalid options
                }
            } while (choice != 6);  // Repeats the menu until the user chooses to exit
        } else {
            System.out.println("Incorrect PIN. Access denied.");  // Prints an error message if the entered PIN is incorrect
        }
    }
}




